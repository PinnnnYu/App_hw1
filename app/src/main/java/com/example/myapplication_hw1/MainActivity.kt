package com.example.myapplication_hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editTextTextPersonName).getText().toString()
            val editText1 = findViewById<EditText>(R.id.editTextTextPersonName2).getText().toString()
            val bundle = Bundle()
            bundle.putString("text", editText)
            bundle.putString("text1", editText1)

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivityForResult(intent, 1)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let{
            if (requestCode ==1 && resultCode == Activity.RESULT_OK){
                findViewById<TextView>(R.id.textView).text = "${it.getString("text")}"
                findViewById<TextView>(R.id.textView1).text = "${it.getString("text1")}"
                findViewById<TextView>(R.id.textView2).text = "${it.getString("text2")}"
                findViewById<TextView>(R.id.textView3).text = "${it.getString("text3")}"
            }
        }
    }



}