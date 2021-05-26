package com.example.klab6

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RaMViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var nameTextView: TextView? = null
    var imageView: ImageView? = null

    init {
        nameTextView = itemView.findViewById(R.id.name)
        imageView = itemView.findViewById(R.id.image)
    }
}
