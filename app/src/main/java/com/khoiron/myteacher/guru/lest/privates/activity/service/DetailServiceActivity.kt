package com.khoiron.myteacher.guru.lest.privates.activity.service

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.adapter.OnclikListenerRecycler
import com.khoiron.myteacher.guru.lest.privates.adapter.RecyyclerAdapterMenuUp
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.fragment.GaleryFragment
import com.khoiron.myteacher.guru.lest.privates.fragment.ProfileServicesFragment
import com.khoiron.myteacher.guru.lest.privates.fragment.RatesFragment
import com.khoiron.myteacher.guru.lest.privates.layout.serviselayout.DetailServiceUi
import org.jetbrains.anko.setContentView

/**
 * Created by khoiron on 22/06/18.
 */

class DetailServiceActivity:BaseActivity() {

    val rvMenuTop     by lazy { findViewById(R.id.rvMenuTop) as RecyclerView }
    val back          by lazy { findViewById(R.id.backd) as ImageView }
    val btnBook       by lazy { findViewById(R.id.btnBook) as RelativeLayout }
    val btnBook1      by lazy { findViewById(R.id.btnBook1) as ImageView }
    val btnBook2      by lazy { findViewById(R.id.btnBook2) as TextView }
    val btnAsk        by lazy { findViewById(R.id.btnAsk) as RelativeLayout }
    val btnAsk1       by lazy { findViewById(R.id.btnAsk1) as ImageView }
    val btnAsk2       by lazy { findViewById(R.id.btnAsk2) as TextView }

    val adapter       by lazy { RecyyclerAdapterMenuUp(this) }
    val menu          by lazy { ArrayList<String>() }

    override fun layoutView() {
        DetailServiceUi<DetailServiceActivity>().setContentView(this)
    }

    override fun onMain(savedInstanceState: Bundle?) {
        initRecycler()
        onClik()
        switchFargment(R.id.placeFragment,ProfileServicesFragment())
        adapter.onclick(object :OnclikListenerRecycler{
            override fun onClik(view: Int, position: Int) {
                when (position){
                    0 -> {
                        switchFargment(R.id.placeFragment,ProfileServicesFragment())
                        destroyFragment(RatesFragment())
                        destroyFragment(GaleryFragment())
                    }
                    1 -> {
                        switchFargment(R.id.placeFragment, RatesFragment())
                        destroyFragment(ProfileServicesFragment())
                        destroyFragment(GaleryFragment())
                    }
                    2 -> {
                        switchFargment(R.id.placeFragment,GaleryFragment())
                        destroyFragment(ProfileServicesFragment())
                        destroyFragment(RatesFragment())
                    }
                }
            }
        })
    }

    private fun onClik() {
        back.setOnClickListener { finish() }
        btnAsk.setOnClickListener { notice() }
        btnAsk1.setOnClickListener { notice() }
        btnAsk2.setOnClickListener { notice() }
    }



    private fun initRecycler() {
        val llm = LinearLayoutManager(this)
        llm.orientation = LinearLayoutManager.HORIZONTAL

        rvMenuTop.setHasFixedSize(true)
        rvMenuTop.setLayoutManager(llm)
        adapter.setData(menu)
        rvMenuTop.adapter = adapter

        val profile = "Profile"
        val rates   = "Rates"
        val Galery  = "Galery"

        menu.add(profile)
        menu.add(rates)
        menu.add(Galery)

        adapter.notifyDataSetChanged()
    }


}