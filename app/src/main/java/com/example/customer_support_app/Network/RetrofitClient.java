package com.example.customer_support_app.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://vxvsvbnr-8000.euw.devtunnels.ms/";

    public Retrofit getRetrofitInstance()
    {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

       // private static String BASE_URL = "http://192.168.213.225/UserApi/";


//https://vxvsvbnr-8000.euw.devtunnels.ms/getManagers?role_id=rol_qLO42FIvSNsdZEO4