package com.example.manyatihouselist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActView extends AppCompatActivity {
    ListView b;
    Context context;
    ArrayList proImg;

    public static Integer[] progImg = {R.drawable.house1, R.drawable.house2, R.drawable.house3,
            R.drawable.house4, R.drawable.house5, R.drawable.house6, R.drawable.house7, R.drawable.house8,
            R.drawable.house9};

    public static String[] progNames = {"Beautiful House1", "Beautiful House2", "Beautiful House3", "Beautiful House4", "Beautiful House5",
            "Beautiful House6", "Beautiful House7", "Beautiful House8", "Beautiful House9"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_view);


        AListAdapter m = new AListAdapter(this, progNames, progImg);
        b = (ListView) findViewById(R.id.liV);
        b.setAdapter(m);
        b.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ActView.this, "U clicked3:" +progNames [position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}