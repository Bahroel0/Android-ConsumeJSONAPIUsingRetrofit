package com.example.bahroel.consumptionjsonretrofit.API;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/android/jsonandroid")
    Call<JSONResponse> getJSON();
}
