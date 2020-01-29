package com.example.drumpadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    ImageButton i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;

//    @Override
//    public void onBackPressed() {
//        finish();
//        System.exit(0);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1=findViewById(R.id.imageButton1);
        i2=findViewById(R.id.imageButton2);
        i3=findViewById(R.id.imageButton3);
        i4=findViewById(R.id.imageButton4);
        i5=findViewById(R.id.imageButton5);
        i6=findViewById(R.id.imageButton6);
        i7=findViewById(R.id.imageButton7);
        i8=findViewById(R.id.imageButton8);
        i9=findViewById(R.id.imageButton9);
        i10=findViewById(R.id.imageButton10);
        i11=findViewById(R.id.imageButton11);
        i12=findViewById(R.id.imageButton12);

        m1=MediaPlayer.create(this,R.raw.one);
        m2=MediaPlayer.create(this,R.raw.two);
        m3=MediaPlayer.create(this,R.raw.three);
        m4=MediaPlayer.create(this,R.raw.four);
        m5=MediaPlayer.create(this,R.raw.fv);
        m6=MediaPlayer.create(this,R.raw.sixth);
        m7=MediaPlayer.create(this,R.raw.seventh);
        m8=MediaPlayer.create(this,R.raw.eighth);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.start();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.start();
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.start();
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.start();
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m5.start();
            }
        });
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m6.start();
            }
        });
        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m7.start();
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m8.start();
            }
        });

    }
}
