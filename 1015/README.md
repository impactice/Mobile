
<img width="891" height="673" alt="image" src="https://github.com/user-attachments/assets/e56e11dc-1c23-4b2d-8e03-e7c42b9ef03b" />




MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
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
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="#FFAB15"
        android:text="  TextView1  " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="2"
        android:background="#FF00FF"
        android:text="  TextView2  " />
    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="3"
        android:background="#00FFFF"
        android:text="  TextView3  " />
</LinearLayout>
``` 

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/2981fb05-f248-4da6-bedf-842fa7183bb9" />

이 코드 수정
```
android:layout_weight="10"
```

MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
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
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="10"
        android:background="#FFAB15"
        android:text="  TextView1  " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="10"
        android:background="#FF00FF"
        android:text="  TextView2  " />
    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="10"
        android:background="#00FFFF"
        android:text="  TextView3  " />
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/5f5f273f-cbdb-4221-9b9c-2b0b7c20c252" />

MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
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
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F0F0F0"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_weight="10"
        android:background="#FFAB15"
        android:text="  TextView1  " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="#FF00FF"
        android:text="  TextView2  " />
    <TextView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="10"
        android:background="#00FFFF"
        android:text="  TextView3  " />
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/c2dfca62-9251-4436-bc42-33ee343b5139" />

--------------------------------------------------------------------------------------------------

<img width="895" height="677" alt="image" src="https://github.com/user-attachments/assets/fbadba77-c355-4e6a-acb7-41cfaf83a9a3" />




----------------------------------------------------------------------------------------------------------------

<img width="892" height="679" alt="image" src="https://github.com/user-attachments/assets/0c70f05a-9b3f-42fb-936d-90553dcc0249" />



----------------------------------------------------------------------------------------------------------

<img width="890" height="675" alt="image" src="https://github.com/user-attachments/assets/71bb69ed-6069-48c7-8f9e-17223280eef2" />


<img width="893" height="677" alt="image" src="https://github.com/user-attachments/assets/3f02e83e-3efa-42b1-b9d6-ec52f519cd43" />

px로 설정할 시 휴대폰 해상도에 따라서 다르게 보일 수 있음 (반면 dp는 px보다 거의 비슷하게 보이게 됨)

<img width="893" height="672" alt="image" src="https://github.com/user-attachments/assets/81471a1e-c31b-47b1-977f-a448e8881254" />

글자의 경우에는 dp로 했을 때 글자 크기 조절이 안 될 수 있음 (반면 sp는 글자 변경이 가능)  


-> 글자는 sp를 쓰는 게 좋고 화면은 dp가 더 나음  

-----------------------------------------------------------------------------------------------

<img width="889" height="673" alt="image" src="https://github.com/user-attachments/assets/f14b2976-af49-4190-8d3c-aa802cae7bc7" />



activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#DEDEDE"
    android:orientation="vertical">
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFAB15"
        android:text="TextView1"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FF00FF"
        android:layout_margin="20dp"
        android:text="TextView2 (margin 20dp)"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#00FFFF"
        android:padding="20dp"
        android:text="TextView3 (padding 20dp)"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#FFFF00"
        android:layout_margin="20dp"
        android:padding="20dp"
        android:text="TextView4 (padding 20dp, margin 20dp)"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/1088b7c7-bf64-478a-a932-7df4472ba19d" />

----------------------------------------------------------------------------------------------------

<img width="895" height="673" alt="image" src="https://github.com/user-attachments/assets/5aa3f3a2-9216-45a0-93fc-54d901b8816f" />


activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent" android:layout_height="match_parent"
    android:background="#DEDEDE" android:orientation="vertical">
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:background="#FFAB15" android:gravity="center"
        android:text=" center "/>
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:background="#FF00FF" android:gravity="right"
        android:text=" right "/>
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:background="#00FFFF" android:gravity="left"
        android:text=" left "/>
    <TextView
        android:layout_width="match_parent" android:layout_height="wrap_content"
        android:background="#FFFF00"
        android:text=" 설정없음"/>
    <TextView
        android:layout_width="match_parent" android:layout_height="0dp"
        android:layout_weight="1" android:background="#BB00BB"
        android:gravity="top"
        android:text=" top "/>
    <TextView
        android:layout_width="match_parent" android:layout_height="0dp"
        android:layout_weight="1" android:background="#00BBBB"
        android:gravity="bottom"
        android:text=" bottom "/>
    <TextView
        android:layout_width="match_parent" android:layout_height="0dp"
        android:layout_weight="1" android:background="#BBBB00"
        android:gravity="top|center"
        android:text=" top|center"/>
    <TextView
        android:layout_width="match_parent" android:layout_height="0dp"
        android:layout_weight="1" android:background="#BBBBBB"
        android:gravity="right|center"
        android:text=" right|center"/>
</LinearLayout>
``` 

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/d89e894f-40ab-42a2-9ae5-2ad2b0e6c10a" />

