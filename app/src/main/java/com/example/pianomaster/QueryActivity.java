package com.example.pianomaster;

import static com.example.pianomaster.SplashActivity.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class QueryActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    static Boolean bt1 = false, bt2 = false, bt3 = false, main = false;
    ImageView next;
    TextView leveltext, desc_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        btn1 = findViewById(R.id.button_beginner);

        btn2 = findViewById(R.id.button_inter);

        btn3 = findViewById(R.id.button_advanced);

        next = findViewById(R.id.next);
        leveltext = findViewById(R.id.leveltext);
        desc_text = findViewById(R.id.desc_text);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leveltext.setTextSize(27);
                leveltext.setText("Your level is: Beginner");
                desc_text.setText("Start your game by reviewing notes, how they sound and their position on the piano.");
                bt1 = true;
                bt3 = false;
                bt2 = false;
                next.setVisibility(View.VISIBLE);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leveltext.setTextSize(24);
                leveltext.setText("Your level is: Intermediate");
                desc_text.setText("Play simple and energetic melodies!");
                bt1 = false;
                bt3 = false;
                bt2 = true;
                next.setVisibility(View.VISIBLE);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leveltext.setTextSize(27);
                leveltext.setText("Your level is: Advanced");
                desc_text.setText("You need full concentration to be able to perform the complicated melodies.");
                bt1 = false;
                bt2 = false;
                bt3 = true;
                next.setVisibility(View.VISIBLE);
            }
        });

    }

    public void goToTheMainPage(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
        SharedPreferences.Editor editor= settings.edit();
        editor.putBoolean("done",true);
        editor.apply();


    }
}