package com.khoiron.myteacher.guru.lest.privates.layout.serviselayout

import android.view.Gravity
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.utility.DimenValue
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by khoiron on 29/05/18.
 */

class DetailServiceUi<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        relativeLayout {
            relativeLayout {
                backgroundColor = resources.getColor(R.color.colorWhite)
                linearLayout {
                    id = R.id.header
                    orientation = LinearLayout.HORIZONTAL
                    relativeLayout {
                        backgroundColor = resources.getColor(R.color.colorWhite)
                        id = R.id.back
                        imageView {
                            id = R.id.backd
                            imageResource = R.drawable.backd
                        }.lparams(width = matchParent, height = matchParent)
                    }.lparams(width = dip(50), height = dip(45))
                    linearLayout {
                        backgroundColor = resources.getColor(R.color.colorsoftgrey)
                    }.lparams(width = dip(1), height = matchParent){
                        bottomMargin = dip(4)
                        topMargin = dip(4)
                    }
                    relativeLayout {
                        recyclerView {
                            id = R.id.rvMenuTop
                        }.lparams(height = dip(45)) {
                            centerHorizontally()
                        }
                    }.lparams(width = matchParent, height = dip(45))
                }.lparams(width = matchParent){
                    topMargin = dip(DimenValue.small_v_margin)
//                    bottomMargin = dip(DimenValue.small_v_margin)
                }
                frameLayout {
                    id = R.id.placeFragment
                }.lparams(width = matchParent, height = matchParent) {
                    below(R.id.header)
                    bottomMargin = dip(50)
                }
                linearLayout {
                    relativeLayout {
                        id = R.id.btnBook
                        backgroundColor = resources.getColor(R.color.colorPrimary)
                        linearLayout {
                            orientation = LinearLayout.HORIZONTAL
                            imageView {
                                id = R.id.btnBook1
                                imageResource = R.drawable.book
                            }
                            textView {
                                id = R.id.btnBook2
                                textSize = 16f //sp
                                textColor = resources.getColor(R.color.colorWhite)
                                gravity = Gravity.CENTER
                                text = "Book Now"
                            }.lparams(height = matchParent) {
                                leftMargin = dip(3)
                            }
                        }.lparams {
                            centerHorizontally()
                            centerVertically()
                        }
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 1f
                    }
                    relativeLayout {
                        id = R.id.btnAsk
                        backgroundColor = resources.getColor(R.color.colorgrey)
                        linearLayout {
                            orientation = LinearLayout.HORIZONTAL
                            relativeLayout {
                                imageView {
                                    id = R.id.btnAsk1
                                    imageResource = R.drawable.ask
                                }.lparams(width = dip(30), height = dip(30)) {
                                    centerVertically()
                                }
                            }
                            textView {
                                id = R.id.btnAsk2
                                textSize = 16f //sp
                                textColor = resources.getColor(R.color.colorWhite)
                                gravity = Gravity.CENTER
                                text = "Ask"
                            }.lparams(height = matchParent) {
                                leftMargin = dip(5)
                            }
                        }.lparams {
                            centerHorizontally()
                            centerVertically()
                        }
                    }.lparams(width = dip(0), height = matchParent) {
                        weight = 1f
                    }
                }.lparams(width = matchParent, height = dip(50)) {
                    alignParentBottom()
                }
            }
        }
    }
}