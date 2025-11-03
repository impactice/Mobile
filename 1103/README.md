
<img width="897" height="676" alt="image" src="https://github.com/user-attachments/assets/c13453a8-07dc-4382-86c2-77b62ba89df8" />

MainActivity.java 
```
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
        EditText ew = findViewById(R.id.ew);
        EditText eh = findViewById(R.id.eh);
        RadioButton rw = findViewById(R.id.rw);
        rw.setChecked(true);
        RadioButton rb = findViewById(R.id.rb);
        RadioButton rk = findViewById(R.id.rk);
        CheckBox c = findViewById(R.id.c);
        Button b = findViewById(R.id.b);
        TextView tv = findViewById(R.id.tv);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg ="";
                msg += "가로 길이: "+ew.getText();
                msg += ", 세로 길이: "+ew.getText();
                if(rw.isChecked()) msg += ", 색상: "+rw.getText();
                if(rb.isChecked()) msg += ", 색상: "+rb.getText();
                if(rk.isChecked()) msg += ", 색상: "+rk.getText();
                if(c.isChecked()) msg += c.getText();
                tv.setText(msg);
            }
        });
    }


}
```

activity_main.xml 
```
<?xml version="1.0" encoding="UTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center_horizontal">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="주문 내역 작성"
        android:textSize="50sp"/>
    <EditText android:id="@+id/ew"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:hint="가로 길이 (mm)"/>
    <EditText android:id="@+id/eh"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:hint="세로 길이 (mm)"/>
    <RadioGroup android:layout_height="wrap_content" android:layout_width="wrap_content" android:orientation="horizontal">
        <RadioButton android:id="@+id/rw"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="화이트"
            android:textSize="30sp"/>
        <RadioButton android:id="@+id/rb"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="브라운"
            android:textSize="30sp"/>
        <RadioButton android:id="@+id/rk"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="블랙"
            android:textSize="30sp"/>
    </RadioGroup>
    <CheckBox android:id="@+id/c"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="설치 공구 필요"
        android:textSize="30sp"/>
    <Button android:id="@+id/b"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="주문 내역 확인"
        android:textSize="30sp"/>
    <TextView android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="여기에 주문 내역 표시됨"
        android:textSize="30sp"/>


</LinearLayout>
``` 

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/544444d9-f7eb-4afe-a4aa-5ae569cd8b17" />


<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/a9d5e095-567f-4acf-b943-440755c86139" />

----------------------------------------------------

<img width="891" height="676" alt="image" src="https://github.com/user-attachments/assets/a54aa844-02e4-4225-ac28-5de54987ce7c" />

MainActivity.java 
```

```

activity_main.xml 
```

```


---------------------------------------------

<img width="894" height="683" alt="image" src="https://github.com/user-attachments/assets/55db30cf-2489-477c-ad3e-423075cc9796" />



xml을 안 쓰는 버전

<img width="890" height="678" alt="image" src="https://github.com/user-attachments/assets/c24962fd-b192-41f8-bb51-dcf6f5244406" />




MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
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
        LinearLayout ll = new LinearLayout(this);
        ll.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        ll.setBackgroundColor(Color.parseColor("#F0F0F0"));
    }


```

하다가 마침

