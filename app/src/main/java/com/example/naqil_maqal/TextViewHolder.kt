package com.example.naqil_maqal

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.example.naqil_maqal.databinding.ItemBinding

class TextViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("SetTextI18n")
    fun bind(text: ItemText) {
        binding.tvTitle.text = "Position $text"
    }
}