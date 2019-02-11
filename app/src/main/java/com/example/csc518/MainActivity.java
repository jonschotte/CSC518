package com.example.csc518;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student s = new Student("Mike", "Litman", 15);
    }

    public void onButtonPressed(View v)
    {
        TextView answerTV = (TextView)this.findViewById(R.id.answerTV);
        answerTV.setText("World");
    }

    public void onNextPageButtonPressed(View v)
    {
        //intent used to go to other page
        Intent i = new Intent(this, Page2Activity.class);
        this.startActivity(i);
    }
}
