
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

activity_main.xml 

```

```




















































