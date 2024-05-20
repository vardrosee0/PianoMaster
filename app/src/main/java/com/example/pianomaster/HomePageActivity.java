package com.example.pianomaster;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.media.SoundPool;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    int beg3cost = 199, beg4cost = 299;
    int int1cost = 499, int2cost = 999, int3cost = 1299, int4cost = 1599, adv1cost = 2499;
    boolean beg3bought = false,beg4bought = false;
    boolean int1bought = false, int2bought = false,int3bought = false,int4bought = false, adv1bought = false;
    Button beg3coin, beg4coin, int1coin, int2coin, int3coin, int4coin, adv1coin;
    int click, purchase;
    SoundPool soundPool;

    TextView numcoins;
    static int points_amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        numcoins = findViewById(R.id.numcoins);
        numcoins.setText(Integer.toString(HomePageActivity.points_amount));

        beg3coin = findViewById(R.id.ex3_coin);
        beg4coin = findViewById(R.id.ex4_coin);
        int1coin = findViewById(R.id.int1_coin);
        int2coin = findViewById(R.id.hp_coin);
        int3coin = findViewById(R.id.int3_coin);
        int4coin = findViewById(R.id.int4_coin);
        adv1coin = findViewById(R.id.adv1_coin);
        soundPool = new SoundPool.Builder().setMaxStreams(6).build();
        click = soundPool.load(this, R.raw.button1, 1);
        purchase = soundPool.load(this, R.raw.purchase, 1);

        if (Beg3Activity.open_beg3) {
            beg3coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            beg3coin.setText("PLAY");
            beg3bought = true;
        }
        if (Beg4Activity.open_beg4) {
            beg4coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            beg4coin.setText("PLAY");
            beg4bought = true;

        }
        if (Inter1Activity.open_int1) {
            int3coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);

            int3coin.setText("PLAY");
            int3bought = true;

        }
        if (Inter2Activity.open_int2) {
            int2coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            int2bought = true;

            int2coin.setText("PLAY");
        }
        if (Inter3Activity.open_int3) {
            int1coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            int1bought = true;

            int1coin.setText("PLAY");
        }
        if (Inter4Activity.open_int4) {
            int4coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            int4bought = true;

            int4coin.setText("PLAY");
        }
        if (Adv1Activity.open_adv1) {
            adv1coin.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            adv1bought = true;

            adv1coin.setText("PLAY");
        }


    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void goToBeg1(View view) {
        soundPool.play(click, 1, 1, 0, 0, 1);
        Intent intent = new Intent(this, Exercise1Activity.class);
        startActivity(intent);

    }

    public void goToBeg2(View view) {
        soundPool.play(click, 1, 1, 0, 0, 1);
        Intent intent = new Intent(this, Exercise2Activity.class);
        startActivity(intent);

    }

    public void goToBeg3(View view) {
        if (beg3bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Beg3Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > beg3cost) {
                beg3bought = true;
                HomePageActivity.points_amount -= beg3cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Beg3Activity.class);
                startActivity(intent);
            }
        }

    }

    public void goToBeg4(View view) {
        if (beg4bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Beg4Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > beg4cost) {
                beg4bought = true;
                HomePageActivity.points_amount -= beg4cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Beg4Activity.class);
                startActivity(intent);
            }
        }
    }

    public void goToInt1(View view) {
        if (int3bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Inter1Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > int3cost) {
                int3bought = true;
                HomePageActivity.points_amount -= int3cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Inter1Activity.class);
                startActivity(intent);
            }
        }

    }

    public void goToInt2(View view) {
        if (int2bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Inter2Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > int2cost) {
                int2bought = true;
                HomePageActivity.points_amount -= int2cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Inter2Activity.class);
                startActivity(intent);
            }
        }

    }

    public void goToInt3(View view) {
        if (int1bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Inter3Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > int1cost) {
                int3bought = true;
                HomePageActivity.points_amount -= int1cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Inter3Activity.class);
                startActivity(intent);
            }
        }

    }

    public void goToInt4(View view) {
        if (int4bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this, Inter4Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > int4cost) {
                int4bought = true;
                HomePageActivity.points_amount -= int4cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Inter4Activity.class);
                startActivity(intent);
            }
        }

    }

    public void goToAdv1(View view) {
        if (adv1bought) {
            soundPool.play(click, 1, 1, 0, 0, 1);
            Intent intent = new Intent(this,Adv1Activity.class);
            startActivity(intent);
        } else {
            if (HomePageActivity.points_amount > adv1cost) {
                adv1bought = true;
                HomePageActivity.points_amount -= adv1cost;
                soundPool.play(purchase, 1, 1, 0, 0, 1);
                Intent intent = new Intent(this, Adv1Activity.class);
                startActivity(intent);
            }
        }


    }



}