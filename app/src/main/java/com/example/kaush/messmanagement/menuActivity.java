package com.example.kaush.messmanagement;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void sundayPage(View view) {
        Intent a=new Intent(this,sundayActivity.class);
        startActivity(a);
    }
    public void mondayPage(View view) {
        Intent a=new Intent(this,mondayActivity.class);
        startActivity(a);
    }
    public void tuesdayPage(View view) {
        Intent a=new Intent(this,tuesdayActivity.class);
        startActivity(a);
    }
    public void wednesdayPage(View view) {
        Intent a=new Intent(this,wednesdayActivity.class);
        startActivity(a);
    }
    public void thursdayPage(View view) {
        Intent a=new Intent(this,thursdayActivity.class);
        startActivity(a);
    }
    public void fridayPage(View view) {
        Intent a=new Intent(this,fridayActivity.class);
        startActivity(a);
    }
    public void saturdayPage(View view) {
        Intent a=new Intent(this,saturdayActivity.class);
        startActivity(a);
    }
}
