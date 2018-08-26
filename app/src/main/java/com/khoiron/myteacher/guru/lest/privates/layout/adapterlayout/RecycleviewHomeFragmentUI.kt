package com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout

import android.graphics.Typeface
import android.os.Build
import android.support.annotation.RequiresApi
import android.view.ViewGroup
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.*

/**
 * Created by khoiron on 17/04/18.
 */

class RecycleviewHomeFragmentUI: AnkoComponent<ViewGroup> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            linearLayout {
                orientation = LinearLayout.VERTICAL
                imageView {
                    id = R.id.imageRvHome
                }.lparams(width = matchParent, height = dip(160))
                textView {
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                    id = R.id.titleRvHome
                    textColor = resources.getColor(R.color.colorgreyblack)
                    textSize = 18f //sp
                    text = "Creative exercise 6 prompt jump start yourn next project"
                }.lparams(width = matchParent) {
                    topMargin = dip(5)
                }
                textView {
                    typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                    id = R.id.nameRvHome
                    text = "jhon pantau"
                    textSize = 14f //sp
                }.lparams(width = matchParent) {

                }
            }.lparams(width = dip(280)) {
                rightMargin = dip(15)
                leftMargin = dip(15)
            }
        }
    }
}