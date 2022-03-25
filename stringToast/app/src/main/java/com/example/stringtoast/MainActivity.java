package com.example.stringtoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText string;
    Button btn1;
    String txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string = (EditText) findViewById(R.id.string);
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt=string.getText().toString();
                if(txt.length()!=0) {
                    Toast.makeText(MainActivity.this,txt,Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "string not entered", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}