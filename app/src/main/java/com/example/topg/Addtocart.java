package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Addtocart extends AppCompatActivity {
    EditText etname;
    EditText etlastname;
    EditText etemail;
    EditText etphone;
    EditText etpostal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtocart);

    }

    public void buttoncheckout(View view) {
        Intent j=new Intent(this,checkout.class);
        startActivity(j);
        etname=findViewById(R.id.etname);
        etlastname=findViewById(R.id.etlastname);
        etemail=findViewById(R.id.etemail);
        etphone=findViewById(R.id.etphone);
        etpostal=findViewById(R.id.etpostal);
        j.putExtra("text1",etname.getText().toString());
        j.putExtra("text2",etlastname.getText().toString());
        j.putExtra("text3",etemail.getText().toString());
        j.putExtra("text4",etphone.getText().toString());
        j.putExtra("text5",etpostal.getText().toString());
        startActivity(j);




    }
}