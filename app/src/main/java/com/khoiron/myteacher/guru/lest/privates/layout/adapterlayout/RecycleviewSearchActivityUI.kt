package com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout

import android.os.Build
import android.support.annotation.RequiresApi
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by khoiron on 17/04/18.
 */

class RecycleviewSearchActivityUI: AnkoComponent<ViewGroup> {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL

        }
    }
}