package com.khoiron.myteacher.guru.lest.privates.Activity

import android.os.Bundle
import com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.UI.Base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.Layout.RegisterUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 29/05/18.
 */
class RegisterActivity : BaseActivity() {
    override fun layoutView() { RegisterUi().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {

    }
}