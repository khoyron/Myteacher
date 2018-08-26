package com.khoiron.myteacher.guru.lest.privates.layout.fragmentlayout

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.style
import org.jetbrains.anko.support.v4.nestedScrollView

/**
 * Created by khoiron on 22/06/18.
 */
class ProfileServicesFragmentUi<T>: AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui){
        linearLayout {
            orientation = LinearLayout.VERTICAL
            nestedScrollView {
                isFillViewport = true
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    imageView {
                        id = R.id.image
                    }.lparams(width = matchParent, height = dip(210))
                    textView {
                        id = R.id.title
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        gravity = Gravity.CENTER
                        textSize = 23f //sp
                        textColor = resources.getColor(R.color.greyblack)
                        text = "Asmiranda"
                        leftPadding = dip(20)
                        textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                    }.lparams(width = matchParent, height = dip(50))
                    linearLayout {
                        backgroundColor = resources.getColor(R.color.colorsoftgrey)
                    }.lparams(width = matchParent, height = dip(1)) {
                        leftMargin = dip(20)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        imageView {
                            imageResource = R.drawable.paket
                        }.lparams(width = dip(35))
                        linearLayout {
                            orientation = LinearLayout.VERTICAL
                            textView {
                                id = R.id.txPaket
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textSize = 17f //sp
                                text = "Paket 1-2 jam / hari"
                                textColor = resources.getColor(R.color.greyblack)
                            }.lparams(width = matchParent)
                            textView {
                                id = R.id.txAmount
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textSize = 17f //sp
                                text = "Rp 90.000 / IDR"
                                textColor = resources.getColor(R.color.colorPrimary)
                            }.lparams(width = matchParent) {
                                topMargin = dip(5)
                            }
                            textView {
                                id = R.id.txAddress
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textColor = resources.getColor(R.color.greyblack)
                                textSize = 17f //sp
                                text = "surabaya"
                            }.lparams(width = matchParent) {
                                topMargin = dip(5)
                            }
                        }.lparams(width = matchParent) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(10)
                        leftMargin = dip(20)
                    }
                    linearLayout {
                        backgroundColor = resources.getColor(R.color.colorsoftgrey)
                    }.lparams(width = matchParent, height = dip(1)) {
                        topMargin = dip(10)
                        leftMargin = dip(20)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        imageView {
                            imageResource = R.drawable.human
                        }.lparams(width = dip(35), height = dip(35))
                        ratingBar {
                            style { R.style.customRatingBar }
                            numStars = 5
                        }.lparams(width = dip(170), height = dip(35)) {
                            leftMargin = dip(10)
                        }
                        textView {
                            id = R.id.txReview
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorPrimary)
                            textSize = 17f
                            textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                            gravity = Gravity.CENTER
                            text = "0 review"
                        }.lparams(width = matchParent, height = matchParent) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(20)
                        topMargin = dip(10)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        imageView {
                            imageResource = R.drawable.descriptions
                        }.lparams(width = dip(35), height = dip(35))
                        linearLayout {
                            id = R.id.etServices
                            orientation = LinearLayout.VERTICAL
                            textView {
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textSize = 17f //sp
                                text = "Belajar matematic dengan methode main asik bintang"
                                textColor = resources.getColor(R.color.greyblack)
                            }.lparams(width = matchParent, height = matchParent)
                        }.lparams(width = matchParent) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(10)
                        leftMargin = dip(20)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        imageView {
                            imageResource = R.drawable.place
                        }.lparams(width = dip(35), height = matchParent)
                        linearLayout {
                            id = R.id.txFullAddress
                            orientation = LinearLayout.VERTICAL
                            textView {
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textSize = 17f //sp
                                text = "Based in Surabaya, City East Java Indonesia"
                                textColor = resources.getColor(R.color.greyblack)
                            }.lparams(width = matchParent, height = matchParent)
                        }.lparams(width = matchParent) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(10)
                        leftMargin = dip(20)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        imageView {
                            imageResource = R.drawable.gelar
                        }.lparams(width = dip(35))
                        linearLayout {
                            orientation = LinearLayout.VERTICAL
                            textView {
                                id = R.id.txJenjang
                                typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                                textSize = 17f //sp
                                text = "Dosen di Universitas Airlangga"
                                textColor = resources.getColor(R.color.colorPrimary)
                            }.lparams(width = matchParent, height = matchParent)
                        }.lparams(width = matchParent) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(10)
                        bottomMargin = dip(20)
                        leftMargin = dip(20)
                    }
                }
            }.lparams(width = matchParent, height = matchParent)
        }


    }

}