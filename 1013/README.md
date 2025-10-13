
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


------------------------------------------------------------------------------------------

<img width="890" height="670" alt="image" src="https://github.com/user-attachments/assets/03416bc1-5753-4e44-8338-42c1babff237" />



MainActivity.java 

```

```


activity_main.xml 

```

```
