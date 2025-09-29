package com.example.project2;

import android.graphics.Color;
import android.view.View;

public class MyTextView_ClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.GREEN);
    }
}