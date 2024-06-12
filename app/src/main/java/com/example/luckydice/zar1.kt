package com.example.luckydice

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.random.Random

class zar1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_zar1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button1:Button=findViewById(R.id.button3)
        button1.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }


        val ivDice1: ImageView = findViewById(R.id.ivDice)
        val btnRoll: Button = findViewById(R.id.btnRoll)
        val tvTotal: TextView = findViewById(R.id.tvTotal)

        btnRoll.setOnClickListener {
            val result1 = rollDice()

            val drawableResource1 = getDrawableResource(result1)

            ivDice1.setImageResource(drawableResource1)

            val total = result1
            tvTotal.text = "TOPLAM: $total"

        }
    }

    private fun rollDice(): Int {
        return Random.nextInt(1, 7)
    }

    private fun getDrawableResource(result: Int): Int {
        return when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}