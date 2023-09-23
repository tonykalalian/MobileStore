package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class orderActivity3 extends AppCompatActivity {
    TextView textViewtecno;
    RadioButton rbtnwhite,rbtngold,rbtnblack,rbtn128gb,rbtn256gb,rbtn512gb;
    ImageView imagetecno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order3);
        Intent intent= getIntent();
        int index = intent.getExtras().getInt("position");
        tecno techno = com.example.topg.tecno.techno[index];

        imagetecno=findViewById(R.id.imagetecno);
        imagetecno.setImageResource(techno.getImageId());

        textViewtecno = findViewById(R.id.textviewtecno);
        textViewtecno.setText(techno.getType()+"");

        rbtnwhite=findViewById(R.id.rbtnwhite);
        rbtnblack=findViewById(R.id.rbtnblack);
        rbtngold=findViewById(R.id.rbtngold);
        rbtn128gb=findViewById(R.id.rbtn128gb);
        rbtn256gb=findViewById(R.id.rbtn256gb);
        rbtn512gb=findViewById(R.id.rbtn512gb);

    }



    public void btnaddtecno(View view) {
        if(!rbtnwhite.isChecked() && !rbtnblack.isChecked() && !rbtngold.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        else if (!rbtn128gb.isChecked() && !rbtn256gb.isChecked() && !rbtn512gb.isChecked() )
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        if(rbtnwhite.isChecked() || rbtnblack.isChecked() || rbtngold.isChecked() && rbtn128gb.isChecked()||rbtn256gb.isChecked()||rbtn512gb.isChecked()) {
            Toast.makeText(this, "operation accomplished successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Addtocart.class);
            startActivity(i);
        }
    }
}