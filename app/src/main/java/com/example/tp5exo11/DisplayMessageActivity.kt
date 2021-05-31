package com.example.tp5exo11

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.edit
import androidx.core.view.get
import com.example.tp5exo11.MainActivity as MainActivity

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val pref = getSharedPreferences("fileName", Context.MODE_PRIVATE)

        //bak1.setBackgroundColor(- 0xFFFFFFFF.toInt())
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val bak1= findViewById<ConstraintLayout>(R.id.editText2)
        bak1.setBackgroundColor(-1*pref.getInt("color", 0xFFFFFFFF.toInt()))
        val message = intent.getIntExtra("EXTRA_MESSAGE",12)
        val textView = findViewById<TextView>(R.id.textView2).apply {
           // text = message
        }
        val radioGroup=findViewById<RadioGroup>(R.id.rb)

       // textView.text=pref.getInt("color",12).toString()
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val pref = getSharedPreferences("fileName", Context.MODE_PRIVATE)
            if ( R.id.radioButton==checkedId) {

                pref.edit {
                    putInt("color", 0xEE0038.toInt())

                }

            }
            if ( R.id.radioButton2==checkedId) {

                pref.edit {
                    putInt("color", 0x19DAC7.toInt())


                }


            }
            if ( R.id.radioButton3==checkedId) {

                pref.edit {
                    putInt("color", 0xFF3700B3.toInt())

                }

            }
            if ( R.id.radioButton4==checkedId) {

                pref.edit {
                    putInt("color", 0xFFEB3B.toInt())

                }

            }




            pref.edit().commit()
            }
val btn =findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }


        }



    }
