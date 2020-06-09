package com.example.android.greeterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<EditText>(R.id.name_field)
        findViewById<Button>(R.id.greeter)
        findViewById<TextView>(R.id.hello)

        greeter.setOnClickListener({
            Toast.makeText(this,"Welcome to Greeter App",Toast.LENGTH_SHORT).show()

            val name = name_field.text.toString()
            hello.setText("Hello, " + name)
        })
    }

}
