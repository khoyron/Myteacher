package com.khoiron.myteacher.guru.lest.privates.adapter

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import com.khoiron.myteacher.guru.lest.privates.layout.adapterlayout.RecycleviewSearchActivityUI
import org.jetbrains.anko.AnkoContext

/**
 * Created by khoiron on 17/04/18.
 */

class SearchActivityAdapter (val context: Context?, var data: MutableList<String>, var onClik :OnclikListenerRecycler): RecyclerView.Adapter<SearchActivityAdapter.MyViewHolder>(), Filterable {

    var contactList : MutableList<String> = data

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecycleviewSearchActivityUI().createView(AnkoContext.create(parent!!.context, parent)))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listData = data[position]
       /* holder?.name.text = listData
        holder?.name.setOnClickListener {
            onClik.onClik(holder?.name.id,position)
        }*/
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val name: TextView = itemView.find(R.id.dataDialog)
    }

    override fun getFilter(): Filter {
        return object : Filter(){
            override fun performFiltering(charSequence: CharSequence?): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    data = contactList
                } else {
                    val filteredList :MutableList<String> = ArrayList()
                    for (row in contactList) {
                        if (row.toLowerCase().contains(charString.toLowerCase()) || row.contains(charSequence!!)) {
                            filteredList.add(row)
                        }
                    }

                    data = filteredList
                }

                val filterResults = FilterResults()
                filterResults.values = data
                return filterResults
            }

            override fun publishResults(charSequence: CharSequence?, filterResults: FilterResults?) {
                data = filterResults?.values as ArrayList<String>
                notifyDataSetChanged()
            }
        }
    }

}