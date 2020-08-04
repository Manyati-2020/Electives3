package com.example.manyatihouselist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] progNames;
    private final Integer[] progImg;

    public AListAdapter(Activity context,String[] progNames,Integer[] progImg) {
        super(context, R.layout.activity_image_view, progNames);
        this.context = context;
        this.progNames = progNames;
        this.progImg = progImg;

        }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater  inflater =context.getLayoutInflater();
    View rowView= inflater.inflate(R.layout.activity_act_view,null,true);

        TextView textTitle = (TextView) rowView.findViewById(R.id.txtv);
        ImageView img= (ImageView) rowView.findViewById(R.id.img);
        textTitle.setText(progNames[position]);
        img.setImageResource(progImg[position]);

        return rowView;
    }
}



