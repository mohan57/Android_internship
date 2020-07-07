package com.example.ass_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView tv;
   int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView2);
    }

    public void Toast(View view) {
        Toast.makeText(this, "your count "+a, Toast.LENGTH_SHORT).show();
    }

    public void plus(View view) {
        a++;
        tv.setText(""+a);
    }

    public void minus(View view) {
        a--;
        if(a<=0)
        {
            a=0;
            Toast.makeText(this, "minimum value cant exceed 0", Toast.LENGTH_SHORT).show();
        }
        tv.setText(""+a);
    }

    public void reset(View view) {
        a=0;
        tv.setText(""+a);
    }
}