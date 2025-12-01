

<img width="1251" height="825" alt="image" src="https://github.com/user-attachments/assets/5b75a36c-e637-49d5-b02d-6b7fa5286772" />

수정중...  
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

import java.util.Arrays;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    LinkedList lister=new LinkedList();
    String list[]={"아이템"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lister.addAll(Arrays.asList(list));

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        TextView testText = new TextView(this);
        testText.setText("Test");
        ll.addView(testText);

        // 체크박스 생성
//        CheckBox checkbox = new CheckBox(this);
//        checkbox.setText("체크하면 확인 버튼이 표시됩니다");
//        ll.addView(checkbox);

        Button button = new Button(this);
        button.setText("삽입");

        Button button2 = new Button(this);
        button2.setText("삭제");

        listview=new ListView(this);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, lister);
        listview.setAdapter(adapter);

        // 버튼 크기 설정: 너비는 WRAP_CONTENT, 높이는 WRAP_CONTENT
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        button.setLayoutParams(buttonParams);
        //button.setVisibility(View.GONE); // 처음에는 숨김
        ll.addView(button);
        button2.setLayoutParams(buttonParams);
        ll.addView(button2);

//        checkbox.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if (isChecked) {
//                button.setVisibility(View.VISIBLE);
//            } else {
//                button.setVisibility(View.GONE);
//            }
//        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lister.remove(v);
                //return false;
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lister.remove(v);
                //return true;
            }
        });
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                button.setEnabled(false);
//                checkbox.setEnabled(false);
//            }
//        });

        setContentView(ll);
    }
}
```















