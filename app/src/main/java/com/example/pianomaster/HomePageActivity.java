package com.example.pianomaster;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    Button beg_page, int_page, adv_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        beg_page = findViewById(R.id.beg_page);
        int_page = findViewById(R.id.int_page);
        adv_page = findViewById(R.id.adv_page);
        /*
        if (bt1) {
        }

        if (bt2) {
        }

        if (bt3) {
        }*/


    }

    public void goToBeg(View view) {
        Intent intent = new Intent(this, BeginnerActivity.class);
        startActivity(intent);
    }

    public void goToInt(View view) {
        Intent intent = new Intent(this, IntermediateActivity.class);
        startActivity(intent);
    }

    public void goToAdv(View view) {
        Intent intent = new Intent(this, AdvancedActivity.class);
        startActivity(intent);
    }


}