package com.example.luckydice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button1:ImageView=findViewById(R.id.imageView2)
        val button2:ImageView=findViewById(R.id.imageView3)
        val button3:ImageView=findViewById(R.id.imageView4)
        val button4:ImageView=findViewById(R.id.imageView5)
        val button5:ImageView=findViewById(R.id.imageView6)
        val button6:ImageView=findViewById(R.id.imageView7)

        button1.setOnClickListener {
            val intent = Intent (this, zar1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent (this, zar2::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent (this, zar3::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent (this, zar4::class.java)
            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent (this, zar5::class.java)
            startActivity(intent)
        }
        button6.setOnClickListener {
            val intent = Intent (this, zar6::class.java)
            startActivity(intent)
        }
    }
}