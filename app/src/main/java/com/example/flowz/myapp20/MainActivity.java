package com.example.flowz.myapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolBar = (toolbar) findViewById(R.id.toolbar);
        SetSupportActionBar (toolBar);

        Spinner spinnerCourses =(spinner) findViewById(R.id.spinner_courses);
    }

}
