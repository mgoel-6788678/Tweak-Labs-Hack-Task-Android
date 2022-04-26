package com.example.tweeklabshacktask

class Athlete {
    var name: String? = null
    var sport: String? = null
    lateinit var sessions: List<Session>

    init {
        name = "Sample Bowler"
        sport = "Pace Bowler"
        sessions = listOf(Session(), Session())
    }

    fun returnDetails(): Athlete {
        return this
    }
}