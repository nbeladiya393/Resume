package com.example.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    EditText state, fname, mname, aline1, email, city;
    Button btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        fname = findViewById(R.id.fname);
        mname = findViewById(R.id.mname);
        aline1 = findViewById(R.id.aline1);
        email = findViewById(R.id.email);
        city = findViewById(R.id.city);
        state = findViewById(R.id.state);
        btnnext = findViewById(R.id.btnnext);


        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fn = fname.getText().toString();
                String ln = mname.getText().toString();
                String add = aline1.getText().toString();
                String mail = email.getText().toString();
                String c = city.getText().toString();
                String state = email.getText().toString();

                editor.putString("fname",fn);
                editor.putString("lname",ln);
                editor.putString("address",add);
                editor.putString("email",mail);
                editor.putString("city",c);
                editor.putString("state",state);
                editor.commit();

                startActivity(new Intent(MainActivity.this,Hobby.class));

            }
        });

    }
}
