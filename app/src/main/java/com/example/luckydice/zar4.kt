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
import kotlin.random.Random

class zar4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_zar4)
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
        val ivDice2: ImageView = findViewById(R.id.ivDice2)
        val ivDice3: ImageView = findViewById(R.id.ivDice3)
        val ivDice4: ImageView = findViewById(R.id.ivDice4)
        val btnRoll: Button = findViewById(R.id.btnRoll)
        val tvTotal: TextView = findViewById(R.id.tvTotal)

        btnRoll.setOnClickListener {
            val result1 = rollDice()
            val result2 = rollDice()
            val result3 = rollDice()
            val result4 = rollDice()

            val drawableResource1 = getDrawableResource(result1)
            val drawableResource2 = getDrawableResource(result2)
            val drawableResource3 = getDrawableResource(result3)
            val drawableResource4 = getDrawableResource(result4)

            ivDice1.setImageResource(drawableResource1)
            ivDice2.setImageResource(drawableResource2)
            ivDice3.setImageResource(drawableResource3)
            ivDice4.setImageResource(drawableResource4)

            val total = result1+result2+result3+result4
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