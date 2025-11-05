
<img width="896" height="676" alt="image" src="https://github.com/user-attachments/assets/8266c879-1d20-4d79-a45c-96f968a99b06" />

<img width="895" height="678" alt="image" src="https://github.com/user-attachments/assets/8b090ccf-4d63-478f-8fc4-1442913cbc0b" />

<img width="899" height="678" alt="image" src="https://github.com/user-attachments/assets/e1b1fa76-7137-4bd8-ac87-d6a17f18f500" />


MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setBackgroundColor(Color.parseColor("#F0F0F0"));
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(
           new LinearLayout.LayoutParams(
                   ViewGroup.LayoutParams.MATCH_PARENT,
                   ViewGroup.LayoutParams.MATCH_PARENT
           )

        );
        TextView tv1 = new TextView(this);
        tv1.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        tv1.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv1.setText(" TextView 1 ");
        TextView tv2 = new TextView(this);
        tv2.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        tv2.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv2.setText(" TextView 2 ");
        TextView tv3 = new TextView(this);
        tv3.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        tv3.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv3.setText(" TextView 3 ");
        ll.addView(tv1);
        ll.addView(tv2);
        ll.addView(tv3);
        setContentView(ll);
    }


}
```



<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/0106e73e-dfe1-4bc6-b6ec-43bb4f2a0857" />

-----------------------------------------------------------------------------------------------------------

<img width="903" height="683" alt="image" src="https://github.com/user-attachments/assets/63c81510-d2cb-48d4-bdf3-2bf97b7ba9ec" />

<img width="895" height="681" alt="image" src="https://github.com/user-attachments/assets/7e95375e-1ba6-4195-8615-35a739c00680" />


MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        ll.setBackgroundColor(Color.parseColor("#F0F0F0"));
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(
           new LinearLayout.LayoutParams(
                   ViewGroup.LayoutParams.MATCH_PARENT,
                   ViewGroup.LayoutParams.MATCH_PARENT
           )

        );
        TextView tv1 = new TextView(this);
        tv1.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,0,1)
        );
        tv1.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv1.setText(" TextView 1 ");
        TextView tv2 = new TextView(this);
        tv2.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT,0,2)
        );
        tv2.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv2.setText(" TextView 2 ");
        TextView tv3 = new TextView(this);
        tv3.setLayoutParams(
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,0,3)
        );
        tv3.setBackgroundColor(Color.parseColor("#FFAB15"));
        tv3.setText(" TextView 3 ");
        ll.addView(tv1);
        ll.addView(tv2);
        ll.addView(tv3);
        setContentView(ll);
    }


}
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/e7793ce7-49f8-42a0-a08d-d6a821314af8" />

-----------------------------------------------------------------------------

<img width="899" height="685" alt="image" src="https://github.com/user-attachments/assets/2ff037aa-5478-4ac9-bb70-22134b19700a" />

px는 좋지 않고 dp를 써야 한다  
sp는 텍스트 크기 설정 가능 -> 텍스트 크기는 sp로 하고 다른 것들은 dp로 한다

<img width="898" height="678" alt="image" src="https://github.com/user-attachments/assets/a26fb03c-7ae5-42dd-8701-f70fcb4efb52" />

<img width="896" height="680" alt="image" src="https://github.com/user-attachments/assets/112ae417-a8c2-47bf-b0d1-9acdac0c7259" />

<img width="904" height="696" alt="image" src="https://github.com/user-attachments/assets/08a18a94-9aa3-45d2-9024-cf1d3f8b14ab" />

-------------------------------------------------------------------------

<img width="897" height="684" alt="image" src="https://github.com/user-attachments/assets/302defd9-d108-4f5f-817d-0a3da3f663df" />

<img width="895" height="679" alt="image" src="https://github.com/user-attachments/assets/c021727c-e876-44e5-93c2-e1ffd67d2da5" />

---------------------------------------------------------------

<img width="896" height="679" alt="image" src="https://github.com/user-attachments/assets/8200beba-8833-4a1d-a8ed-1c168d50a682" />

<img width="895" height="680" alt="image" src="https://github.com/user-attachments/assets/285a8407-5dff-412b-8a52-8d34b18c955e" /> 

------------------------------------------------------------------------

<img width="903" height="681" alt="image" src="https://github.com/user-attachments/assets/0628654d-05d2-40da-b62d-b66d8b03bc93" />

<img width="888" height="681" alt="image" src="https://github.com/user-attachments/assets/461585ac-859a-4b6b-9db3-3a59a0073da5" />

------------------------------------------------------------------------------------------

<img width="893" height="684" alt="image" src="https://github.com/user-attachments/assets/4e751325-4511-4bc0-840c-27bd28d3f920" />

<img width="890" height="680" alt="image" src="https://github.com/user-attachments/assets/7979c65c-90b2-4d17-8b8d-2d81f0ccec37" />

-----------------------------------------------------------

<img width="892" height="680" alt="image" src="https://github.com/user-attachments/assets/239d0173-39ac-4d57-834f-be963dd80c74" />

<img width="900" height="687" alt="image" src="https://github.com/user-attachments/assets/fb2fc089-7ac3-4330-863a-035f4a8a103e" />

<img width="896" height="683" alt="image" src="https://github.com/user-attachments/assets/48bfc352-27c6-4084-9d09-f48f40c655c9" />

<img width="893" height="680" alt="image" src="https://github.com/user-attachments/assets/0e993e7d-563b-4075-8f1c-b790748859e1" />

-----------------------------------------------------------

<img width="894" height="685" alt="image" src="https://github.com/user-attachments/assets/6c78889f-1208-4c8c-92be-534a2f50e73c" />

<img width="900" height="687" alt="image" src="https://github.com/user-attachments/assets/5ae9d10e-ec00-4c06-8d4e-788740b9156c" />

---------------------------------------------------------------

<img width="897" height="681" alt="image" src="https://github.com/user-attachments/assets/9fd44972-1967-4a64-b3ef-6df5ec452c6d" />

<img width="899" height="684" alt="image" src="https://github.com/user-attachments/assets/4532e8d4-88ad-4588-bdac-53739e3d4090" />

---------------------------------------------------------------------

## 004_사용자인터페이스기초2.pdf 

<img width="986" height="750" alt="image" src="https://github.com/user-attachments/assets/6872fef8-9a3a-4348-be51-56bae66d9fcf" />


MainActivity.java 
```
package com.example.project3;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity{
    LinearLayout ll;
    EditText edittext;
    Button button_add, button_del;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ll= new LinearLayout(this);
        ll.setPadding(50,50,50,50);
        ll.setOrientation(LinearLayout.VERTICAL);
        Random random= new Random();
        for (int i= 0; i< 5; i++) {
            TextView tv = new TextView(this);
            tv.setBackgroundColor(Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            ll.addView(tv); // 끝위치다음에삽입
        }
        LinearLayout ll2 = new LinearLayout(this);
        edittext= new EditText(this); edittext.setHint("삽입인덱스");
        button_add= new Button(this); button_add.setText("추가");
        button_del= new Button(this); button_del.setText("삭제");
        ll2.addView(edittext); ll2.addView(button_add); ll2.addView(button_del);
        ll.addView(ll2);
        setContentView(ll);
        textview= new TextView(this);
        textview.setText("Hi");
        button_add.setOnClickListener(v -> button_add_job());
        button_del.setOnClickListener(v -> button_del_job());
    }
    private void button_del_job() {
        ll.removeView(textview); // 뷰삭제
        button_add.setEnabled(true); button_del.setEnabled(false);
    }
    private void button_add_job() {
        int index=Integer.parseInt(edittext.getText().toString());
        ll.addView(textview, index); // 지정된index 위치에뷰삽입
        button_add.setEnabled(false); button_del.setEnabled(true);
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/63d59b0f-204d-415f-9e07-9721d18fa806" />

-----------------------------------------------------

<img width="979" height="743" alt="image" src="https://github.com/user-attachments/assets/86a33fae-dba3-42ba-86ea-003b26a6d115" />

<img width="985" height="752" alt="image" src="https://github.com/user-attachments/assets/e9aa02a2-c7ae-49e9-9d40-68d561dd66a0" />

---------------------------------------------------------------

<img width="985" height="745" alt="image" src="https://github.com/user-attachments/assets/04c808ef-4938-4502-b1f3-9f36dd2cdc77" />


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
        LinearLayout ll=findViewById(R.id.ll);
        LayoutInflater inflater=getLayoutInflater();
        RadioGroup radiogroup= (RadioGroup) inflater.inflate(R.layout.activity_main_radiogroup, null);
        RadioButton rb1 = radiogroup.findViewById(R.id.rb1);
        rb1.setChecked(true);
        CheckBox checkbox=findViewById(R.id.checkbox);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) ll.addView(radiogroup);
                else ll.removeView(radiogroup);
            }
        });
    }
}
```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8" ?>
<LinearLayout
    android:id="@+id/ll"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <CheckBox
        android:id="@+id/checkbox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="정보수집동의"/>
</LinearLayout>
```

