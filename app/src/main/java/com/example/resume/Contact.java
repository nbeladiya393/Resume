package com.example.resume;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contact extends MainActivity {


SharedPreferences preferences;
SharedPreferences.Editor editor;

EditText con1, con2, work1;
Button btnnext;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("Data", 0);
        editor = preferences.edit();

        con1 = findViewById(R.id.con1);
        con2 = findViewById(R.id.con2);
        work1 = findViewById(R.id.con1);
        btnnext = findViewById(R.id.btnnext);

   btnnext.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           String c1 = con1.getText().toString();
           String c2 = con2.getText().toString();
           String w1 = work1.getText().toString();


           editor.putString("con1",c1);
           editor.putString("con2",c2);
           editor.putString("work1",w1);

           editor.commit();

           startActivity(new Intent(Contact.this,skills.class));

       }
   });



        }
}
