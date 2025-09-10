
MainActivity.java 
 ```
package com.example.sample;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        this.setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textview);
        tv.setText("대한민국");
        /*
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        }); */
    }
} 
 ```


activity_main.xml 
```
<?xml version="1.0" encoding="utf-8" ?>
<TextView
    android:id="@+id/textview"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:text="안녕하세요"
    android:textSize="30sp"
    />
```

-------------------

tasks.json 
```
{
  "version": "2.0.0",
  "tasks": [
    {
      "label": "build C file",
      "type": "shell",
      "command": "gcc",
      "args": [
        "-g",
        "${file}",        // 현재 열려있는 파일을 자동으로 사용
        "-o",
        "${fileDirname}\\${fileBasenameNoExtension}.exe"  // 동일한 이름의 exe 파일로 출력
      ],
      "group": {
        "kind": "build",
        "isDefault": true
      },
      "problemMatcher": ["$gcc"],
      "detail": "Build and run the current C file"
    }
  ]
}
```

launch.json 
```
{
  "version": "0.2.0",
  "configurations": [
    {
      "name": "Debug C file",
      "type": "cppdbg",
      "request": "launch",
      "program": "${workspaceFolder}\\${fileBasenameNoExtension}.exe",  // 자동으로 exe 파일 경로를 설정
      "args": [],
      "stopAtEntry": false,
      "cwd": "${workspaceFolder}",
      "environment": [],
      "externalConsole": true,
      "MIMode": "gdb",
      "miDebuggerPath": "C:\\mingw-w64\\mingw32\\bin\\gdb.exe",  // gdb 경로 설정
      "preLaunchTask": "build C file",  // 위의 tasks.json에서 정의한 빌드 작업 호출
      "monitorSignals": true
    }
  ]
}
```



