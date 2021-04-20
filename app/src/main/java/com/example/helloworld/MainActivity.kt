package com.example.helloworld

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // variable declaration for counting numbers
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Function definition(as refrence in activity_main.xml)
    fun increase(view : View){
        // increment operation
        counter++
        // Getting updated value of the counter on tex-view
        val textView = findViewById(R.id.count) as TextView
        textView.text =  "$counter"
    }
}