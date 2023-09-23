
package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listphone4 extends AppCompatActivity {
    ListView listview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listphone4);
        listview4=findViewById(R.id.listview4);

        ArrayAdapter<tablet> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,tablet.tablets);
        listview4.setAdapter(listAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(listphone4.this, orderActivity4.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        };
        listview4.setOnItemClickListener(onItemClickListener);
    }

    public void back(View view) {
        this.finish();
    }
}