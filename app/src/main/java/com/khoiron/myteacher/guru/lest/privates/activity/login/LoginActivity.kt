package com.khoiron.myteacher.guru.lest.privates.activity.login

import android.os.Bundle
import android.widget.*
import com.khoiron.myteacher.guru.lest.privates.activity.home.Home
import com.khoiron.myteacher.guru.lest.privates.layout.loginlayout.LoginUi
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import org.jetbrains.anko.setContentView
import org.json.JSONException
import io.reactivex.internal.util.NotificationLite.getError
import org.json.JSONObject
import com.facebook.login.LoginResult
import com.facebook.login.LoginManager
import java.util.*
import java.util.Arrays.asList
import android.content.Intent
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import android.R.attr.data
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import android.support.annotation.NonNull
import com.facebook.*
import com.google.android.gms.tasks.OnCompleteListener
import com.facebook.GraphResponse
import com.facebook.GraphRequest
import retrofit2.http.DELETE
import com.facebook.AccessToken




/**
 * Created by khoiron on 29/05/18.
 */
class LoginActivity : BaseActivity() {
    lateinit var callbackmanager: CallbackManager
    lateinit var mGoogleSignInClient: GoogleSignInClient
    var RC_SIGN_IN = 10

    val btnBack by lazy { findViewById(R.id.backBtn) as ImageView }
    val btnFacebook by lazy { findViewById(R.id.facebook) as LinearLayout }
    val btnGoogle by lazy { findViewById(R.id.google)as LinearLayout }

    val etEmail by lazy { findViewById(R.id.etEmail)as EditText }
    val etPassword by lazy { findViewById(R.id.etPasssword) as EditText}
    val btnLogin by lazy { findViewById(R.id.btnLogin) as Button }
    val btnGoRegister by lazy { findViewById(R.id.gotoRegister) as TextView}

    override fun layoutView() {
        LoginUi<LoginActivity>().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {
        googleLoginInit()
        btnBack.setOnClickListener { finish() }
        btnLogin.setOnClickListener {
            goActivity(Home::class.java)
        }
        btnGoRegister.setOnClickListener {
            goActivity(RegisterActivity::class.java)
        }
        btnFacebook.setOnClickListener {
            onFblogin()
        }
        btnGoogle.setOnClickListener {
            disconnectFromFacebook()
//            signIn()
//            signOut()
        }
    }

    private fun googleLoginInit() {
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build()

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

    private fun signIn() {
        val signInIntent = mGoogleSignInClient.getSignInIntent()
        startActivityForResult(signInIntent, RC_SIGN_IN)
    }


    fun disconnectFromFacebook() {

        if (AccessToken.getCurrentAccessToken() == null) {
            return  // already logged out
        }

        GraphRequest(AccessToken.getCurrentAccessToken(), "/me/permissions/", null, HttpMethod.DELETE, GraphRequest.Callback { LoginManager.getInstance().logOut() }).executeAsync()
    }

    private fun signOut() {
        mGoogleSignInClient.signOut()
                .addOnCompleteListener(this, object : OnCompleteListener<Void>{
                    override fun onComplete(p0: Task<Void>) {
                        setLog("logout oke")
                    }
                })
    }

    private fun onFblogin() {
        callbackmanager = CallbackManager.Factory.create()

        // Set permissions
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("email", "user_photos", "public_profile"))

        LoginManager.getInstance().registerCallback(callbackmanager,
                object : FacebookCallback<LoginResult> {
                    override fun onSuccess(loginResult: LoginResult) {

                        val parameters = Bundle()
                        parameters.putString("fields", "id,name,last_name,link,email,picture")
                        val request = GraphRequest.newMeRequest(loginResult.accessToken) { jsonObject, graphResponse ->
                            var id: String? = null
                            if (jsonObject != null) {
                                try {
                                    setLog("response "+jsonObject.toString())
                                    val str_email = jsonObject.getString("email")
                                    val str_id = jsonObject.getString("id")
                                    val str_firstname = jsonObject.getString("first_name")
                                    val str_lastname = jsonObject.getString("last_name")
                                    setLog(str_email+" "+str_firstname+" "+str_id+" "+str_lastname)

                                } catch (e: Exception) {
                                    e.printStackTrace()
                                }

                            }
                        }
                        request.parameters = parameters
                        request.executeAsync()


                    }

                    override fun onCancel() {
                        setLog( "On cancel")
                    }

                    override fun onError(error: FacebookException) {
                        setLog(error.toString())
                    }
                })


    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)

        try {
            callbackmanager.onActivityResult(requestCode, resultCode, data)
        }catch (e:Exception){
            e.printStackTrace()
        }
        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode === RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }

    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            setLog(account.email+" "+account.id+" "+account.givenName)
        } catch (e: ApiException) {

        }

    }
}