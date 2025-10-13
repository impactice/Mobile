
<img width="889" height="670" alt="image" src="https://github.com/user-attachments/assets/eb59bab8-5e72-4fbc-8ee0-4d3839cef567" />


MainActivity.java 

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

<img width="1916" height="1025" alt="image" src="https://github.com/user-attachments/assets/21a4582e-c5b4-4d62-95d3-94ec34483079" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/96e92f00-61d1-4744-b654-7cffe90340f5" />

팁  

logt를 치면
<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/48021eab-59ce-484e-aea2-c33326d1e3af" />

여기에 엔터를 치면 이렇게 자동으로 완성이 되어진다
<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/6008f035-791f-4ce2-b620-473b70e5f054" />


------------------------------------------------------------------------------------------

<img width="890" height="670" alt="image" src="https://github.com/user-attachments/assets/03416bc1-5753-4e44-8338-42c1babff237" />



MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
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
                int color=Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                v.setBackgroundColor(color);
                // Toast.makeText(this, "Color value "+color, Toast.LENGTH_SHORT).show(); // 여기서this 사용은오류
                // Toast.makeText(MainActivity.this, "Color value "+color, Toast.LENGTH_SHORT).show(); // 가능
                Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_LONG).show();
                // Toast toast=Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_SHORT);
                // toast.show();
            }
        });
    }
}
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/b85f5f6b-99d6-4370-96b5-0c959ce93cff" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/acfa69c2-237b-42a7-8871-e8e6f18fb1b9" />

------------------------------------------------------------------------------------------

안녕이라고 표시되게 하고 싶으면

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/f59e7758-8e82-4186-b723-fab9b8eef089" />

MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
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
                int color=Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                v.setBackgroundColor(color);
                Toast.makeText(getApplicationContext(), "안녕", Toast.LENGTH_SHORT).show();
                
            }
        });
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/5be2c0cb-b25a-4bd2-9e37-cd1215a73ea1" />




-------------------------------------------------------------------------------------------
<img width="887" height="679" alt="image" src="https://github.com/user-attachments/assets/41eede15-591c-4c8c-b2d4-310287d5a2a9" />



MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
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
                changeColor(v);
            }
        });
    }
    private void changeColor(View v) {
        Random random=new Random();
        int color=Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
        v.setBackgroundColor(color);
        Toast.makeText( this, "Color value "+color, Toast.LENGTH_SHORT).show();
        //Toast.makeText( MainActivity.this, "Color value "+color, Toast.LENGTH_SHORT).show();
        //Toast.makeText( getApplicationContext(), "Color value "+color, Toast.LENGTH_SHORT).show();
    }
}

```



<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/592845aa-be49-4c30-846d-50d4e134a386" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/493f9df0-2627-4eb9-ad8f-de231c86a365" />


----------------------------------------------------------------

<img width="889" height="669" alt="image" src="https://github.com/user-attachments/assets/13d53c45-39e0-4a79-adaa-ce996a4b3224" />

viewGroup이 LinearLayout을 담을 수 있다 

-------------------------------------------------------------------------------

<img width="890" height="674" alt="image" src="https://github.com/user-attachments/assets/45245ca2-8758-4a50-8122-2c1784be9694" />


MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFAB15"
        android:text="  TextView1  "/>
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FF00FF"
        android:text="  TextView2  "/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#00FFFF"
        android:text="  TextView3  "/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/1e2a8634-c1e2-40f8-9d5a-068bcad37adf" />

------------------------------------------------

이 코드 설명 
```
android:background="#FFAB15"
```
이 코드는 배경색 지정 

팁으로는 

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/458e7bf8-61c1-4d20-b811-6963d524e918" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/c5522801-0325-48ed-9bb0-b63547375ec1" />

MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
```

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#AAAAAA"
        android:textSize="30sp"
        android:text="안녕하세요"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFAB15"
        android:text="  TextView1  "/>
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FF00FF"
        android:text="  TextView2  "/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#00FFFF"
        android:text="  TextView3  "/>
</LinearLayout>
```

결과 

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/fbefba69-4e10-4e9b-a68b-85819c0aa78b" />

------------------------------------------------------------------------------------------


MainActivity.java 

```

```

activity_main.xml 

```

```
