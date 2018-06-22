package com.khoiron.myteacher.guru.lest.privates.layout

import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.activity.home.Home
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.*

/**
 * Created by khoiron on 29/05/18.
 */

class HomeUi<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            backgroundColor = resources.getColor(R.color.colorWhite)
            relativeLayout {
                id = R.id.header
                textView {
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                    text = "Home"
                    textSize = 24f //sp
                }.lparams {
                    alignParentLeft()
                    centerVertically()
                }
                imageView {
                    id = R.id.search
                    imageResource = R.drawable.search
                }.lparams {
                    alignParentRight()
                    centerVertically()
                }
            }.lparams(width = matchParent , height = dip(40)) {
                leftMargin = dip(15)
                topMargin = dip(20)
                rightMargin = dip(15)
            }
            frameLayout {
                id = R.id.placeFragment
            }.lparams(width = matchParent, height = matchParent) {
                below(R.id.header)
            }
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                relativeLayout {
                    id = R.id.home
                    imageView {
                        id = R.id.imgHome
                        imageResource = R.drawable.sementara
                    }.lparams {
                        centerHorizontally()
                    }
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        textColor = resources.getColor(R.color.colorgrey)
                        text = resources.getString(R.string.home)
                        id = R.id.txHome
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent) {
                        below(R.id.imgHome)
                    }
                }.lparams(width = dip(0), height = matchParent) {
                    topMargin = dip(10)
                    weight = 1f
                }
                relativeLayout {
                    id = R.id.topChoise
                    imageView {
                        id = R.id.imgTopChoise
                        imageResource = R.drawable.sementara
                    }.lparams {
                        centerHorizontally()
                    }
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        textColor = resources.getColor(R.color.colorgrey)
                        id = R.id.txTopChoise
                        gravity = Gravity.CENTER
                        text = resources.getString(R.string.top_choise)
                    }.lparams(width = matchParent) {
                        below(R.id.imgTopChoise)
                    }
                }.lparams(width = dip(0), height = matchParent) {
                    topMargin = dip(10)
                    weight = 1f
                }
                relativeLayout {
                    id = R.id.create
                    imageView {
                        id = R.id.imgCreate
                        imageResource = R.drawable.sementara
                    }.lparams {
                        centerHorizontally()
                    }
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        textColor = resources.getColor(R.color.colorgrey)
                        text = resources.getString(R.string.create)
                        id = R.id.txCreate
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent) {
                        below(R.id.imgCreate)
                    }
                }.lparams(width = dip(0), height = matchParent) {
                    topMargin = dip(10)
                    weight = 1f
                }
                relativeLayout {
                    id = R.id.yourClass
                    imageView {
                        id = R.id.imgYourClass
                        imageResource = R.drawable.sementara
                    }.lparams {
                        centerHorizontally()
                    }
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        textColor = resources.getColor(R.color.colorgrey)
                        text = resources.getString(R.string.your_clases)
                        id = R.id.txYourClass
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent) {
                        below(R.id.imgYourClass)
                    }
                }.lparams(width = dip(0), height = matchParent) {
                    topMargin = dip(10)
                    weight = 1f
                }
                relativeLayout {
                    id = R.id.profile
                    imageView {
                        id = R.id.imgProfile
                        imageResource = R.drawable.sementara
                    }.lparams {
                        centerHorizontally()
                    }
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        textColor = resources.getColor(R.color.colorgrey)
                        id = R.id.txProfile
                        text = resources.getString(R.string.acount)
                        gravity = Gravity.CENTER
                    }.lparams(width = matchParent) {
                        below(R.id.imgProfile)
                    }
                }.lparams(width = dip(0), height = matchParent) {
                    topMargin = dip(10)
                    weight = 1f
                }
            }.lparams(width = matchParent) {
                bottomMargin = dip(10)
                alignParentBottom()
            }
        }
    }
}