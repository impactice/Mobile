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

activity_main.xml (수정)
```
<?xml version="1.0" encoding="uTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="경성이"
        android:textSize="30sp"
        android:gravity="center"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="오리"
        android:textSize="30sp"
        android:gravity="center"/>

</LinearLayout>

```
<img width="467" height="951" alt="image" src="https://github.com/user-attachments/assets/f60e9955-cf12-4dd6-a6e0-3e5a64508983" />

activity_main.xml (수정)
```
<?xml version="1.0" encoding="uTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="경성이"
        android:textSize="30sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="오리"
        android:textSize="30sp"
        android:gravity="right"/>


</LinearLayout>

```
<img width="519" height="987" alt="image" src="https://github.com/user-attachments/assets/eb360a93-9f2d-4c98-acaa-da5953c6775e" />





<img width="748" height="566" alt="image" src="https://github.com/user-attachments/assets/89b2cd18-2abd-4de4-a1e2-ff0df2a3d161" />

------------------------------------------------------------------------------------------------------------

<img width="750" height="568" alt="image" src="https://github.com/user-attachments/assets/d644c3d8-dc29-42c4-bc9a-b8d5203531dd" />

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="uTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Test"
        android:textSize="30sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="이름: 홍길동"
        android:textSize="20sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="프로그래밍 능력: Java(중), Python(상)"
        android:textSize="20sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="국적: 대한민국"
        android:textSize="20sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="연락처: gdhong@example.com"
        android:textSize="20sp"
        android:gravity="left"/>


</LinearLayout>
```
- 보라색 박스는 타이틀바는 아직 안 배운 개념이여서 구현x















 











