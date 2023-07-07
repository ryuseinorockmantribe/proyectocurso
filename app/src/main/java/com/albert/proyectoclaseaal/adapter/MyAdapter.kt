package com.albert.proyectoclaseaal.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.albert.proyectoclaseaal.R
import com.albert.proyectoclaseaal.recycler.data.UserItem
import com.bumptech.glide.Glide

class MyAdapter(private val dataList : List<UserItem>) : RecyclerView.Adapter<RoyalViewHolder>(){

    /** */
    override fun getItemCount(): Int = dataList.size

    /** */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoyalViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler,parent,false)
        return RoyalViewHolder(view)

    }

    /** */
    override fun onBindViewHolder(holder: RoyalViewHolder, position: Int) {

        val userItem : UserItem = dataList[position]

        holder.tvName.text = userItem.name
        holder.origen.text = userItem.origen
        holder.tipo.text = userItem.tipo


            val context = holder.itemView.context



            Glide.with(context).load(userItem.imageURLValue).into(holder.ivUserProfile)






    }

}