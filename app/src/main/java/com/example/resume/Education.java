package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Education extends MainActivity{
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    RadioButton ten, twe, bachelors, masters, professional;
    EditText per1, per2, per3, per4, per5, year1, year2, year3, year4, year5, school1, school2, field1, field2, field3, university1, university2, university3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();


        ten = findViewById(R.id.ten);
        twe = findViewById(R.id.twe);
        bachelors = findViewById(R.id.bachelors);
        masters = findViewById(R.id.masters);
        professional = findViewById(R.id.professional);
        per1 = findViewById(R.id.per1);
        per2 = findViewById(R.id.per2);
        per3 = findViewById(R.id.per3);
        per4 = findViewById(R.id.per4);
        per5 = findViewById(R.id.per5);
        year1 = findViewById(R.id.year1);
        year2 = findViewById(R.id.year2);
        year3= findViewById(R.id.year3);
        year4 = findViewById(R.id.year4);
        year5 = findViewById(R.id.year5);
        school1 = findViewById(R.id.school1);
        school2= findViewById(R.id.school2);
        field1 = findViewById(R.id.field1);
        field2 = findViewById(R.id.field2);
        field3 = findViewById(R.id.field3);
        university1 = findViewById(R.id.university1);
        university2 = findViewById(R.id.university2);
        university3 = findViewById(R.id.university3);




        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String p1 = per1.getText().toString();
                String p2 = per2.getText().toString();
                String p3 = per3.getText().toString();
                String p4 = per4.getText().toString();
                String p5 = per5.getText().toString();
                String te = ten.getText().toString();
                String tw = twe.getText().toString();
                String b = bachelors.getText().toString();
                String m = masters.getText().toString();
                String pr = professional.getText().toString();
                String y1 = year1.getText().toString();
                String y2 = year2.getText().toString();
                String y3 = year3.getText().toString();
                String y4 = year4.getText().toString();
                String y5 = year5.getText().toString();
                String f1 = field1.getText().toString();
                String f2 = field2.getText().toString();
                String f3 = field3.getText().toString();
                String s1 = school1.getText().toString();
                String s2 = school2.getText().toString();
                String u1 = university1.getText().toString();
                String u2 = university2.getText().toString();
                String u3 = university3.getText().toString();



                editor.putString("per1",p1);
                editor.putString("per2",p2);
                editor.putString("per3",p3);
                editor.putString("per4",p4);
                editor.putString("per5",p5);
                editor.putString("year1",y1);
                editor.putString("year2",y2);
                editor.putString("year3",y3);
                editor.putString("year4",y4);
                editor.putString("year5",y5);
                editor.putString("field1",f1);
                editor.putString("field2",f2);
                editor.putString("field3",f3);
                editor.putString("school1",s1);
                editor.putString("school2",s2);
                editor.putString("university1",u1);
                editor.putString("university2",u2);
                editor.putString("university3",u3);
                editor.putString("ten",te);
                editor.putString("twe",tw);
                editor.putString("bachelor",b);
                editor.putString("masters",m);
                editor.putString("professional",pr);

                editor.commit();

                startActivity(new Intent(Education.this, Wokrhistory.class));


            }
        });








    }



}
