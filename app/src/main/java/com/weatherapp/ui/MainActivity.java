package com.weatherapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.weatherapp.R;
import com.weatherapp.data.model.ResponseBody;
import com.weatherapp.data.network.ResponseCallback;
import com.weatherapp.data.network.WeatherService;
import com.weatherapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

}