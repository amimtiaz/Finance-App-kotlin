package com.imtiaz_acedamy.financeappkotlin.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.imtiaz_acedamy.financeappkotlin.R
import com.imtiaz_acedamy.financeappkotlin.databinding.ActivityMainBinding
import com.imtiaz_acedamy.financeappkotlin.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
    lateinit var binding: ActivityReportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.getRoot())

    }
}