package com.example.kaush.messmanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;


public class Worker_class extends AppCompatActivity {
    FirebaseAuth fref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.worker_activity);
        fref=FirebaseAuth.getInstance();
        Button messMenu =(Button) findViewById(R.id.mess_menu);
        //Button budget =(Button) findViewById(R.id.budget_input);
        Button stock =(Button) findViewById(R.id.stock_bal);
        Button logout = (Button) findViewById(R.id.lgt);


        messMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Worker_class.this, menuActivity.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fref.signOut();
                Intent n=new Intent(Worker_class.this,MainActivity.class);
                startActivity(n);
                finish();
            }
        });

       /* budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Worker_class.this, budget_info.class);
                startActivity(i);
            }
        });*/


        stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Worker_class.this, Stck.class);
                startActivity(i);
            }
        });



    }
    }

