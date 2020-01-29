package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.textView2);
        ratingBar=findViewById(R.id.ratingBar);
    }
    public void submit(View view){
        float givenRating= ratingBar.getRating();
        if(givenRating<2)
        {
            text.setText("Rating: " +givenRating +"\nWe will try better next time");
        }
        else
        if (givenRating>=2 && givenRating<=3)
        {
            text.setText("Rating: " +givenRating +"\nWe will keep improving");
        }
        else
        if( givenRating>=3 && givenRating<=4.5)
        {
            text.setText("Rating :" +givenRating +"\nThank you,we will keep improving");
        }
        else
        if(givenRating==5)
        {
            text.setText("Rating :" +givenRating +"\nThank you so much !!");
        }


    }
}
