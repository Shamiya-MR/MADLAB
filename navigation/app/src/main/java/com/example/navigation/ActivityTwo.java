package com.example.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {
    TextView text;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        str = getIntent().getStringExtra("message");
        text = findViewById(R.id.text);
        text.setText("Hey "+ str + "\nWelcome....");
    }
}