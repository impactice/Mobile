package com.example.project3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_QuizStart=findViewById(R.id.button_QuizStart);
        button_QuizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 지도표시
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=부산시청근처주차장"));
                startActivity(intent);
                //startActivity(new Intent(getApplication(), SecondActivity.class));
            }
        });
    }
}