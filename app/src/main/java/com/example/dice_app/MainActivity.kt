package com.example.dice_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var imgDice1 : ImageView
    lateinit var imgDice2  : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceBtn = findViewById<Button>(R.id.button_dice) //set the button to the variable

        diceBtn.setOnClickListener{
        //define the button function on click

            //calling function
            rollDice1()
            rollDice2()
        }
    }
    //OR you can use functions to simplify the code
    fun rollDice1(){
        imgDice1 = findViewById(R.id.img_dice) //set the image view to the variable - dice 1


        val randomNumber = (1..6).random()//random value to 1 to 6

        val diceImage = when(randomNumber)
        {
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
        imgDice1.setImageResource(diceImage) //set image and display dice 1


    }

    fun rollDice2(){

        imgDice2 = findViewById(R.id.img_dice1) //set the image view to the variable  - dice 2

        val randomNumber = (1..6).random()//random value to 1 to 6

        val diceImage = when(randomNumber)
        {
            1-> R.drawable.dice1
            2-> R.drawable.dice2
            3-> R.drawable.dice3
            4-> R.drawable.dice4
            5-> R.drawable.dice5
            6-> R.drawable.dice6
            else -> R.drawable.dice_empty
        }

        imgDice2.setImageResource(diceImage) //set image and display dice 2

    }


}