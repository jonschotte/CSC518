package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Page2Activity extends AppCompatActivity
{

    private EditText fnameET, lnameET, ageET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        this.fnameET = (EditText)this.findViewById(R.id.fnameET);
        this.lnameET = (EditText)this.findViewById(R.id.lnameET);
        this.ageET = (EditText)this.findViewById(R.id.ageET);
    }


    public void onAddStudentButtonPressed(View v)
    {
        String fname = this.fnameET.getText().toString();
        String lname = this.lnameET.getText().toString();
        int age = Integer.parseInt(this.ageET.getText().toString());
        Student s = new Student(fname, lname, age);
        s.display();

        Core.currStudent = s;

        //Intent i = new Intent(this, MainActivity.class);
        //Intent i = new Intent(this, MainActivity.class);
        //this.startActivity(i);
    }


}
