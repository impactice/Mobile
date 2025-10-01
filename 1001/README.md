람다식 설명

MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
```
저기 코드 중에서 
```
new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
            }
        }
```
이 부분이 람다식을 통해서 줄일 수 있음  

이렇게 줄일 수 있음   
```
textview.setOnClickListener(
                (v) -> {
                v.setBackgroundColor(Color.GREEN);
            }
        );
```

더 줄일 수도 있음 
```
textview.setOnClickListener(
                (v) -> 
                v.setBackgroundColor(Color.GREEN)
            
        );
```

더 간결하게 
```
textview.setOnClickListener(v -> v.setBackgroundColor(Color.GREEN));
```

이렇게 바뀔 수도 있음  

MainActivity.java (수정)
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(v -> ft(v)); // 이 부분이 변화
    }

    private void ft(View v) { // 이 부분이 추가
        v.setBackgroundColor(Color.GREEN);
    }
}
```
<img width="642" height="487" alt="image" src="https://github.com/user-attachments/assets/90478c9e-3665-4b34-8d35-d64cdab15369" />




MainActivity.java (수정)
```
package com.example.project2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = findViewById(R.id.bt);
        TextView tv = findViewById(R.id.tv);
        bt.setOnClickListener(v -> tv.setText("정답: 서울"));
    }


}
```

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">

    <Button
        android:id="@+id/bt"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:layout_gravity="center"
        android:text="문제 1: 대한민국 수도는?"
        android:textSize="30sp" />
    <TextView
        android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:gravity="center"
        android:textSize="20sp"
        android:hint="여기에 답안이 표시된다"/>


</LinearLayout>

```

<img width="644" height="487" alt="image" src="https://github.com/user-attachments/assets/72fb5674-4b28-465a-a12b-4f5402baacb9" />


MainActivity.java (수정)
```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et = findViewById(R.id.et);
        Button bt = findViewById(R.id.bt);
        TextView tv = findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s =et.getText().toString();
                tv.setText(s.length()+"");
            }
        });
    }


}
```

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">

    <EditText
        android:id="@+id/et"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="여기에 텍스트를 입력하세요"
        android:layout_margin="20dp"
        android:textSize="20sp"
        android:layout_gravity="center"/>


    <Button
        android:id="@+id/bt"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:layout_gravity="center"
        android:text="텍스트 길이 계산"
        android:textSize="30sp" />
    <TextView
        android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:gravity="center"
        android:textSize="20sp"
        android:hint="여기에 답안이 표시된다"/>


</LinearLayout>

``` 

