package com.example.pianomaster;

import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

public class Exercise2Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    TextView congrats, points, inform;
    int pos = 1;
    ProgressBar progressBar;
    TreeMap<Integer, String> notes = new TreeMap<>();

    Button b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36;
    int a3, a3sh, a4, a4sh, a5, a5sh, b3_, b4_, b5_, c3, c3sh, c4, c4sh, c5, c5sh, c6, d3, d3sh;
    int d4, d4sh, d5, d5sh, e3, e4, e5, f3, f3sh, f4, f4sh, f5, f5sh, g3, g3sh, g4, g4sh, g5, g5sh;
    private SoundPool soundPool;
    public static boolean open3;


    // piano notes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        congrats = findViewById(R.id.congrats);
        points = findViewById(R.id.points);
        inform = findViewById(R.id.textView3);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(280);

        points.setText(String.valueOf(Exercise1Activity.points_amount));

        notes.put(1, "c4");
        notes.put(2, "c4");
        notes.put(3, "g4");
        notes.put(4, "g4");
        notes.put(5, "a4");
        notes.put(6, "a4");
        notes.put(7, "g4");

        notes.put(8, "f4");
        notes.put(9, "f4");
        notes.put(10, "e4");
        notes.put(11, "e4");
        notes.put(12, "d4");
        notes.put(13, "d4");
        notes.put(14, "c4");


        b1 = findViewById(R.id.k1);
        b2 = findViewById(R.id.b1);
        b3 = findViewById(R.id.k2);
        b4 = findViewById(R.id.b2);
        b5 = findViewById(R.id.k3);
        b6 = findViewById(R.id.k4);
        b7 = findViewById(R.id.b3);
        b8 = findViewById(R.id.k5);
        b9 = findViewById(R.id.b4);
        b10 = findViewById(R.id.k6);
        b11 = findViewById(R.id.b5);
        b12 = findViewById(R.id.k7);
        b13 = findViewById(R.id.k8);
        b14 = findViewById(R.id.b6);
        b15 = findViewById(R.id.k9);
        b16 = findViewById(R.id.b7);
        b17 = findViewById(R.id.k10);
        b18 = findViewById(R.id.k11);
        b19 = findViewById(R.id.b8);
        b20 = findViewById(R.id.k12);
        b21 = findViewById(R.id.b9);
        b22 = findViewById(R.id.k13);
        b23 = findViewById(R.id.b10);
        b24 = findViewById(R.id.k14);
        b25 = findViewById(R.id.k15);
        b26 = findViewById(R.id.b11);
        b27 = findViewById(R.id.k16);
        b28 = findViewById(R.id.b12);
        b29 = findViewById(R.id.k17);
        b30 = findViewById(R.id.k18);
        b31 = findViewById(R.id.b13);
        b32 = findViewById(R.id.k19);
        b33 = findViewById(R.id.b14);
        b34 = findViewById(R.id.k20);
        b35 = findViewById(R.id.b15);
        b36 = findViewById(R.id.k21);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);

        soundPool = new SoundPool.Builder().setMaxStreams(6).build();

        c3 = soundPool.load(this, R.raw.c3, 1);
        c3sh = soundPool.load(this, R.raw.c3sh, 1);
        d3 = soundPool.load(this, R.raw.d3, 1);
        d3sh = soundPool.load(this, R.raw.d3sh, 1);
        e3 = soundPool.load(this, R.raw.e3, 1);
        f3 = soundPool.load(this, R.raw.f3, 1);
        f3sh = soundPool.load(this, R.raw.f3sh, 1);
        g3 = soundPool.load(this, R.raw.g3, 1);
        g3sh = soundPool.load(this, R.raw.g3sh, 1);
        a3 = soundPool.load(this, R.raw.a3, 1);
        a3sh = soundPool.load(this, R.raw.a3sh, 1);
        b3_ = soundPool.load(this, R.raw.b3, 1);
        c4 = soundPool.load(this, R.raw.c4, 1);
        c4sh = soundPool.load(this, R.raw.c4sh, 1);
        d4 = soundPool.load(this, R.raw.d4, 1);
        d4sh = soundPool.load(this, R.raw.d4sh, 1);
        e4 = soundPool.load(this, R.raw.e4, 1);
        f4 = soundPool.load(this, R.raw.f4, 1);
        f4sh = soundPool.load(this, R.raw.f4sh, 1);
        g4 = soundPool.load(this, R.raw.g4, 1);
        g4sh = soundPool.load(this, R.raw.g4sh, 1);
        a4 = soundPool.load(this, R.raw.a4, 1);
        a4sh = soundPool.load(this, R.raw.a4sh, 1);
        b4_ = soundPool.load(this, R.raw.b4, 1);
        c5 = soundPool.load(this, R.raw.c5, 1);
        c5sh = soundPool.load(this, R.raw.c5sh, 1);
        d5 = soundPool.load(this, R.raw.d5, 1);
        d5sh = soundPool.load(this, R.raw.d5sh, 1);
        e5 = soundPool.load(this, R.raw.e5, 1);
        f5 = soundPool.load(this, R.raw.f5, 1);
        f5sh = soundPool.load(this, R.raw.f5sh, 1);
        g5 = soundPool.load(this, R.raw.g5, 1);
        g5sh = soundPool.load(this, R.raw.g5sh, 1);
        a5 = soundPool.load(this, R.raw.a5, 1);
        a5sh = soundPool.load(this, R.raw.a5sh, 1);
        b5_ = soundPool.load(this, R.raw.b5, 1);


        playSound(c4, 1000);
        playSound(c4, 1400);
        playSound(g4, 1800);
        playSound(g4, 2200);
        playSound(a4, 2600);
        playSound(a4, 3000);
        playSound(g4, 3400);

        playSound(f4, 4100);
        playSound(f4, 4500);
        playSound(e4, 4900);
        playSound(e4, 5300);
        playSound(d4, 5700);
        playSound(d4, 6100);
        playSound(c4, 6500);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
                inform.setText("Play!");
            }
        }, 6800);

    }

    public void goToAnActivity(View view) {
        soundPool.release();
        Intent intent = new Intent(this, ExercisesActivity.class);
        startActivity(intent);
    }

    public void playSound(Button next_key, Button current_key, int pos1, String note) {
        if (Objects.equals(notes.get(pos1), note)){
            next_key.setBackgroundResource(R.drawable.right_selector);
            pos++;
            Exercise1Activity.points_amount += 10;
            points.setText(String.valueOf(Exercise1Activity.points_amount));
            progressBar.incrementProgressBy(20);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    current_key.setBackgroundResource(R.drawable.wrong_selector);
                }
            }, 100);
        }

    }


    public void playSound(int note, long millis) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                soundPool.play(note, 1, 1, 0, 0, 1);

            }
        }, millis);

    }


    // notes playing
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.k1:
                soundPool.play(c3, 1, 1, 0, 0, 1);
                break;
            case R.id.k2:
                soundPool.play(d3, 1, 1, 0, 0, 1);
                break;

            case R.id.k3:
                soundPool.play(e3, 1, 1, 0, 0, 1);
                break;

            case R.id.k4:
                soundPool.play(f3, 1, 1, 0, 0, 1);
                break;

            case R.id.k5:
                soundPool.play(g3, 1, 1, 0, 0, 1);
                break;

            case R.id.k6:
                soundPool.play(a3, 1, 1, 0, 0, 1);
                break;

            case R.id.k7:
                soundPool.play(b3_, 1, 1, 0, 0, 1);
                break;

            case R.id.k8:
                switch (pos) {
                    case 1: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20); break;
                    case 2: playSound(b20, b13, pos, "c4"); break;
                    case 14:
                        playSound(b12, b13, pos, "c4");
                        if (progressBar.getMax() == progressBar.getProgress()) {
                            inform.setVisibility(View.INVISIBLE);
                            congrats.setText("Incredible! New level is unlocked.");
                            open3 = true;
                        }
                        b12.setBackgroundResource(R.drawable.wrong_selector);
                        break;
                }

                soundPool.play(c4, 1, 1, 0, 0, 1);
                break;

            case R.id.k9:
                switch (pos) {
                    case 12: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20);
                        points.setText(String.valueOf(Exercise1Activity.points_amount)); break;
                    case 13: playSound(b13, b15, pos, "d4"); break;
                }
                soundPool.play(d4, 1, 1, 0, 0, 1);
                break;

            case R.id.k10:
                switch (pos) {
                    case 10: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20);
                        points.setText(String.valueOf(Exercise1Activity.points_amount));break;
                    case 11: playSound(b15, b17, pos, "e4"); break;
                }
                soundPool.play(e4, 1, 1, 0, 0, 1);
                break;

            case R.id.k11:
                switch (pos) {
                    case 8: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20);
                        points.setText(String.valueOf(Exercise1Activity.points_amount)); break;
                    case 9: playSound(b17, b18, pos, "f4"); break;
                }
                soundPool.play(f4, 1, 1, 0, 0, 1);
                break;

            case R.id.k12:
                switch (pos) {
                    case 3: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20);
                        points.setText(String.valueOf(Exercise1Activity.points_amount)); break;
                    case 4: playSound(b22, b20, pos, "g4"); break;
                    case 7: playSound(b18, b20, pos, "g4");break;
                }
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.k13:
                switch (pos) {
                    case 5: pos++; Exercise1Activity.points_amount += 10; progressBar.incrementProgressBy(20);
                        points.setText(String.valueOf(Exercise1Activity.points_amount)); break;
                    case 6: playSound(b20, b22, pos, "a4"); break;
                }
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.k14:
                soundPool.play(b4_, 1, 1, 0, 0, 1);
                break;

            case R.id.k15:
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.k16:
                soundPool.play(d5, 1, 1, 0, 0, 1);
                break;

            case R.id.k17:
                soundPool.play(e5, 1, 1, 0, 0, 1);
                break;

            case R.id.k18:
                soundPool.play(f5, 1, 1, 0, 0, 1);
                break;

            case R.id.k19:
                soundPool.play(g5, 1, 1, 0, 0, 1);
                break;

            case R.id.k20:
                soundPool.play(a5, 1, 1, 0, 0, 1);
                break;

            case R.id.k21:
                soundPool.play(b5_, 1, 1, 0, 0, 1);
                break;

            case R.id.b1:
                soundPool.play(c3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b2:
                soundPool.play(d3sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b3:
                soundPool.play(f3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b4:
                soundPool.play(g3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b5:
                soundPool.play(a3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b6:
                soundPool.play(c4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b7:
                soundPool.play(d4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b8:
                soundPool.play(f4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b9:
                soundPool.play(g4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b10:
                soundPool.play(a4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b11:
                soundPool.play(c5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b12:
                soundPool.play(d5sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b13:
                soundPool.play(f5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b14:
                soundPool.play(g5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b15:
                soundPool.play(a5sh, 1, 1, 0, 0, 1);
                break;
        }

    }
}