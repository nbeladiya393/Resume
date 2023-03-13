package com.example.resume;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Template1 extends AppCompatActivity {

    TextView txtName,txtcareer,txteducation,txtworkhistory,txtexperience, txthobby, txtskills;
    SharedPreferences preferences;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.template1);

        preferences = getSharedPreferences("Data",0);

        txtName = findViewById(R.id.txtname);
        txtcareer = findViewById(R.id.txtcareer);
        txteducation = findViewById(R.id.txteducation);
        txtworkhistory = findViewById(R.id.txtworkhistory);
        txtexperience = findViewById(R.id.txtexperience);
        txthobby = findViewById(R.id.txthobby);
        txtskills = findViewById(R.id.txtskills);

        String name = preferences.getString("fname","");
        String mname = preferences.getString("lname","");
        String aline1 = preferences.getString("address","");
        String email = preferences.getString("email","");
        String city = preferences.getString("city","");
        String state = preferences.getString("state","");
        String travelling = preferences.getString("travelling","");
        String singing = preferences.getString("singing","");
        String reading = preferences.getString("reading","");
        String diary = preferences.getString("diary","");
        String fit = preferences.getString("fit","");
        String draw = preferences.getString("draw","");
        String athletics = preferences.getString("athletics","");
        String RND = preferences.getString("RND","");
        String analysis = preferences.getString("analysis","");
        String percentage1 = preferences.getString("per1","");
        String percentage2 = preferences.getString("per2","");
        String percentage3 = preferences.getString("per3","");
        String percentage4 = preferences.getString("per4","");
        String percentage5 = preferences.getString("per5 ","");
        String year1 = preferences.getString("year1","");
        String year2 = preferences.getString("year2","");
        String year3 = preferences.getString("year3","");
        String year4 = preferences.getString("year4","");
        String year5 = preferences.getString("year5","");
        String field1 = preferences.getString("field1","");
        String field2 = preferences.getString("field2","");
        String field3 = preferences.getString("field3","");
        String school1 = preferences.getString("school1","");
        String school2 = preferences.getString("school2","");
        String university1 = preferences.getString("university1","");
        String university2 = preferences.getString("university2","");
        String univeristy3 = preferences.getString("univeristy3","");
        String tenth = preferences.getString("ten","");
        String twelth = preferences.getString("twe","");
        String bachelors = preferences.getString("bachelor","");
        String masters = preferences.getString("master","");
        String professionals = preferences.getString("professional","");
        String designation1= preferences.getString("des1","");
        String designation2 = preferences.getString("des2","");
        String jobtitle1 = preferences.getString("job1","");
        String jobtitle2 = preferences.getString("job2","");
        String experience = preferences.getString("experience","");
        String contact1 = preferences.getString("con1","");
        String contact2 = preferences.getString("con2","");
        String work1 = preferences.getString("work1","");
        String skill1= preferences.getString("skill1","");
        String skill2 = preferences.getString("skill2","");
        String skill3 = preferences.getString("skill3","");
        String skill4 = preferences.getString("skill4","");



        txtName.setText("Name: "+name);
        txtName.setText("Phone1: "+contact1);
        txtName.setText("Phone2: "+contact2);
        txtName.setText("Gmail: "+email);
        txtName.setText("Address: "+aline1);
        txtcareer.setText("Name: ");
        txteducation.setText("Qualification: "+tenth);
        txteducation.setText("Year: "+year1);
        txteducation.setText("Percentage: "+percentage1);
        txteducation.setText("Qualification: "+twelth);
        txteducation.setText("Year: "+year2);
        txteducation.setText("Percentage: "+percentage2);
        txteducation.setText("Bachelors: "+field1);
        txteducation.setText("Year: "+year3);
        txteducation.setText("Percentage: "+percentage3);
        txteducation.setText("Masters: "+field2);
        txteducation.setText("Year: "+year4);
        txteducation.setText("Percentage: "+percentage4);
        txteducation.setText("Phd.: "+field3);
        txteducation.setText("Year: "+year5);
        txteducation.setText("Percentage: "+percentage5);
        txtworkhistory.setText("Job 1: "+jobtitle1);
        txtworkhistory.setText("Description : "+designation1);
        txtworkhistory.setText("Job 2: "+jobtitle2);
        txtworkhistory.setText("Description: "+designation2);
        txtexperience.setText("Experience"+experience);
        txthobby.setText("Hobby 1: "+athletics);
        txthobby.setText("Hobby 2: "+fit);
        txthobby.setText("Hobby 3: "+RND);
        txthobby.setText("Hobby 4: "+analysis);
        txtskills.setText("Skill 1"+skill1);
        txtskills.setText("Skill 2"+skill2);
        txtskills.setText("Skill 3"+skill3);
        txtskills.setText("Skill 4"+skill4);








    }
}
