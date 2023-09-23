package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class order extends AppCompatActivity {
    ImageView imgiphone;
    TextView btniphone;
    RadioButton radio1, radio2, radio3, radio4, radio5, radio6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);


        Intent intent = getIntent();
        int index1 = intent.getExtras().getInt("position");
        iphone iphones = com.example.topg.iphone.iphones[index1];

        imgiphone = findViewById(R.id.imgiphone);
        imgiphone.setImageResource(iphones.getImageId());

        btniphone = findViewById(R.id.btniphone);
        btniphone.setText(iphones.getType() + "");

        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);
        radio5 = findViewById(R.id.radio5);
        radio6 = findViewById(R.id.radio6);
    }


    public void btnadsam(View view) {
        if (!radio1.isChecked() && !radio2.isChecked() && !radio3.isChecked())
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        else if (!radio4.isChecked() && !radio5.isChecked() && !radio6.isChecked())
            Toast.makeText(this, "Please fill all the data", Toast.LENGTH_SHORT).show();
        if (radio1.isChecked() || radio2.isChecked() || radio3.isChecked() && radio4.isChecked() || radio5.isChecked() || radio6.isChecked()) {
            Toast.makeText(this, "operation accomplished successfully", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, Addtocart.class);
            startActivity(i);
        }

        }
    }
