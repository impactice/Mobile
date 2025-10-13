
<img width="889" height="670" alt="image" src="https://github.com/user-attachments/assets/eb59bab8-5e72-4fbc-8ee0-4d3839cef567" />


MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("터치하면 배경색이 변경됩니다.");
        textview.setTextSize(25);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int color= Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                v.setBackgroundColor(color);
                Log.i(TAG, "onClick: "+"Color value "+color);
            }
        });
    }
}
```

<img width="1916" height="1025" alt="image" src="https://github.com/user-attachments/assets/21a4582e-c5b4-4d62-95d3-94ec34483079" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/96e92f00-61d1-4744-b654-7cffe90340f5" />

팁  

logt를 치면
<img width="1919" height="1028" alt="image" src="https://github.com/user-attachments/assets/48021eab-59ce-484e-aea2-c33326d1e3af" />

여기에 엔터를 치면 이렇게 자동으로 완성이 되어진다
<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/6008f035-791f-4ce2-b620-473b70e5f054" />


------------------------------------------------------------------------------------------

<img width="890" height="670" alt="image" src="https://github.com/user-attachments/assets/03416bc1-5753-4e44-8338-42c1babff237" />



MainActivity.java 

```
package com.example.project2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textview=new TextView(this);
        textview.setText("터치하면 배경색이 변경됩니다.");
        textview.setTextSize(25);
        textview.setGravity(Gravity.CENTER);
        setContentView(textview);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int color=Color.rgb(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                v.setBackgroundColor(color);
                // Toast.makeText(this, "Color value "+color, Toast.LENGTH_SHORT).show(); // 여기서this 사용은오류
                // Toast.makeText(MainActivity.this, "Color value "+color, Toast.LENGTH_SHORT).show(); // 가능
                Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_SHORT).show();
                // Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_LONG).show();
                // Toast toast=Toast.makeText(getApplicationContext(), "Color value "+color, Toast.LENGTH_SHORT);
                // toast.show();
            }
        });
    }
}
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/b85f5f6b-99d6-4370-96b5-0c959ce93cff" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/acfa69c2-237b-42a7-8871-e8e6f18fb1b9" />


activity_main.xml 

```

```
