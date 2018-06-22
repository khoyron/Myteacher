package com.khoiron.myteacher.guru.lest.privates.activity.home

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.khoiron.myteacher.guru.lest.privates.layout.HomeUi
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.activity.service.CreateServiceActivity
import com.khoiron.myteacher.guru.lest.privates.base.BaseActivity
import com.khoiron.myteacher.guru.lest.privates.fragment.HomeFragment
import com.khoiron.myteacher.guru.lest.privates.fragment.ProfileFragment
import com.khoiron.myteacher.guru.lest.privates.fragment.TopChoiseFragment
import com.khoiron.myteacher.guru.lest.privates.fragment.YourClassFragment
import org.jetbrains.anko.setContentView

class Home : BaseActivity() {
    override fun layoutView() { HomeUi<Home>().setContentView(this)}

    val search          by lazy { findViewById(R.id.search) as ImageView }
    val home            by lazy { findViewById(R.id.home) as RelativeLayout }
    val imgHome         by lazy { findViewById(R.id.imgHome) as ImageView }
    val txHome          by lazy { findViewById(R.id.txHome) as TextView }
    val topChoise       by lazy { findViewById(R.id.topChoise) as RelativeLayout }
    val imgTopChoise    by lazy { findViewById(R.id.imgTopChoise) as ImageView }
    val txTopChoise     by lazy { findViewById(R.id.txTopChoise) as TextView }
    val create          by lazy { findViewById(R.id.create) as RelativeLayout }
    val imgCreate       by lazy { findViewById(R.id.imgCreate) as ImageView }
    val txCreate        by lazy { findViewById(R.id.txCreate) as TextView }
    val yourClass       by lazy { findViewById(R.id.yourClass) as RelativeLayout }
    val imgYourClass    by lazy { findViewById(R.id.imgYourClass) as ImageView }
    val txYourClass     by lazy { findViewById(R.id.txYourClass) as TextView }
    val profile         by lazy { findViewById(R.id.profile) as RelativeLayout }
    val imgProfile      by lazy { findViewById(R.id.imgProfile) as ImageView }
    val txProfile       by lazy { findViewById(R.id.txProfile) as TextView }


    override fun onMain(savedInstanceState: Bundle?) {
        setOnClik()
        switchFargment(R.id.placeFragment,HomeFragment())
    }

    private fun setOnClik() {
        search.setOnClickListener { goActivity(SearchActivity::class.java) }
        home.setOnClickListener { homeClik() }
        txHome.setOnClickListener { homeClik() }
        imgHome.setOnClickListener { homeClik() }
        topChoise.setOnClickListener { choiseClik() }
        imgTopChoise.setOnClickListener { choiseClik() }
        txTopChoise.setOnClickListener { choiseClik() }
        create.setOnClickListener { createClick() }
        imgCreate.setOnClickListener { createClick() }
        txCreate.setOnClickListener { createClick() }
        yourClass.setOnClickListener { yourClassClik() }
        imgYourClass.setOnClickListener { yourClassClik() }
        txYourClass.setOnClickListener { yourClassClik() }
        profile.setOnClickListener { profileClik() }
        imgProfile.setOnClickListener { profileClik() }
        txProfile.setOnClickListener { profileClik() }

    }

    private fun createClick() {
        goActivity(CreateServiceActivity::class.java)
        imgCreate.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara2))
        txCreate.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        imgTopChoise.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txTopChoise.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgHome.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txHome.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgYourClass.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txYourClass.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgProfile.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txProfile.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
    }

    private fun choiseClik() {
        switchFargment(R.id.placeFragment,TopChoiseFragment())
        imgTopChoise.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara2))
        txTopChoise.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        imgCreate.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txCreate.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgHome.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txHome.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgYourClass.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txYourClass.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgProfile.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txProfile.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
    }

    private fun homeClik() {
        switchFargment(R.id.placeFragment,HomeFragment())
        imgHome.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara2))
        txHome.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        imgTopChoise.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txTopChoise.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgCreate.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txCreate.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgYourClass.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txYourClass.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgProfile.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txProfile.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))


    }
    private fun yourClassClik() {
        switchFargment(R.id.placeFragment,YourClassFragment())
        imgYourClass.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara2))
        txYourClass.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        imgHome.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txHome.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgProfile.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txProfile.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgTopChoise.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txTopChoise.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgCreate.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txCreate.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))



    }
    private fun profileClik() {
        switchFargment(R.id.placeFragment,ProfileFragment())
        imgProfile.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara2))
        txProfile.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
        imgYourClass.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txYourClass.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgHome.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txHome.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgTopChoise.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txTopChoise.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
        imgCreate.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.sementara))
        txCreate.setTextColor(ContextCompat.getColor(this, R.color.colorgrey))
    }
}
