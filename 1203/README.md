
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

-----

<img width="748" height="565" alt="image" src="https://github.com/user-attachments/assets/4b146a18-a668-463e-abb3-d8fe37d7baa6" />

---

<img width="747" height="570" alt="image" src="https://github.com/user-attachments/assets/08d8ed02-ae7e-4c45-9292-c7c44d2fb298" />

---

<img width="758" height="579" alt="image" src="https://github.com/user-attachments/assets/791f0f2a-f7f8-4e29-a1e0-e5307ee6ee0f" />

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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;




public class MainActivity extends AppCompatActivity {
    EditText edittext_memo, edittext_display;
    Button button_save, button_read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_memo=findViewById(R.id.edittext_memo);
        edittext_display=findViewById(R.id.edittext_display);
        button_save=findViewById(R.id.button_save);
        button_read=findViewById(R.id.button_read);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) { button_save_job(); }
        });
        button_read.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) { button_read_job(); }
        });
    }
    private void button_read_job() {
        try {
            FileInputStream fis = openFileInput("memo.txt");
            BufferedReader iF=new BufferedReader(new InputStreamReader(fis));
            edittext_display.setText("");
            for(String line=iF.readLine(); line!=null; line=iF.readLine()){
                edittext_display.append(line+"\n");
            }
            iF.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
    private void button_save_job() {
        try {
            FileOutputStream oF=openFileOutput("memo.txt", MODE_APPEND);
            String s=edittext_memo.getText().toString()+"\n";
            oF.write(s.getBytes());
            oF.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="20dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="메모"
        android:textSize="20sp"/>
    <EditText android:id="@+id/edittext_memo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="15sp"/>
    <Button android:id="@+id/button_save"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="저장"
        android:textSize="15sp"/>
    <Button android:id="@+id/button_read"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메모 보기"
        android:textSize="15sp"/>
    <EditText android:id="@+id/edittext_display"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="top"
        android:textSize="15sp"/>
</LinearLayout>
```

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/2a6cbc7d-0a4c-4f2d-a36b-2e08a0fcbeec" />

작성된 파일은 여기서 볼수 있음 
<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/def8cd7d-500d-4a1f-81c3-148e3b2cd111" />

--- 

## 009_메뉴,대화상자

<img width="900" height="688" alt="image" src="https://github.com/user-attachments/assets/35ce061a-c36b-4a5b-8a5f-af0fb47bc5b4" />

---
메뉴 만드는 법 
<img width="904" height="693" alt="image" src="https://github.com/user-attachments/assets/616dbcd4-4ac5-4831-b9e4-8f6e4a25981e" />

<img width="784" height="1044" alt="image" src="https://github.com/user-attachments/assets/726539dd-1bd9-40fc-b0b2-518fae1450d8" />


---

<img width="906" height="698" alt="image" src="https://github.com/user-attachments/assets/5e09d675-6ad3-456d-919b-cfae87c6fb9d" />

MainActivity.java
```
package com.example.project4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.MenuItem;
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
import androidx.annotation.NonNull;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    EditText edittext_memo;
    TextView textview_fontstyle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_memo=findViewById(R.id.edittext_memo);
        textview_fontstyle=findViewById(R.id.textview_fontstyle);
        registerForContextMenu(textview_fontstyle);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.contextmenu_italic){
            edittext_memo.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
        }
        else if(item.getItemId()==R.id.contextmenu_bold){
            edittext_memo.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
        }
        else if(item.getItemId()==R.id.contextmenu_normal){
            edittext_memo.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        }
        return super.onContextItemSelected(item);
    }
}

```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="10dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button android:id="@+id/button_save"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:text="저장"
            android:textSize="15sp"/>
        <TextView
            android:id="@+id/textview_fontstyle"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:text="폰트스타일"
            android:textSize="15sp"/>
    </LinearLayout>
    <EditText
        android:id="@+id/edittext_memo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="메모입력"
        android:textSize="20sp"/>
</LinearLayout>
```

context_menu.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:id="@+id/contextmenu_italic" android:title="italic"/>
    <item android:id="@+id/contextmenu_bold" android:title="bold"/>
    <item android:id="@+id/contextmenu_normal" android:title="normal"/>
</menu>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/705dd76e-7732-4e6f-a89e-a84743e245a1" />


---

<img width="918" height="698" alt="image" src="https://github.com/user-attachments/assets/27fc502c-f39b-487c-82e5-3d6535d05a00" />


---

<img width="906" height="687" alt="image" src="https://github.com/user-attachments/assets/7a9d60a9-cbc2-4463-afaa-137099a348f3" />

--- 

<img width="905" height="686" alt="image" src="https://github.com/user-attachments/assets/48a6ad07-5215-4cfb-a9c8-46ef957d2762" />

--- 

<img width="908" height="695" alt="image" src="https://github.com/user-attachments/assets/b1b6c52c-8cbf-4318-9272-7815ad5d49f9" />

--- 

<img width="909" height="690" alt="image" src="https://github.com/user-attachments/assets/ab42f3d1-a8da-4c24-a72a-280c645edeec" />

--- 

<img width="900" height="699" alt="image" src="https://github.com/user-attachments/assets/537df83b-337c-4958-a00c-940d0639a200" />

--- 








