package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceBtn = findViewById<Button>(R.id.button_dice) //set the button to the variable

        diceBtn.setOnClickListener{//define the button function on click

            val randomNumber = (1..6).random()//random value to 1 to 6

            val txtDice = findViewById<TextView>(R.id.text_dice) //set the text view to the variable

            txtDice.text = randomNumber.toString() //convert the random number to a string and show it on that text view

        }
        //OR you can use functions to simplify the code
    }

}