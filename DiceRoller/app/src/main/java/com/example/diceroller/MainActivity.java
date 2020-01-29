package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView image1;
    private Random randomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1= findViewById(R.id.imageView);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollOurDice();
            }
        });
    }
    private void rollOurDice(){
        int myRanNumber= randomNumber.nextInt(6)+1;

        switch (myRanNumber)
        {
            case 1:
                image1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                image1.setImageResource(R.drawable.dice6);
                break;

        }
    }
}
