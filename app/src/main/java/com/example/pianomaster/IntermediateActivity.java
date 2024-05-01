package com.example.pianomaster;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IntermediateActivity extends AppCompatActivity {

    Button beg_ex1, beg_ex2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        beg_ex1 = findViewById(R.id.beg_ex1);
        beg_ex2 = findViewById(R.id.beg_ex2);

    }

    public void goToAnExercise1(View view) {
        Intent intent = new Intent(this, Inter1Activity.class);
        startActivity(intent);

    }

    public void goToAnExercise2(View view) {
        Intent intent = new Intent(this, Inter2Activity.class);
        startActivity(intent);

    }

    public void goToAnExercise3(View view) {
        Intent intent = new Intent(this, Inter3Activity.class);
        startActivity(intent);

    }

    public void goToAnExercise4(View view) {
        Intent intent = new Intent(this, Inter4Activity.class);
        startActivity(intent);

    }


}