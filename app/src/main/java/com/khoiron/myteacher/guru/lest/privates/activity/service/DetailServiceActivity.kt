package com.khoiron.myteacher.guru.lest.privates.activity.service

import android.os.Bundle
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.layout.DetailServiceUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 22/06/18.
 */
class DetailServiceActivity:BaseActivity() {
    override fun layoutView() {
        DetailServiceUi<DetailServiceActivity>().setContentView(this)
    }

    override fun onMain(savedInstanceState: Bundle?) {

    }
}