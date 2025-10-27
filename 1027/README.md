

<img width="891" height="678" alt="image" src="https://github.com/user-attachments/assets/74502074-6b19-4999-81ac-b7abbf20eacb" />

<img width="899" height="675" alt="image" src="https://github.com/user-attachments/assets/1f1b9788-8dda-4d9b-87e4-bb8443727c39" />

<img width="897" height="678" alt="image" src="https://github.com/user-attachments/assets/2c1e27af-8f0d-449e-bb91-3ec781717582" />

<img width="891" height="676" alt="image" src="https://github.com/user-attachments/assets/f229e02e-fa30-408d-8f9d-d015bbb36c70" />

<img width="894" height="680" alt="image" src="https://github.com/user-attachments/assets/a923ad16-360c-4886-bd13-e1a6e5199f77" />


------------------------------------------------------------------------------------


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

스크롤 내릴 수 있음

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/db679ff9-3696-4309-81b2-1001938c820a" />

------------------------------------------------------------------------------

<img width="890" height="675" alt="image" src="https://github.com/user-attachments/assets/9988113d-f240-44a4-8969-30cf0dbd0a72" />

activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <CheckBox
        android:id="@+id/checkbox_english"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="영어대화가능"
        android:textSize="20sp"/>
    <CheckBox
        android:id="@+id/checkbox_chinese"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="중국어대화가능"
        android:textSize="20sp"/>
    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:id="@+id/radiobutton_korean"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한국인"
            android:textSize="20sp"/>
        <RadioButton
            android:id="@+id/radiobutton_foreigner"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="외국인"
            android:textSize="20sp"/>
    </RadioGroup>
    <Button
        android:id="@+id/button_show"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="입력내용표시"/>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:layout_margin="10dp"
        android:hint="여기에결과표시됨"/>
    <Button
        android:id="@+id/button_clear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="초기화"/>
</LinearLayout>
``` 

MainActivity.java 
```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textview_display;
    private Button button_show, button_clear;
    private CheckBox checkbox_english, checkbox_chinese;
    private RadioButton radiobutton_korean, radiobutton_foreigner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview_display=findViewById(R.id.textview_display);
        button_show=findViewById(R.id.button_show);
        button_clear=findViewById(R.id.button_clear);
        checkbox_english=findViewById(R.id.checkbox_english);
        checkbox_chinese=findViewById(R.id.checkbox_chinese);
        radiobutton_korean=findViewById(R.id.radiobutton_korean);
        radiobutton_foreigner=findViewById(R.id.radiobutton_foreigner);
        button_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb=new StringBuilder();
                sb.append("영어회화가능여부: "+checkbox_english.isChecked()+"\n");
                sb.append("중국어회화가능여부: "+checkbox_chinese.isChecked()+"\n");
                sb.append("한국인: "+radiobutton_korean.isChecked()+"\n");
                sb.append("외국인: "+radiobutton_foreigner.isChecked()+"\n");
                textview_display.setText(sb.toString());
            }
        });
        button_clear.setOnClickListener((v)->button_clear_job());
    }
    private void button_clear_job() {
        checkbox_english.setChecked(false);
        checkbox_chinese.setChecked(false);
        radiobutton_korean.setChecked(false);
        radiobutton_foreigner.setChecked(false);
        textview_display.setText("");
    }
}
```

- String 변경x
- StringBuilder 변경o




<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/d45bf435-8505-4a00-894f-3e96a4c0ad7e" />


한국인 선택하면 외국인 선택이 안됨(반대도 마찬가지) 

<img width="1914" height="1028" alt="image" src="https://github.com/user-attachments/assets/c006bd35-8150-43ee-9671-b247d5ceb0bb" />

--------------------------------------------

activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <CheckBox
        android:id="@+id/checkbox_english"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="영어대화가능"
        android:textSize="20sp"/>
    <CheckBox
        android:id="@+id/checkbox_chinese"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="중국어대화가능"
        android:textSize="20sp"/>
    <CheckBox
        android:id="@+id/checkbox_jap"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="일본어대화가능"
        android:textSize="20sp"/>
    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:id="@+id/radiobutton_korean"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한국인"
            android:textSize="20sp"/>
        <RadioButton
            android:id="@+id/radiobutton_foreigner"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="외국인"
            android:textSize="20sp"/>
    </RadioGroup>
    <Button
        android:id="@+id/button_show"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="입력내용표시"/>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:layout_margin="10dp"
        android:hint="여기에결과표시됨"/>
    <Button
        android:id="@+id/button_clear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="초기화"/>
</LinearLayout>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/8fb91c66-7492-4657-8da4-7c16aa035a86" />

-----------------------------------------------


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <CheckBox
        android:id="@+id/checkbox_english"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="영어대화가능"
        android:textSize="20sp"/>
    <CheckBox
        android:id="@+id/checkbox_chinese"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="중국어대화가능"
        android:textSize="20sp"/>
    <CheckBox
        android:id="@+id/checkbox_jap"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="일본어대화가능"
        android:textSize="20sp"/>
    
    <RadioGroup
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:id="@+id/radiobutton_korean"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한국인"
            android:textSize="20sp"/>
        <RadioButton
            android:id="@+id/radiobutton_foreigner"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="외국인"
            android:textSize="20sp"/>
        <RadioButton
            android:id="@+id/radiobutton_allon"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="N/A"
            android:textSize="20sp"/>
    </RadioGroup>
    <Button
        android:id="@+id/button_show"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="입력내용표시"/>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:layout_margin="10dp"
        android:hint="여기에결과표시됨"/>
    <Button
        android:id="@+id/button_clear"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:text="초기화"/>
</LinearLayout>
```

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/35767252-95ce-4ae1-944c-6937ad4d4c1b" />

