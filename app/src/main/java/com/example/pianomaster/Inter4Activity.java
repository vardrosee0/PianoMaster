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

import java.util.HashMap;
import java.util.Objects;

import pl.droidsonroids.gif.GifImageView;

public class Inter4Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    TextView congrats, points, inform;
    int n = 8;
    Button b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36;
    int pos = 1;
    static int points_amount = 0;
    int a3, a3sh, a4, a4sh, a5, a5sh, b3_, b4_, b5_, c3, c3sh, c4, c4sh, c5, c5sh, c6, d3, d3sh;
    int d4, d4sh, d5, d5sh, e3, e4, e5, f3, f3sh, f4, f4sh, f5, f5sh, g3, g3sh, g4, g4sh, g5, g5sh;
    private SoundPool soundPool;
    public static boolean open_beg3;
    ProgressBar progressBar;
    GifImageView gif;
    HashMap<Integer, String> notes = new HashMap<>();

    String[] sequence2;

    // piano notes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter4);

        congrats = findViewById(R.id.congrats);
        points = findViewById(R.id.points);
        inform = findViewById(R.id.textView3);

        gif = findViewById(R.id.gif);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(360);

        points.setText(String.valueOf(points_amount));

        notes.put(1, "e4");
        notes.put(2, "a4");
        notes.put(3, "b4_");
        notes.put(4, "c5");
        notes.put(5, "b4_");
        notes.put(6, "a4");
        notes.put(7, "e4");
        notes.put(8, "a4");
        notes.put(9, "b4_");
        notes.put(10, "c5");
        notes.put(11, "d5");
        notes.put(12, "c5");
        notes.put(13, "d5");
        notes.put(14, "e5");
        notes.put(15, "e5");
        notes.put(16, "e4");
        notes.put(17, "a4");
        notes.put(18, "b4_");
        notes.put(19, "c5");
        notes.put(20, "b4_");
        notes.put(21, "a4");
        notes.put(22, "a4");
        notes.put(23, "e5");
        notes.put(24, "d5");
        notes.put(25, "a4");
        notes.put(26, "e5");
        notes.put(27, "d5");
        notes.put(28, "g4");
        notes.put(29, "g4");
        notes.put(30, "a4");
        notes.put(31, "a4");


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



        playSound(e4, 1000, b17);
        playSound(a4, 1300, b22);
        playSound(b4_, 1600, b24);
        playSound(c5, 1900, b25);
        playSound(b4_, 2700, b24);
        playSound(a4, 3500, b22);
        playSound(e4, 4500, b17);
        playSound(a4, 4800, b22);
        playSound(b4_, 5100, b24);
        playSound(c5, 5400, b25);
        playSound(d5, 6200, b27);
        playSound(c5, 6700, b25);
        playSound(d5, 7000, b27);
        playSound(e5, 7500, b29);
        playSound(e5, 7800, b29);
        playSound(e4, 8100, b17);
        playSound(a4, 8400, b22);
        playSound(b4_, 8700, b24);
        playSound(c5, 9000, b25);
        playSound(b4_, 9800, b24);
        playSound(a4, 10800, b22);
        playSound(a4, 11800, b22);
        playSound(e5, 12100, b29);
        playSound(d5, 12400, b27);
        playSound(a4, 12900, b22);
        playSound(e5, 13200, b29);
        playSound(d5, 13500, b27);
        playSound(g4, 14000, b20);
        playSound(g4, 14500, b20);
        playSound(a4, 15000, b22);
        playSound(a4, 15300, b22);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                progressBar.setVisibility(View.VISIBLE);
                inform.setText("Play!");
            }
        }, 15300);

    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, IntermediateActivity.class);
        soundPool.release();
        startActivity(intent);
    }



    //playing notes
    public void playSound(int note, long millis, Button btn) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                soundPool.play(note, 1, 1, 0, 0, 1);
                btn.setBackgroundResource(R.drawable.selected);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        btn.setBackgroundResource(R.drawable.right_selector);
                    }
                }, 200);
            }
        }, millis);
    }

    //playing right or wrong notes
    public void playSound(Button next_key, Button current_key, int pos1, String note) {
        if (Objects.equals(notes.get(pos1), note)){
            if (next_key == b19) {
                next_key.setBackgroundResource(R.drawable.right_black_selector);
            } else {
                next_key.setBackgroundResource(R.drawable.right_selector);
            }
            pos++;
            points_amount += 10;
            points.setText(String.valueOf(points_amount));
            progressBar.incrementProgressBy(10);
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    if (current_key == b19) {
                        current_key.setBackgroundResource(R.drawable.wrong_black_selector);
                    } else {
                        current_key.setBackgroundResource(R.drawable.wrong_selector);
                    }
                }
            }, 100);
        }
    }


    // notes playing
    @Override
    public void onClick(View view) {
        points.setText(String.valueOf(Exercise1Activity.points_amount));
        switch (view.getId()) {
            case R.id.k1:
                soundPool.play(c3, 1, 1, 0, 0, 1);
                points_amount -= 10;
                break;
            case R.id.k2:
                points_amount -= 10;
                soundPool.play(d3, 1, 1, 0, 0, 1);
                break;

            case R.id.k3:
                points_amount -= 10;
                soundPool.play(e3, 1, 1, 0, 0, 1);
                break;

            case R.id.k4:
                points_amount -= 10;
                soundPool.play(f3, 1, 1, 0, 0, 1);
                break;

            case R.id.k5:
                points_amount -= 10;
                soundPool.play(g3, 1, 1, 0, 0, 1);
                break;

            case R.id.k6:
                points_amount -= 10;
                soundPool.play(a3, 1, 1, 0, 0, 1);
                break;

            case R.id.k7:
                points_amount -= 10;
                soundPool.play(b3_, 1, 1, 0, 0, 1);
                break;

            case R.id.k8:
                soundPool.play(c4, 1, 1, 0, 0, 1);
                break;

            case R.id.k9:
                soundPool.play(d4, 1, 1, 0, 0, 1);
                break;

            case R.id.k10:
                switch (pos) {
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        playSound(b17, b24, pos, "e4");break;
                    case 8:playSound(b22, b17, pos, "e4");break;
                }
                soundPool.play(e4, 1, 1, 0, 0, 1);
                break;

            case R.id.k11:
                switch (pos) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:playSound(b18, b22, pos, "f4");break;
                    case 19:playSound(b24, b18, pos, "f4");break;
                }
                soundPool.play(f4, 1, 1, 0, 0, 1);
                break;

            case R.id.k12:
                switch (pos) {
                    case 13:playSound(b22, b20, pos, "g4");break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:playSound(b20, b25, pos, "g4");break;
                    case 30:playSound(b25, b20, pos, "g4");break;
                }
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.k13:
                switch (pos) {
                    case 3:playSound(b17, b22, pos, "a4");
                    case 9:
                    case 10:
                    case 11:playSound(b22, b17, pos, "a4");break;
                    case 12:playSound(b20, b22, pos, "a4");break;
                    case 14:playSound(b18, b22, pos, "a4");break;
                    case 20:
                    case 21:
                    case 22:playSound(b22, b17, pos, "a4");break;
                    case 23:playSound(b24, b22, pos, "a4");break;
                }
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.k14:
                switch (pos) {
                    case 2:playSound(b22, b24, pos, "b4_");
                    case 9:
                    case 10:
                    case 11:playSound(b24, b27, pos, "b4_");break;
                    case 12:playSound(b19, b24, pos, "b4_");break;
                    case 24:playSound(b25, b24, pos, "b4_");break;
                    case 37:
                        b24.setBackgroundResource(R.drawable.wrong_selector);
                        if (progressBar.getMax() == progressBar.getProgress()) {
                            inform.setVisibility(View.INVISIBLE);
                            congrats.setText("Perfect! New level is unlocked.");
                            open_beg3 = true;
                        }

                }
                soundPool.play(b4_, 1, 1, 0, 0, 1);
                break;

            case R.id.k15:
                switch (pos) {
                    case 1: playSound(b24, b25, pos, "c5"); break;
                    case 25:playSound(b20, b25, pos, "c5"); break;
                    case 31:
                    case 32:
                    case 33:playSound(b25, b20, pos, "c5");break;
                    case 34:playSound(b27, b25, pos, "c5");break;
                }
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.k16:
                switch (pos) {
                    case 35:playSound(b27, b25, pos, "d5");break;
                    case 36:playSound(b24, b27, pos, "d5");break;
                }
                soundPool.play(d5, 1, 1, 0, 0, 1);
                break;

            case R.id.k17:
                soundPool.play(e5, 1, 1, 0, 0, 1);
                break;

            case R.id.k18:
                points_amount -= 10;
                soundPool.play(f5, 1, 1, 0, 0, 1);
                break;

            case R.id.k19:
                points_amount -= 10;
                soundPool.play(g5, 1, 1, 0, 0, 1);
                break;

            case R.id.k20:
                points_amount -= 10;
                soundPool.play(a5, 1, 1, 0, 0, 1);
                break;

            case R.id.k21:
                points_amount -= 10;
                soundPool.play(b5_, 1, 1, 0, 0, 1);
                break;

            case R.id.b1:
                points_amount -= 10;
                soundPool.play(c3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b2:
                points_amount -= 10;
                soundPool.play(d3sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b3:
                points_amount -= 10;
                soundPool.play(f3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b4:
                points_amount -= 10;
                soundPool.play(g3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b5:
                points_amount -= 10;
                soundPool.play(a3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b6:
                points_amount -= 10;
                soundPool.play(c4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b7:
                points_amount -= 10;
                soundPool.play(d4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b8:
                soundPool.play(f4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b9:
                points_amount -= 10;
                soundPool.play(g4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b10:
                points_amount -= 10;
                soundPool.play(a4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b11:
                points_amount -= 10;
                soundPool.play(c5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b12:
                points_amount -= 10;
                soundPool.play(d5sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b13:
                soundPool.play(f5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b14:
                points_amount -= 10;
                soundPool.play(g5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b15:
                points_amount -= 10;
                soundPool.play(a5sh, 1, 1, 0, 0, 1);
                break;


        }

    }
}