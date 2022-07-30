package com.example.naqil_maqal

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.naqil_maqal.databinding.ItemBinding

class TextAdapter : RecyclerView.Adapter<TextViewHolder>() {
    var models = listOf<ItemText>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_categories, parent, false)
        val binding = ItemBinding.bind(itemView)
        return TextViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bind(models[position])
    }

    override fun getItemCount(): Int = models.size

}