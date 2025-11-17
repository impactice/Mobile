
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

        Button button=new Button(this);
        button.setText("확인");
        ll.addView(button);


        //RadioGroup radiogroup = new RadioGroup(this);
        //radiogroup.setOrientation(LinearLayout.HORIZONTAL);
        //RadioButton rb1 = new RadioButton(this);
        //button= new Button(this); button.setText("확인");
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



activity_main.xml
```

```




