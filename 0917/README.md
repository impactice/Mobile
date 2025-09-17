# 만들기 
- xml 사용
- 자기 이름을 가운데에 출력


MainActivity.java 
```
package com.example.sample1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setText("홍길동");
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);

        setContentView(textView);

    }
}
```

activity_main.xml 
```
package com.example.sample1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textView = new TextView(this);
        textView.setText("홍길동");
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);

        setContentView(textView);

    }
}
```
---------------------------------------------------------------------------------------------------------------
