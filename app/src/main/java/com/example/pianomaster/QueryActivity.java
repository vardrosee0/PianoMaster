package com.example.pianomaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QueryActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    Boolean bt1 = false, bt2 = false, bt3 = false;
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        btn1 = findViewById(R.id.button_beginner);

        btn2 = findViewById(R.id.button_inter);

        btn3 = findViewById(R.id.button_advanced);

        next = findViewById(R.id.next);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1 = true;

                next.setVisibility(View.VISIBLE);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt2 = true;
                next.setVisibility(View.VISIBLE);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt3 = true;
                next.setVisibility(View.VISIBLE);
            }
        });

    }

    public void goToTheMainPage(View view) {
        if (bt1) {
            Intent intent = new Intent(this, BeginnerActivity.class);
            startActivity(intent);
        }


    }
}