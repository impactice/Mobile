
<img width="897" height="685" alt="image" src="https://github.com/user-attachments/assets/17a6fdc8-eb84-4f84-8030-d53ef02ad861" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview=findViewById(R.id.imageview);
        // res/drawable 폴더내이미지리소스표시방법1
        imageview.setImageResource(R.drawable.s1);
// res/drawable 폴더내이미지리소스표시방법2
        // imageview.setImageDrawable(getResources().getDrawable(R.drawable.s1));
        // res/drawable 폴더내이미지리소스표시방법3
        // bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.s1);
        // imageview.setImageBitmap(bitmap);
        // res/raw 폴더내이미지리소스표시
// bitmap= BitmapFactory.decodeResource(getResources(), R.raw.s1);
        // imageview.setImageBitmap(bitmap);
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

<img width="1918" height="1030" alt="image" src="https://github.com/user-attachments/assets/d5b67a32-e0ce-4278-87d0-febf8923da8f" />

-----

### 폴더 만들기 

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/81bc6aa4-15fd-44d1-ad5e-0bdafa38e171" />

---

<img width="897" height="676" alt="image" src="https://github.com/user-attachments/assets/3e7986d4-6457-4561-94f3-2ad307b9d22c" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview=findViewById(R.id.imageview);
        imageview.setImageResource(R.drawable.s1);
        TextView textview=findViewById(R.id.textview);
        textview.setText("직육면체");
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <ImageView
        android:id="@+id/imageview"
        android:padding="10dp"
        android:layout_width="100dp"
        android:layout_height="100dp"/>
    <TextView
        android:id="@+id/textview"
        android:padding="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="50sp"/>
</LinearLayout>

```


<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/00d211f1-9da5-45e2-9511-795592a19efb" />

-----


<img width="900" height="689" alt="image" src="https://github.com/user-attachments/assets/afc9f218-b6b1-48e5-8af8-bf7da2d894bb" />


MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
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
    android:orientation="vertical"
    android:gravity="center"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
    <Button
        android:id="@+id/button"
        android:textSize="50sp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="시작"/>
</LinearLayout>
```

SecondActivity.java 
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    String list[] = {
            "https://kdca.go.kr/",
            "https://www.busan.go.kr/",
            "https://www.gov.kr/"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView listView = findViewById(R.id.listview);
        Button button = findViewById(R.id.button);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(list[position]));
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
```

activity_second.xml
```
<?xml version="1.0" encoding="UTF-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:gravity="center_horizontal"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="홈으로"
        android:textSize="30sp"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/9990006d-8278-4225-976f-dffad593a002" />

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/70e8b09b-bd88-4173-b909-1433ff469f41" />


--- 

## 008_스레드.pdf 

<img width="820" height="622" alt="image" src="https://github.com/user-attachments/assets/e5eef0ee-5956-4a3e-8c87-5ba78abe5abd" />


MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    TextView textview;
    Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        button_start=findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                do_job();
            }
        });
    }
    private void do_job() {
        SystemClock.sleep(5000);
        textview.setText("\n작업 완료\n");
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
    <Button
        android:id="@+id/button_start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="작업 시작"/>
    <TextView
        android:id="@+id/textview"
        android:background="#C5E89B"
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="\n\n"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="작업 관련 메모 입력"/>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메모 저장"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/9243c80e-60c0-4e0b-9e9e-50bf2f9855e7" />

- 스레드를 하나 밖에 안 만들어서 작업 시작 버튼을 누르고 작업하는 동안 키 입력이 안됨

----- 

<img width="826" height="628" alt="image" src="https://github.com/user-attachments/assets/932e1f6c-cea2-48ee-ac13-1e2dfec9f705" />


MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textview;
    Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview=findViewById(R.id.textview);
        button_start=findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread=new Thread(new Runnable() {
                    @Override
                    public void run() {
                        do_job();
                    }
                });
                thread.start();
            }
        });
    }
    private void do_job() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textview.setText("\n작업 중\n");
            }
        });
        SystemClock.sleep(5000);
        runOnUiThread( () -> textview.setText("\n작업 완료\n") );
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
    <Button
        android:id="@+id/button_start"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="작업 시작"/>
    <TextView
        android:id="@+id/textview"
        android:background="#C5E89B"
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="\n\n"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="작업 관련 메모 입력"/>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메모 저장"/>
</LinearLayout>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/15792535-bc64-456c-a72e-337a6a1a1586" />


```
@Override
            public void onClick(View v) {
                new Thread(() -> do_job()).start();

            }

```
이렇게 람다식을 쓸 수 있음 

---

<img width="820" height="626" alt="image" src="https://github.com/user-attachments/assets/22ab773d-573a-4d4a-801b-0f74880794fd" />

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

public class MainActivity extends AppCompatActivity{
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textview=new TextView(this);
        textview.setGravity(Gravity.CENTER_HORIZONTAL);
        textview.setTextSize(Dimension.SP, 30);
        setContentView(textview);
        textview.setText("작업중");
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                textview.setBackgroundColor(Color.GREEN);
                textview.setText("작업완료");
            }
        }).start();
    }
}
```


화면이 뜨다가 화면이 꺼짐  

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/f735c0da-b752-4419-ad62-6b4620a0c56f" />


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

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textview=new TextView(this);
        textview.setGravity(Gravity.CENTER_HORIZONTAL);
        textview.setTextSize(Dimension.SP, 30);
        setContentView(textview);
        textview.setText("작업 중");
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textview.setBackgroundColor(Color.GREEN);
                        textview.setText("작업 완료");
                    }
                });
            }
        }).start();
    }
}
```

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/b433b532-2d76-4328-8a9f-f466b00bae94" />


<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/8b5409b8-dd78-44c7-8148-7a0896446bb8" />

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

public class MainActivity extends AppCompatActivity {
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textview=new TextView(this);
        textview.setGravity(Gravity.CENTER_HORIZONTAL);
        textview.setTextSize(Dimension.SP, 30);
        setContentView(textview);
        textview.setText("작업 중");
        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                runOnUiThread( 
                        () -> {
                            textview.setBackgroundColor(Color.GREEN);
                            textview.setText("작업 완료");
                        });
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        textview.setBackgroundColor(Color.GREEN);
//                        textview.setText("작업 완료");
//                    }
//                });
            }
        }).start();
    }
}
```

- 교수님이 쓰레드를 꼭 알아야 한다고 하심
--- 
