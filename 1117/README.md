
<img width="1335" height="596" alt="image" src="https://github.com/user-attachments/assets/09925d38-18f2-40ec-bcb7-996de1323769" />


과제 변경중....  


MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Button button;

        // 전체 레이아웃
        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView testText = new TextView(this);
        testText.setText("Test");
        ll.addView(testText);

        // 체크박스 생성
        CheckBox checkbox = new CheckBox(this);
        checkbox.setText("체크하면 확인 버튼이 표시됩니다");
        ll.addView(checkbox);

        RadioGroup radiogroup = new RadioGroup(this);
        radiogroup.setOrientation(LinearLayout.HORIZONTAL);
        Button button=new Button(this);
        button.setText("확인");
        ll.addView(button);
        radiogroup.setVisibility(View.GONE); // 처음에는 숨김
        ll.addView(radiogroup);

        //RadioGroup radiogroup = new RadioGroup(this);
        //radiogroup.setOrientation(LinearLayout.HORIZONTAL);
        //RadioButton rb1 = new RadioButton(this);
        // rb1.setText("확인");
        //radiogroup.addView(rb1);
        //radiogroup.setVisibility(View.GONE); // 처음에는 숨김
        //ll.addView(radiogroup);

        // 체크박스 리스너 설정
        /*
        checkbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                radiogroup.setVisibility(View.VISIBLE);
            } else {
                radiogroup.setVisibility(View.GONE);
            }
        }); */

        setContentView(ll);
    }
}
```

--------

<img width="989" height="749" alt="image" src="https://github.com/user-attachments/assets/5f096f17-ccdf-4861-bf8a-f48dd7ee5644" />

---

<img width="986" height="743" alt="image" src="https://github.com/user-attachments/assets/b48969fc-1d63-48d0-8385-c161066fd693" />

---

<img width="986" height="751" alt="image" src="https://github.com/user-attachments/assets/702e281e-6b4a-4fab-b692-72de99ceebf9" />

---

<img width="990" height="751" alt="image" src="https://github.com/user-attachments/assets/c72af613-2828-4cf3-b374-07eec01a44d6" />

--- 

<img width="990" height="757" alt="image" src="https://github.com/user-attachments/assets/3e17d67c-dede-401f-9e3c-e919b7f8df74" />

--- 

<img width="984" height="749" alt="image" src="https://github.com/user-attachments/assets/7a3e2ee3-e5f3-4411-a84e-e24900e00836" />

----

## 007_리스트 뷰

<img width="747" height="576" alt="image" src="https://github.com/user-attachments/assets/3ad24352-92e0-41e5-9afc-d621c99c3197" />

----

<img width="738" height="562" alt="image" src="https://github.com/user-attachments/assets/7a39cf34-c4a9-4e4d-84c8-1d5d20dc8301" />

-----

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
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
    ListView listview;
    String list[]={"한국","미국","중국","일본","영국","독일","프랑스","캐나다","오스트리아",
            "덴마크","이란","필리핀","인도네시아","브라질","네팔","이집트"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.listitem, R.id.listitem_text, list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list[position]+" 클릭", Toast.LENGTH_LONG).show();
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
    android:layout_height="match_parent">
    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
</LinearLayout>
```

listitem.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:id="@+id/listitem_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="10dp"
        android:textSize="20sp"/>
</LinearLayout>
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/b7b769fd-0065-4bd2-8e90-4a01a62417a8" />

-----

<img width="747" height="564" alt="image" src="https://github.com/user-attachments/assets/55e17778-9e5b-41ef-8631-fd3fbd4f7a9f" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
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
    ListView listview;
    String list[]={"한국","미국","중국","일본","영국","독일","프랑스","캐나다","오스트리아",
            "덴마크","이란","필리핀","인도네시아","브라질","네팔","이집트"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listview=new ListView(this);
        // ArrayAdapter adapter=new ArrayAdapter(this, R.layout.listitem, R.id.listitem_text, list);
        // ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, list);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String v= (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), v+" 클릭", Toast.LENGTH_LONG).show();
                //Toast.makeText(getApplicationContext(), list[position]+" 클릭", Toast.LENGTH_LONG).show();
            }
        });
        setContentView(listview);
    }
}
```

listitem.xml
```
<?xml version="1.0" encoding="utf-8"?>
<TextView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/listitem_text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="10dp"
    android:textSize="20sp"/>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/b3f1c785-66f2-4aa8-98a8-2f94a8caa31e" />

----  

<img width="740" height="571" alt="image" src="https://github.com/user-attachments/assets/67855d09-573f-4286-b544-631c123fa5cb" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
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
    ListView listview;
    String list[]={"한국","미국","중국","일본","영국","독일","프랑스","캐나다","오스트리아",
            "덴마크","이란","필리핀","인도네시아","브라질","네팔","이집트"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listview=new ListView(this);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list[position]+" 클릭", Toast.LENGTH_LONG).show();
                return true; // Long Click 처리완료
            }
        });
        setContentView(listview);
    }
}
```

<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/900f7bdf-8a23-476f-acb5-f2139187fb67" />

------- 


