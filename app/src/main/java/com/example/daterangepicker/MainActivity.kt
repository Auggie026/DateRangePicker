package com.example.daterangepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.datepicker.MaterialDatePicker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

            val starDate = datePicked.first
            val secondDate = datePicked.second

            Toast.makeText(this,
            "$starDate $secondDate",
            Toast.LENGTH_SHORT).show()
        }
    }
}