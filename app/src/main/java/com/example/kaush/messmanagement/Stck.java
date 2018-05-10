package com.example.kaush.messmanagement;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Stck extends AppCompatActivity {

    Button addCartButton;
    EditText item,quantity;
    Spinner month;
    int i=0;
    ArrayList<Food_Item> foods;
    Button saveButton;
    DatabaseReference foodRef;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stck);
        addCartButton=findViewById(R.id.button2);
        text = findViewById(R.id.display);
        TextView textDisplayMonth = findViewById(R.id.displayMonth);
        item=findViewById(R.id.item);
        month=findViewById(R.id.month);
        quantity=findViewById(R.id.quantity);
        saveButton=findViewById(R.id.save);
        foods=new ArrayList<>();
        foodRef = FirebaseDatabase.getInstance().getReference();
        addCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String string1 = item.getText().toString();
                String string2 = quantity.getText().toString();
                String string3 = month.getSelectedItem().toString();
                if(string1.matches("") && string2.matches("")) {
                    item.setHint("Please enter item");
                    quantity.setHint("Please enter food quantity");
                    item.setHintTextColor(getResources().getColor(R.color.red));
                    quantity.setHintTextColor(getResources().getColor(R.color.red));
                }
                else {
                        item.setHintTextColor(getResources().getColor(R.color.grey));
                    quantity.setHintTextColor(getResources().getColor(R.color.grey));
                        i++;
                        text.append("\n" + i + "\t" + item.getText().toString() + "\t" + quantity.getText().toString()+ "\t" + string3);
                        foods.add(new Food_Item(month.getSelectedItem().toString(), item.getText().toString(), quantity.getText().toString()));
                        item.setHint("Enter item");
                        quantity.setHint("Enter food quantity");
                        item.setText("");
                        quantity.setText("");
                }
            }
        });
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int j = 0; j < foods.size(); j++) {
                    foodRef.child("Food_Stock").child(foods.get(j).getMonth())
                            .child(foods.get(j).getFoodItem())
                            .setValue(foods.get(j).getQuantity()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(Stck.this, "saved", Toast.LENGTH_SHORT).show();
                                text.setText(null);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(Stck.this, "failure", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
    }

}
