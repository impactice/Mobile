
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


MainActivity.java 
```

```



activity_main.xml 
```

```





