package com.khoiron.myteacher.guru.lest.privates.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.khoiron.myteacher.guru.lest.privates.R
import com.khoiron.myteacher.guru.lest.privates.activity.model.ModelRvHome
import com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout.RecycleviewHomeFragmentUI
import com.squareup.picasso.Picasso
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find

/**
 * Created by khoiron on 26/06/18.
 */
class RecyyclerAdapterHomeFragment( var ctx: Context?): RecyclerView.Adapter<RecyyclerAdapterHomeFragment.MyViewHolder>() {

    val context = ctx
    var data :MutableList<ModelRvHome> = ArrayList<ModelRvHome>()
    lateinit var onclikListenerRecycler :OnclikListenerRecycler

    fun setData(data: ArrayList<ModelRvHome>){
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyyclerAdapterHomeFragment.MyViewHolder {
        return MyViewHolder(RecycleviewHomeFragmentUI().createView(AnkoContext.create(parent!!.context, parent)))
    }


    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var data = data.get(position)
        Picasso.get()
                .load(data.image)
                .fit()
                .into(holder.img)
        holder.title.setText(data.title)
        holder.name.setText(data.name)

        holder.itemView.setOnClickListener { onclikListenerRecycler.onClik(99,position) }
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.find(R.id.imageRvHome)
        val title :TextView = itemView.find(R.id.titleRvHome)
        val name :TextView = itemView.find(R.id.nameRvHome)
    }

    fun onclick(onclikListenerRecycler :OnclikListenerRecycler){
        this.onclikListenerRecycler = onclikListenerRecycler
    }


}