package com.dicoding.submission.myapplication.view

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.FragmentManager
import com.dicoding.submission.myapplication.R
import com.dicoding.submission.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var bind : ActivityMainBinding? = null
    private val binding get() = bind!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        bind = null
    }

}