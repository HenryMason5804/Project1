package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.util.TypedValue.*
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     private var initialSize:Float=0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialSize=findViewById<TextView>(R.id.CenterText).textSize
    }
    fun decreaseFont(){
        var paraText = CenterText
        var current_text_size:Float = paraText.textSize
        if (current_text_size > 5){
            current_text_size=current_text_size-5
        }
        else {
            current_text_size = 2F
        }
        paraText.setTextSize(COMPLEX_UNIT_PX, current_text_size)
    }

    fun realButtonClick(view: View){
        decreaseFont()
        Toast.makeText(this,"Wow you are so talented! Stay Litty",Toast.LENGTH_LONG).show()
    }




    fun fakeButtonClick(view: View) {
        decreaseFont()
        Toast.makeText(this, "PSYCHE YOU SUCK", Toast.LENGTH_LONG).show()
    }
    fun killBabies (view:View) {
        CenterText.setTextSize(COMPLEX_UNIT_PX, this.initialSize+5)
        Toast.makeText(this,"You just killed a baby you turd",Toast.LENGTH_LONG).show()

    }
    }