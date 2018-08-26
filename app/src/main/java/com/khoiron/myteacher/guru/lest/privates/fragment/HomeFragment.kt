package com.khoiron.myteacher.guru.lest.privates.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.RelativeLayout
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.activity.model.ModelRvHome
import com.khoiron.myteacher.guru.lest.privates.activity.service.DetailCategoryActivity
import com.khoiron.myteacher.guru.lest.privates.activity.service.DetailServiceActivity
import com.khoiron.myteacher.guru.lest.privates.adapter.OnclikListenerRecycler
import com.khoiron.myteacher.guru.lest.privates.adapter.RecyyclerAdapterHomeFragment
import com.khoiron.myteacher.guru.lest.privates.base.BaseFragment
import com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout.HomeFragmentUi
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * Created by khoiron on 22/06/18.
 */

class HomeFragment : BaseFragment() {

    val btnRobotic      by lazy { myView.findViewById(R.id.btnRobotic) as RelativeLayout }
    val rvRobotic       by lazy { myView.findViewById(R.id.rvRobotic) as RecyclerView }

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

    val recyyclerAdapterHomeFragment by lazy { RecyyclerAdapterHomeFragment(context) }
    val data by lazy { ArrayList<ModelRvHome>() }

    override fun layoutFragment(): View {
        return HomeFragmentUi<Fragment>().createView(AnkoContext.create(ctx, this))
    }

    override fun onViewCreatedListener(view: View?, savedInstanceState: Bundle?) {
        btnOnClik()
        initRecyclerView()
        setData()
    }

    private fun setData() {
        var modelRvHome = ModelRvHome()
        modelRvHome.image = "https://images2.privateschoolreview.com/photo/780x600/6000/5601/Whitby-School-7M53H7.jpg"
        modelRvHome.name  = "Bu santi"
        modelRvHome.title = "Creative exercise 6 prompt jump start yourn next project"
        data.add(modelRvHome)
        data.add(modelRvHome)
        data.add(modelRvHome)
        data.add(modelRvHome)
        data.add(modelRvHome)
        recyyclerAdapterHomeFragment.setData(data)
        recyyclerAdapterHomeFragment.notifyDataSetChanged()

        recyyclerAdapterHomeFragment.onclick(object :OnclikListenerRecycler{
            override fun onClik(view: Int, position: Int) {
                if (view==99){
                    goActivity(DetailServiceActivity::class.java)
                }
            }
        })

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

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun initRecyclerView() {
        val llm = LinearLayoutManager(context)
        llm.orientation = LinearLayoutManager.HORIZONTAL

        val llm2 = LinearLayoutManager(context)
        llm2.orientation = LinearLayoutManager.HORIZONTAL

        val llm3 = LinearLayoutManager(context)
        llm3.orientation = LinearLayoutManager.HORIZONTAL

        val llm4 = LinearLayoutManager(context)
        llm4.orientation = LinearLayoutManager.HORIZONTAL

        val llm5 = LinearLayoutManager(context)
        llm5.orientation = LinearLayoutManager.HORIZONTAL

        val llm6 = LinearLayoutManager(context)
        llm6.orientation = LinearLayoutManager.HORIZONTAL

        val llm7 = LinearLayoutManager(context)
        llm7.orientation = LinearLayoutManager.HORIZONTAL

        val llm8 = LinearLayoutManager(context)
        llm8.orientation = LinearLayoutManager.HORIZONTAL

        val llm9 = LinearLayoutManager(context)
        llm9.orientation = LinearLayoutManager.HORIZONTAL

        rvRobotic.setHasFixedSize(true)
        rvRobotic.setLayoutManager(llm)
        rvRobotic.adapter = recyyclerAdapterHomeFragment


        rvMatematic.setHasFixedSize(true)
        rvMatematic.setLayoutManager(llm2)
        rvMatematic.adapter = recyyclerAdapterHomeFragment

        rvBiologic.setHasFixedSize(true)
        rvBiologic.setLayoutManager(llm3)
        rvBiologic.adapter = recyyclerAdapterHomeFragment

        rvComputer.setHasFixedSize(true)
        rvComputer.setLayoutManager(llm4)
        rvComputer.adapter = recyyclerAdapterHomeFragment

        rvNaturalScienc.setHasFixedSize(true)
        rvNaturalScienc.setLayoutManager(llm5)
        rvNaturalScienc.adapter = recyyclerAdapterHomeFragment

        rvReligions.setHasFixedSize(true)
        rvReligions.setLayoutManager(llm6)
        rvReligions.adapter = recyyclerAdapterHomeFragment

        rvArtAndCulture.setHasFixedSize(true)
        rvArtAndCulture.setLayoutManager(llm7)
        rvArtAndCulture.adapter = recyyclerAdapterHomeFragment

        rvSocilaSciance.setHasFixedSize(true)
        rvSocilaSciance.setLayoutManager(llm8)
        rvSocilaSciance.adapter = recyyclerAdapterHomeFragment

        rvOther.setHasFixedSize(true)
        rvOther.setLayoutManager(llm9)
        rvOther.adapter = recyyclerAdapterHomeFragment

    }
}