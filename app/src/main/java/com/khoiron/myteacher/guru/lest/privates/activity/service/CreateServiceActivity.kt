package com.khoiron.myteacher.guru.lest.privates.activity.service

import android.os.Bundle
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.layout.CreateServiceUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 22/06/18.
 */
class CreateServiceActivity :BaseActivity() {
    override fun layoutView() {
        CreateServiceUi<CreateServiceActivity>().setContentView(this)
    }

    override fun onMain(savedInstanceState: Bundle?) {

    }
}