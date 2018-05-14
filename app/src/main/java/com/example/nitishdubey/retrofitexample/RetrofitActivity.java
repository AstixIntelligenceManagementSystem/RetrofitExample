package com.example.nitishdubey.retrofitexample;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {

    private ProgressDialog pDialogRegisterLogin;
    RecyclerView recyclerView;
    Button btn_getData;
    List<TableContains> movies;

    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "6c4f05f22b82eb3d18e0debb648cb051";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        pDialogRegisterLogin = new ProgressDialog(RetrofitActivity.this);
          recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
       btn_getData= (Button) findViewById(R.id.btn_getData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        btn_getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //new FetchData().execute();
                createRetrofitRequest();
            }
        });

    }



    private void createRetrofitRequest() {

        pDialogRegisterLogin.setTitle("Please Wait");
        pDialogRegisterLogin.setMessage("While we fetching data.");
        pDialogRegisterLogin.setIndeterminate(false);
        pDialogRegisterLogin.setCancelable(false);
        pDialogRegisterLogin.setCanceledOnTouchOutside(false);
        pDialogRegisterLogin.show();
        movies=new ArrayList<TableContains>();

        ApiInterface apiService=ApiClient.getClient().create(ApiInterface.class);

       // Call<MoviesResponse> call = apiService.getTopRatedMovies(API_KEY);
        Call<TableContains> call = apiService.getCategory("12345");

        //public abstract void enqueue(retrofit2.Callback<T> callback)
       // Asynchronously send the request and notify callback of its response or if an error occurred talking to the server, creating the request, or processing the response.
        call.enqueue(new Callback<TableContains>() {
            @Override
            public void onResponse(Call<TableContains> call, Response<TableContains> response) {
                if(pDialogRegisterLogin.isShowing())
                {
                    pDialogRegisterLogin.dismiss();
                }

                List<TablesHeader> movies = response.body().getAllCategoryJasonResult();
                List<CategoryMaster> ctgryMstr = null;
                for(TablesHeader mheader:movies )
                {
                   ctgryMstr.addAll(mheader.getListCatgry());
                }
                if(ctgryMstr!=null && ctgryMstr.size()>0)
                   recyclerView.setAdapter(new MoviesAdapter(ctgryMstr, R.layout.list_item_movie, getApplicationContext()));
               
               //List<Movie> movies = response.body().getResults();

               // 

            }

            @Override
            public void onFailure(Call<TableContains> call, Throwable t) {
                if(pDialogRegisterLogin.isShowing())
                {
                    pDialogRegisterLogin.dismiss();
                }
                System.out.println("Error Data = "+toString().toString());
            }
        });


    }
}
