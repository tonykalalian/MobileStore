package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class orderActivity4 extends AppCompatActivity {
    TextView txtx;
    RadioButton rbtnwhite2,rbtngold2,rbtnblack2,rbtn128gb2,rbtn256gb2,rbtn512gb2;
    ImageView imgipad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order4);
        Intent intent= getIntent();
        int index = intent.getExtras().getInt("position");
        tablet tablets = com.example.topg.tablet.tablets[index];

        imgipad=findViewById(R.id.imgipad);
        imgipad.setImageResource(tablets.getImageId());

        txtx = findViewById(R.id.txtx);
        txtx.setText(tablets.getType()+"");

        rbtnwhite2=findViewById(R.id.rbtnwhite2);
        rbtnblack2=findViewById(R.id.rbtnblack2);
        rbtngold2=findViewById(R.id.rbtngold2);
        rbtn128gb2=findViewById(R.id.rbtn128gb2);
        rbtn256gb2=findViewById(R.id.rbtn256gb2);
        rbtn512gb2=findViewById(R.id.rbtn512gb2);

    }



    public void btnbtn(View view) {
        if(!rbtnwhite2.isChecked() && !rbtnblack2.isChecked() && !rbtngold2.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        else if (!rbtn128gb2.isChecked() && !rbtn256gb2.isChecked() && !rbtn512gb2.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        if(rbtnwhite2.isChecked() || rbtnblack2.isChecked() || rbtngold2.isChecked()&& rbtn128gb2.isChecked()||rbtn256gb2.isChecked()||rbtn512gb2.isChecked() ) {
            Toast.makeText(this, "operation accomplished successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Addtocart.class);
            startActivity(i);
        }
    }


}