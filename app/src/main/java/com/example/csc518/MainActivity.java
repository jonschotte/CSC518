package com.example.csc518;

import android.content.Intent;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private ListView studentListView;
    private ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.studentListView = (ListView)this.findViewById(R.id.studentListView);

        for(int i = 0; i < Core.theStudentStrings.length; i++)
        {
            Core.theStudentStrings[i] = "Unknown Student";
        }
        for( int i=0; i < 100; i++)
        {
            Student s = Core.currStudent;
            Core.theStudents[Core.numStudents] = s;
            Core.theStudentStrings[Core.numStudents] = s.toString();
            Core.numStudents++;
        }

        //String[] bibleBooks = {"Mathew", "Mark", "Luke", "John", "Acts"};
        //String[] ar0fStuff = new String[1000];
        //for(int i= 0; i < 1000; i++)
        {
            //ar0fStuff [i] = "asdfas" + i;
        }
        this.listAdapter = new ArrayAdapter<String>(this, R.layout.student_listview_row, Core.theStudentStrings);
        this.studentListView.setAdapter(this.listAdapter);


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
