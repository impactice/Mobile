## 011_그래픽처리.pdf 

### 커스텀 뷰, Canvas, Paint
<img width="719" height="552" alt="image" src="https://github.com/user-attachments/assets/2c75d361-c189-4f48-971f-2c52ed1ddbbc" />

---

### 커스텀 뷰, 터치이벤트
<img width="723" height="548" alt="image" src="https://github.com/user-attachments/assets/172d35f7-2863-4ed3-af50-8f0af8cea693" />

---

### 그림판 앱 
<img width="736" height="557" alt="image" src="https://github.com/user-attachments/assets/d8aa97fe-5cb3-49d9-9c74-a367454cd0f3" />

MyView.java
```
package com.example.project6;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyView extends View {
    private Paint paint=new Paint();
    private Path path=new Path();
    public MyView(Context context) {
        super(context);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
        paint.setTextSize(50);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(event.getX(),event.getY());
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                return super.onTouchEvent(event);
        }
        invalidate();
        return true;
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

<img width="1919" height="1032" alt="image" src="https://github.com/user-attachments/assets/09ef9444-3f8b-4980-bd3f-6aa3f69bf26b" />

<img width="1917" height="1033" alt="image" src="https://github.com/user-attachments/assets/b263a069-6fd2-407d-b558-1088c1246de9" />

-----

## 국립고궁박물관학술정보앱(기본-리스트뷰).txt 

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
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.LinkedList;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ListView listview;
    ArrayAdapter adapter;
    LinkedList titleList=new LinkedList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, titleList);
        listview.setAdapter(adapter);
        new Thread(()->displayData()).start();
    }
    private void displayData() {
        String xmlString=downloadXml();
        Log.i(TAG, xmlString);
        getInfoFromXml(xmlString);
        runOnUiThread(()->adapter.notifyDataSetChanged());
    }
    private void getInfoFromXml(String xmlString) {
        String data="", title="";
        XmlPullParser parser= Xml.newPullParser();
        try {
            parser.setInput(new StringReader(xmlString));
            for(int event=parser.getEventType(); event!=XmlPullParser.END_DOCUMENT; event=parser.next()){
                if(event==XmlPullParser.TEXT) { data=parser.getText(); continue; }
                if(event!=XmlPullParser.END_TAG) continue;
                String tag=parser.getName();
                if(tag.equals("title")) title=data;
                if(tag.equals("list")) titleList.add(title);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private String downloadXml() {
        StringBuilder sb=new StringBuilder();
        try {
            handleSSL();
            URL url=new URL("https://www.gogung.go.kr/openApiPublication.do");
            BufferedReader si=new BufferedReader(new InputStreamReader(url.openStream()));
            for(String line=si.readLine(); line!=null; line=si.readLine()) sb.append(line);
            si.close();
        } catch (Exception e) { throw new RuntimeException(e); }
        return sb.toString();
    }
    // HTTPS 접속에서 아래 오류 발생 시 대응
    // java.security.cert.CertificateException: java.security.cert.CertPathValidatorException: Trust anchor for certification path not found.
    // Reference: https://copyprogramming.com/howto/way-to-ignore-ssl-certificate-using-httpsurlconnection
    private void handleSSL() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext sslContext= SSLContext.getInstance("TLS");
        sslContext.init(null, new TrustManager[]{
                new X509TrustManager() {
                    @Override public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {}
                    @Override public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {}
                    @Override public X509Certificate[] getAcceptedIssuers() {return new X509Certificate[]{};}
                }
        },null);
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
    }
}

```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="10dp"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"/>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
        <TextView
            android:padding="10dp"
            android:text="본 저작물은 국립고궁박물관 공공데이터개방 API를 이용하여 제작되었습니다(링크: https://www.gogung.go.kr/gogung/main/contents.do?menuNo=800153)"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"/>
    </LinearLayout>
</LinearLayout>

```

AndroidManifest.xml
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    package="com.example.test">

    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.Test"
        android:usesCleartextTraffic="true"
        tools:targetApi="31">
        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
    </application>

</manifest>
```
이거 실행이 안되었음....

-----
#### 수정 