---------------------------

<img width="897" height="678" alt="image" src="https://github.com/user-attachments/assets/92eb80f7-7c53-420a-97cd-cb9dd0d4b398" />

activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:orientation="vertical" android:padding="20dp"
    android:gravity="center_horizontal">
    <EditText
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:id="@+id/edittext" android:hint="이름"/>
    <CheckBox
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:id="@+id/checkbox_english" android:text="영어대화가능"/>
    <CheckBox
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:id="@+id/checkbox_chinese" android:text="중국어대화가능"/>
    <RadioGroup
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:id="@+id/radiobutton_korean" android:text="한국인"/>
        <RadioButton
            android:layout_width="wrap_content" android:layout_height="wrap_content"
            android:id="@+id/radiobutton_foreigner" android:text="외국인"/>
    </RadioGroup>
    <Button
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:id="@+id/button_show" android:text="입력내용표시"/>
    <TextView
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:id="@+id/textview_display" android:hint="여기에결과표시됨"/>
    <CheckBox
        android:layout_width="wrap_content" android:layout_height="wrap_content"
        android:id="@+id/checkbox_lock" android:text="LOCK"/>
</LinearLayout>
```


MainActivity.java 
```
package com.example.project2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textview_display;
    private Button button_show;
    private CheckBox checkbox_english, checkbox_chinese, checkbox_lock;
    private RadioButton radiobutton_korean, radiobutton_foreigner;
    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext= findViewById(R.id.edittext);
        textview_display= findViewById(R.id.textview_display);
        button_show= findViewById(R.id.button_show);
        checkbox_english= findViewById(R.id.checkbox_english);
        checkbox_chinese= findViewById(R.id.checkbox_chinese);
        checkbox_lock= findViewById(R.id.checkbox_lock);
        radiobutton_korean= findViewById(R.id.radiobutton_korean);
        radiobutton_foreigner= findViewById(R.id.radiobutton_foreigner);
        checkbox_lock.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                lockUnlock( ! isChecked) ;
            }
        });
    }
    private void lockUnlock(boolean isChecked) {
        edittext.setEnabled(isChecked);
        checkbox_english.setEnabled(isChecked);
        checkbox_chinese.setEnabled(isChecked);
        radiobutton_korean.setEnabled(isChecked);
        radiobutton_foreigner.setEnabled(isChecked);
        button_show.setEnabled(isChecked);
        textview_display.setEnabled(isChecked);
    }
}
```

- ~.setEnabled() 사용못하게

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/4d37d58d-afbe-407f-8814-22c097933f4c" />






