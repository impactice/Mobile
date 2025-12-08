## 009_메뉴,대화상자.pdf 

### 메뉴
<img width="900" height="681" alt="image" src="https://github.com/user-attachments/assets/576f9534-47d5-4679-8f75-f48a8e587cbe" />

---

### 컨텍스트 메뉴 사용 
<img width="900" height="681" alt="image" src="https://github.com/user-attachments/assets/e7d2ddf1-afb1-40d7-9bd9-4323c2f46242" />

---

### 콘텍스트 메뉴 사용 예 (1/2)
<img width="894" height="682" alt="image" src="https://github.com/user-attachments/assets/60ac0a15-96bf-436b-8c1d-2f627374225f" />

---

### 옵션 메뉴 사용 예
<img width="896" height="685" alt="image" src="https://github.com/user-attachments/assets/0d19ce2a-0ac8-4c2d-a10d-f325cd651e0b" />


---

### 대화상자 계층 구조
<img width="909" height="695" alt="image" src="https://github.com/user-attachments/assets/d6ade72e-48ab-43a8-9326-35d27b40e092" />

---

### 대화상자: AlertDialog.Builder, AlertDialog
<img width="894" height="678" alt="image" src="https://github.com/user-attachments/assets/d986a9a4-52be-44c6-8cdf-4d07f1f4d71a" />

MainActivity.java
```
package com.example.project6;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edittext_memo;
    Button button_save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_memo=findViewById(R.id.edittext_memo);
        button_save=findViewById(R.id.button_save);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_save_job();
            }
        });
    }
    private void button_save_job() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("확인");
        builder.setMessage("새 메모 작성 시 기존 입력하신 내용이 사라집니다");
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                edittext_memo.setText("");
            }
        });
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog dialog=builder.create();
        dialog.show();
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="10dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <Button android:id="@+id/button_save"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="5dp"
        android:text="새 메모 작성"
        android:textSize="15sp"/>
    <EditText
        android:id="@+id/edittext_memo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="메모 입력"
        android:textSize="20sp"/>
</LinearLayout>
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/e8627d5c-f6e9-4f59-b64a-213427e288d7" />

----- 

### 날짜선택창: DatePickerDialog

<img width="895" height="686" alt="image" src="https://github.com/user-attachments/assets/86364176-3455-4623-afb1-33a90a3dbfbf" />

MainActivity.java
```
package com.example.project6;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText edittext_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_date = findViewById(R.id.edittext_date);
        edittext_date.setFocusable(false);
        edittext_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext_date_job();
            }
        });
    }
    private void edittext_date_job() {
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                edittext_date.setText(year+"년 "+(month+1)+"월 "+dayOfMonth+"일");
            }
        }, year, month, day);
        dialog.show();
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="10dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <EditText
        android:id="@+id/edittext_date"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="예약일 선택"
        android:textSize="20sp"/>
</LinearLayout>
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/995f0149-f9f3-4f9d-93d3-b65d5b219f86" />

<img width="1919" height="1026" alt="image" src="https://github.com/user-attachments/assets/12d4c6c3-3d84-44bc-9c87-0893e6a1e76a" />

<img width="1917" height="1028" alt="image" src="https://github.com/user-attachments/assets/27367f52-0e16-4276-87b7-ca1d3410cf6e" />

--- 

### 시간선택창: TimePickerDialog
<img width="904" height="683" alt="image" src="https://github.com/user-attachments/assets/76d4bb1f-8104-439d-9bf5-c65859d19e37" />

MainActivity.java
```
package com.example.project6;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText edittext_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_time=findViewById(R.id.edittext_time);
        edittext_time.setFocusable(false);
        edittext_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext_time_job();
            }
        });
    }
    private void edittext_time_job() {
        Calendar calendar=Calendar.getInstance();
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                edittext_time.setText(hourOfDay+"시 "+minute+"분");
            }
        }, hour, minute, false);
        dialog.show();
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="10dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <EditText
        android:id="@+id/edittext_time"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="예약시간 선택"
        android:textSize="20sp"/>
</LinearLayout>
```

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/eaaee471-530f-45c3-a920-9d77a3ce93bb" />

<img width="1919" height="1027" alt="image" src="https://github.com/user-attachments/assets/01cebe29-7426-4757-b321-d89ed9e6342e" />

<img width="1919" height="1030" alt="image" src="https://github.com/user-attachments/assets/e076be44-ffdc-49ec-8cfc-465e187e2080" />

--- 

## 011_그래픽처리.pdf


### 커스텀 뷰, 터치이벤트

MainActivity.java
```
package com.example.project6;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private float x, y, radius=50;
    private Paint paint=new Paint(); // Paint 객체 생성
    private String action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( new MyView(this) );
    }
    private class MyView extends View {
        public MyView(Context context) {
            super(context);
            paint.setColor(Color.BLUE); // 색 설정
            paint.setTextSize(radius); // 텍스트 크기 설정
        }
        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawCircle(x, y, radius, paint); // 중심 좌표 (x,y), 반지름이 radius인 원을 그림
            canvas.drawText(action+" ("+(int)x+","+(int)y+")", x-4*radius, y-4*radius, paint);
        }
        @Override
        public boolean onTouchEvent(MotionEvent event) {
            x=event.getX(); // 터치가 발생한 x 좌표 값 반환
            y=event.getY(); // 터치가 발생한 y 좌표 값 반환
            if(event.getAction()==MotionEvent.ACTION_DOWN) action="DOWN";
            if(event.getAction()==MotionEvent.ACTION_MOVE) action="MOVE";
            if(event.getAction()==MotionEvent.ACTION_UP) action="UP";
            invalidate(); // onDraw(Canvas) 메소드 호출. UI 스레드가 아닌 경우 postInvalidate() 사용
            return true; // return false;인 경우를 테스트해 보시오
        }
    }
}
```

사진처럼 저기가 (0,0)이다. 
<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/f7479227-fb22-4372-bb27-35f6d7864e07" />

```
(0,0) -------------> x +
|        (100,150)
|
|
y +
```
- 둘 다 플러스이다

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/4ba62701-f0e3-498c-9063-8f14c4c9b03c" />


### 커스텀 뷰, Canvas, Paint

<img width="903" height="686" alt="image" src="https://github.com/user-attachments/assets/7353b503-e428-4843-84bb-c0b90d3fced4" />

MyView.java
```
package com.example.project6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
        Path path=new Path();
        paint.setColor(Color.BLUE);
        path.moveTo(100,100);
        path.lineTo(350,100);
        path.lineTo(250,300);
        path.moveTo(400,400);
        path.lineTo(600,600);
        path.lineTo(450,700);
        canvas.drawPath(path, paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(600,200,50,paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5f);
        paint.setTextSize(150);
        canvas.drawText("안녕하세요", 100,1000, paint);
    }
}
```

MainActivity.java
```
package com.example.project6;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
}
```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/5d53c65e-dfb8-48e4-92b1-3a9dfd6b56a8" />




