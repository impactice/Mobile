
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







MainActivity.java
```

```

activity_main.xml
```

```
