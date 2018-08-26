package com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout

import android.graphics.Typeface
import android.os.Build
import android.support.annotation.RequiresApi
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.utility.DimenValue
import org.jetbrains.anko.*

/**
 * Created by khoiron on 17/04/18.
 */

class RecycleviewMenuTop: AnkoComponent<ViewGroup> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        relativeLayout {
            backgroundColor = resources.getColor(R.color.colorWhite)
            relativeLayout {
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    textView {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        id = R.id.titleMenu
                        textColor = resources.getColor(R.color.colorPrimary)
                        gravity = Gravity.CENTER
                        text = "Profile"
                        textSize = DimenValue.medium_v_margin.toFloat()
                    }.lparams(width = matchParent)
                }.lparams(width = matchParent) {
                    centerHorizontally()
                    centerVertically()
                    bottomMargin = dip(3)
                }
                linearLayout {
                    id = R.id.groundTitle
                    backgroundColor = resources.getColor(R.color.colorPrimary)
                }.lparams(width = matchParent, height = dip(3)) {
                    alignParentBottom()
                }
            }.lparams(width = dip(100), height = matchParent)
        }

    }
}