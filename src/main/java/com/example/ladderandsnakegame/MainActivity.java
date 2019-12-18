package com.example.ladderandsnakegame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private Button btn;
    private Button btn1;
    private TextView tv;

    int top = 0;
    int left = 0;
    int bottom = 0;
    int right = 0;
    int count = 0;

    private int dpToPx(int dip) {
        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                r.getDisplayMetrics()
        );
        return px;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image = findViewById(R.id.imageID);
        btn = findViewById(R.id.button);
        btn1 = findViewById(R.id.button1);
        tv = findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) image.getLayoutParams();
                params.leftMargin = dpToPx(125);
                params.topMargin = (dpToPx(110));
                params.rightMargin = (dpToPx(520));
                params.bottomMargin = (dpToPx(231));
                image.setLayoutParams(params);
                top = 0;
                left = 0;
                right = 0;
                bottom = 0;
                count = 0;
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = (int) (Math.random() * ((4 - 1) + 1)) + 1;
                int y = count;
                count = count + x;
                if (count > 32) {
                    count = y;
                    tv.setText("Count Value Greater than 32 so try again:...");
                } else
                    tv.setText("count=" + count + "\t" + "dice=" + x);
                if (count == 32) {
                    tv.setText("(CONGRATULATIONS)----You Have Won----");
                }
                if (count == 8) {
                    count = 20;
                    tv.setText("(LADDER) jumped to 20 from 8 ");
                }
                if (count == 10) {
                    count = 14;
                    tv.setText("(LADDER) jumped to 14 from 10");
                }
                if (count == 22) {
                    count = 26;
                    tv.setText("(LADDER) jumped to 26 from 22");
                }
                if (count == 24) {
                    count = 15;
                    tv.setText("(SNAKE) reduced to 15 from 24");
                }
                if (count == 18) {
                    count = 3;
                    tv.setText("(SNAKE) reduced to 3 from 18");
                }
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) image.getLayoutParams();
                switch (count) {
                    case 1: {
                        params.topMargin = (dpToPx(110));
                        params.bottomMargin = (dpToPx(231));
                        params.leftMargin = dpToPx(125);
                        params.rightMargin = (dpToPx(520));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 2: {
                        params.topMargin = (dpToPx(165));
                        params.bottomMargin = (dpToPx(176));
                        params.leftMargin = dpToPx(125);
                        params.rightMargin = (dpToPx(520));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 3: {
                        params.topMargin = (dpToPx(220));
                        params.bottomMargin = (dpToPx(121));
                        params.leftMargin = dpToPx(125);
                        params.rightMargin = (dpToPx(520));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 4: {
                        params.topMargin = (dpToPx(275));
                        params.bottomMargin = (dpToPx(66));
                        params.leftMargin = dpToPx(125);
                        params.rightMargin = (dpToPx(520));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 5: {
                        params.topMargin = (dpToPx(275));
                        params.bottomMargin = (dpToPx(66));
                        params.rightMargin = (dpToPx(465));
                        params.leftMargin = dpToPx(180);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 6: {
                        params.topMargin = (dpToPx(275));
                        params.bottomMargin = (dpToPx(66));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 7: {
                        params.topMargin = (dpToPx(230));
                        params.bottomMargin = (dpToPx(111));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 8: {
                        params.topMargin = (dpToPx(185));
                        params.bottomMargin = (dpToPx(156));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 9: {
                        params.topMargin = (dpToPx(140));
                        params.bottomMargin = (dpToPx(201));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 10: {
                        params.topMargin = (dpToPx(95));
                        params.bottomMargin = (dpToPx(246));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 11: {
                        params.topMargin = (dpToPx(50));
                        params.bottomMargin = (dpToPx(291));
                        params.rightMargin = (dpToPx(410));
                        params.leftMargin = dpToPx(235);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 12: {
                        params.rightMargin = (dpToPx(375));
                        params.leftMargin = dpToPx(270);
                        params.topMargin = (dpToPx(5));
                        params.bottomMargin = (dpToPx(336));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 13: {
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        params.topMargin = (dpToPx(35));
                        params.bottomMargin = (dpToPx(306));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 14: {
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        params.topMargin = (dpToPx(85));
                        params.bottomMargin = (dpToPx(256));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 15: {
                        params.topMargin = (dpToPx(135));
                        params.bottomMargin = (dpToPx(206));
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 16: {
                        params.topMargin = (dpToPx(185));
                        params.bottomMargin = (dpToPx(156));
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 17: {
                        params.topMargin = (dpToPx(235));
                        params.bottomMargin = (dpToPx(106));
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 18: {
                        params.topMargin = (dpToPx(285));
                        params.bottomMargin = (dpToPx(56));
                        params.rightMargin = (dpToPx(307));
                        params.leftMargin = dpToPx(335);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 19: {
                        params.topMargin = (dpToPx(285));
                        params.bottomMargin = (dpToPx(56));
                        params.rightMargin = (dpToPx(237));
                        params.leftMargin = dpToPx(405);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 20: {
                        params.topMargin = (dpToPx(235));
                        params.bottomMargin = (dpToPx(106));
                        params.rightMargin = (dpToPx(207));
                        params.leftMargin = dpToPx(425);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 21: {
                        params.topMargin = (dpToPx(185));
                        params.bottomMargin = (dpToPx(156));
                        params.rightMargin = (dpToPx(207));
                        params.leftMargin = dpToPx(425);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 22: {
                        params.rightMargin = (dpToPx(207));
                        params.leftMargin = dpToPx(425);
                        params.topMargin = (dpToPx(135));
                        params.bottomMargin = (dpToPx(206));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 23: {
                        params.topMargin = (dpToPx(85));
                        params.bottomMargin = (dpToPx(256));
                        params.rightMargin = (dpToPx(207));
                        params.leftMargin = dpToPx(425);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 24: {
                        params.rightMargin = (dpToPx(207));
                        params.leftMargin = dpToPx(425);
                        params.topMargin = (dpToPx(35));
                        params.bottomMargin = (dpToPx(306));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 25: {
                        params.topMargin = (dpToPx(35));
                        params.bottomMargin = (dpToPx(306));
                        params.rightMargin = (dpToPx(137));
                        params.leftMargin = dpToPx(495);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 26: {
                        params.topMargin = (dpToPx(75));
                        params.bottomMargin = (dpToPx(261));
                        params.rightMargin = (dpToPx(97));
                        params.leftMargin = dpToPx(535);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 27: {
                        params.rightMargin = (dpToPx(97));
                        params.leftMargin = dpToPx(535);
                        params.topMargin = (dpToPx(125));
                        params.bottomMargin = (dpToPx(211));
                        image.setLayoutParams(params);
                        break;
                    }
                    case 28: {
                        params.topMargin = (dpToPx(175));
                        params.bottomMargin = (dpToPx(161));
                        params.rightMargin = (dpToPx(97));
                        params.leftMargin = dpToPx(535);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 29: {
                        params.topMargin = (dpToPx(225));
                        params.bottomMargin = (dpToPx(111));
                        params.rightMargin = (dpToPx(97));
                        params.leftMargin = dpToPx(535);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 30: {
                        params.topMargin = (dpToPx(275));
                        params.bottomMargin = (dpToPx(61));
                        params.rightMargin = (dpToPx(97));
                        params.leftMargin = dpToPx(535);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 31: {
                        params.topMargin = (dpToPx(275));
                        params.bottomMargin = (dpToPx(61));
                        params.rightMargin = (dpToPx(47));
                        params.leftMargin = dpToPx(585);
                        image.setLayoutParams(params);
                        break;
                    }
                    case 32: {
                        params.topMargin = (dpToPx(175));
                        params.bottomMargin = (dpToPx(161));
                        params.rightMargin = (dpToPx(7));
                        params.leftMargin = dpToPx(625);
                        image.setLayoutParams(params);
                        break;
                    }
                }
            }
        });
    }
}
