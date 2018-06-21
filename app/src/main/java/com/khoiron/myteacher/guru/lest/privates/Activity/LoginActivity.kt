package com.khoiron.myteacher.guru.lest.privates.Activity

import android.os.Bundle
import android.widget.*
import com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.UI.Base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.Layout.LoginUi
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 29/05/18.
 */
class LoginActivity : BaseActivity() {
    val btnBack by lazy { findViewById(R.id.back) as ImageView }
    val btnFacebook by lazy { findViewById(R.id.facebook) as LinearLayout }
    val btnGoogle by lazy { findViewById(R.id.google)as LinearLayout }

    val etEmail by lazy { findViewById(R.id.etEmail)as EditText }
    val etPassword by lazy { findViewById(R.id.etPasssword) as EditText}
    val btnLogin by lazy { findViewById(R.id.btnLogin) as Button }
    val btnGoRegister by lazy { findViewById(R.id.gotoRegister) as TextView}

    override fun layoutView() {LoginUi().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {
        btnBack.setOnClickListener { finish() }
        btnLogin.setOnClickListener {
            goActivity(Home::class.java)
        }
        btnGoRegister.setOnClickListener {
            goActivity(RegisterActivity::class.java)
        }
    }
}