package com.example.incrementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun increment(view: View){
        textView.text = (textView.text.toString().toInt() + 1).toString();
    }

    fun decrement(view: View){
        textView.text = if (textView.text.toString().toInt() > 0) (textView.text.toString().toInt() - 1).toString() else "0";
    }
}
