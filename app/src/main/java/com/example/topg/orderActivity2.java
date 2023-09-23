package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class orderActivity2 extends AppCompatActivity {
    ImageView iv;
    RadioButton Btn1,Btn2,Btn3,Btn4,Btn5,Btn6;
    TextView txts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order2);
        Intent intent= getIntent();
        int index = intent.getExtras().getInt("position");
        samsung samsungs = com.example.topg.samsung.samsungs[index];

        iv=findViewById(R.id.imgv);
        iv.setImageResource(samsungs.getImageId());

        txts = findViewById(R.id.txts);
        txts.setText(samsungs.getType()+"");

        Btn1=findViewById(R.id.rblack);
        Btn2=findViewById(R.id.rblue);
        Btn3=findViewById(R.id.rwhite);
        Btn4=findViewById(R.id.r125);
        Btn5=findViewById(R.id.r256);
        Btn6=findViewById(R.id.r500);

    }

    public void btnadd(View view) {
        if(!Btn1.isChecked() && !Btn2.isChecked() && !Btn3.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        else if (!Btn4.isChecked() && !Btn5.isChecked() && !Btn6.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        if(Btn1.isChecked() || Btn2.isChecked() || Btn3.isChecked() && Btn4.isChecked()||Btn5.isChecked()||Btn6.isChecked()) {
            Toast.makeText(this, "operation accomplished successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Addtocart.class);
            startActivity(i);
        }
    }
}