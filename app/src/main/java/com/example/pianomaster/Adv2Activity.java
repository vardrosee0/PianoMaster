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

public class Adv2Activity extends AppCompatActivity implements View.OnClickListener{
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
        setContentView(R.layout.activity_adv2);

        congrats = findViewById(R.id.congrats);
        points = findViewById(R.id.points);
        inform = findViewById(R.id.textView3);

        gif = findViewById(R.id.gif);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(160);

        points.setText(String.valueOf(points_amount));

        notes.put(1, "c4");
        notes.put(2, "c4");
        notes.put(3, "d4");
        notes.put(4, "c4");
        notes.put(5, "f4");
        notes.put(6, "e4");

        notes.put(7, "c4");
        notes.put(8, "c4");
        notes.put(9, "d4");
        notes.put(10, "c4");
        notes.put(11, "g4");
        notes.put(12, "f4");

        notes.put(13, "c4");
        notes.put(14, "c4");
        notes.put(15, "c5");
        notes.put(16, "a4");
        notes.put(17, "f4");
        notes.put(18, "e4");
        notes.put(19, "d4");

        notes.put(20, "a4sh");
        notes.put(21, "a4sh");
        notes.put(22, "a4");
        notes.put(23, "f4");
        notes.put(24, "g4");
        notes.put(25, "f4");


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



        playSound(c4, 1000, b13);
        playSound(c4, 1400, b13);
        playSound(d4, 1700, b15);
        playSound(c4, 2200, b13);
        playSound(f4, 2700, b18);
        playSound(e4, 3200, b17);
        playSound(c4, 4000, b13);
        playSound(c4, 4500, b13);
        playSound(d4, 5000, b15);
        playSound(c4, 5500, b13);
        playSound(g4, 6000, b20);
        playSound(f4, 6500, b18);
        playSound(c4, 7000, b13);
        playSound(c4, 7500, b13);
        playSound(c5, 8000, b25);
        playSound(a4, 8500, b22);
        playSound(f4, 8500, b18);
        playSound(e4, 8500, b17);
        playSound(d4, 8500, b15);
        playSound(a4sh, 8500, b24);
        playSound(a4sh, 8500, b24);
        playSound(a4, 8500, b22);
        playSound(f4, 8500, b18);
        playSound(g4, 8500, b20);
        playSound(f4, 8500, b18);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                progressBar.setVisibility(View.VISIBLE);
                inform.setText("Play!");
            }
        }, 8600);

    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, BeginnerActivity.class);
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
                        if (btn == b20) {
                            btn.setBackgroundResource(R.drawable.right_selector);
                        } else if (btn == b19){
                            btn.setBackgroundResource(R.drawable.wrong_black_selector);
                        }else {
                            btn.setBackgroundResource(R.drawable.wrong_selector);
                        }
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
                playSound(b20, b17, pos, "e4");
                b20.setBackgroundResource(R.drawable.wrong_selector);
                if (progressBar.getMax() == progressBar.getProgress()) {
                    inform.setVisibility(View.INVISIBLE);
                    congrats.setText("Perfect! New level is unlocked.");
                    open_beg3 = true;
                }
                soundPool.play(e4, 1, 1, 0, 0, 1);
                break;

            case R.id.k11:
                soundPool.play(f4, 1, 1, 0, 0, 1);
                break;

            case R.id.k12:
                switch (pos) {
                    case 1:
                    case 2:playSound(b20, b22, pos, "g4"); break;
                    case 3:playSound(b24, b20, pos, "g4");break;
                }
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.k13:
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.k14:
                switch (pos) {
                    case 4:playSound(b29, b24, pos, "b4_");
                    case 9:
                    case 10:
                    case 11:playSound(b24, b27, pos, "b4_");break;
                    case 12:playSound(b19, b24, pos, "b4_");break;
                }

                soundPool.play(b4_, 1, 1, 0, 0, 1);
                break;

            case R.id.k15:
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.k16:
                playSound(b24, b27, pos, "d5");
                soundPool.play(d5, 1, 1, 0, 0, 1);
                break;

            case R.id.k17:
                switch (pos) {
                    case 5:
                    case 6:playSound(b29, b24, pos, "e5"); break;
                    case 7:playSound(b27, b29, pos, "e5");break;
                }
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
                switch (pos) {
                    case 13:
                    case 14:
                        playSound(b19, b24, pos, "f4sh");
                        break;
                    case 15:playSound(b17, b19, pos, "f4sh");
                        break;
                }
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