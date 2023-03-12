package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Wokrhistory extends MainActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    EditText job1, job2, des1, des2, experience;
    Button btnnext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        job1 = findViewById(R.id.job1);
        job2 = findViewById(R.id.job2);
        des1 = findViewById(R.id.des1);
        des2 = findViewById(R.id.des2);
        experience = findViewById(R.id.experience);
        btnnext = findViewById(R.id.btnnext);

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String j1 = job1.getText().toString();
                String j2 = job2.getText().toString();
                String d1 = des1.getText().toString();
                String d2 = des2.getText().toString();
                String exp = experience.getText().toString();


                editor.putString("des1", d1);
                editor.putString("des2", d2);
                editor.putString("job1", j1);
                editor.putString("job2", j2);
                editor.putString("experience", exp);

                editor.commit();

                startActivity(new Intent(Wokrhistory.this, Contact.class));

            }
        });
    }
}