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
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by khoiron on 17/04/18.
 */

class RecycleviewHomeFragmentParentUI: AnkoComponent<ViewGroup> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            linearLayout {
                orientation = LinearLayout.VERTICAL
                relativeLayout {
                    id = R.id.btnRobotic
                    textView {
                        id = R.id.titleCategory
                        textColor = resources.getColor(R.color.colorgreyblack)
                        text = resources.getString(R.string.title_robotic)
                        textSize = DimenValue.medium_margin.toFloat()
                    }.lparams(width = matchParent, height = matchParent) {
                        centerVertically()
                    }
                    textView {
                        gravity = Gravity.CENTER
                        textSize = DimenValue.medium_v_margin.toFloat()
                        text = "See All"
                        textColor = resources.getColor(R.color.colorPrimary)
                    }.lparams {
                        centerVertically()
                        alignParentRight()
                    }
                }.lparams(width = matchParent, height = dip(30)) {
                    rightMargin = dip(DimenValue.medium_v_margin)
                    leftMargin = dip(DimenValue.medium_v_margin)
                    topMargin = dip(DimenValue.medium_v_margin)
                    bottomMargin = dip(DimenValue.medium_margin)

                }
                recyclerView {
                    id = R.id.rvHomeInside
                }.lparams(width = matchParent) {
                    leftMargin = dip(DimenValue.medium_v_margin)
                }
                linearLayout {
                    backgroundColor = resources.getColor(R.color.colorsoftgrey)
                }.lparams(width = matchParent, height = dip(1)) {
                    rightMargin = dip(DimenValue.medium_v_margin)
                    leftMargin = dip(DimenValue.medium_v_margin)
                    topMargin = dip(DimenValue.medium_margin)
                }
            }.lparams(width = matchParent, height = dip(300))
        }
    }
}