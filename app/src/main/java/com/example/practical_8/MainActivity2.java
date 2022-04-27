package com.example.practical_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent=getIntent();

        String message = intent.getStringExtra(MainActivity.MSG);
        TextView textView = findViewById(R.id.detailsview);
        textView.setText(message);


    }
}