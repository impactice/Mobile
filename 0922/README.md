MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview1 = findViewById(R.id.textview1);
        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview1.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
```

activity_main.xml (수정)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:id="@+id/tv"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:text="안녕하세요"
        android:textSize="30sp"/>

</LinearLayout>
```
클릭할시 
<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/eda18391-f266-4080-a4c7-194ef2730936" />

-------------------------------------------------------------
activity_main.xml (수정)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:id="@+id/textview1"
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:gravity="center"
        android:text="안녕하세요"
        android:textSize="30sp"/>

</LinearLayout>
```
클릭할 시
<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/8fe702a3-2688-4800-9fdc-499bbce7758d" />

------------------------------------------------
