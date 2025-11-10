
<img width="1339" height="662" alt="image" src="https://github.com/user-attachments/assets/ed1be65f-9d58-4a37-87c9-89f356d0d262" />


MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton kor = findViewById(R.id.kor);
        RadioButton nokor = findViewById(R.id.nokor);
        Button bt = findViewById(R.id.bt);
        TextView tv = findViewById(R.id.tv);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg ="";
                if(kor.isChecked()) msg += kor.getText();
                if(nokor.isChecked()) msg += nokor.getText();
                tv.setText(msg);
            }
        });

    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:textSize="30sp"
        android:text="한국인/외국인 선택"
        />
    <RadioGroup
        android:id="@+id/radiogroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center">
        <RadioButton
            android:id="@+id/kor"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한국인"/>

        <RadioButton
            android:id="@+id/nokor"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="외국인" />

    </RadioGroup>

    <Button
        android:id="@+id/bt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="확인" />
    <TextView android:id="@+id/tv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:hint="여기에 표시됨"
        android:textSize="20sp"/>

</LinearLayout>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/94b39ea8-2b1f-489b-90ee-2dc503311362" />

-----------------------------------------------------------------------------------

<img width="1000" height="755" alt="image" src="https://github.com/user-attachments/assets/4693ca16-f965-4f34-85b1-821b56e5c24c" />

<img width="984" height="752" alt="image" src="https://github.com/user-attachments/assets/f7cb54bc-e705-4a46-affb-931e253131a0" />

<img width="986" height="748" alt="image" src="https://github.com/user-attachments/assets/5252ea61-a0f6-4513-843d-047ca1dbe855" />


----------------------------------------------------



MainActivity.java 
```

```


activity_main.xml 
```

```




