package com.example.pianomaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    static SharedPreferences settings;
    static boolean firstRun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                settings=getSharedPreferences("prefs",0);
                firstRun=settings.getBoolean("firstRun",true);
                if(firstRun)//if running for first time
                //Splash will load for first time
                {
                    SharedPreferences.Editor editor=settings.edit();
                    editor.putBoolean("firstRun",false);
                    editor.apply();
                    Intent i=new Intent(SplashActivity.this, OnBoarding.class);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Intent a=new Intent(SplashActivity.this, HomePageActivity.class);
                    startActivity(a);
                    finish();
                }
            }
        }, 2000);
    }
}