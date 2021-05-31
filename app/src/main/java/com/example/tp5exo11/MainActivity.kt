package com.example.tp5exo11

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.edit
import android.text.Layout as L

var EXTRA_MESSAGE = 0xFF3700B3.toInt()

class MainActivity : AppCompatActivity() {
    fun sendMessage(view: View) {



     //   val editText = findViewById<EditText>(R.id.editText1)
       // val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
             putIntExtra(EXTRA_MESSAGE,11111111)
        }
        startActivity(intent)
    }

    private fun putIntExtra(extraMessage: Int, i: Int) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pref = getSharedPreferences("fileName", Context.MODE_PRIVATE)

        val bak1= findViewById<ConstraintLayout>(R.id.con)
        bak1.setBackgroundColor(-1*pref.getInt("color", 0xFFFFFFFF.toInt()))

        val text=findViewById<TextView>(R.id.textView)
        text.text= pref.getInt("color",122).toString()
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {




    this.sendMessage(btn)


        }


    }






    /** Called when the user taps the Send button */

}