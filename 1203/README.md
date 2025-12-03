
<img width="746" height="566" alt="image" src="https://github.com/user-attachments/assets/76b47cf1-6321-4986-ab87-6ba342171f30" />

저장소 
1. 파일 - 프레퍼런스(공유) 파일   
    ㄴ (일반) 파일
2. DB

프레퍼런스는 뭔가? **key,value 쌍을 입출력**

----- 

<img width="751" height="571" alt="image" src="https://github.com/user-attachments/assets/3dd38db4-8d1b-4d24-84d6-df25e82eda44" />




MainActivity.java

```
package com.example.project4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Dimension;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;




public class MainActivity extends AppCompatActivity {
    private static final String MEMO = "MEMO";
    EditText edittext_title, edittext_memo;
    SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        edittext_memo=findViewById(R.id.edittext_memo);
        SharedPreferences pref=getSharedPreferences("myPref", MODE_PRIVATE);
        if(pref.contains(MEMO)) edittext_memo.setText(pref.getString(MEMO, ""));
    }
    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences pref=getSharedPreferences("myPref", MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putString(MEMO, edittext_memo.getText().toString());
        editor.apply();
    }
}

```


activity_a.xml
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
        android:text="아이디어 창고"
        android:textSize="25sp"/>
    <EditText
        android:id="@+id/edittext_memo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="아이디어 메모"
        android:textSize="20sp"/>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="저장"
        android:textSize="20sp"/>
</LinearLayout>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/696eb0da-aac3-4230-b1d8-ccd2f29f7ed9" />

-----

<img width="744" height="569" alt="image" src="https://github.com/user-attachments/assets/9688220b-c84f-465c-ba27-6a7c8a4e2a70" />

---

<img width="749" height="575" alt="image" src="https://github.com/user-attachments/assets/5df820e7-5165-445d-8a8b-166eadd9c1c2" />




