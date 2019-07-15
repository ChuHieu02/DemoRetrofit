package com.example.demoretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL = "http://171.244.27.194:7777/ServiceHosts/";
    private static RetrofitClient mInstance;
    private static Retrofit retrofit;


    public static Retrofit getRetrofitClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}
