package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext_num1, edittext_num2;
    Button button_add, button_sub;
    TextView textview_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_num1=findViewById(R.id.edittext_num1);
        edittext_num2=findViewById(R.id.edittext_num2);
        button_add=findViewById(R.id.button_add);
        button_sub=findViewById(R.id.button_sub);
        textview_display=findViewById(R.id.textview_display);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // int n1=Integer.parseInt(edittext_num1.getText()); // 오류(getText() 반환자료형주의)
       int n1=Integer.parseInt(edittext_num1.getText().toString());
        int n2=Integer.parseInt(edittext_num2.getText().toString());
        if(v.getId()==R.id.button_add) textview_display.setText(n1+n2+"");
        if(v.getId()==R.id.button_sub) textview_display.setText(n1-n2+"");
    }
}