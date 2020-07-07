package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv,tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String s = getIntent().getStringExtra("mydata");
        String s1 = getIntent().getStringExtra("mydata1");
        String s2 = getIntent().getStringExtra("mydata2");
        String s3 = getIntent().getStringExtra("mydata3");
        String s4 = getIntent().getStringExtra("mydata4");
        String s5 = getIntent().getStringExtra("mydata5");


        tv=findViewById(R.id.textView2);
        tv1=findViewById(R.id.textView3);
        tv2=findViewById(R.id.textView4);
        tv3=findViewById(R.id.textView5);
        tv4=findViewById(R.id.textView6);
        tv5=findViewById(R.id.textView7);

        tv.setText("welcome "+s);
        tv1.setText(s1);
        tv2.setText(s2);
        tv3.setText(s3);
        tv4.setText(s4);
        tv5.setText(s5);






    }
}