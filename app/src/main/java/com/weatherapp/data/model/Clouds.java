package com.weatherapp.data.model;

import com.google.gson.annotations.SerializedName;

public class Clouds {
    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @SerializedName("all")
    private int all;


}
