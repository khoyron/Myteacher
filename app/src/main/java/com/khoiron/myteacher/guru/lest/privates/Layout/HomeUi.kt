package com.khoiron.myteacher.guru.lest.privates.Layout

import android.view.View
import com.khoiron.myteacher.guru.lest.privates.Activity.Home
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.textView

/**
 * Created by khoiron on 29/05/18.
 */

class HomeUi : AnkoComponent<Home> {
    override fun createView(ui: AnkoContext<Home>) = with(ui) {
        linearLayout {
            textView {
                text = "Hello World!"
            }
        }
    }
}