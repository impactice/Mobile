
<img width="897" height="685" alt="image" src="https://github.com/user-attachments/assets/17a6fdc8-eb84-4f84-8030-d53ef02ad861" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
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
import android.widget.ImageView;
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
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview=findViewById(R.id.imageview);
        // res/drawable 폴더내이미지리소스표시방법1
        imageview.setImageResource(R.drawable.s1);
// res/drawable 폴더내이미지리소스표시방법2
        // imageview.setImageDrawable(getResources().getDrawable(R.drawable.s1));
        // res/drawable 폴더내이미지리소스표시방법3
        // bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.s1);
        // imageview.setImageBitmap(bitmap);
        // res/raw 폴더내이미지리소스표시
// bitmap= BitmapFactory.decodeResource(getResources(), R.raw.s1);
        // imageview.setImageBitmap(bitmap);
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="40dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ImageView
        android:id="@+id/imageview"
        android:layout_width="100dp"
        android:layout_height="100dp"/>
</LinearLayout>

```

<img width="1918" height="1030" alt="image" src="https://github.com/user-attachments/assets/d5b67a32-e0ce-4278-87d0-febf8923da8f" />

-----

### 폴더 만들기 

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/81bc6aa4-15fd-44d1-ad5e-0bdafa38e171" />

---

<img width="897" height="676" alt="image" src="https://github.com/user-attachments/assets/3e7986d4-6457-4561-94f3-2ad307b9d22c" />

MainActivity.java
```
package com.example.project4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.widget.ImageView;
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
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview=findViewById(R.id.imageview);
        imageview.setImageResource(R.drawable.s1);
        TextView textview=findViewById(R.id.textview);
        textview.setText("직육면체");
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
    <ImageView
        android:id="@+id/imageview"
        android:padding="10dp"
        android:layout_width="100dp"
        android:layout_height="100dp"/>
    <TextView
        android:id="@+id/textview"
        android:padding="10dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textSize="50sp"/>
</LinearLayout>

```




<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/00d211f1-9da5-45e2-9511-795592a19efb" />



