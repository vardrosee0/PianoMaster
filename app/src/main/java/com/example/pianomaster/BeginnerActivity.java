package com.example.pianomaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeginnerActivity extends AppCompatActivity {

    Button beg_ex1, beg_ex2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        beg_ex1 = findViewById(R.id.beg_ex1);
        beg_ex2 = findViewById(R.id.beg_ex2);

    }

    public void goToAnExercise2(View view) {
        Intent intent = new Intent(this, Exercise2Activity.class);
        startActivity(intent);

    }


}