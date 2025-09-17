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
    android:orientation="vertical"
    android:gravity="top" >
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

- 수업에 한거 
activity_main.xml (수정) 
```
<?xml version="1.0" encoding="uTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="top" >
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Test"
        android:textSize="30sp"
        android:gravity="left"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="이름: 홍길동\n프로그래밍 능력: Java(중), Python(상)\n국적: 대한민국\n연락처: gdhong@example.com\n"
        android:textSize="20sp"
        android:gravity="left"/>



</LinearLayout>

```
----------------------------------------------------------------------------------------------
<img width="750" height="566" alt="image" src="https://github.com/user-attachments/assets/bc404225-fdc9-47ce-8b57-e33e3a1d1459" />

MainActivity.java 
```
package com.example.sample1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// package 문, import 문 생략

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setGravity(Gravity.CENTER);

        TextView textView1 = new TextView(this);
        textView1.setText("안녕하세요");
        textView1.setTextSize(30);
        textView1.setGravity(Gravity.CENTER);

        TextView textView2 = new TextView(this);
        textView2.setText("반갑습니다");
        textView2.setTextSize(30);
        textView2.setGravity(Gravity.CENTER);

        linearLayout.addView(textView1);
        linearLayout.addView(textView2);

        setContentView(linearLayout);
    }
}
```
<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/0d4845e8-5702-4262-8eea-51927fbb4a21" />

설명 
기본적인 흐름(기본적인 틀)
MainActivity.java
```
package com.example.sample1;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// package 문, import 문 생략

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout ll = new LinearLayout(this);
        TextView tv1 = new TextView(this);
        TextView tv2 = new TextView(this);
        ll.addView(tv1);
        ll.addView(tv2);
        setContentView(ll);

    }
}
```

MainActivity.java
```
package com.example.sample1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// package 문, import 문 생략

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout ll = new LinearLayout(this);
        TextView tv1 = new TextView(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.CENTER);
        tv1.setText("안녕하세요");
        tv1.setTextSize(30);
        tv1.setGravity(Gravity.CENTER);
        TextView tv2 = new TextView(this);
        tv2.setText("반갑습니다");
        tv2.setTextSize(30);
        tv2.setGravity(Gravity.CENTER);
        ll.addView(tv1);
        ll.addView(tv2);
        setContentView(ll);

    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/eae2e6ee-1be3-4dd4-ab74-eef79b073909" />

--------------------------------------------------------------------------------------
Add와 Optimize 두개 체크하고 ok누르기 
<img width="988" height="727" alt="image" src="https://github.com/user-attachments/assets/0636a20d-e0c4-4eec-a968-ef115048102a" />

----------------------------------------------------------------------------------------
<img width="750" height="565" alt="image" src="https://github.com/user-attachments/assets/dbb13da8-67d6-4593-8ff1-d3e11fab1358" />
MainActivity.java
```
package com.example.sample1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// package 문, import 문 생략

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout ll = new LinearLayout(this);
        TextView tv1 = new TextView(this);
        TextView tv2 = new TextView(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setGravity(Gravity.TOP);
        tv1.setText("Test");
        tv1.setTextSize(30);
        tv1.setGravity(Gravity.LEFT);
        tv2.setText("이름: 홍길동\n프로그래밍 능력: Java(중), Python(상)\n국적: 대한민국\n연락처: gdhong@example.com\n");
        tv2.setTextSize(20);
        tv2.setGravity(Gravity.LEFT);
        ll.addView(tv1);
        ll.addView(tv2);
        setContentView(ll);

    }
}
```






 











