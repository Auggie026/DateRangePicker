package com.example.daterangepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daterangepicker.databinding.ActivityMainBinding
import com.google.android.material.datepicker.MaterialDatePicker

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showDateRangePicker()
    }


    private fun showDateRangePicker(){

        val dateRangePicker = MaterialDatePicker.Builder
            .dateRangePicker()
            .setTitleText("Select Date")
            .build()

        dateRangePicker.show(
            supportFragmentManager,
            "date_range_pucker"
        )

        dateRangePicker.addOnPositiveButtonClickListener { datePicked ->

            val startDate = datePicked.first
            val endDate = datePicked.second

            binding.tvDateRange.text = "StartDate: $startDate" +
            "\nEndDate: $endDate"


        }
    }
}