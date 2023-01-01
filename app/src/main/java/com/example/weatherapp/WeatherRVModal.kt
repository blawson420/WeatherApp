package com.example.weatherapp

class WeatherData {
    private var time: String = ""
    private var temp: String = ""
    private var icon: String = ""

    // Constructor
    constructor(time: String, temp: String, icon: String) {
        this.time = time
        this.temp = temp
        this.icon = icon
    }

    // Getters
    fun getTime(): String {
        return time
    }

    fun getTemp(): String {
        return temp
    }

    fun getIcon(): String {
        return icon
    }

    // Setters
    fun setTime(time: String) {
        this.time = time
    }

    fun setTemp(temp: String) {
        this.temp = temp
    }

    fun setIcon(icon: String) {
        this.icon = icon
    }
}
