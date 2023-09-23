package com.example.topg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listphone2 extends AppCompatActivity {
    ListView liv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listphone2);
        liv2=findViewById(R.id.liv2);

        ArrayAdapter<iphone> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,iphone.iphones);
        liv2.setAdapter(listAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(listphone2.this, order.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        };
        liv2.setOnItemClickListener(onItemClickListener);
    }

    public void btnback2_click(View view) {
        this.finish();
    }
}