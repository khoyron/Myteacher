package com.khoiron.myteacher.guru.lest.privates.layout

import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

/**
 * Created by khoiron on 22/06/18.
 */
class YourClassFragmentUi<T>: AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui){
        verticalLayout {
            textView {
                text = "YourClassFragmentUi"
            }
        }
    }
}