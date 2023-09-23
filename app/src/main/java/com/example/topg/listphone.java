package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listphone extends AppCompatActivity {
    ListView liv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listphone);
        liv=findViewById(R.id.liv);

        ArrayAdapter<samsung> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,samsung.samsungs);
        liv.setAdapter(listAdapter);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(listphone.this, orderActivity2.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        };
        liv.setOnItemClickListener(onItemClickListener);

    }


    public void btnback_click(View view) {
        this.finish();
    }
}