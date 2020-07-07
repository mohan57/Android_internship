package com.example.score_board;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv,tv1;
    int a=0;
    int a1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.one);
        tv1=findViewById(R.id.textView);
    }

    public void one(View view) {

       a=a+1;
        tv.setText(""+a);

    }

    public void three(View view) {
        a=a+3;
        tv.setText(""+a);
    }

    public void five(View view) {
        a=a+5;
        tv.setText(""+a);
    }

    public void one1(View view) {
        a1=a1+1;
        tv1.setText(""+a1);
    }

    public void three1(View view) {
        a1=a1+3;
        tv1.setText(""+a1);
    }

    public void five1(View view) {
        a1=a1+5;
        tv1.setText(""+a1);
    }

    public void reset(View view) {
        a=0;
        a1=0;
        tv.setText(""+a);
        tv1.setText(""+a1);
        Toast.makeText(this, "SCORE RESET", Toast.LENGTH_SHORT).show();
    }
}