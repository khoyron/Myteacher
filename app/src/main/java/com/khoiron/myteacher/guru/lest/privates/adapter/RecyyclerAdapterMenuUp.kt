package com.khoiron.myteacher.guru.lest.privates.adapter

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout.RecycleviewMenuTop
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * Created by khoiron on 26/06/18.
 */
class RecyyclerAdapterMenuUp(var ctx: Context?): RecyclerView.Adapter<RecyyclerAdapterMenuUp.MyViewHolder>() {

    val context = ctx
    var selected = -1
    var data :MutableList<String> = ArrayList<String>()
    lateinit var onclikListenerRecycler :OnclikListenerRecycler

    fun setData(data: ArrayList<String>){
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyyclerAdapterMenuUp.MyViewHolder {
        return MyViewHolder(RecycleviewMenuTop().createView(AnkoContext.create(parent!!.context, parent)))
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var data = data.get(position)
        holder.title.setText(data)

        if (selected==position){
            holder.line.setBackgroundColor(ContextCompat.getColor(context!!, R.color.colorPrimary))
        }else{
            holder.line.setBackgroundColor(ContextCompat.getColor(context!!, R.color.colorWhite))

        }

        holder.itemView.setOnClickListener {
            selected = position
            onclikListenerRecycler.onClik(99,position)
            notifyDataSetChanged()
        }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val line: LinearLayout = itemView.find(R.id.groundTitle)
        val title :TextView = itemView.find(R.id.titleMenu)
    }

    fun onclick(onclikListenerRecycler :OnclikListenerRecycler){
        this.onclikListenerRecycler = onclikListenerRecycler
    }

}