package com.example.tweeklabshacktask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
//import android.widget.Toast
import com.example.tweeklabshacktask.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun signIn(view: View): Boolean{
        val pNum = this.binding.phoneNumber.editableText.toString()
        val pass = this.binding.Password.editableText.toString()

        val returnValue = pNum == "9876543210" && pass == "password"

        if (returnValue) {
            val intent = Intent(this, AthleteActivity::class.java)
            startActivity(intent)
        }else Toast.makeText(this, "Incorrect number or password entered", Toast.LENGTH_LONG).show()
        return returnValue
    }
}