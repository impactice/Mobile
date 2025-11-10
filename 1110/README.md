
<img width="1339" height="662" alt="image" src="https://github.com/user-attachments/assets/ed1be65f-9d58-4a37-87c9-89f356d0d262" />


MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton kor = findViewById(R.id.kor);
        RadioButton nokor = findViewById(R.id.nokor);
        Button bt = findViewById(R.id.bt);
        TextView tv = findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg ="";
                if(kor.isChecked()) msg += kor.getText();
                if(nokor.isChecked()) msg += nokor.getText();
                tv.setText(msg);
            }
        });

    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:textSize="30sp"
        android:text="한국인/외국인 선택"
        />
    <RadioGroup
        android:id="@+id/radiogroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center">
        <RadioButton
            android:id="@+id/kor"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한국인"/>

        <RadioButton
            android:id="@+id/nokor"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="외국인" />

    </RadioGroup>

    <Button
        android:id="@+id/bt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="확인" />
    <TextView android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:hint="여기에 표시됨"
        android:textSize="20sp"/>

</LinearLayout>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/94b39ea8-2b1f-489b-90ee-2dc503311362" />

-----------------------------------------------------------------------------------

<img width="1000" height="755" alt="image" src="https://github.com/user-attachments/assets/4693ca16-f965-4f34-85b1-821b56e5c24c" />

<img width="984" height="752" alt="image" src="https://github.com/user-attachments/assets/f7cb54bc-e705-4a46-affb-931e253131a0" />

<img width="986" height="748" alt="image" src="https://github.com/user-attachments/assets/5252ea61-a0f6-4513-843d-047ca1dbe855" />


----------------------------------------------------


<img width="985" height="751" alt="image" src="https://github.com/user-attachments/assets/6bb65653-b420-43c0-840b-e2c26e76ba4e" />

-----------------------------------------------------

<img width="993" height="755" alt="image" src="https://github.com/user-attachments/assets/e80f80db-cfef-4eb7-9271-4862aebad8f3" />


---------------------------------------

<img width="986" height="756" alt="image" src="https://github.com/user-attachments/assets/4760371a-8f6d-46b8-b3d4-26240c16ab10" />

---------------------------------

<img width="992" height="754" alt="image" src="https://github.com/user-attachments/assets/50973dda-0f08-4f32-93fe-97e756b9287f" />

--------------------------------------

<img width="989" height="749" alt="image" src="https://github.com/user-attachments/assets/b3249182-b1e5-4719-9b6b-d1a3e6e006ca" />

------------------------

## 005_인텐트.pdf

<img width="985" height="748" alt="image" src="https://github.com/user-attachments/assets/a5035d77-f277-446f-8263-1467a6aeaa42" />

-------------


<img width="989" height="754" alt="image" src="https://github.com/user-attachments/assets/b0f83587-f1f9-49e7-9667-b85d79955a47" />


 SecondActivity.java 만들기  

 
<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/a12dd679-93c5-4a48-87e3-77ad7a991d52" />

<img width="897" height="650" alt="image" src="https://github.com/user-attachments/assets/36d64eb5-e253-4d09-b158-61920de76a1a" />


MainActivity.java 
```
package com.example.project3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_QuizStart=findViewById(R.id.button_QuizStart);
        button_QuizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), SecondActivity.class));
            }
        });
    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:orientation="vertical" android:gravity="center" android:background="#03A9F4">
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:gravity="center" android:text="퀴즈" android:textSize="80sp"/>
    <Button
        android:id="@+id/button_QuizStart"
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:layout_gravity="center" android:layout_margin="40dp" android:text="시작"
        android:textSize="40sp"/>
</LinearLayout>
```

SecondActivity.java
```
package com.example.project3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}

```

activity_second.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:orientation="vertical" android:padding="30dp" android:gravity="center">
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:gravity="center" android:text="대한민국의수도는?" android:textSize="30sp"/>
    <EditText
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:gravity="center" android:hint="답변입력" android:textSize="30sp"/>
    <Button
        android:id="@+id/button_QuizStart"
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:layout_gravity="center" android:text="다음" android:textSize="30sp"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/2de56605-4a7f-45e3-a9c9-b75505f722fd" />


<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/0bdcd30e-c198-4bb9-a5f8-f0bc52c6068b" />


------------------------------------

<img width="988" height="751" alt="image" src="https://github.com/user-attachments/assets/7b5b8ec2-f26c-41e5-8cde-b6aae47cf57a" />

```
Intent intent=new Intent(getApplicationContext(), Activity_Second.class);
startActivity(intent);
```

```
Intent intent = new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse("https://www.google.com"));
startActivity(intent);
```

MainActivity.java 
```
package com.example.project3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_QuizStart=findViewById(R.id.button_QuizStart);
        button_QuizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
                //startActivity(new Intent(getApplication(), SecondActivity.class));
            }
        });
    }
}
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/8b7bfcb0-3ace-40c8-b32c-cb90ab5d4ac0" />

시작을 누르면 구글 접속

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/7b185052-126b-42a0-a3fc-fee9722b6af4" />

-------------------------------

<img width="987" height="748" alt="image" src="https://github.com/user-attachments/assets/c042f1fe-aac7-4f90-b58c-a68708f0dffc" />

```
 // 웹브라우저표시
Intent intent= new Intent(Intent.ACTION_VIEW);
intent.setData(Uri.parse("https://www.google.com"));
startActivity(intent);
```

MainActivity.java 
```
package com.example.project3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_QuizStart=findViewById(R.id.button_QuizStart);
        button_QuizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 웹브라우저표시
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com"));
                startActivity(intent);
                //startActivity(new Intent(getApplication(), SecondActivity.class));
            }
        });
    }
}
```

```
                // 지도표시
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=부산시청근처주차장"));
                startActivity(intent);
```

MainActivity.java
```
package com.example.project3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_QuizStart=findViewById(R.id.button_QuizStart);
        button_QuizStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 지도표시
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:0,0?q=부산시청근처주차장"));
                startActivity(intent);
                //startActivity(new Intent(getApplication(), SecondActivity.class));
            }
        });
    }
}
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/2c0abb40-71a4-4bee-bc1d-612f1078c902" />

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/83230555-42b0-4257-bd2b-405b26f19df1" />

---------------------------------

<img width="996" height="749" alt="image" src="https://github.com/user-attachments/assets/049d9187-bde0-4d26-96e9-ad674d557c89" />

<img width="986" height="748" alt="image" src="https://github.com/user-attachments/assets/be519935-3a09-4a33-882e-bb7cdf5264f8" />

--------------

<img width="983" height="752" alt="image" src="https://github.com/user-attachments/assets/4ba2fa81-74d5-4c04-be2d-ae6c29f29407" />

<img width="989" height="751" alt="image" src="https://github.com/user-attachments/assets/39ce607c-c98c-4dd8-bac1-f43189efa7a9" />



