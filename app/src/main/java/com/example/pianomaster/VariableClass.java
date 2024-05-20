package com.example.pianomaster;

import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;

public class VariableClass {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    static int full;

    static void delayed_text(TextView view, String text, long millis) {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                view.setText(text);
            }
        }, millis);
    }

}
