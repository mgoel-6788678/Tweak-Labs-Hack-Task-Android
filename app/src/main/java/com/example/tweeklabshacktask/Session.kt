package com.example.tweeklabshacktask

class Session {
    private var duration: String? = null
    private var activity: String? = null
    private var date: String? = null

    init {
        duration = "30 min"
        activity = "2 Balls"
        date = "12/02/2022"
    }

    override fun toString(): String {
        return "Session 1: $date\n$duration $activity"
    }
}