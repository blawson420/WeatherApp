package com.example.weatherapp;

public class WeatherModel {
    int icon;
    String weatherDetails;

    public WeatherModel(int icon, String weatherDetails) {
        this.icon = icon;
        this.weatherDetails = weatherDetails;
    }

    public int getIcon() {
        return icon;
    }

    public String getWeatherDetails() {
        return weatherDetails;
    }
}