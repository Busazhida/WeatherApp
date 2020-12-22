package com.weatherapp;

import android.app.Application;

import com.weatherapp.data.network.WeatherService;

public class App extends Application {
    public static WeatherService service;

    @Override
    public void onCreate() {
        super.onCreate();
        service = new WeatherService();
    }
}
