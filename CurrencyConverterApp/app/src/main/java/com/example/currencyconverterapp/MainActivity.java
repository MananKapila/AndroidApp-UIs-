package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro,dollar,russia,yen,cand,ausd,pound,btc,cyen;
    EditText edit;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        yen = findViewById(R.id.yen);
        cyen = findViewById(R.id.cYen);
        ausd = findViewById(R.id.aus);
        cand = findViewById(R.id.can);
        pound = findViewById(R.id.pound);
        russia = findViewById(R.id.russia);
        btc = findViewById(R.id.btc);
        txt=findViewById(R.id.textView);
        edit=findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.012;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
       dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.014;
                    DecimalFormat numberFormat =new DecimalFormat("#.00");
                    txt.setText(""+numberFormat.format(k));
                }
            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.011;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        cyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.100;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*1.53;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.90;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        ausd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.021;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        cand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.018;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit.getText().toString();
                if(TextUtils.isEmpty(s))
                {
                    edit.setError("Empty User Input");
                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(s);
                    txt.setText(null);
                    Formatter formatter =new Formatter();
                    k=n*0.0000015;
                    DecimalFormat numberformat =new DecimalFormat("#.00");
                    txt.setText(""+numberformat.format(k));
                }
            }
        });

    }
}
