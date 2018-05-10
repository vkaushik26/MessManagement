package com.example.kaush.messmanagement;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Sign_Up extends AppCompatActivity implements View.OnClickListener {

    private Button buttonRegister;
    EditText editTextRoll;
    EditText editTextName;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private TextView textViewSignin;
    private ProgressDialog progressDialog;
    private Spinner spinnerlogin_info;
    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase database;
    DatabaseReference ref;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__page);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User1");
        user = new User();
        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextRoll = (EditText) findViewById(R.id.editTextRoll);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        spinnerlogin_info=(Spinner) findViewById(R.id.login_info);
        textViewSignin = (TextView) findViewById(R.id.textViewSignin);
        buttonRegister.setOnClickListener(this);
        textViewSignin.setOnClickListener(this);


    }
    public void getVal(){
        user.setName(editTextName.getText().toString());
        user.setRoll_no(editTextRoll.getText().toString());
        user.setEmail(editTextEmail.getText().toString());
        user.setPassword(editTextPassword.getText().toString());
    }

    private void registerUser() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String name = editTextName.getText().toString().trim();
        String roll = editTextRoll.getText().toString().trim();
        final String option=spinnerlogin_info.getSelectedItem().toString();

        if (TextUtils.isEmpty(name)) {
            Toast.makeText(this, "Please enter name", Toast.LENGTH_SHORT).show();
            editTextName.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(roll)) {
            Toast.makeText(this, "Please enter roll-no", Toast.LENGTH_SHORT).show();
            editTextRoll.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(email)) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            editTextEmail.requestFocus();

            return;
        }
        if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            editTextPassword.requestFocus();
            return;
        }

        progressDialog.setMessage("Registering User....");
        progressDialog.show();
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Sign_Up.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                progressDialog.hide();
            }
        })

                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            ref.child(firebaseAuth.getCurrentUser().getUid()).child("Name").setValue(user.getName());
                            ref.child(firebaseAuth.getCurrentUser().getUid()).child("Email").setValue(user.getEmail());
                            ref.child(firebaseAuth.getCurrentUser().getUid()).child("Roll").setValue(user.getRoll_no());
                            ref.child(firebaseAuth.getCurrentUser().getUid()).child("Password").setValue(user.getPassword());
                            ref.child(firebaseAuth.getCurrentUser().getUid()).child("Option").setValue(option);
                            Toast.makeText(Sign_Up.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            editTextPassword.setText(null);
                            editTextEmail.setText(null);
                            editTextRoll.setText(null);
                            editTextName.setText(null);
                        }
                        progressDialog.hide();
                    }
                });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonRegister:
                if (view == buttonRegister) {
                    getVal();

                    registerUser();

                }
                break;
            case R.id.textViewSignin:
                startActivity(new Intent(this, MainActivity.class));
        }
    }

}
