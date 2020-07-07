package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et,et1,et2,et3,et4;
    RadioButton b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editTextTextPersonName);
        et1=findViewById(R.id.editTextTextPersonName2);
        et2=findViewById(R.id.editTextTextEmailAddress);
        et3=findViewById(R.id.editTextPhone);
        et4=findViewById(R.id.editTextTextPersonName3);
        b1=findViewById(R.id.radioButton);
        b2=findViewById(R.id.radioButton2);

    }

    public void submit(View view) {
        String data5 = null;


        String data = et.getText().toString();
        String data1 = et1.getText().toString();
        String data2= et2.getText().toString();
        String data3 = et3.getText().toString();
        String data4 = et4.getText().toString();
        if(b1.isChecked() ){
            data5 = b1.getText().toString();
        }
        if(b2.isChecked() ){
             data5 = b2.getText().toString();
        }

        if (data.isEmpty() && data1.isEmpty() && data2.isEmpty() && data3.isEmpty() && data4.isEmpty()){
            Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent i=new Intent(MainActivity.this,MainActivity2.class);
            i.putExtra("mydata", data);
            i.putExtra("mydata1", data1);
            i.putExtra("mydata2", data2);
            i.putExtra("mydata3", data3);
            i.putExtra("mydata4", data4);
            i.putExtra("mydata5", data5);




            startActivity(i);

        }

    }
}