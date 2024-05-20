package com.example.pianomaster;

import android.content.Intent;
import static com.example.pianomaster.HomePageActivity.points_amount;

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

public class Inter2Activity extends AppCompatActivity implements View.OnClickListener{
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    TextView congrats, points, playtext;
    int n = 8;
    Button b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36;
    int pos = 1, points1 = 0;
    int win, tick, a3, a3sh, a4, a4sh, a5, a5sh, b3_, b4_, b5_, c3, c3sh, c4, c4sh, c5, c5sh, c6, d3, d3sh;
    int d4, d4sh, d5, d5sh, e3, e4, e5, f3, f3sh, f4, f4sh, f5, f5sh, g3, g3sh, g4, g4sh, g5, g5sh;
    private SoundPool soundPool;
    public static boolean open_int2;
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
        setContentView(R.layout.activity_inter2);
        open_int2 = true;

        congrats = findViewById(R.id.congrats);
        points = findViewById(R.id.points);
        playtext = findViewById(R.id.playtext);

        gif = findViewById(R.id.musicgif);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(300);

        points.setText(String.valueOf(points_amount));

        notes.put(1, "b3_");
        notes.put(2, "e4");
        notes.put(3, "g4");
        notes.put(4, "f4sh");
        notes.put(5, "e4");
        notes.put(6, "b4_");
        notes.put(7, "a4");
        notes.put(8, "f4sh");
        notes.put(9, "e4");
        notes.put(10, "g4");
        notes.put(11, "f4sh");
        notes.put(12, "d4sh");
        notes.put(13, "f4");
        notes.put(14, "b3_");
        notes.put(15, "b3_");
        notes.put(16, "e4");
        notes.put(17, "g4");
        notes.put(18, "f4sh");
        notes.put(19, "e4");
        notes.put(20, "b4_");
        notes.put(21, "d5");
        notes.put(22, "c5sh");
        notes.put(23, "c5");
        notes.put(24, "g4sh");
        notes.put(25, "c5");
        notes.put(26, "b4_");
        notes.put(27, "a4sh");
        notes.put(28, "b3_");
        notes.put(29, "g4");
        notes.put(30, "e4");


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
        tick = soundPool.load(this, R.raw.clock_ticking, 1);
        win = soundPool.load(this, R.raw.win, 1);
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
                playSound(b3_, 1000, b12);
                playSound(e4, 1400, b17);
                playSound(g4, 2000, b20);
                playSound(f4sh, 2200, b19);
                playSound(e4, 2600, b17);
                playSound(b4_, 3400, b24);
                playSound(a4, 3800, b22);
                playSound(f4sh, 5000, b19);
                playSound(e4, 6200, b17);
                playSound(g4, 6800, b20);
                playSound(f4sh, 7000, b19);
                playSound(d4sh, 7400, b16);
                playSound(f4, 8200, b18);
                playSound(b3_, 8600, b12);
                playSound(b3_, 10600, b12);
                playSound(e4, 11000, b17);
                playSound(g4, 11600, b20);
                playSound(f4sh, 11800, b19);
                playSound(e4, 12200, b17);
                playSound(b4_, 13000, b24);
                playSound(d5, 13400, b27);
                playSound(c5sh, 14200, b26);
                playSound(c5, 14600, b25);
                playSound(g4sh, 15400, b21);
                playSound(c5, 15800, b25);
                playSound(b4_, 16400, b24);
                playSound(a4sh, 16600, b23);
                playSound(b3_, 17000, b12);
                playSound(g4, 17800, b20);
                playSound(e4, 18200, b17);
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
        }, 21700);


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
                if (btn == b19 || btn == b21 || btn == b23 || btn == b26 || btn == b16 ) {
                    btn.setBackgroundResource(R.drawable.selected_black);
                } else {
                    btn.setBackgroundResource(R.drawable.selected);
                }

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (btn == b19 || btn == b21 || btn == b23 || btn == b26 || btn == b16) {
                            btn.setBackgroundResource(R.drawable.right_black_selector);
                        } else {
                            btn.setBackgroundResource(R.drawable.right_selector);
                        }
                    }
                }, 200);
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
                if (next_key == b19 || next_key == b21 || next_key == b16 || next_key == b26 || next_key == b23) {
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
                        if (current_key == b19 || current_key == b21 || current_key == b16 || current_key == b26 || current_key == b23){
                            current_key.setBackgroundResource(R.drawable.wrong_black_selector);
                        } else {
                            current_key.setBackgroundResource(R.drawable.wrong_selector);
                        }
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
                switch (pos) {
                    case 1:playSound(b17, b12, pos, "b3_");break;
                    case 14:playSound(b12, b18, pos, "b3_");break;
                    case 15:playSound(b17, b12, pos, "b3_");break;
                    case 28: playSound(b20, b12, pos, "b3_");break;
                    default:                playSoundW();

                }
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
                    case 2:
                    case 9:
                    case 16:
                        playSound(b20, b17, pos, "e4");break;
                    case 5:
                    case 19:playSound(b24, b17, pos, "e4");break;
                    case 30:playSound(b1, b17, pos, "e4");break;
                    default:                playSoundW();

                }
                soundPool.play(e4, 1, 1, 0, 0, 1);
                break;

            case R.id.k11:
                switch (pos) {
                    case 13:playSound(b12, b18, pos, "f4");break;
                    default:                playSoundW();
                }
                soundPool.play(f4, 1, 1, 0, 0, 1);
                break;

            case R.id.k12:
                switch (pos) {
                    case 3:
                    case 10:
                    case 17:
                        playSound(b19, b20, pos, "g4");break;
                    case 29:playSound(b17, b20, pos, "g4");break;

                    default:                playSoundW();
                }
                soundPool.play(g4, 1, 1, 0, 0, 1);
                break;

            case R.id.k13:
                switch (pos) {
                    case 7:playSound(b19, b22, pos, "a4");
                    default:                playSoundW();
                }
                soundPool.play(a4, 1, 1, 0, 0, 1);
                break;

            case R.id.k14:
                switch (pos) {
                    case 6:playSound(b22, b24, pos, "b4_");break;
                    case 20:playSound(b27, b24, pos, "b4_");break;
                    case 26:playSound(b23, b24, pos, "b4_");break;
                    default:                playSoundW();
                }
                soundPool.play(b4_, 1, 1, 0, 0, 1);
                break;

            case R.id.k15:
                switch (pos) {
                    case 23: playSound(b21, b25, pos, "c5"); break;
                    case 25:playSound(b24, b25, pos, "c5"); break;
                    default:                playSoundW();
                }
                soundPool.play(c5, 1, 1, 0, 0, 1);
                break;

            case R.id.k16:
                switch (pos) {
                    case 21:playSound(b26, b27, pos, "d5");break;
                    default:                playSoundW();
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
                switch (pos) {
                    case 12:playSound(b18, b16, pos, "d4sh");break;
                    default:                playSoundW();
                }
                soundPool.play(d4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b8:
                switch (pos) {
                    case 4:
                    case 8:
                    case 18:
                        playSound(b17, b19, pos, "f4sh");break;
                    case 11:
                        playSound(b16, b19, pos, "f4sh");break;

                    default:                playSoundW();
                }
                soundPool.play(f4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b9:
                switch (pos) {
                    case 24:playSound(b25, b21, pos, "g4sh");break;
                    default:                playSoundW();
                }
                soundPool.play(g4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b10:
                switch (pos) {
                    case 27:playSound(b12, b23, pos, "a4sh");break;
                    default:                playSoundW();
                }
                soundPool.play(a4sh, 1, 1, 0, 0, 1);
                break;

            case R.id.b11:
                switch (pos) {
                    case 22:playSound(b25, b26, pos, "c5sh");break;
                    default:                playSoundW();
                }
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