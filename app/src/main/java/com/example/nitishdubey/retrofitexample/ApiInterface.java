package com.example.nitishdubey.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Nitish Dubey on 09-05-2018.
 */

/*
Take a look to other annotations:

@Path – variable substitution for the API endpoint. For example movie id will be swapped for{id} in the URL endpoint.

@Query – specifies the query key name with the value of the annotated parameter.

@Body – payload for the POST call

@Header – specifies the header with the value of the annotated parameter
*/

public interface ApiInterface {


    @GET("fnGetAllCategoryJASON/{IMEINo}")
    Call<TableContains>getCategory(@Path("IMEINo") String imei);

  /*  @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);*/
}
