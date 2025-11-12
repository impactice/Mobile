인텐트를 사용하는 2가지 방법 (암시적 인텐트와 명시적 인텐트)
<img width="819" height="617" alt="image" src="https://github.com/user-attachments/assets/e8176ddb-e9ba-4a9b-a968-913a8909d785" />

-----

<img width="823" height="623" alt="image" src="https://github.com/user-attachments/assets/f88bae49-fa65-460c-8bb3-85f65478734b" />

---

<img width="820" height="626" alt="image" src="https://github.com/user-attachments/assets/5ea78247-d891-4721-8590-8d662eefda15" />

--------------

파일 이름 바꾸기 팁! 

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/cb30f1cc-501b-4f78-b180-8bd6300f8fb7" />

왜? 이렇게 해야 하는 가?  
이렇게 하면 파일 이름이 변경 되는 동시에 선언 된 것도 바꾼다(개발자 일이 줄어든다)

---------------------------

<img width="816" height="619" alt="image" src="https://github.com/user-attachments/assets/bd23bb0e-1086-4078-bfbb-5578ac0f96ca" />

Activity_First.java
```
package com.example.project3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity_First extends AppCompatActivity{
    private int GET_COUNTRY_NAME=1;
    private TextView textview_display;
    private int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setTitle("첫번째 액티비티");
        textview_display=findViewById(R.id.textview_display);
        Button button=findViewById(R.id.button_countryNameInput);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), Activity_Second.class);
                intent.putExtra("COUNTER", ++counter);
                startActivityForResult(intent, GET_COUNTRY_NAME);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==GET_COUNTRY_NAME && resultCode==RESULT_OK){
            textview_display.setText(data.getStringExtra("COUNTRY_NAME"));
        }
    }
}
```

Activity_Second.java
```
package com.example.project3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_Second extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("두번째 액티비티");
        //TextView textview_display=findViewById(R.id.textview_display); //이거 없애래 필요 없는거
        EditText edittext_countryName=findViewById(R.id.edittext_countryName);
        Button button=findViewById(R.id.button_return);
        Intent intent=getIntent();
        edittext_countryName.setHint("입력시도 "+intent.getIntExtra("COUNTER",0)+"번째");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("COUNTRY_NAME", edittext_countryName.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
```

activity_first.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="100dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <Button android:id="@+id/button_countryNameInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="도시명 입력"
        android:textSize="20sp"/>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="도시명이 여기에 표시됨"
        android:textSize="20sp"/>
</LinearLayout>
```


activity_second.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="100dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <EditText android:id="@+id/edittext_countryName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="20sp"/>
    <Button android:id="@+id/button_return"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="입력 완료"
        android:textSize="20sp"/>

</LinearLayout>
```

이거 오류가 안 잡힘...

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/0f6c3e7e-87dd-43fd-8be1-d3a64bcc4e08" />


위의 사진에서 코드에 줄이 그어져 있는 이유로는 쓰지 말라고... (더 좋고 효율적인 것이 나왔..)

-------------------------------

<img width="1127" height="853" alt="image" src="https://github.com/user-attachments/assets/07162a2f-8988-447f-b74e-aa209162f2ec" />


MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
        EditText e = findViewById(R.id.e);
        Button b = findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                String s = "geo:0,0?q="+e.getText().toString();
                intent.setData(Uri.parse(s));
                startActivity(intent);
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
    android:gravity="center_horizontal"
    android:orientation="vertical">
    <TextView
        android:id="@+id/t"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="지도 검색"/>
    <EditText
        android:id="@+id/e"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:hint="지도 검색어 입력"/>
    <Button
        android:id="@+id/b"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="30sp"
        android:text="검색"/>

</LinearLayout>

```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/34002e1c-ff3b-4d1e-b62c-6f4336ea1dcb" />

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/5752d5e0-2862-40ef-b558-7fb5efbbd7fb" />

<img width="1917" height="1028" alt="image" src="https://github.com/user-attachments/assets/b5d35d73-ae63-4b29-a5e6-3b0ef6ee226d" />

---

<img width="1124" height="853" alt="image" src="https://github.com/user-attachments/assets/3bd7bec0-9a69-4168-b5d0-3aefa080c460" />

<img width="1127" height="848" alt="image" src="https://github.com/user-attachments/assets/58055ebe-624a-46dd-827f-057122bd3913" />


-------

<img width="1126" height="854" alt="image" src="https://github.com/user-attachments/assets/9f631704-ec87-4bf5-a539-fd15e80e219a" />

<img width="1127" height="853" alt="image" src="https://github.com/user-attachments/assets/f33cd29b-9b8f-4e3f-a419-1ffed66ca808" />

<img width="1122" height="853" alt="image" src="https://github.com/user-attachments/assets/6a85cc85-5da1-49c1-a238-e7a64c5bf122" />

<img width="1125" height="852" alt="image" src="https://github.com/user-attachments/assets/e134d101-a36a-45f3-8f1d-f0ea1f3ee5f8" />


--------------------------

## 006_액티비티생명주기.pdf

<img width="988" height="752" alt="image" src="https://github.com/user-attachments/assets/0da87971-4b24-4523-81d7-7a8ce0b19a6c" />

onCreate() -> onStart() -> onResume() -> 실행 -> onPause() -> onStop() -> onDestory() -> 없음  
그리고 onStop() -> onRestart() -> onStart() 

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

    }
    @Override
    protected void onStart() { super.onStart(); }
    @Override
    protected void onResume() { super.onResume(); }
    @Override
    protected void onPause() { super.onPause();}
    @Override
    protected void onStop() { super.onStop(); }
    @Override
    protected void onDestroy() { super.onDestroy(); }
}
```

---

<img width="989" height="754" alt="image" src="https://github.com/user-attachments/assets/1ec59c93-b63f-4276-a73d-c3c9f313e90e" />

---

<img width="986" height="750" alt="image" src="https://github.com/user-attachments/assets/c87d18d4-5b66-463a-9fde-40aa69667885" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("액티비티A ", "onCreate: ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("액티비티A ", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("액티비티A ", "onResume: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("액티비티A ", "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("액티비티A ", "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("액티비티A ", "onDestroy: ");
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="50dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="액티비티 A"
        android:textSize="30sp"/>
</LinearLayout>
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/fb226eee-8482-4be9-bf31-09d0bc12188b" />

onCreate() - 실행됨 -> onStart() - 실행됨 -> onResume() - 실행됨 -> 실행(실행이 되었으니 앞에 꺼는 실행이 됨) 

---

<img width="987" height="755" alt="image" src="https://github.com/user-attachments/assets/d595a368-a0d7-462a-8b55-a8115aedc2f3" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("액티비티A ", "onCreate: ");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("액티비티A ", "onStart: ");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("액티비티A ", "onResume: ");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("액티비티A ", "onPause: ");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("액티비티A ", "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("액티비티A ", "onDestroy: ");
    }
}
```


activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="50dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="액티비티A"
        android:textSize="30sp"/>
</LinearLayout>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/0b43694b-0a54-4c22-a60e-d0cea7a4e0ce" />

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/07b11404-fcbd-44b3-95ce-d0d26188a966" />
