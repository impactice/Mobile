
<img width="644" height="491" alt="image" src="https://github.com/user-attachments/assets/46a26be6-93e6-4f21-82f5-ee148fb6fb54" />


MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = new TextView(this);
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

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/a2c10f90-a3da-449c-9470-05b3b25f0cb5" />


<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/986b7e00-490f-4629-95da-21f0338a3df0" />

MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.BLUE);
            }
        };
        textview.setOnClickListener(listener);
    }
}
```

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/2369d3fa-e781-4016-9b75-c4b442671f26" />

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/b70725db-f13e-42fb-b772-b4c2dceae414" />

<img width="643" height="488" alt="image" src="https://github.com/user-attachments/assets/a15503e3-c145-4443-a234-fa185f5d5127" />

클래스 만드는 법 

<img width="1919" height="1025" alt="image" src="https://github.com/user-attachments/assets/0ec689d6-43e5-4190-a5f6-18be1392e7b2" />

MyTextView_ClickListener.java (새로 만든 클래스) 
```
package com.example.project2;

import android.graphics.Color;
import android.view.View;

public class MyTextView_ClickListener implements View.OnClickListener{
    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.GREEN);
    }
}
```

MainActivity.java (수정) 
```
package com.example.project2;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new MyTextView_ClickListener());
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/a366867d-3a8a-4424-8ca2-612cd58864a3" /> 

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/58dae8c9-de4b-4c59-bad5-b2dfbf10e010" />

<img width="644" height="490" alt="image" src="https://github.com/user-attachments/assets/a0e29188-89ec-463f-ba62-3e1a559581fd" />

MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.setBackgroundColor(Color.GREEN);
    }
}
```

<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/29b19a90-223e-47ba-81ad-b178d34b005a" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/3f2b68dc-4c29-4372-bdf6-2d2857f0f6bb" />


MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.textview) v.setBackgroundColor(Color.GREEN);
        v.setBackgroundColor(Color.GREEN);
    }
}
```

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<TextView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/textview"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:text="안녕하세요"
    android:textSize="30sp" />
``` 

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/ff8e8ea4-cc47-4623-8a4e-ac87eee402cc" /> 

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/d6ab7539-4ee8-4c3e-9519-f98284f38e7f" />

<img width="647" height="488" alt="image" src="https://github.com/user-attachments/assets/eb47c2f7-4131-4b02-bad0-240216e09739" />


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

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/fd59a610-64cd-4dc8-b6e8-7d4793c7d322" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/9d5501f5-ba2f-4fa5-a1ad-8be898c7efdd" />

```
textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
            }
        });
```
이 부분에서 
```
textview.setOnClickListener(
            textview.setOnClickListener( v -> v.setBackgroundColor(Color.GREEN));
        );
```
이렇게 생략을 할 수 있음  


MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        // textview.setOnClickListener( (v) -> {v.setBackgroundColor(Color.GREEN);} );
        // textview.setOnClickListener( v -> {v.setBackgroundColor(Color.GREEN);} );
        // textview.setOnClickListener( (v) -> v.setBackgroundColor(Color.GREEN) );
        textview.setOnClickListener( v -> v.setBackgroundColor(Color.GREEN));
    }
}
```

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/2e3c00da-3039-4b1c-8484-af445883478f" />

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/7dcd7bc6-3255-43eb-8e91-0c15baecd8d5" />

MainActivity.java (수정) 
```

```
