package com.weatherapp.data.network;

import com.weatherapp.data.model.ResponseBody;

public interface ResponseCallback {
    void onSuccess(ResponseBody body);

    void onFailure(Throwable t);
}

