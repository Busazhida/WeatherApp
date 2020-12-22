package com.weatherapp.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weatherapp.App;
import com.weatherapp.data.model.ResponseBody;
import com.weatherapp.data.network.ResponseCallback;
import com.weatherapp.databinding.FragmentWeatherBinding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherFragment extends Fragment {

    protected FragmentWeatherBinding binding;
    protected WeatherFragmentViewModel vm;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWeatherBinding.inflate(inflater, container, false);
        vm = new ViewModelProvider(requireActivity()).get(WeatherFragmentViewModel.class);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm.getBody();
        setText();
    }

    @SuppressLint("SetTextI18n")
    private void setText() {
        vm.bodyMutableLiveData.observe(getViewLifecycleOwner(), body1 -> {
            @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd  'at' HH:mm:ss");
            double tempC = body1.getMain().getFeels_like() / 32;
            binding.tvCountry.setText("Country: " + body1.getSys().getCountry());
            binding.tvCity.setText("City: " + body1.getName());
            binding.tvTemp.setText("Temp: " + tempC);
            binding.tvBeginTime.setText("begin: " + dateFormat.format(body1.getSys().getSunrise()));
            binding.tvEndTime.setText("end: " + dateFormat.format(body1.getSys().getSunset()));
            binding.tvDescription.setText("description: " + body1.getWeather().get(0).getDescription());

        });


    }
}