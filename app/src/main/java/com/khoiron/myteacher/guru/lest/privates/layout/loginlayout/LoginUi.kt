package com.khoiron.myteacher.guru.lest.privates.layout.loginlayout

import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.nestedScrollView

/**
 * Created by khoiron on 29/05/18.
 */

class LoginUi<T> : AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            backgroundColor = resources.getColor(R.color.colorWhite)
            linearLayout {
                orientation = LinearLayout.HORIZONTAL
                imageView {
                    id = R.id.backBtn
                    imageResource = R.drawable.back
                }.lparams(width = dip(55), height = matchParent) {
                    topMargin = dip(10)
                    leftMargin = dip(5)
                    bottomMargin = dip(10)
                }
                textView {
                    gravity = Gravity.CENTER
                    textSize = 22f //sp
                    textColor = resources.getColor(R.color.colorgrey)
                    text = resources.getString(R.string.sign_in)
                    textAlignment = View.TEXT_ALIGNMENT_TEXT_START
                }.lparams(width = matchParent, height = matchParent) {
                    leftMargin = dip(20)
                }
            }.lparams(width = matchParent, height = dip(55))
            linearLayout {
                backgroundResource = R.drawable.shadow
            }.lparams(width = matchParent, height = dip(7))
            nestedScrollView {
                //android:fillViewport = true //not support attribute
                linearLayout {
                    backgroundColor = resources.getColor(R.color.colorTransparant)
                    orientation = LinearLayout.VERTICAL
                    linearLayout {
                        id = R.id.facebook
                        orientation = LinearLayout.HORIZONTAL
                        backgroundResource = R.drawable.cornerlinear
                        relativeLayout{
                            imageView {
                                imageResource = R.drawable.logo_facebook
                            }.lparams(width = dip(35), height = dip(35)){
                                centerVertically()
                                centerHorizontally()
                            }
                        }.lparams(width = dip(50), height = matchParent)
                        textView {

                            textSize = 18f //sp
                            text = resources.getString(R.string.sign_in_with_facebook)
                            textColor = resources.getColor(R.color.colorgreybalck)
                            gravity = Gravity.CENTER

                        }.lparams(width = matchParent, height = matchParent) {
                            //                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent, height = dip(50)) {
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                        topMargin = dip(30)
                    }
                    linearLayout {
                        id = R.id.google
                        orientation = LinearLayout.HORIZONTAL
                        backgroundResource = R.drawable.cornerlinear
                        relativeLayout{
                            imageView {
                                imageResource = R.drawable.logo_google
                            }.lparams(width = dip(25), height = dip(25)){
                                centerVertically()
                                centerHorizontally()
                            }
                        }.lparams(width = dip(50), height = matchParent)
                        textView {
                            textSize = 18f //sp
                            text = resources.getString(R.string.sign_in_with_google)
                            textColor = resources.getColor(R.color.colorgreybalck)
                            gravity = Gravity.CENTER
                        }.lparams(width = matchParent, height = matchParent) {
                            //                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent, height = dip(50)) {
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                        topMargin = dip(15)
                    }
                    linearLayout {
                        orientation = LinearLayout.HORIZONTAL
                        relativeLayout {
                            linearLayout {
                                backgroundColor = resources.getColor(R.color.colorsoftgrey)
                            }.lparams(width = matchParent, height = dip(1)) {
                                centerVertically()
                            }
                        }.lparams(width = dip(0), height = dip(30)) {
                            rightMargin = dip(5)
                            weight = 5f
                        }
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            text = "Or"
                            textSize = 16f //sp
                            gravity = Gravity.CENTER
                            textColor = resources.getColor(R.color.colorgreybalck)
                        }.lparams(width = dip(0), height = dip(30)) {
                            weight = 1f
                        }
                        relativeLayout {
                            linearLayout {
                                backgroundColor = resources.getColor(R.color.colorsoftgrey)
                            }.lparams(width = matchParent, height = dip(1)) {
                                centerVertically()
                            }
                        }.lparams(width = dip(0), height = dip(30)) {
                            leftMargin = dip(5)
                            weight = 5f
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                        topMargin = dip(30)
                    }
                    linearLayout {
                        backgroundResource = R.drawable.cornerlinear
                        orientation = LinearLayout.VERTICAL
                        editText {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            id = R.id.etEmail
                            backgroundColor = resources.getColor(R.color.colorTransparant)
                            hintTextColor = resources.getColor(R.color.colorgreybalck)
                            hint = resources.getString(R.string.email_address)
                        }.lparams(width = matchParent, height = dip(45)) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(30)
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                    }
                    linearLayout {
                        backgroundResource = R.drawable.cornerlinear
                        orientation = LinearLayout.VERTICAL
                        editText {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            id = R.id.etPasssword
                            hintTextColor = resources.getColor(R.color.colorgreybalck)
                            hint = resources.getString(R.string.password)
                            backgroundColor = resources.getColor(R.color.colorTransparant)
                        }.lparams(width = matchParent, height = dip(45)) {
                            leftMargin = dip(10)
                        }
                    }.lparams(width = matchParent) {
                        topMargin = dip(7)
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                    }
                    button {
                        typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                        id = R.id.btnLogin
                        textSize = 18f //sp
                        textColor = resources.getColor(R.color.colorWhite)
                        backgroundResource = R.drawable.button_corner
                        text = resources.getString(R.string.sign_in)
                    }.lparams(width = matchParent, height = dip(48)) {
                        rightMargin = dip(20)
                        leftMargin = dip(20)
                        topMargin = dip(30)
                        bottomMargin = dip(20)
                    }
                    textView {
                        id = R.id.gotoRegister
                        textColor = resources.getColor(R.color.colorgreybalck)
                        gravity = Gravity.CENTER
                        text = resources.getString(R.string.forgot_password)
                    }.lparams(width = matchParent) {
                        leftMargin = dip(20)
                        rightMargin = dip(20)
                        bottomMargin = dip(30)
                    }
                }.lparams(width = matchParent, height = matchParent)
            }.lparams(width = matchParent, height = matchParent)
        }
    }
}