activity_main_radiogroup.xml
```
<?xml version="1.0" encoding="utf-8" ?>
<RadioGroup
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">
    <RadioButton
        android:id="@+id/rb1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="한번만"/>
    <RadioButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="항상"/>
</RadioGroup>
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/c36f5805-6fe2-4ee9-9ae5-ec45d731f060" />

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/fda8dc91-5d95-4929-8781-23fa348e4c3b" />

--------------------------------------------------------------------------

<img width="984" height="745" alt="image" src="https://github.com/user-attachments/assets/a0616b97-7c0a-4c09-8652-ed6e7ca2e416" />

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
        LinearLayout ll=new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        CheckBox checkbox=new CheckBox(this);
        checkbox.setText("정보수집동의");
        ll.addView(checkbox);
        setContentView(ll);
        RadioGroup radiogroup=new RadioGroup(this);
        radiogroup.setOrientation(LinearLayout.HORIZONTAL);
        RadioButton rb1=new RadioButton(this);
        rb1.setText("한번만");
        RadioButton rb2=new RadioButton(this);
        rb2.setText("항상");
        radiogroup.addView(rb1);
        radiogroup.addView(rb2);
        rb1.setChecked(true); // 라디오그룹에 추가한 이후 체크 설정
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) ll.addView(radiogroup); // 라디오 그룹 추가
                else ll.removeView(radiogroup); // 라디오 그룹 제거
            }
        });
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/118593b1-cd1f-48da-a1c7-8d96bae63881" />

-----------------------------------------------------------

<img width="985" height="749" alt="image" src="https://github.com/user-attachments/assets/2ff64f78-140c-4592-bc48-ebcca9fa8d00" />

activity_main.xml 
```
<?xml version="1.0" encoding="utf-8" ?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <CheckBox
        android:id="@+id/checkbox"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="정보수집동의"/>
    <RadioGroup
        android:id="@+id/radiogroup"
        android:visibility="invisible"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="한번만"/>
        <RadioButton
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="항상"/>
    </RadioGroup>
    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="제출"/>
</LinearLayout>
```

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
        RadioGroup radiogroup=findViewById(R.id.radiogroup);
        CheckBox checkbox=findViewById(R.id.checkbox);
        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked) radiogroup.setVisibility(View.VISIBLE);
                else radiogroup.setVisibility(View.GONE);
            }
        });
    }
}
```

<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/46d3c406-a4bd-4672-bbf6-d0b3e8862f69" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/175bb7de-d3d5-4d89-aee8-7aab93520fb7" />



