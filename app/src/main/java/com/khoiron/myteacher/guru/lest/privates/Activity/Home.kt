package com.khoiron.myteacher.guru.lest.privates.Activity

import android.os.Bundle
import com.cekongkir.cekpaket.cekresi.ceklokasi.ceksemuaongkir.cekbarang.kiriman.khoiron.UI.Base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.Layout.HomeUi
import org.jetbrains.anko.setContentView

class Home : BaseActivity() {
    override fun layoutView() { HomeUi().setContentView(this)}

    override fun onMain(savedInstanceState: Bundle?) {

    }
}
