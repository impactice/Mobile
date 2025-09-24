저번꺼 복습
MainActivity.java (수정) 
```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview1 = findViewById(R.id.textview1);
        textview1.setOnClickListener(new View.OnClickListener() { //인터페이스는 객체 생성을 할 수 없다 - 인터페이스는 추상 메서드만 가지고 있고, 구현이 없기 때문 

            @Override
            public void onClick(View v) {
                textview1.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
```

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center">
    <TextView
        android:id="@+id/textview1"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:text="안녕하세요"
        android:textSize="30sp" />
</LinearLayout>

```
<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/da8a7435-11d2-4b06-bd2d-7e9ef871d6e4" />

---------------------------------------------------------------------------------------
<img width="733" height="555" alt="image" src="https://github.com/user-attachments/assets/cac58a3b-db86-47f9-ba7b-1543b19765d5" />

MainActivity.java (수정) 
```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et = findViewById(R.id.et);
        Button bt= findViewById(R.id.bt);
        TextView tv= findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // et.getText();  // return 타입이 String이 아니라 Editable이다
                String s= et.getText().toString(); // 해결법
                if(s.length()<=0) return;
                double w = Double.parseDouble(s)*0.3025;
                tv.setText(w+" (평)");

            }
        });
    }
}
```


activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <EditText
        android:id="@+id/et"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:inputType="number"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="제곱미터값을입력하세요" />
    <Button
        android:id="@+id/bt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="평수계산"
        android:textSize="30sp"
        android:layout_margin="10dp"/>
    <TextView
        android:id="@+id/tv"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="여기에평수결과표시됨"/>
</LinearLayout>
```


<img width="1919" height="1025" alt="image" src="https://github.com/user-attachments/assets/bb6cad89-0314-434b-8d5c-d8dc9a122348" />

-------------------------------------------------------------------------------------

<img width="911" height="688" alt="image" src="https://github.com/user-attachments/assets/87e69788-c9c2-492d-bc74-227c47b01f6f" />


MainActivity.java (수정) 
```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {
    EditText edittext_num1, edittext_num2;
    Button button_add, button_sub;
    TextView textview_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_num1=findViewById(R.id.edittext_num1);
        edittext_num2=findViewById(R.id.edittext_num2);
        button_add=findViewById(R.id.button_add);
        button_sub=findViewById(R.id.button_sub);
        textview_display=findViewById(R.id.textview_display);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(edittext_num1.getText().toString());
                int n2=Integer.parseInt(edittext_num2.getText().toString());
                if(v.getId()==R.id.button_add) textview_display.setText(n1+n2+"");
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1=Integer.parseInt(edittext_num1.getText().toString());
                int n2=Integer.parseInt(edittext_num2.getText().toString());
                if(v.getId()==R.id.button_sub) textview_display.setText(n1-n2+"");
            }
        });
    }

//    @Override
//    public void onClick(View v) {
//        // int n1=Integer.parseInt(edittext_num1.getText()); // 오류(getText() 반환자료형주의)
//        int n1=Integer.parseInt(edittext_num1.getText().toString());
//        int n2=Integer.parseInt(edittext_num2.getText().toString());
//        if(v.getId()==R.id.button_add) textview_display.setText(n1+n2+"");
//        if(v.getId()==R.id.button_sub) textview_display.setText(n1-n2+"");
//    }
}
```

activity_main.xml (수정) 
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    android:gravity="center_horizontal">
    <EditText
        android:id="@+id/edittext_num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:inputType="number"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="첫번째수를입력하세요" />
    <EditText
        android:id="@+id/edittext_num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:inputType="number"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="두번째수를입력하세요" />
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:orientation="horizontal">
        <Button
            android:id="@+id/button_add"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="덧셈"
            android:textSize="30sp"
            android:layout_margin="10dp"/>
        <Button
            android:id="@+id/button_sub"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="뺄셈"
            android:textSize="30sp"
            android:layout_margin="10dp"/>
    </LinearLayout>
    <TextView
        android:id="@+id/textview_display"
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:textSize="30sp"
        android:layout_margin="10dp"
        android:hint="여기에계산결과표시됨"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/94f07b10-67a1-4361-a468-f722e254b158" />


MainActivity.java (교제) 
```
package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext_num1, edittext_num2;
    Button button_add, button_sub;
    TextView textview_display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_num1=findViewById(R.id.edittext_num1);
        edittext_num2=findViewById(R.id.edittext_num2);
        button_add=findViewById(R.id.button_add);
        button_sub=findViewById(R.id.button_sub);
        textview_display=findViewById(R.id.textview_display);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // int n1=Integer.parseInt(edittext_num1.getText()); // 오류(getText() 반환자료형주의)
       int n1=Integer.parseInt(edittext_num1.getText().toString());
        int n2=Integer.parseInt(edittext_num2.getText().toString());
        if(v.getId()==R.id.button_add) textview_display.setText(n1+n2+"");
        if(v.getId()==R.id.button_sub) textview_display.setText(n1-n2+"");
    }
}
```

activity_main.xml은 동일

<img width="1918" height="1028" alt="image" src="https://github.com/user-attachments/assets/69a50e34-10a7-41ff-aeea-c35569728cdb" />


