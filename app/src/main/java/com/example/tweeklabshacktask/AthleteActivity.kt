package com.example.tweeklabshacktask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tweeklabshacktask.databinding.ActivityAthleteBinding

class AthleteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAthleteBinding
    private lateinit var athlete: Athlete
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_athlete)
        binding = ActivityAthleteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        athlete = Athlete().returnDetails() // function which returns the athlete object
    }

    override fun onStart() {
        super.onStart()
        binding.AthleteName.text = athlete.name
        binding.AthleteSport.text = athlete.sport

        var countBalls =0
        var countsessions =0
        for(x in athlete.sessions) {
            countsessions++
            countBalls += x.numActivity()!!
        }

        binding.BallsBowled.text = getString(R.string.balls, countBalls)
        binding.NumSessions.text = getString(R.string.numSessions, countsessions)
        binding.sessionOne.text = athlete.sessions[0].toString()
        binding.sessionTwo.text = athlete.sessions[1].toString()
    }
}