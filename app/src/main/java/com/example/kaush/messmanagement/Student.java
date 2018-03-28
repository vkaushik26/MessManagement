package com.example.kaush.messmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by kaush on 28-03-2018.
 */

public class Student extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_page);
    }
    public void menuPage(View view) {
        Intent a=new Intent(this,menuActivity.class);
        startActivity(a);
    }

    public void surveyPage(View view) {
        Intent a=new Intent(this,feedbackActivity.class);
        startActivity(a);
    }

    public void suggestionPage(View view) {
        Intent a=new Intent(this,suggestionActivity.class);
        startActivity(a);
    }
}
