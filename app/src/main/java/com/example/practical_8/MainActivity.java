package com.example.practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "successfull.activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclk(View v)
    {
        Intent intent = new Intent(this,MainActivity2.class);

        EditText edittext= findViewById(R.id.Name);
        EditText edittext2= findViewById(R.id.email);
        EditText edittext3= findViewById(R.id.phone);
        EditText edittext4= findViewById(R.id.address);

        String message = edittext.getText().toString() + "\n"
                         +edittext2.getText().toString() +"\n"
                         +edittext3.getText().toString() +"\n"
                         +edittext4.getText().toString() ;

        intent.putExtra(MSG,message);
        startActivity(intent);

    }



}