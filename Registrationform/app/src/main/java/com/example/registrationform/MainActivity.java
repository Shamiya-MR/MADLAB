package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import java.lang.ref.PhantomReference;
public class MainActivity extends AppCompatActivity {
    Button Submit;
    EditText Name;
    EditText Age;
    EditText Address;
    EditText Job;
    RadioButton Gender;
    EditText Dob;
    EditText Qualification;
    EditText Phone;
    RadioGroup gender;
    RadioButton gen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit = (Button) findViewById(R.id.Submit);
        Name=(EditText)findViewById(R.id.Name);
        Age =(EditText)findViewById(R.id.Age);
        Address =(EditText)findViewById(R.id.Address);
        Phone=(EditText)findViewById(R.id.Phone);
        Job =(EditText)findViewById(R.id.Job);
        gender=(RadioGroup) findViewById(R.id.gender);
        Dob=(EditText)findViewById(R.id.Dob);
        Qualification=(EditText)findViewById(R.id.Qualification);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String na= Name.getText().toString();
                String ag= Age.getText().toString();
                String ad= Address.getText().toString();
                String Do= Dob.getText().toString();
                String Qual= Qualification.getText().toString();
                String Jo= Job.getText().toString();
                String phn= Phone.getText().toString();
                int i=gender.getCheckedRadioButtonId();
                gen =(RadioButton) findViewById(i);
                Intent intent=new Intent(getBaseContext(),ActivityTwo.class);
                intent.putExtra("message_key", na);
                intent.putExtra("message_key1", ag);
                intent.putExtra("message_key2", ad);
                intent.putExtra("message_key6", Do);
                intent.putExtra("message_key5", Qual);
                intent.putExtra("message_key4", Jo);
                intent.putExtra("message_key3", gen.getText());
                intent.putExtra("message_key7", phn);
                startActivity(intent);
            }
        });
    }
}
