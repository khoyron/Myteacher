package com.khoiron.myteacher.guru.lest.privates.Layout

import android.graphics.Typeface
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.Activity.SplashScreen
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.*

/**
 * Created by khoiron on 29/05/18.
 */

class SplashScreenUi : AnkoComponent<SplashScreen> {
    override fun createView(ui: AnkoContext<SplashScreen>) = with(ui) {
        relativeLayout {
            imageView {
                scaleType = ImageView.ScaleType.FIT_XY
                id = R.id.imageBg
            }.lparams(width = matchParent, height = matchParent)
            linearLayout {
                backgroundColor = resources.getColor(R.color.colorTransparant)
                orientation = LinearLayout.VERTICAL
                relativeLayout {
                    textView {
                        id = R.id.tvTitle
                        textColor = resources.getColor(R.color.colorWhite)
                        text = resources.getString(R.string.name)
                        textSize = 27f
                        gravity = Gravity.CENTER
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                    }.lparams {
                        centerVertically()
                        centerHorizontally()
                    }
                }.lparams(width = matchParent) {
                    topMargin = dip(70)
                }
            }.lparams(width = matchParent, height = matchParent)
            linearLayout {
                orientation = LinearLayout.VERTICAL
                textView {
                    gravity = Gravity.CENTER
                    textSize = 20f //sp
                    textColor = resources.getColor(R.color.colorWhite)
                    text = resources.getString(R.string.start_title1)
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                }.lparams(width = matchParent) {
                    bottomMargin = dip(8)
                }
                textView {
                    gravity = Gravity.CENTER
                    textSize = 16f //sp
                    textColor = resources.getColor(R.color.colorWhite)
                    text = resources.getString(R.string.start_title2)
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                }.lparams(width = matchParent) {
                    bottomMargin = dip(15)
                }
                button {
                    id = R.id.firstButton
                    backgroundResource = R.drawable.button_corner
                    textColor = resources.getColor(R.color.colorWhite)
                    text = resources.getString(R.string.get_started)
                }.lparams(width = matchParent, height = dip(46)) {
                    bottomMargin = dip(15)
                    leftMargin = dip(10)
                    rightMargin = dip(10)
                }
                textView {
                    gravity = Gravity.CENTER
                    textSize = 16f //sp
                    textColor = resources.getColor(R.color.colorWhite)
                    text = resources.getString(R.string.already_have)
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")

                }.lparams(width = matchParent) {
                    bottomMargin = dip(40)
                }
            }.lparams(width = matchParent) {
                alignParentBottom()
            }
        }
    }
}