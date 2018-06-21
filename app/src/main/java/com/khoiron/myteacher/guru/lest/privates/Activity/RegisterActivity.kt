package com.khoiron.myteacher.guru.lest.privates.Activity

import android.os.Bundle
import android.widget.*
import com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.UI.Base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.Layout.RegisterUi
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 29/05/18.
 */
class RegisterActivity : BaseActivity() {

    val btnBack by lazy { findViewById(R.id.back) as ImageView }
    val btnFacebook by lazy { findViewById(R.id.facebook) as LinearLayout }
    val btnGoogle by lazy { findViewById(R.id.google)as LinearLayout }

    val etLastName by lazy { findViewById(R.id.etLastName)as EditText }
    val etFirstName by lazy { findViewById(R.id.etFirstName) as EditText}
    val etEmail by lazy { findViewById(R.id.etEmail)as EditText }
    val etPassword by lazy { findViewById(R.id.etPasssword) as EditText}

    val btnRegister by lazy { findViewById(R.id.btnRegister) as Button }
    val btnGotoLogin by lazy { findViewById(R.id.gotoLogin) as TextView }

    override fun layoutView() { RegisterUi().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {
        btnBack.setOnClickListener { finish() }
        btnRegister.setOnClickListener { goActivity(Home::class.java) }

        btnGotoLogin.setOnClickListener {
            goActivity(LoginActivity::class.java)
        }
    }
}