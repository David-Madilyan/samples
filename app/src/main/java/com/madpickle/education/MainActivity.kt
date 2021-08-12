package com.madpickle.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.madpickle.education.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var mViewmodel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        NavigationUI.setupActionBarWithNavController(this, findNavController(R.id.main_nav_fragment))

//        mViewmodel = AndroidViewModel.of(this).get(MainViewModel::class.java)
        mViewmodel = ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onSupportNavigateUp() = findNavController(R.id.main_nav_fragment).navigateUp()

}