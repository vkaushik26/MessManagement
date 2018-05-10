package com.example.kaush.messmanagement;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class suggestionActivity extends AppCompatActivity {
    Button suggSubmit;
    EditText ans;
    DatabaseReference dref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);
        dref = FirebaseDatabase.getInstance().getReference();
        ans = findViewById(R.id.ans);
        suggSubmit= findViewById(R.id.suggSubmit);
        suggSubmit.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View view) {
                dref.child("Suggestion").push().setValue(ans.getText().toString()).addOnSuccessListener(new OnSuccessListener<Void>()
                {
                    @Override
                    public void onSuccess(Void aVoid)
                    {
                        Toast.makeText(suggestionActivity.this,"Submit",Toast.LENGTH_SHORT).show();
                        ans.setText(null);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(suggestionActivity.this,"Fail",Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

}
