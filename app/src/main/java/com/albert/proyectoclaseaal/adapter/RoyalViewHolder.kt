package com.albert.proyectoclaseaal.adapter

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.albert.proyectoclaseaal.R

class RoyalViewHolder(view : View) : RecyclerView.ViewHolder(view){

    val tvName : TextView = view.findViewById(R.id.tv_item_recycler_name)

    val ivUserProfile : ImageView = view.findViewById(R.id.iv_item_recycler_image)
    val origen : TextView = view.findViewById(R.id.tv_item_recycler_origen)
    val tipo : TextView = view.findViewById(R.id.tv_item_recycler_tipo)

}
