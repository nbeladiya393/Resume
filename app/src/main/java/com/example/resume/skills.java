package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class skills extends  MainActivity{


    SharedPreferences preferences;
    SharedPreferences.Editor editor;

EditText skill1, skill2, skill3, skill4;
Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();


        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
        btnnext = findViewById(R.id.btnnext);


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = skill1.getText().toString();
                String s2 = skill2.getText().toString();
                String s3 = skill3.getText().toString();
                String s4 = skill4.getText().toString();

                editor.putString("skill1",s1);
                editor.putString("skill2",s2);
                editor.putString("skill3",s3);
                editor.putString("skill4",s4);

                editor.commit();

                startActivity(new Intent(skills.this,skills.class));

            }
        });

    }

}
