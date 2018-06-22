package com.khoiron.myteacher.guru.lest.privates.activity.home

import android.os.Bundle
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.layout.SearchActivityUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 22/06/18.
 */
class SearchActivity : BaseActivity() {
    override fun layoutView() {
        SearchActivityUi<SearchActivity>().setContentView(this)
    }

    override fun onMain(savedInstanceState: Bundle?) {

    }
}