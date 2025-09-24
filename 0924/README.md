저번꺼 복습
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
        textview1.setOnClickListener(new View.OnClickListener() { //인터페이스는 객체 생성을 할 수 없다 - 인터페이스는 추상 메서드만 가지고 있고, 구현이 없기 때문 

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
    android:gravity="center">
    <TextView
        android:id="@+id/textview1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:text="안녕하세요"
        android:textSize="30sp" />
</LinearLayout>

```
<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/da8a7435-11d2-4b06-bd2d-7e9ef871d6e4" />

---------------------------------------------------------------------------------------
<img width="733" height="555" alt="image" src="https://github.com/user-attachments/assets/cac58a3b-db86-47f9-ba7b-1543b19765d5" />

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
        Button bt= findViewById(R.id.bt);
        TextView tv= findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // et.getText();  // return 타입이 String이 아니라 Editable이다
                String s= et.getText().toString(); // 해결법
                if(s.length()<=0) return;
                double w = Double.parseDouble(s)*0.3025;
                tv.setText(w+" (평)");

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
    android:padding="20dp"
    android:gravity="center_horizontal">
    <EditText
        android:id="@+id/et"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:inputType="number"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="제곱미터값을입력하세요" />
    <Button
        android:id="@+id/bt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="평수계산"
        android:textSize="30sp"
        android:layout_margin="10dp"/>
    <TextView
        android:id="@+id/tv"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="여기에평수결과표시됨"/>
</LinearLayout>
```











