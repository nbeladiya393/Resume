package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Hobby extends MainActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    RadioButton travelling, singing, reading, diary, fit, draw, athletics, RND, analysis;
    Button btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        travelling = findViewById(R.id.travelling);
        singing = findViewById(R.id.singing);
        reading= findViewById(R.id.reading);
        diary = findViewById(R.id.diary);
        fit = findViewById(R.id.fit);
        draw = findViewById(R.id.draw);
        athletics = findViewById(R.id.athletics);
        RND = findViewById(R.id.RND);
        analysis = findViewById(R.id.analysis);
        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String t = travelling.getText().toString();
                String s = singing.getText().toString();
                String r = reading.getText().toString();
                String d = diary.getText().toString();
                String f = fit.getText().toString();
                String dr = draw.getText().toString();
                String a = athletics.getText().toString();
                String rnd = RND.getText().toString();
                String an = analysis.getText().toString();


                editor.putString("travelling",t);
                editor.putString("singing",s);
                editor.putString("reading",r);
                editor.putString("diary",d);
                editor.putString("fit",f);
                editor.putString("draw",dr);
                editor.putString("athletics",a);
                editor.putString("RND",rnd);
                editor.putString("analysis",an);

                editor.commit();

             startActivity(new Intent(Hobby.this, Education.class));


            }
        });

    }
}
