
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

```

activity_main.xml (수정) 
```

``` 
