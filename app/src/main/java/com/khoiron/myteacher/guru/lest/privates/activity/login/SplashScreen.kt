package com.khoiron.myteacher.guru.lest.privates.activity.login

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.khoiron.myteacher.guru.lest.privates.layout.loginlayout.SplashScreenUi
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.utility.Globals
import com.khoiron.myteacher.guru.lest.privates.activity.home.Home
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import org.jetbrains.anko.setContentView
import com.squareup.picasso.Picasso
import java.lang.Exception


/**
 * Created by khoiron on 29/05/18.
 */

//test
class SplashScreen : BaseActivity() {
    override fun layoutView() {
        SplashScreenUi<SplashScreen>().setContentView(this)}

    val imageBg by lazy { findViewById(R.id.imageBg) as ImageView }
    val goSignIn by lazy { findViewById(R.id.gosignin) as TextView }
    val firstButton by lazy { findViewById(R.id.firstButton) as Button }

    override fun onMain(savedInstanceState: Bundle?) {
        firstButton.visibility = View.GONE
        loadBackground();

        firstButton.setOnClickListener {
            goActivity(Home::class.java)
        }
        goSignIn.setOnClickListener {
            goActivity(LoginActivity::class.java)
        }
    }

    private fun loadBackground() {
        Picasso.get()
                .load(Globals.urlImageBackground)
                .into(imageBg, object : com.squareup.picasso.Callback {
                    override fun onSuccess() {
                        firstButton.visibility = View.VISIBLE
                    }

                    override fun onError(e: Exception?) {
                        loadBackground()
                    }
                })
    }

}