package com.example.nitishdubey.retrofitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent intent=new Intent(SplashScreen.this,RetrofitActivity.class);
        startActivity(intent);
        finish();
    }
}
