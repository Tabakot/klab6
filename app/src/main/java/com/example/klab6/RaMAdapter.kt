package com.example.klab6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class RaMAdapter : RecyclerView.Adapter<RaMViewHolder>() {
    private var ramList: List<RaM> = emptyList()

    fun changeList(list: List<RaM>) {
        ramList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaMViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.ram_item, parent, false)
        return RaMViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RaMViewHolder, position: Int) {
        val ram = ramList[position]
        holder.nameTextView?.text = ram.name
        Picasso.get().load(ram.image).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return ramList.size
    }
}