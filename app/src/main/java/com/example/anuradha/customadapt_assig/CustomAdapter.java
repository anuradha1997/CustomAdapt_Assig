package com.example.anuradha.customadapt_assig;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anuradha on 3/23/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    String text[];
    String text1[];
    Activity activity;

    public CustomAdapter(Activity activity,String text1[],String text2[]) {
        super(activity,R.layout.customize,text1);
        this.text=text1;
        this.text1=text2;
        this.activity=activity;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflator=activity.getLayoutInflater();
        View v=inflator.inflate(R.layout.customize,null);
//        ImageView imageview= (ImageView) v.findViewById(R.id.img);
        TextView t1= (TextView) v.findViewById(R.id.t2);
        TextView t2= (TextView) v.findViewById(R.id.t3);
//        imageview.setImageResource(image[position]);

        t1.setText(text[position]);
        t2.setText(text1[position]);
        return v;
    }
}