--------------------------------------------------------------------------------------------------------


<img width="894" height="679" alt="image" src="https://github.com/user-attachments/assets/38fc9113-cbf6-41c8-8d98-f6140c203382" />




activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#DEDEDE"
    android:orientation="vertical">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFAB15"
        android:layout_gravity="center"
        android:text=" center " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FF00FF"
        android:layout_gravity="right"
        android:text=" right " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#00FFFF"
        android:layout_gravity="left"
        android:text=" left " />
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:background="#FFFF00"
        android:text=" 설정없음" />
</LinearLayout>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/6747aa50-406c-4c23-8a6a-518c9b41a0af" />


---------------------------------------------------------------------------------------------

<img width="893" height="682" alt="image" src="https://github.com/user-attachments/assets/8d820c3c-4cb9-4a63-8ca5-45e089cf6330" />

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="회원이름"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textPassword"
        android:hint="패스워드"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:hint="회원email"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:hint="회원정보"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="right">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:text="회원등록"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:text="메인"/>
    </LinearLayout>
</LinearLayout>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/28674473-0182-414f-865a-934a4b9255e7" />


-----------------------------------------------------------------------------------


패스워드를 길게 하게 싶으면 (이 부분 변경)

```
EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:inputType="textPassword"
        android:hint="패스워드"/>
```

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="회원이름"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:inputType="textPassword"
        android:hint="패스워드"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="textEmailAddress"
        android:hint="회원email"/>
    <EditText
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:hint="회원정보"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="right">
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:text="회원등록"/>
        <Button
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:text="메인"/>
    </LinearLayout>
</LinearLayout>
``` 

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/ee3db159-1f6a-420d-be91-5942d25b3b9a" />


----------------------------------------------------------------------------------------------------------

<img width="896" height="682" alt="image" src="https://github.com/user-attachments/assets/933b5acc-1cf8-4d4b-926b-0c170ad2b430" />



activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <EditText
        android:id="@+id/edittext_email"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="이메일"/>
    <EditText
        android:id="@+id/edittext_password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/edittext_email"
        android:hint="패스워드"/>
    <Button
        android:id="@+id/button_register"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/edittext_password"
        android:layout_margin="10dp"
        android:text="회원등록"/>
    <Button
        android:id="@+id/button_home"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/edittext_password"
        android:layout_toRightOf="@id/button_register"
        android:layout_margin="10dp"
        android:text="메인"/>
</RelativeLayout>
``` 

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/77eb7959-31d0-4d9d-8874-7c0314caa450" />


코드 설명 

```
android:id="@+id/edittext_email"
```
왜 여기에는 +가 없는 것인가? 그 이유는 id를 만드는 것이 아닌 만들어진 id를 참조하는 것이기 때문에
```
android:layout_below="@id/edittext_email"
```






-------------------------------------------------------------------------------------------

03_이벤트 처리.pdf

<img width="650" height="499" alt="image" src="https://github.com/user-attachments/assets/28ccc479-66b9-4f49-8947-4cac655648b7" />


