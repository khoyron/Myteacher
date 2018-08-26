package com.khoiron.myteacher.guru.lest.privates.activity.login

import android.os.Bundle
import android.widget.*
import com.khoiron.myteacher.guru.lest.privates.activity.home.Home
import com.khoiron.myteacher.guru.lest.privates.layout.loginlayout.RegisterUi
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import okhttp3.ResponseBody
import org.jetbrains.anko.setContentView
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by khoiron on 29/05/18.
 */
class RegisterActivity : BaseActivity() {

    val btnBack by lazy { findViewById(R.id.backToLogin) as ImageView }
    val btnFacebook by lazy { findViewById(R.id.facebook) as LinearLayout }
    val btnGoogle by lazy { findViewById(R.id.google)as LinearLayout }

    val btnRegister by lazy { findViewById(R.id.btnRegister) as Button }

    val btnGotoLogin by lazy { findViewById(R.id.gotoLogin) as TextView }
    override fun layoutView() { RegisterUi<RegisterActivity>().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {
        btnBack.setOnClickListener { finish() }
        btnRegister.setOnClickListener { getRegister() }

        btnGotoLogin.setOnClickListener {
            goActivity(LoginActivity::class.java)
        }
    }

    val etLastName by lazy { findViewById(R.id.etLastName)as EditText }
    val etFirstName by lazy { findViewById(R.id.etFirstName) as EditText}
    val etEmail by lazy { findViewById(R.id.etEmail)as EditText }
    val etPassword by lazy { findViewById(R.id.etPasssword) as EditText}

    val etAddress by lazy { findViewById(R.id.etAddress) as EditText}
    val etZipcode by lazy { findViewById(R.id.etZipcode) as EditText}
    val etUserName by lazy { findViewById(R.id.etUserName) as EditText}
    val etMobile by lazy { findViewById(R.id.etMobile) as EditText}
    val etgender by lazy { findViewById(R.id.etgender) as EditText}
    val etType by lazy { findViewById(R.id.etType) as EditText}

    private fun getRegister() {

        val tsLong = System.currentTimeMillis() / 1000
        val ts = tsLong.toString()

        myUrl.register(etFirstName.text.toString(),etLastName.text.toString(),etAddress.text.toString(),etZipcode.text.toString(),
                etUserName.text.toString(), etPassword.text.toString(),etEmail.text.toString(),etMobile.text.toString(), etgender.text.toString(),ts,etType.text.toString()).enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                if(response?.code()==200){
                    var json = JSONObject(response.body()?.string())
                    if("success".equals(json.getString("status"))){
                        goActivity(RegisterActivity::class.java)
                    }else{
                        setToast(json.optString("message"))
                    }
                }else{
                    setLog("code error "+response?.code().toString())
                }
            }

            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {

            }
        })
    }
}