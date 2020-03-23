package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnConfirm.setOnClickListener {
            checkAnswer()
        }

    }



    private fun checkAnswer() {
        val answer = etAnswer.text.toString()

        val messageResult =  if (answer == getString(R.string.giraffe)) {
            R.string.correct
        } else {
            R.string.incorrect
        }
        Toast.makeText(this, messageResult , Toast.LENGTH_LONG).show()

    }



}