MainActivity.java 

```

package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackgroundColor(Color.GREEN);
            }
        });
    }
}

``` 

이거는 시험에 나올 가능성이 높을 듯

  

MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // v.setText("Bye"); // 이거 안됨
                textview.setText("Bye"); // 이거는 됨
                v.setBackgroundColor(Color.GREEN);
                textview.setBackgroundColor(Color.GREEN);
            }
        });
    }
}

```

이 코드 사용법
```
v.setText("Bye");
```


MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("안녕하세요");
        textview.setTextSize(30);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // v.setText("Bye"); // 이거 안됨
                TextView tt = (TextView) v; // 타입을 캐스팅해서 바꿈 
                tt.setText("Bye"); // 해결 방법
                textview.setText("Bye"); // 이거는 됨
                
            }
        });
    }
}
```

----------------------------------------------------------------------------------------

<img width="889" height="673" alt="image" src="https://github.com/user-attachments/assets/d39b304a-516e-45e6-9d0f-ceef27bd9632" />



<img width="895" height="677" alt="image" src="https://github.com/user-attachments/assets/1c15aba1-0462-407e-8a00-4d11a6bb276e" />


MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String city[]={"서울", "부산", "울산", "창원"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, city);
        spinner.setAdapter(adapter);
    }
}
```




activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="50dp">
    <Spinner
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.AppCompat.Spinner.Underlined"
        android:id="@+id/spinner"/>
</LinearLayout>
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/f831904f-0e66-4f16-b9fe-45e3bcf12e8e" />

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/3b687d65-886a-4eca-acf2-801bf49c4238" />



<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/2c29db92-93c7-454c-b4ff-5786b242a2ae" />

```
ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, city);
```
이 코드 중에서 simple_spinner_item 이 부분에 커서를 하고 Ctrl+B를 누르면 밑에 화면이 뜬다


<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/cffba85c-d3ef-4c6e-a1e1-4a2331b778c7" />

팁! 선택하고 ctrl+/ 하면 전체 주석

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/e55a511f-e413-434b-ba75-56168c69dd6f" />



<img width="1919" height="1033" alt="image" src="https://github.com/user-attachments/assets/cbfa3976-42a0-46f6-b918-d4f0038b6d0a" />



------------------------------------------------------------------------------

<img width="893" height="683" alt="image" src="https://github.com/user-attachments/assets/e33caa5e-4a3f-4dd9-bed0-9d7c5fcc06fa" />


<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/64040986-e6fc-4732-a510-6960cf33b6e9" />

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/6f34e425-1797-40e8-93ac-4ef4c67a95a4" />




MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private String city[]={"서울", "부산", "울산", "창원"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this, R.layout.my_spinner_item, city);
        spinner.setAdapter(adapter);
    }
}
```

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="50dp">
    <Spinner
        android:id="@+id/spinner"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.AppCompat.Spinner.Underlined" />
</LinearLayout>
```

my_spinner_item.xml

```
<?xml version="1.0" encoding="utf-8"?>
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="10dp"
    android:background="#BCECEA" />
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/91defc50-53c2-4f20-9790-5a8c19b61263" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/df99a3c7-2209-4edd-8298-cfe188a0eb77" />

---------------------------------------------------------------------------------

<img width="895" height="678" alt="image" src="https://github.com/user-attachments/assets/a2c7d91e-5e19-4aa5-be14-431721aaa3ce" />

MainActivity.java 

```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private String city[]={"서울", "부산", "울산", "창원"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, city);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), city[position], Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}
```

activity_main.xml 

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="50dp">
    <Spinner
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        style="@style/Widget.AppCompat.Spinner.Underlined"
        android:id="@+id/spinner"/>
</LinearLayout>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/f3154a18-8524-42f9-9a56-4ed2e2ae7bef" />

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/55c86322-59c4-4a96-ba44-4989831cdf3b" />


-----------------------------------------------------------------------------













