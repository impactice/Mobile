package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        // textview.setOnClickListener( (v) -> {v.setBackgroundColor(Color.GREEN);} );
        // textview.setOnClickListener( v -> {v.setBackgroundColor(Color.GREEN);} );
        // textview.setOnClickListener( (v) -> v.setBackgroundColor(Color.GREEN) );
        textview.setOnClickListener( v -> v.setBackgroundColor(Color.GREEN));
    }
}