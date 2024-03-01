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
    Button ex2, ex1;
    TextView message;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises);

        ex2 = findViewById(R.id.ex2);
        ex1 = findViewById(R.id.ex1);
        message = findViewById(R.id.messageExercise);
        arrow = findViewById(R.id.arrow);
        ex2.setClickable(false);



        if (Exercise1Activity.open2) {
            ex2.setClickable(true);
            ViewGroup.MarginLayoutParams marginParams1 = (ViewGroup.MarginLayoutParams) arrow.getLayoutParams();
            ViewGroup.MarginLayoutParams marginParams2 = (ViewGroup.MarginLayoutParams) message.getLayoutParams();
            marginParams1.setMargins(460,
                    marginParams1.topMargin,
                    marginParams1.rightMargin,
                    marginParams1.bottomMargin);
            marginParams2.setMargins(300,
                    marginParams2.topMargin,
                    marginParams2.rightMargin,
                    marginParams2.bottomMargin);
            message.setText("Stepping into a harder exercise. Be more careful!");
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
}
