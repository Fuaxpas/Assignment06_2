package com.example.assignment06_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView4.text = intent.getStringExtra(ani)
        imageView3.setImageDrawable(ContextCompat.getDrawable(this@MainActivity2,intent.getIntExtra(image,-1)))
        textView5.text = intent.getStringExtra(dec)
    }
}