package com.weatherapp.data.network;

import com.weatherapp.data.model.ResponseBody;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET("data/2.5/weather")
    Call<ResponseBody> getResponse(@Query("q") String q,
                                   @Query("appid") String apid);

}
