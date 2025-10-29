package com.example.project3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton v0=findViewById(R.id.v0);
        RadioButton v1=findViewById(R.id.v1);
        RadioButton e=findViewById(R.id.e);
        RadioButton el=findViewById(R.id.el);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = "";
                if(v0.isChecked()) s=v0.getText().toString();
                if(v1.isChecked()) s=v1.getText().toString();
                if(e.isChecked()) s=e.getText().toString();
                if(el.isChecked()) s=el.getText().toString();
                Toast.makeText(getApplicationContext(), "연료유형: " + s, Toast.LENGTH_SHORT).show();
            }
        });
    }


}