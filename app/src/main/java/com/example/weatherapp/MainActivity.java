package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.weatherapp.R;
import com.example.weatherapp.WeatherRVAdapter;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ArrayList<WeatherModel> weatherModels = new ArrayList<>();
    int[] weatherImages = {R.drawable.sunny, R.drawable.cloudy, R.drawable.storm};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.horizontalRV);
        setWeatherModels();

        WeatherRVAdapter adapter = new WeatherRVAdapter(this, weatherModels);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void setWeatherModels() {
        String[] details = getResources().getStringArray(R.array.weather_details);

        for (int i = 0; i < 8; i++) {
            Random rand = new Random();
            int randomWeather = rand.nextInt(3);
            weatherModels.add(new WeatherModel(weatherImages[randomWeather], details[randomWeather]));
        }
    }
}