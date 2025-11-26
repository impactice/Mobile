package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textview=new TextView(this);
        textview.setGravity(Gravity.CENTER_HORIZONTAL);
        textview.setTextSize(Dimension.SP, 30);
        setContentView(textview);
        textview.setText("작업 중");
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                runOnUiThread(
                        () -> {
                            textview.setBackgroundColor(Color.GREEN);
                            textview.setText("작업 완료");
                        });
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        textview.setBackgroundColor(Color.GREEN);
//                        textview.setText("작업 완료");
//                    }
//                });
            }
        }).start();
    }
}