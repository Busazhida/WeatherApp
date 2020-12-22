package com.weatherapp.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.weatherapp.App;
import com.weatherapp.data.model.ResponseBody;
import com.weatherapp.data.network.ResponseCallback;

public class WeatherFragmentViewModel extends ViewModel {

    protected MutableLiveData<ResponseBody> bodyMutableLiveData = new MutableLiveData<>();

    public void getBody() {
        App.service.getResponse("Bishkek", "4bbf5a1ed98cd9f688ebb3651474cdd2", new ResponseCallback() {

            @Override
            public void onSuccess(ResponseBody body) {
                if (body != null) {
                    bodyMutableLiveData.setValue(body);
                }
            }

            @Override
            public void onFailure(Throwable t) {
            }

        });
    }

}
