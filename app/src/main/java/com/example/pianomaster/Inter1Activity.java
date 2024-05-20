package com.example.pianomaster;

import static com.example.pianomaster.HomePageActivity.points_amount;

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

public class Inter1Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    TextView congrats, points, playtext;
    int n = 8;
    Button b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36;
    int pos = 1, points1 = 0;
    int win, tick, a3, a3sh, a4, a4sh, a5, a5sh, b3_, b4_, b5_, c3, c3sh, c4, c4sh, c5, c5sh, c6, d3, d3sh;
    int d4, d4sh, d5, d5sh, e3, e4, e5, f3, f3sh, f4, f4sh, f5, f5sh, g3, g3sh, g4, g4sh, g5, g5sh;
    private SoundPool soundPool;
    public static boolean open_int1;
    ProgressBar progressBar;
    int combo = 0;
    GifImageView gif;
    boolean done = false;
    Button[] white_buttons, black_buttons;
    HashMap<Integer, String> notes = new HashMap<>();

    String[] sequence2;

    // piano notes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter1);
        open_int1 = true;

        congrats = findViewById(R.id.congrats);
        points = findViewById(R.id.points);
        playtext = findViewById(R.id.playtext);

        gif = findViewById(R.id.musicgif);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(370);

        points.setText(String.valueOf(points_amount));

        notes.put(1, "c5");
        notes.put(2, "b4_");
        notes.put(3, "a4");
        notes.put(4, "e4");
        notes.put(5, "e4");
        notes.put(6, "e4");
        notes.put(7, "e4");
        notes.put(8, "e4");
        notes.put(9, "a4");
        notes.put(10, "a4");
        notes.put(11, "a4");
        notes.put(12, "a4");
        notes.put(13, "g4");
        notes.put(14, "a4");
        notes.put(15, "f4");
        notes.put(16, "f4");
        notes.put(17, "f4");
        notes.put(18, "f4");
        notes.put(19, "f4");
        notes.put(20, "a4");
        notes.put(21, "a4");
        notes.put(22, "a4");
        notes.put(23, "a4");
        notes.put(24, "b4_");
        notes.put(25, "c5");
        notes.put(26, "g4");
        notes.put(27, "g4");
        notes.put(28, "g4");
        notes.put(29, "g4");
        notes.put(30, "g4");
        notes.put(31, "c5");
        notes.put(32, "c5");
        notes.put(33, "c5");
        notes.put(34, "c5");
        notes.put(35, "d5");
        notes.put(36, "d5");
        notes.put(37, "b4_");


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


        white_buttons = new Button[]{b1, b3, b5, b6, b8, b10, b12, b13, b15, b17, b18, b20, b22, b24, b25, b27, b28, b29, b30, b32, b34, b36};
        black_buttons = new Button[]{b2, b4, b7, b9, b11, b14, b16, b19, b21, b23, b26, b28, b31, b33, b35};

        for (Button button: white_buttons) {
            button.setOnClickListener(this);
        }
        for (Button button: black_buttons) {
            button.setOnClickListener(this);
        }

        soundPool = new SoundPool.Builder().setMaxStreams(6).build();
        win = soundPool.load(this, R.raw.win, 1);
        tick = soundPool.load(this, R.raw.clock_ticking, 1);
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

        VariableClass.delayed_text(playtext, "3", 1000);
        playSound(tick, 1000);
        VariableClass.delayed_text(playtext, "2", 2000);
        playSound(tick, 2000);
        VariableClass.delayed_text(playtext, "1", 3000);
        playSound(tick, 3000);

        final Handler handler4 = new Handler();
        handler4.postDelayed(new Runnable() {
            @Override
            public void run() {
                playtext.setVisibility(View.INVISIBLE);
                gif.setVisibility(View.VISIBLE);
                playSound(c5, 1000, b25);
                playSound(b4_, 1800, b24);
                playSound(a4, 2600, b22);
                playSound(e4, 3000, b17);
                playSound(e4, 3400, b17);
                playSound(e4, 3600, b17);
                playSound(e4, 3800, b17);
                playSound(e4, 4000, b17);
                playSound(a4, 4200, b22);
                playSound(a4, 4600, b22);
                playSound(a4, 4800, b22);
                playSound(a4, 5000, b22);
                playSound(g4, 5400, b20);
                playSound(a4, 5600, b22);
                playSound(f4, 6000, b18);
                playSound(f4, 6400, b18);
                playSound(f4, 6600, b18);
                playSound(f4, 6800, b18);
                playSound(f4, 7000, b18);
                playSound(a4, 7200, b22);
                playSound(a4, 7600, b22);
                playSound(a4, 7800, b22);
                playSound(a4, 8000, b22);
                playSound(b4_, 8400, b24);
                playSound(c5, 8600, b25);
                playSound(g4, 9000, b20);
                playSound(g4, 9400, b20);
                playSound(g4, 9600, b20);
                playSound(g4, 9800, b20);
                playSound(g4, 10000, b20);
                playSound(c5, 10200, b25);
                playSound(c5, 10600, b25);
                playSound(c5, 10800, b25);
                playSound(c5, 11000, b25);
                playSound(d5, 11400, b27);
                playSound(d5, 11600, b27);
                playSound(b4_, 12000, b24);
            }
        }, 3500);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                gif.setVisibility(View.INVISIBLE);
                playtext.setVisibility(View.VISIBLE);
                playtext.setText("Play!");
                progressBar.setVisibility(View.VISIBLE);
                for (Button button: white_buttons) {
                    button.setEnabled(true);
                }
                for (Button button: black_buttons) {
                    button.setEnabled(true);
                }
            }
        }, 15500);

    }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        soundPool.release();
        startActivity(intent);
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
                        if (btn == b25) {
                            btn.setBackgroundResource(R.drawable.right_selector);
                        } else {
                            btn.setBackgroundResource(R.drawable.wrong_selector);
                        }
                    }
                }, 100);
            }
        }, millis);
    }

    //playing right or wrong notes
    public void playSound(Button next_key, Button current_key, int pos1, String note) {
        if (Objects.equals(notes.get(pos), note)){
            progressBar.incrementProgressBy(10);
            if (pos == notes.size()) {
                if (!done) {
                    points1 += (combo * 5);
                    points_amount +=  (combo * 5);
                    points.setText(String.valueOf(points_amount));
                    done = true;
                    playtext.setText("Incredible! You got " + String.valueOf(points1) + " coins.");
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            soundPool.play(win, 1, 1, 0, 0, 1);
                        }
                    }, 300);
                    for (Button button: white_buttons) {
                        button.setBackgroundResource(R.drawable.press_and_normal_selector);
                    }
                    for (Button button: black_buttons) {
                        button.setBackgroundResource(R.drawable.black_key_selector);
                    }
                } else {
                    playtext.setText("Incredible! You got " + String.valueOf(points1) + " coins.");
                }

            } else {
                if (next_key == b23) {
                    next_key.setBackgroundResource(R.drawable.right_black_selector);
                } else {
                    next_key.setBackgroundResource(R.drawable.right_selector);
                }
                pos++;
                combo += 1;
                points1 += (combo * 5);
                points_amount +=  (combo * 5);
                points.setText(String.valueOf(points_amount));
                playtext.setText("Great! x" + combo);
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        current_key.setBackgroundResource(R.drawable.wrong_selector);
                    }
                }, 100);
            }
        } else {
            if (done == false) {
                combo =0;
                playtext.setText("Try again!");
                points1 -= 10;
                points_amount -= 10;
                points.setText(String.valueOf(points_amount));
            }
        }

    }

    public void playSoundW() {
        if (!done) {
            combo = 0;
            playtext.setText("Try again!");
            points1 -= 10;
            points_amount -= 10;
            points.setText(String.valueOf(points_amount));
        }

    }


    // notes playing
    @Override
    public void onClick(View view) {
        points.setText(String.valueOf(points_amount));
        switch (view.getId()) {
            case R.id.k1:
                soundPool.play(c3, 1, 1, 0, 0, 1);
                playSoundW();
                break;
            case R.id.k2:
                playSoundW();
                soundPool.play(d3, 1, 1, 0, 0, 1);
                break;

            case R.id.k3:
                playSoundW();
                soundPool.play(e3, 1, 1, 0, 0, 1);
                break;

            case R.id.k4:
                playSoundW();
                soundPool.play(f3, 1, 1, 0, 0, 1);
                break;

            case R.id.k5:
                playSoundW();
                soundPool.play(g3, 1, 1, 0, 0, 1);
                break;

            case R.id.k6:
                playSoundW();
                soundPool.play(a3, 1, 1, 0, 0, 1);
                break;

            case R.id.k7:
                playSoundW();
                soundPool.play(b3_, 1, 1, 0, 0, 1);
                break;

            case R.id.k8:
                playSoundW();
                soundPool.play(c4, 1, 1, 0, 0, 1);
                break;

            case R.id.k9:
                playSoundW();
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
                    default:playSoundW();
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

                    default:playSoundW();
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
                    default:playSoundW();
                }
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.k13:
                switch (pos) {
                    case 3:playSound(b17, b22, pos, "a4");break;
                    case 9:
                    case 10:
                    case 11:playSound(b22, b17, pos, "a4");break;
                    case 12:playSound(b20, b22, pos, "a4");break;
                    case 14:playSound(b18, b22, pos, "a4");break;
                    case 20:
                    case 21:
                    case 22:playSound(b22, b17, pos, "a4");break;
                    case 23:playSound(b24, b22, pos, "a4");break;
                    default:playSoundW();
                }
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.k14:
                switch (pos) {
                    case 2:playSound(b22, b24, pos, "b4_");break;
                    case 9:
                    case 10:
                    case 11:playSound(b24, b27, pos, "b4_");break;
                    case 12:playSound(b19, b24, pos, "b4_");break;
                    case 24:playSound(b25, b24, pos, "b4_");break;
                    case 37:
                        playSound(b25, b24, pos, "b4_");break;

                    default:playSoundW();
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
                    default:playSoundW();
                }
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.k16:
                switch (pos) {
                    case 35:playSound(b27, b25, pos, "d5");break;
                    case 36:playSound(b24, b27, pos, "d5");break;
                    default:playSoundW();
                }
                soundPool.play(d5, 1, 1, 0, 0, 1);
                break;

            case R.id.k17:
                playSoundW();
                soundPool.play(e5, 1, 1, 0, 0, 1);
                break;

            case R.id.k18:
                playSoundW();
                soundPool.play(f5, 1, 1, 0, 0, 1);
                break;

            case R.id.k19:
                playSoundW();
                soundPool.play(g5, 1, 1, 0, 0, 1);
                break;

            case R.id.k20:
                playSoundW();
                soundPool.play(a5, 1, 1, 0, 0, 1);
                break;

            case R.id.k21:
                playSoundW();
                soundPool.play(b5_, 1, 1, 0, 0, 1);
                break;

            case R.id.b1:
                playSoundW();
                soundPool.play(c3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b2:
                playSoundW();
                soundPool.play(d3sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b3:
                playSoundW();
                soundPool.play(f3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b4:
                playSoundW();
                soundPool.play(g3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b5:
                playSoundW();
                soundPool.play(a3sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b6:
                playSoundW();
                soundPool.play(c4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b7:
                playSoundW();
                soundPool.play(d4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b8:
                soundPool.play(f4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b9:
                playSoundW();
                soundPool.play(g4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b10:
                playSoundW();
                soundPool.play(a4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b11:
                playSoundW();
                soundPool.play(c5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b12:
                playSoundW();
                soundPool.play(d5sh, 1, 1, 0, 0, 1);
                break;
            case R.id.b13:
                playSoundW();
                soundPool.play(f5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b14:
                playSoundW();
                soundPool.play(g5sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b15:
                playSoundW();
                soundPool.play(a5sh, 1, 1, 0, 0, 1);
                break;


        }

    }
}