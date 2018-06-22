package com.khoiron.myteacher.guru.lest.privates.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.khoiron.myteacher.guru.lest.privates.base.BaseFragment
import com.khoiron.myteacher.guru.lest.privates.layout.HomeFragmentUi
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * Created by khoiron on 22/06/18.
 */

class HomeFragment : BaseFragment() {
    override fun layoutFragment(): View {
        return HomeFragmentUi<Fragment>().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?) {

    }
}