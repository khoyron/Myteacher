package com.khoiron.myteacher.guru.lest.privates.layout.homescreen

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.textView

/**
 * Created by khoiron on 29/05/18.
 */

class SearchActivityUi<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        linearLayout {
            textView {
                text = "Hello World!"
            }
        }
    }
}