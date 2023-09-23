package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listphone3 extends AppCompatActivity {
    ListView listview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listphone3);
        listview3=findViewById(R.id.listview3);

        ArrayAdapter<tecno> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tecno.techno);
        listview3.setAdapter(listAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(listphone3.this, orderActivity3.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        };
        listview3.setOnItemClickListener(onItemClickListener);
    }


    public void buttonback(View view) {this.finish();}
}