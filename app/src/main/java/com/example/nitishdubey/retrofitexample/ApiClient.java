package com.example.nitishdubey.retrofitexample;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nitish Dubey on 09-05-2018.
 */

public class ApiClient {

    //http://103.20.212.194/RestServiceTest/RestServiceImpl.svc/fnGetAllCategoryJason/123345
    //
    public static final String BASE_URL = "http://103.20.212.194/RestServiceTest/RestServiceImpl.svc/";
   // public static final String BASE_URL = "http://api.themoviedb.org/3/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
