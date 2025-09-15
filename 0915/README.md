MainActivity.java 
```
package com.example.project0;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);  //수업시간에 안 씀
        setContentView(R.layout.activity_main);
        /*  //수업시간에 안씀
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/
    }
}
```

activity_main.xml (수정)
```
<?xml version="1.0" encoding="utf-8" ?>
<TextView
    android:id="@+id/txtview"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:text="안녕하세요"
    android:textSize="40sp" />
```

MainActivity.java (수정)
```
package com.example.project0;

import android.os.Bundle;
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
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.txtview);
        textView.setText("반갑습니다");
    }
}
```

<img width="829" height="622" alt="image" src="https://github.com/user-attachments/assets/40aa696a-9dbf-4064-98fe-386b9dc8f6fe" />


MainActivity.java (수정)
```
package com.example.project0;

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
        
        TextView textView = new TextView(this);
        //setContentView(R.layout.activity_main);
       // TextView textView = findViewById(R.id.txtview);
        textView.setText("반갑습니다");
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        
        setContentView(textView);
    }
}
```
<img width="823" height="624" alt="image" src="https://github.com/user-attachments/assets/32c38789-d814-4a2d-a39e-64f895451fdf" />

꿀팁! 
<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/98635ba7-ee96-42e3-9af8-cd98fccd890c" />
MainActivity를 클릭하고 컨트로+H를 누르면 상속 화면이 나온다 
