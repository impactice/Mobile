

<img width="891" height="678" alt="image" src="https://github.com/user-attachments/assets/74502074-6b19-4999-81ac-b7abbf20eacb" />

<img width="899" height="675" alt="image" src="https://github.com/user-attachments/assets/1f1b9788-8dda-4d9b-87e4-bb8443727c39" />

<img width="897" height="678" alt="image" src="https://github.com/user-attachments/assets/2c1e27af-8f0d-449e-bb91-3ec781717582" />

<img width="891" height="676" alt="image" src="https://github.com/user-attachments/assets/f229e02e-fa30-408d-8f9d-d015bbb36c70" />

<img width="894" height="680" alt="image" src="https://github.com/user-attachments/assets/a923ad16-360c-4886-bd13-e1a6e5199f77" />

<img width="897" height="682" alt="image" src="https://github.com/user-attachments/assets/19b07f62-4d4a-4598-9020-eacd712f8288" />

MainActivity.java 
```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
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
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center_horizontal"
        android:orientation="vertical">
        <TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:padding="80dp"
        android:textSize="20sp"
        android:text="신청서작성" />
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="이름"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="국적"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="거주지(도시명등)"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="상세주소"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="전자메일주소"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="연락처"/>
        <EditText android:layout_width="match_parent" android:layout_height="wrap_content"
        android:layout_margin="40dp" android:hint="비상연락처(선택)"/>
        <Button android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:text="제출"/>
    </LinearLayout>
</ScrollView>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/3fef32e6-0347-4b38-a681-c9519ef8aa4f" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/db679ff9-3696-4309-81b2-1001938c820a" />






