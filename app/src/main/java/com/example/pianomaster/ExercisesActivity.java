package com.example.pianomaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ExercisesActivity extends AppCompatActivity {
    ImageView ex2, ex1, ex3, ex4, lock2, lock3, lock4;
    TextView message;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        ex2 = findViewById(R.id.ex2);
        ex1 = findViewById(R.id.ex1);
        ex3 = findViewById(R.id.ex3);
        ex4 = findViewById(R.id.ex4);

        lock2 = findViewById(R.id.lock2);
        lock3 = findViewById(R.id.lock3);
        lock4 = findViewById(R.id.lock4);


        if (Exercise1Activity.open2) {
            ex2.setClickable(true);
            lock2.setBackgroundResource(R.drawable.baseline_lock_open_24);
        }

        if (Exercise2Activity.open3) {
            ex3.setClickable(true);
            lock3.setBackgroundResource(R.drawable.baseline_lock_open_24);

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
        Intent intent = new Intent(this, Exercise3Activity.class);
        startActivity(intent);
    }
}
