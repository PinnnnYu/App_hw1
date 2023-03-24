package com.example.myapplication_hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            intent?.extras?.let{
                val value = it.getString("text")
                val value1 = it.getString("text1")
                val editText2 = findViewById<EditText>(R.id.editTextTextPersonName3).getText().toString()
                val editText3 = findViewById<EditText>(R.id.editTextTextPersonName4).getText().toString()

                val bundle = Bundle()
                bundle.putString("text", value)
                bundle.putString("text1", value1)
                bundle.putString("text2", editText2)
                bundle.putString("text3", editText3)

                val intent = Intent().putExtras(bundle)
                setResult(Activity.RESULT_OK, intent.putExtras(bundle))
                finish()
            }
        }
    }

}