package com.example.naqil_maqal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.naqil_maqal.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(CategoriesFragment())
        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottom_navigation.setOnItemSelectedListener { item ->
            var fragment: Fragment
            when(item.itemId){
                R.id.maqallar -> {
                    fragment = CategoriesFragment()
                    loadFragment(fragment)
                    true
                }

                else -> {
                    false
                }
            }
        }

    }

    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit()
    }

}
