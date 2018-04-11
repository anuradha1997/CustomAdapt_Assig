package com.example.anuradha.customadapt_assig;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView l1;
    String text1[]={"Start date","1/1/19","gamma","donot","GengerBread","oreo","foryo"};
    String text2[]={"End Date","4/3/19","gamma","donot","GengerBread","oreo","foryo"};

//    Integer image[]={R.drawable.pandafinecircle1,R.drawable.tulsidas,R.drawable.logo,R.drawable.facebook,R.drawable.cafe,R.drawable.fg,R.drawable.premchandra};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1= (ListView) findViewById(R.id.lv1);
        CustomAdapter adapter=new CustomAdapter(this,text1,text2);
        l1.setAdapter(adapter);
    }
}
