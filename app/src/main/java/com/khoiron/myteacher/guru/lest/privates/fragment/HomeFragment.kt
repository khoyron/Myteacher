package com.khoiron.myteacher.guru.lest.privates.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.RelativeLayout
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.activity.service.DetailCategoryActivity
import com.khoiron.myteacher.guru.lest.privates.base.BaseFragment
import com.khoiron.myteacher.guru.lest.privates.layout.HomeFragmentUi
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * Created by khoiron on 22/06/18.
 */

class HomeFragment : BaseFragment() {

    val btnRobotic      by lazy { myView.findViewById(R.id.btnRobotic) as RelativeLayout }
    val vrRobotic       by lazy { myView.findViewById(R.id.rvRobotic) as RecyclerView }
    val btnMatematic    by lazy { myView.findViewById(R.id.btnMatematic) as RelativeLayout }
    val rvMatematic     by lazy { myView.findViewById(R.id.rvMatematic) as RecyclerView }
    val btnBiologic     by lazy { myView.findViewById(R.id.btnBiologic) as RelativeLayout }
    val rvBiologic      by lazy { myView.findViewById(R.id.rvBiologic) as RecyclerView }
    val btnComputer     by lazy { myView.findViewById(R.id.btnComputer) as RelativeLayout }
    val rvComputer      by lazy { myView.findViewById(R.id.rvComputer) as RecyclerView }
    val btnSosialScienc by lazy { myView.findViewById(R.id.btnSosialScience) as RelativeLayout }
    val rvSocilaSciance by lazy { myView.findViewById(R.id.rvSocilaSciance) as RecyclerView }
    val btnNaturalScien by lazy { myView.findViewById(R.id.btnNaturalScience) as RelativeLayout }
    val rvNaturalScienc by lazy { myView.findViewById(R.id.rvNaturalScience) as RecyclerView }
    val btnReligi       by lazy { myView.findViewById(R.id.btnReligi) as RelativeLayout }
    val rvReligions     by lazy { myView.findViewById(R.id.rvReligions) as RecyclerView }
    val btnArtAndCultur by lazy { myView.findViewById(R.id.btnArtAndCulture) as RelativeLayout }
    val rvArtAndCulture by lazy { myView.findViewById(R.id.rvArtAndCulture) as RecyclerView }
    val btnOther        by lazy { myView.findViewById(R.id.btnOther) as RelativeLayout }
    val rvOther         by lazy { myView.findViewById(R.id.rvOther) as RecyclerView }


    override fun layoutFragment(): View {
        return HomeFragmentUi<Fragment>().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?) {
        btnOnClik()
        initRecyclerView()
    }

    private fun btnOnClik() {
        btnRobotic.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnMatematic.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnBiologic.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnComputer.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnNaturalScien.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnSosialScienc.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnArtAndCultur.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnReligi.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
        btnOther.setOnClickListener { goActivity(DetailCategoryActivity::class.java) }
    }

    private fun initRecyclerView() {

    }
}