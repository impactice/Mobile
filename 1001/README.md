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

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/43e52349-8b02-4097-9bb7-83447f60d28e" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/b00ed70c-2b43-48c4-ac39-487c773dc827" />


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

이거는 람다식으로 추상화  

MainActivity.java (수정)
```
package com.example.project2;

import android.os.Bundle;
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
        bt.setOnClickListener(v -> {String s =et.getText().toString(); tv.setText(s.length()+"");});
        
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
<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/d31f58be-302c-43ac-9685-851e942964ad" />

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/e16b13cb-9e42-4e48-9276-fa24ea20d2ec" />


<img width="647" height="489" alt="image" src="https://github.com/user-attachments/assets/c6545aa9-c172-476a-b588-3e3333ca9b65" />

MainActivity.java (수정)
```
package com.example.project2;

import android.os.Bundle;
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
        bt.setOnClickListener(v -> {String s =String.format("%.2f", 37.7777); tv.setText("섭씨 "+s+"(도)");});

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
        android:hint="화씨 온도를 입력하세요"
        android:layout_margin="20dp"
        android:textSize="20sp"
        android:layout_gravity="center"/>


    <Button
        android:id="@+id/bt"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="20dp"
        android:layout_gravity="center"
        android:text="섭씨 온도"
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

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/5bd1ea42-cf94-4249-9b52-f640ed021626" />

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/e27ea119-5d0d-49d8-a5a3-6dcb2c640556" />


<img width="891" height="677" alt="image" src="https://github.com/user-attachments/assets/0a320743-e5c1-430d-86f2-f1465a1c25eb" />


MainActivity.java (수정)
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("터치하면 배경색이 변경됩니다.");
        textview.setTextSize(25);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int color= Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                v.setBackgroundColor(color);
                Log.i(TAG, "onClick: "+"Color value "+color);
            }
        });
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/e0eebf78-f749-4cf0-9046-052d1913f91f" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/225aa0ce-6a3c-47e7-b4ce-3e166b7533b5" />

<img width="1918" height="1028" alt="image" src="https://github.com/user-attachments/assets/752fe64f-9b08-49a6-b36a-d52ecb182b13" />


