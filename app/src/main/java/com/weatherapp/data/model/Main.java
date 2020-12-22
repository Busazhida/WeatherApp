package com.weatherapp.data.model;

import com.google.gson.annotations.SerializedName;

public class Main {
    @SerializedName("temp")
    private double temp;

    @SerializedName("feels_like")
    private double feels_like;

    @SerializedName("temp_min")
    private double temp_min;

    @SerializedName("temp_max")
    private double temp_max;

    @SerializedName("pressure")
    private Integer pressure;

    @SerializedName("humidity")
    private Integer humidity;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}
