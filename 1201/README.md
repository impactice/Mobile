

<img width="1251" height="825" alt="image" src="https://github.com/user-attachments/assets/5b75a36c-e637-49d5-b02d-6b7fa5286772" />

MainActivity.java
```
package com.example.project6;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> lister;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lister = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lister);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView testText = new TextView(this);
        testText.setText("Test");
        ll.addView(testText);

        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        Button insertButton = new Button(this);
        insertButton.setText("삽입");
        insertButton.setLayoutParams(buttonParams);

        Button deleteButton = new Button(this);
        deleteButton.setText("삭제");
        deleteButton.setLayoutParams(buttonParams);

        listview = new ListView(this);
        listview.setAdapter(adapter);

        ll.addView(insertButton);
        ll.addView(deleteButton);
        ll.addView(listview);

        insertButton.setOnClickListener(v -> {
            lister.add(0, "아이템");
            adapter.notifyDataSetChanged();
        });

        deleteButton.setOnClickListener(v -> {
            if (!lister.isEmpty()) {
                lister.remove(0);
                adapter.notifyDataSetChanged();
            }
        });

        setContentView(ll);
    }
}
```

-----

<img width="822" height="623" alt="image" src="https://github.com/user-attachments/assets/11eb79a0-ad6a-4c85-9381-6f692a89a4b7" />

---

<img width="826" height="621" alt="image" src="https://github.com/user-attachments/assets/aa0cc78c-1098-4ab0-96c6-9dc7e2f2cee1" />

<img width="816" height="621" alt="image" src="https://github.com/user-attachments/assets/0fad2898-1f1e-45b5-b365-b18bad4cd4a7" />


--- 

<img width="820" height="620" alt="image" src="https://github.com/user-attachments/assets/2c9ce593-9db8-4c07-bd95-42cfe27c5674" />


MainActivity.java 
```
package com.example.project4;

import android.content.Intent;
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
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity{
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        Button button=findViewById(R.id.button);
        button.setOnClickListener( v -> new Thread( () -> display() ).start()) ;
    }
    private void display() {
        runOnUiThread( () -> textview.setText(""));
        String s=getFromUrl("https://www.busan.go.kr/");
        runOnUiThread( () -> textview.setText(s));
    }
    private String getFromUrl(String urlString) {
        StringBuilder sb=new StringBuilder();
        try {
            URL url=new URL(urlString);
            BufferedReader si=new BufferedReader(new InputStreamReader(url.openStream()));
            for(String line=si.readLine(); line!=null; line=si.readLine()) sb.append(line);
            si.close();
        } catch (Exception e) { e.printStackTrace(); }
        return sb.toString();
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
    android:gravity="center_horizontal"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.AppCompat.Button.Small"
        android:text="다운로드"/>
    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView
            android:id="@+id/textview"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>
    </ScrollView>
</LinearLayout>
```

AndroidManifest.xml
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Project4"
        tools:targetApi="31">

        <activity
            android:name=".SecondActivity"
            android:exported="false" />

        <activity
            android:name=".MyAdapter"
            android:exported="false" />

        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

    </application>
</manifest>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/3d871ce1-cdb0-4123-bc1c-ece3d46565d5" />

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/e43d630d-c776-4ec8-87a6-6c32b41d2680" />

--- 

<img width="792" height="600" alt="image" src="https://github.com/user-attachments/assets/aa3e81a4-cc5a-44df-af66-264fba48e7ee" />



MainActivity.java
```
package com.example.project4;

import android.content.Intent;
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
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        ProgressBar progressbar=findViewById(R.id.progressbar);
        button.setText("SHOW");
        progressbar.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.getText().toString().equals("SHOW")){
                    progressbar.setVisibility(View.VISIBLE);
                    button.setText("HIDE");
                }
                else {
                    progressbar.setVisibility(View.GONE);
                    button.setText("SHOW");
                }
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
    android:padding="40dp"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <Button
        android:id="@+id/button"
        style="@style/Widget.AppCompat.Button.Small"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="SHOW"/>
    <ProgressBar
        android:visibility="gone"
        android:id="@+id/progressbar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/5f809888-7719-44b2-8231-b86f63b568c2" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/a5cb0c91-3de7-4cd7-8dca-14d0e1fcf791" />

--- 


<img width="791" height="599" alt="image" src="https://github.com/user-attachments/assets/854c9794-b531-4f8c-9cdd-f69e6dab2d2b" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
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
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity{
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview= findViewById(R.id.imageview);
        new Thread(()->{
            try {
                URL url=new URL("https://kscms.ks.ac.kr/resources/_Img/Common/flogo.png");
                bitmap=BitmapFactory.decodeStream(url.openStream());
                runOnUiThread(()->imageview.setImageBitmap(bitmap));
            } catch (IOExceptione) {e.printStackTrace();}
        }).start();
    }
}
```


activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="40dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ImageView
        android:id="@+id/imageview"
        android:layout_width="100dp"
        android:layout_height="100dp"/>
</LinearLayout>
```

AndroidManifest.xml
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <!-- 인터넷 권한 -->
    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Project4"
        tools:targetApi="31">

        <!-- 메인 액티비티 (앱 실행 진입점) -->
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>

        <!-- 두 번째 액티비티 -->
        <activity
            android:name=".SecondActivity"
            android:exported="false" />

    </application>
</manifest>
```

왜 안 뜨는 지는 몰?루
<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/2b77f1e0-9835-412e-b0c4-0c33c0f32164" />

---

## 010_저장소.pdf 

<img width="745" height="565" alt="image" src="https://github.com/user-attachments/assets/99814376-40ae-49f1-8d62-35962d1067cd" />







