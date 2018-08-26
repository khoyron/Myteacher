package com.khoiron.myteacher.guru.lest.privates.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import android.widget.ImageView
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.base.BaseFragment
import com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout.ProfileFragmentUi
import com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout.ProfileServicesFragmentUi
import com.khoiron.myteacher.guru.lest.privates.utility.Globals
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.profile_services.view.*
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx
import java.lang.Exception

/**
 * Created by khoiron on 22/06/18.
 */
class ProfileServicesFragment: BaseFragment() {

    val image by lazy { myView.findViewById(R.id.image) as ImageView }

    override fun layoutFragment(): View {
        return ProfileServicesFragmentUi<Fragment>().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?) {
        Picasso.get()
                .load("https://images2.privateschoolreview.com/photo/780x600/6000/5601/Whitby-School-7M53H7.jpg")
                .fit()
                .into(image)
    }

}