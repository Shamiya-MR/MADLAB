package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button button2;
    String strusername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usename);
        password = findViewById(R.id.password);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = username.getText().toString();
                Intent intent = new Intent(getApplicationContext(),
                        ActivityTwo.class);
                intent.putExtra("message", str);
                startActivity(intent);
            }
        });
    }
}