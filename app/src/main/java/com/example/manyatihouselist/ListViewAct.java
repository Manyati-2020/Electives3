package com.example.manyatihouselist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class ListViewAct extends AppCompatActivity {
    ListView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        b=(ListView) findViewById(R.id.liV);
        final String values[]={"House1","House2","House3","House4","House5","House6","House7","House8","House9"};
        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        b.setAdapter(arrayAdapter);
        b.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewAct.this, "U clicked2:" + values[position],Toast.LENGTH_SHORT).show();
            }
        });

    }
}