MainActivity.java
```
package com.example.project6;

import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.LinkedList;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ListView listView;
    private ArrayAdapter<String> adapter;
    private LinkedList<String> titleList = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titleList);
        listView.setAdapter(adapter);

        // 네트워크 작업은 별도 스레드에서 실행
        new Thread(this::displayData).start();
    }

    private void displayData() {
        String xmlString = downloadXml();
        Log.i(TAG, "XML: " + xmlString);
        getInfoFromXml(xmlString);

        runOnUiThread(() -> adapter.notifyDataSetChanged());
    }

    private void getInfoFromXml(String xmlString) {
        String data = "", title = "";
        XmlPullParser parser = Xml.newPullParser();
        try {
            parser.setInput(new StringReader(xmlString));
            for (int event = parser.getEventType();
                 event != XmlPullParser.END_DOCUMENT;
                 event = parser.next()) {

                if (event == XmlPullParser.TEXT) {
                    data = parser.getText();
                    continue;
                }
                if (event != XmlPullParser.END_TAG) continue;

                String tag = parser.getName();
                if (tag.equals("title")) {
                    title = data;
                }
                if (tag.equals("list")) {
                    titleList.add(title);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "XML Parsing Error", e);
        }
    }

    private String downloadXml() {
        StringBuilder sb = new StringBuilder();
        try {
            handleSSL();
            URL url = new URL("https://www.gogung.go.kr/openApiPublication.do");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            reader.close();
        } catch (Exception e) {
            Log.e(TAG, "Download Error", e);
        }
        return sb.toString();
    }

    // SSL 인증서 무시 (테스트용)
    private void handleSSL() {
        try {
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                        @Override
                        public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                        @Override
                        public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[]{}; }
                    }
            }, null);
            HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
        } catch (Exception e) {
            Log.e(TAG, "SSL Error", e);
        }
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:padding="10dp"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ListView
        android:id="@+id/listview"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:divider="@android:color/darker_gray"
        android:dividerHeight="1dp"/>

    <TextView
        android:padding="10dp"
        android:text="본 저작물은 국립고궁박물관 공공데이터개방 API를 이용하여 제작되었습니다\n(링크: https://www.gogung.go.kr/gogung/main/contents.do?menuNo=800153)"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="12sp"
        android:textColor="@android:color/black"/>
</LinearLayout>
```

<img width="1919" height="1031" alt="image" src="https://github.com/user-attachments/assets/ff975dd1-9d7a-4115-9476-aceab3043998" />

--- 

## 010_데이터베이스.pdf 

### SQLite 데이터베이스 사용
<img width="720" height="553" alt="image" src="https://github.com/user-attachments/assets/200c2f1f-791b-4f1b-aaad-c328c991cbab" />

---

### SQLite DB: INSERT, SELECT, Cursor (1/2) 

<img width="720" height="552" alt="image" src="https://github.com/user-attachments/assets/eefbdfda-5c0b-4975-92b3-0509104f9ce2" />

MainActivity.java
```
package com.example.project6;

import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import org.xmlpull.v1.XmlPullParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.LinkedList;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class MainActivity extends AppCompatActivity {
    DBHelper dbHelper=new DBHelper(this);
    EditText edittext_memo, edittext_display;
    Button button_save, button_read;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_memo=findViewById(R.id.edittext_memo);
        edittext_display=findViewById(R.id.edittext_display);
        button_read=findViewById(R.id.button_read);
        button_save=findViewById(R.id.button_save);
        button_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.insert(edittext_memo.getText().toString());
            }
        });
        button_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.select(edittext_display);
            }
        });
    }
}
```

activity_main.xml
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="20dp"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    <TextView
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="메모"
        android:textSize="20sp"/>
    <EditText android:id="@+id/edittext_memo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:textSize="15sp"/>
    <Button android:id="@+id/button_save"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="저장"
        android:textSize="15sp"/>
    <Button android:id="@+id/button_read"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="메모 보기"
        android:textSize="15sp"/>
    <EditText android:id="@+id/edittext_display"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:gravity="top"
        android:textSize="15sp"/>
</LinearLayout>
```

DBHelper.java
```
package com.example.project6;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;

class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "memo.db", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE TB_memo (memo TEXT);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS TB_memo");
        onCreate(db);
    }
    public void insert(String memo) {
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("INSERT INTO TB_memo VALUES ('"+memo+"');");
        db.close();
    }
    public void select(EditText edittext_display) {
        SQLiteDatabase db=getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT memo FROM TB_memo;", null);
        edittext_display.setText("[TB_memo 내용]\n");
        while(cursor.moveToNext()){
            edittext_display.append(cursor.getString(0)+"\n");
        }
        db.close();
    }
}

```

<img width="1919" height="1029" alt="image" src="https://github.com/user-attachments/assets/2a097776-4325-47ca-8775-e5b074e258fa" />







