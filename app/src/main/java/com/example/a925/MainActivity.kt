package com.example.a925

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var editText: EditText
    lateinit var radiogroup: RadioGroup
    lateinit var radiobutton1: RadioButton
    lateinit var radiobutton2: RadioButton
    lateinit var imageview: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.drawable.ic_launcher)

        button1.setOnClickListener {
            val inputText = editText.text.toString()
            Toast.makeText(applicationContext, inputText, Toast.LENGTH_SHORT).show()

            editText.clearFocus()
        }

        button2.setOnClickListener {
            val urlText = editText.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlText))
            startActivity(intent)
        }

        radiogroup.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId) {
                R.id.radiobutton1 -> {
                    imageview.setImageResource(R.drawable.pie)
                }
                R.id.radiobutton2 -> {
                    imageview.setImageResource(R.drawable.oreo)
                }
            }
        }
    }
}
