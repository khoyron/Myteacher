package com.khoiron.myteacher.guru.lest.privates.activity.service

import android.os.Bundle
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.layout.serviselayout.DetailCategoryUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 24/06/18.
 */

class DetailCategoryActivity :BaseActivity(){
    override fun layoutView() {
        DetailCategoryUi<DetailCategoryActivity>().setContentView(this)
    }

    override fun onMain(savedInstanceState: Bundle?) {

    }

}