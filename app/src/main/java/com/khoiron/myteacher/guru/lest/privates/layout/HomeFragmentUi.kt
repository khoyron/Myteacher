package com.khoiron.myteacher.guru.lest.privates.layout

import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.Utility.DimenValue
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.support.v4.nestedScrollView

/**
 * Created by khoiron on 22/06/18.
 */
class HomeFragmentUi<T>: AnkoComponent<T> {
    override fun createView(ui: AnkoContext<T>) = with(ui){
        linearLayout {
            orientation = LinearLayout.VERTICAL
            nestedScrollView {
                isFillViewport = true
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    relativeLayout {
                        id = R.id.btnRobotic
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_robotic)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent, height = matchParent) {
                            centerVertically()
                        }
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        rightMargin = dip(DimenValue.medium_v_margin)
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                    }
                    recyclerView {
                        id = R.id.rvRobotic
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
                    relativeLayout {
                        id = R.id.btnMatematic
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_matematic)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent, height = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvMatematic
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
                    relativeLayout {
                        id = R.id.btnBiologic
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_biologic)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent, height = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvBiologic
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
                    relativeLayout {
                        id = R.id.btnComputer
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_Computer)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        rightMargin = dip(DimenValue.medium_v_margin)
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                    }
                    recyclerView {
                        id = R.id.rvComputer
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
                    relativeLayout {
                        id = R.id.btnSosialScience
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_sosial_sciences)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvSocilaSciance
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
                    relativeLayout {
                        id = R.id.btnNaturalScience
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_natural_sciences)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvNaturalScience
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
                    relativeLayout {
                        id = R.id.btnReligi
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_religi)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        rightMargin = dip(DimenValue.medium_v_margin)
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                    }
                    recyclerView {
                        id = R.id.rvReligions
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                    }
                    linearLayout {
                        backgroundColor = resources.getColor(R.color.colorsoftgrey)
                    }.lparams(width = matchParent, height = dip(1)) {
                        rightMargin = dip(DimenValue.medium_v_margin)
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_v_margin)
                    }
                    relativeLayout {
                        id = R.id.btnArtAndCulture
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_art_and_culture)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvArtAndCulture
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
                    relativeLayout {
                        id = R.id.btnOther
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            textColor = resources.getColor(R.color.colorgreyblack)
                            text = resources.getString(R.string.title_other)
                            textSize = DimenValue.medium_margin.toFloat()
                        }.lparams(width = matchParent)
                        textView {
                            typeface = Typeface.createFromAsset(context.assets, "fonts/avenir_heavy.ttf")
                            gravity = Gravity.CENTER
                            textSize = DimenValue.medium_v_margin.toFloat()
                            text = "See All"
                            textColor = resources.getColor(R.color.colorPrimary)
                        }.lparams {
                            centerVertically()
                            alignParentRight()
                        }
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        topMargin = dip(DimenValue.medium_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                        rightMargin = dip(DimenValue.medium_v_margin)
                    }
                    recyclerView {
                        id = R.id.rvOther
                    }.lparams(width = matchParent) {
                        leftMargin = dip(DimenValue.medium_v_margin)
                        bottomMargin = dip(DimenValue.medium_margin)
                    }
                }.lparams(width = matchParent, height = matchParent)
            }.lparams(width = matchParent, height = matchParent)
        }
    }

}