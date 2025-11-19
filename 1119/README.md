
<img width="896" height="689" alt="image" src="https://github.com/user-attachments/assets/465c7fff-a6cd-4374-98bf-7663421f332d" />

-----

<img width="897" height="686" alt="image" src="https://github.com/user-attachments/assets/09a395fb-17ee-4663-8987-79fb6a16b174" />

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

<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/570bef11-5cee-4948-9456-a2b668b8ae73" />

----- 

<img width="902" height="688" alt="image" src="https://github.com/user-attachments/assets/623808d8-bca2-41b3-b32a-a6e9a1004361" />

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
                return true;
            }
        });
        setContentView(listview);
    }
}
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/d5331609-adc7-4830-b9e3-d62de96e09e0" />

-------

<img width="902" height="682" alt="image" src="https://github.com/user-attachments/assets/ea618a53-2fa2-4826-b1d4-4fcfa1c0a242" />

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
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String v= (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), v+" short 클릭", Toast.LENGTH_SHORT).show();
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String v= (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), v+" LONG 클릭", Toast.LENGTH_SHORT).show();
                return false; // 이후onItemClick()호출됨
// return true;
            }
        });
        setContentView(listview);
    }
}
```
짧게 클릭
<img width="1918" height="1028" alt="image" src="https://github.com/user-attachments/assets/07273042-f15e-4dee-899c-53d7cafad7c2" />

길게 클릭
<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/844dd493-4cd5-46f5-8597-61d956ef5a97" />

-----

<img width="903" height="691" alt="image" src="https://github.com/user-attachments/assets/3a31fd25-ceb9-493b-a4e3-156ca3d18376" />

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

import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity{
    String location[]={"부산", "창원", "울산", "진주", "Pusan", "마산", "거제"};
    LinkedList list=new LinkedList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list.addAll(Arrays.asList(location)); // 배열전체내용LinkedList에삽입
        ListView listview=new ListView(this);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list.get(position)+" 클릭", Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(), listview.getItemAtPosition(position).toString()+" 클릭", Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(), adapter.getItem(position).toString()+" 클릭", Toast.LENGTH_SHORT).show();
            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), list.get(position)+" 삭제됨", Toast.LENGTH_SHORT).show();
                list.remove(position); // 리스트아이템삭제
                adapter.notifyDataSetChanged();// 데이터변경이뷰에반영되도록알림
                return true;
            }
        });
        setContentView(listview);
    }
}
```
짧게 누르면 
<img width="1918" height="1029" alt="image" src="https://github.com/user-attachments/assets/7dad352d-074e-4164-b5c3-e68b49d891cf" />

길게 누르면 해당 항목 삭제
<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/4e9b8261-6d63-4a5a-9cd1-95934031e8e3" />

-------


MainActivity.java
```

```

activity_main.xml
```

```
