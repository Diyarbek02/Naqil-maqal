package com.example.naqil_maqal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.naqil_maqal.databinding.FragmentCategoriesBinding
import com.example.naqil_maqal.databinding.ItemBinding

class CategoriesFragment : Fragment(R.layout.fragment_categories) {
    private lateinit var binding: FragmentCategoriesBinding
    private val adapter = TextAdapter()
    private val list = mutableListOf<ItemText>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_categories, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCategoriesBinding.bind(view)

        fillList()
        adapter.models = list

        binding.apply {
            recyclerView1.adapter = adapter
        }

    }

    private  fun fillList(){
        repeat(24) { j ->
            list.add(ItemText("${j+1}"))
        }
    }
}

