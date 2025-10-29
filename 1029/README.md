
<img width="896" height="679" alt="image" src="https://github.com/user-attachments/assets/440889e7-7b78-440d-91e1-1e1644ca4569" />

뷰 위젯 
- TextView
- EditText
- Button
- CheckBox -> isChecked()
- RadioButton 

뷰그룹 컨테이너  
- LinearLayout: 선형적으로 배치(위,아래등)
- ScrollView
- ListView ㄱ
- Spinner  ㅡ 이 두개가 AdapterView -> Adapter -> Data source 
- RadioGroup 

---------------------------------------------------------------


<img width="891" height="673" alt="image" src="https://github.com/user-attachments/assets/241a2493-2d11-4ad8-8e9e-30e628c3d201" />



MainActivity.java 
```
package com.example.project3;

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

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/9f94ca8b-5b72-4989-a83b-5d0e4ea02f05" />

------------------------------------------------------------------------------------------

<img width="892" height="677" alt="image" src="https://github.com/user-attachments/assets/936186df-0316-4c0d-a786-68b46d68302f" /> 
  
람다식으로 변경1  


MainActivity.java 
```
package com.example.project3;

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
        checkbox_lock.setOnClickListener( (v) -> lockUnlock( ! checkbox_lock.isChecked() ) );
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

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/52986429-eee1-4416-b281-68bdce67c8a6" />

람다식으로 변경2  

MainActivity.java 
```
package com.example.project3;

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
        checkbox_lock.setOnCheckedChangeListener( (buttonView, isChecked) -> lockUnlock( ! isChecked) );
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

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/ef0c8b02-fc20-423c-a2fa-0439ab185e4a" />


-------------------------------------------------------------------------------

<img width="893" height="679" alt="image" src="https://github.com/user-attachments/assets/0a56453e-28b5-4f96-b885-898b683df629" />

MainActivity.java 
```
package com.example.project3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edittext=findViewById(R.id.edittext);
        TextView textview=findViewById(R.id.textview);
        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                String v=edittext.getText().toString();
                if(v.length()<=0) textview.setText("");
                else textview.setText(Double.parseDouble(v)*0.3025+" (평)");
            }
        });
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getApplicationContext(),
                        edittext.getText()+" (제곱미터): "+textview.getText(),
                        Toast.LENGTH_LONG).show();
                edittext.setText("");
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
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <EditText
        android:id="@+id/edittext"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:inputType="number"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="제곱미터값을입력하세요" />
    <TextView
        android:id="@+id/textview"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="여기에평수결과표시됨"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/a4d8c51c-0958-4612-aea5-f71e7a2a5d46" />

----------------------------------------------------------------

<img width="891" height="677" alt="image" src="https://github.com/user-attachments/assets/a3fc0991-600c-4031-8960-83922764b006" />


MainActivity.java 
```
package com.example.project3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private int leftClick, rightClick;
    LinearLayout linearlayout;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearlayout=findViewById(R.id.linearlayout);
        textview=findViewById(R.id.textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), textview.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()!=MotionEvent.ACTION_UP) return super.onTouchEvent(event);
        if(event.getX()<linearlayout.getWidth()/2) leftClick++;
        else rightClick++;
        textview.setText("Left "+leftClick+", Right "+rightClick);
        return super.onTouchEvent(event);
    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/linearlayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">
    <TextView
        android:id="@+id/textview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="클릭수표시"
        android:gravity="center"
        android:textSize="30sp"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/20302a60-0bf4-4c67-acc2-a81d6c2a57f7" />


<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/75a303d7-277f-4a8f-9d06-21920bac00b9" />

----------------------------------------------------

<img width="892" height="674" alt="image" src="https://github.com/user-attachments/assets/5121b92a-c40d-417c-a567-b425715ce44c" />


MainActivity.java 
```
package com.example.project3;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=findViewById(R.id.button1);
        Button button=findViewById(R.id.button);
        TextView textview1=findViewById(R.id.textview1);
        TextView textview_display=findViewById(R.id.textview_display);
        button1.setTag(0);
        textview1.setTag(0);
        button1.setOnClickListener(this);
        textview1.setOnClickListener(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s="button1="+button1.getTag()+", textview1="+textview1.getTag();
                textview_display.setText(s);
            }
        });
    }
    @Override
    public void onClick(View v) {
        v.setTag((int)v.getTag()+1);
    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="button1"
        android:textSize="20sp"
        android:layout_margin="10dp"/>
    <TextView
        android:id="@+id/textview1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="textview1"
        android:textSize="20sp"
        android:layout_margin="10dp"/>
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="터치횟수표시"
        android:textSize="20sp"
        android:layout_margin="10dp"/>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="20sp"
        android:layout_margin="10dp"/>
</LinearLayout>
```

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/70eecfad-5d4f-4633-91f3-e8dd07dac6f4" />

<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/bf42298d-fbe5-4f2a-ba23-f24ec7f07911" />

------------------------------------------------------------------------------------------------

<img width="896" height="676" alt="image" src="https://github.com/user-attachments/assets/ee834dbb-93ee-4907-9b99-8b09e75965b8" />


MainActivity.java 
```

```

activity_main.xml 
```

```


