package com.example.calculatorv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            textView2.setText("0")
        }
        button5.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "7")
            } else {
                textView2.setText(textView2.text.toString() + "7")
            }
        }
        button6.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "8")
            } else {
                textView2.setText(textView2.text.toString() + "8")
            }
        }
        button7.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "9")
            } else {
                textView2.setText(textView2.text.toString() + "9")
            }
        }
        button9.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "4")
            } else {
                textView2.setText(textView2.text.toString() + "4")
            }
        }
        button10.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "5")
            } else {
                textView2.setText(textView2.text.toString() + "5")
            }
        }
        button11.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "6")
            } else {
                textView2.setText(textView2.text.toString() + "6")
            }
        }
        button13.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "1")
            } else {
                textView2.setText(textView2.text.toString() + "1")
            }
        }
        button14.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "2")
            } else {
                textView2.setText(textView2.text.toString() + "2")
            }
        }
        button15.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("")
                textView2.setText(textView2.text.toString() + "3")
            } else {
                textView2.setText(textView2.text.toString() + "3")
            }
        }
        button17.setOnClickListener {
            if (textView2.text == "0") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString() + "0")
            }
        }
        button2.setOnClickListener {
            if (textView2.text == "0" || textView2.text.length.toString() == "1") {
                textView2.setText("0")
            } else {
                textView2.setText(textView2.text.toString().dropLast(1))
            }
        }
    }
}