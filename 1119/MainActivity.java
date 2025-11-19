package com.example.project4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
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
    ListView listview;
    String data1[]={"A","B","C","D","E","F","G","H","I","J","K"};
    String data2[]={"0","1","2","3","4","5","6","7","8","9","10"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listview=new ListView(this);
        MyAdapter adapter=new MyAdapter(this, data1, data2);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String v= (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), v+" 클릭", Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(listview);
    }
}