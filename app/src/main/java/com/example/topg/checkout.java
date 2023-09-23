package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class checkout extends AppCompatActivity {
TextView textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Intent j=getIntent();
        String s1=j.getStringExtra("text1");
        String s2=j.getStringExtra("text2");
        String s3=j.getStringExtra("text3");
        String s4=j.getStringExtra("text4");
        String s5=j.getStringExtra("text5");
        textView10=findViewById(R.id.textView10);
        textView10.setText("First name: "+s1 +"\n"+"Last name :"+s2+"\n"+"Email:"+s3+"\n"+"Phone number:"+s4+"\n"+"Postal code:"+s5);

    }
}