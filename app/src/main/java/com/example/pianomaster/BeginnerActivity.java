package com.example.pianomaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.HashMap;

public class BeginnerActivity extends AppCompatActivity {

    Button beg_ex1, beg_ex2;
    ImageView img, img2, img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        beg_ex1 = findViewById(R.id.beg_ex1);
        beg_ex2 = findViewById(R.id.beg_ex2);
        img = findViewById(R.id.play_btn);
        img2 = findViewById(R.id.play_btn2);
        img3 = findViewById(R.id.play_btn3);

        if (Exercise1Activity.open2) {
            img.setImageResource(R.drawable.repeat);
        }

        if (Exercise2Activity.open3) {
            img2.setImageResource(R.drawable.repeat);
        }

        if (Beg3Activity.open_beg3) {
            img3.setImageResource(R.drawable.repeat);
        }

    }

    public void goToAnExercise1(View view) {
        Intent intent = new Intent(this, Exercise1Activity.class);
        startActivity(intent);

    }

    public void goToAnExercise2(View view) {
        Intent intent = new Intent(this, Exercise2Activity.class);
        startActivity(intent);

    }

    public void goToAnExercise3(View view) {
        Intent intent = new Intent(this, Beg3Activity.class);
        startActivity(intent);

    }


}