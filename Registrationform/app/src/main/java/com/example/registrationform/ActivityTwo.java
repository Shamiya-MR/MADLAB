package com.example.registrationform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.jar.Attributes;
public class ActivityTwo extends AppCompatActivity {
    TextView Name;
    TextView Age;
    TextView Address;
    TextView Qualifi;
    TextView Dob;
    TextView Gender;
    TextView Job;
    TextView Phone;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Name = (TextView)findViewById(R.id.Nameview);
        Age =(TextView)findViewById(R.id.Age);
        Address=(TextView)findViewById(R.id.Address);
        Dob=(TextView)findViewById(R.id.Dob);
        Gender=(TextView) findViewById(R.id.Gender);
        Qualifi=(TextView)findViewById(R.id.Qualification);
        Job=(TextView)findViewById(R.id.Job);
        Phone=(TextView)findViewById(R.id.Phone);
        Intent intent=getIntent();
        String na=intent.getStringExtra("message_key");
        String ag=intent.getStringExtra("message_key1");
        String ad=intent.getStringExtra("message_key2");
        String gn=intent.getStringExtra("message_key3");
        String Jo=intent.getStringExtra("message_key4");
        String Qual=intent.getStringExtra("message_key5");
        String Do=intent.getStringExtra("message_key6");
        String phn=intent.getStringExtra("message_key7");
        Name.setText(na);
        Age.setText(ag);
        Address.setText(ad);
        Qualifi.setText(Qual);
        Job.setText(Jo);
        Phone.setText(phn);
        Dob.setText(Do);
        Gender.setText(gn);
    }
}