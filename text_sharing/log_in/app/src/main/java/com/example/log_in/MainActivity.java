package com.example.log_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.editTextTextPassword);
    }

    public void login(View view) {
        if(et.getText().toString().equals("iagned")) {
            Intent i = new Intent(this, MainActivity3.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "ok.try harder! wrong password", Toast.LENGTH_SHORT).show();
        }
    }

    public void regi(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);

    }
}