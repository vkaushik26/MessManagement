package com.example.kaush.messmanagement;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feedbackActivity extends AppCompatActivity {

    Button feedSubmit;
    RatingBar ans1, ans2, ans3, ans4, ans5, ans6, ans7, ans8, ans9, ans10, ans11;
    DatabaseReference dreff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        dreff = FirebaseDatabase.getInstance().getReference().child("FeedBack");
        ans1 = findViewById(R.id.ratingBar1);
        ans2 = findViewById(R.id.ratingBar2);
        ans3 = findViewById(R.id.ratingBar3);
        ans4 = findViewById(R.id.ratingBar4);
        ans5 = findViewById(R.id.ratingBar5);
        ans6 = findViewById(R.id.ratingBar6);
        ans7 = findViewById(R.id.ratingBar7);
        ans8 = findViewById(R.id.ratingBar8);
        ans9 = findViewById(R.id.ratingBar9);
        ans10 = findViewById(R.id.ratingBar10);
        ans11 = findViewById(R.id.ratingBar11);
        feedSubmit = findViewById(R.id.feedSubmit);


        feedSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                float rating1 = (ans1.getRating());
                float rating2 = (ans2.getRating());
                float rating3 = (ans3.getRating());
                float rating4 = (ans4.getRating());
                float rating5 = (ans5.getRating());
                float rating6 = (ans6.getRating());
                float rating7 = (ans7.getRating());
                float rating8 = (ans8.getRating());
                float rating9 = (ans9.getRating());
                float rating10 = (ans10.getRating());
                float rating11 = (ans11.getRating());

                if (rating1 == 1) {
                    dreff.child("Poor").push().setValue(ans1.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans1.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating1 == 2) {
                    dreff.child("Average").push().setValue(ans1.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans1.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating1 == 3) {
                    dreff.child("Good").push().setValue(ans1.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans1.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating1 == 4) {
                    dreff.child("Very Good").push().setValue(ans1.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans1.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating1 == 5) {
                    dreff.child("Excellent").push().setValue(ans1.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans1.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating2 == 1) {
                    dreff.child("Poor").push().setValue(ans2.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans2.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating2 == 2) {
                    dreff.child("Average").push().setValue(ans2.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans2.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating2 == 3) {
                    dreff.child("Good").push().setValue(ans2.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans2.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating2 == 4) {
                    dreff.child("Very Good").push().setValue(ans2.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans2.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating2 == 5) {
                    dreff.child("Excellent").push().setValue(ans2.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans2.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating3 == 1) {
                    dreff.child("Poor").push().setValue(ans3.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans3.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating3 == 2) {
                    dreff.child("Average").push().setValue(ans3.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans3.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating3 == 3) {
                    dreff.child("Good").push().setValue(ans3.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans3.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating3 == 4) {
                    dreff.child("Very Good").push().setValue(ans3.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans3.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating3 == 5) {
                    dreff.child("Excellent").push().setValue(ans3.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans3.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating4 == 1) {
                    dreff.child("Poor").push().setValue(ans4.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans4.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating4 == 2) {
                    dreff.child("Average").push().setValue(ans4.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans4.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating4 == 3) {
                    dreff.child("Good").push().setValue(ans4.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans4.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating4 == 4) {
                    dreff.child("Very Good").push().setValue(ans4.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans4.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating4 == 5) {
                    dreff.child("Excellent").push().setValue(ans4.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans4.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating5 == 1) {
                    dreff.child("Poor").push().setValue(ans5.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans5.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating5 == 2) {
                    dreff.child("Average").push().setValue(ans5.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans5.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating5 == 3) {
                    dreff.child("Good").push().setValue(ans5.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans5.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating5 == 4) {
                    dreff.child("Very Good").push().setValue(ans5.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans5.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating5 == 5) {
                    dreff.child("Excellent").push().setValue(ans5.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans5.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating6 == 1) {
                    dreff.child("Poor").push().setValue(ans6.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans6.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating6 == 2) {
                    dreff.child("Average").push().setValue(ans6.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans6.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating6 == 3) {
                    dreff.child("Good").push().setValue(ans6.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans6.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating6 == 4) {
                    dreff.child("Very Good").push().setValue(ans6.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans6.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating6 == 5) {
                    dreff.child("Excellent").push().setValue(ans6.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans6.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating7 == 1) {
                    dreff.child("Poor").push().setValue(ans7.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans7.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating7 == 2) {
                    dreff.child("Average").push().setValue(ans7.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans7.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating7 == 3) {
                    dreff.child("Good").push().setValue(ans7.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans7.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating7 == 4) {
                    dreff.child("Very Good").push().setValue(ans7.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans7.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating7 == 5) {
                    dreff.child("Excellent").push().setValue(ans7.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans7.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                if (rating8 == 1) {
                    dreff.child("Poor").push().setValue(ans8.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans8.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating8 == 2) {
                    dreff.child("Average").push().setValue(ans8.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans8.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating8 == 3) {
                    dreff.child("Good").push().setValue(ans8.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans8.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating8 == 4) {
                    dreff.child("Very Good").push().setValue(ans8.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans8.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating8 == 5) {
                    dreff.child("Excellent").push().setValue(ans8.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans8.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                if (rating9 == 1) {
                    dreff.child("Poor").push().setValue(ans9.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans9.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating9 == 2) {
                    dreff.child("Average").push().setValue(ans9.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans9.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating9 == 3) {
                    dreff.child("Good").push().setValue(ans9.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans9.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating9 == 4) {
                    dreff.child("Very Good").push().setValue(ans9.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans9.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating9 == 5) {
                    dreff.child("Excellent").push().setValue(ans9.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans9.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating10 == 1) {
                    dreff.child("Poor").push().setValue(ans10.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans10.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating10 == 2) {
                    dreff.child("Average").push().setValue(ans10.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans10.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating10 == 3) {
                    dreff.child("Good").push().setValue(ans10.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans10.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating10 == 4) {
                    dreff.child("Very Good").push().setValue(ans10.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans10.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating10 == 5) {
                    dreff.child("Excellent").push().setValue(ans10.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans10.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating11 == 1) {
                    dreff.child("Poor").push().setValue(ans11.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans11.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating11 == 2) {
                    dreff.child("Average").push().setValue(ans11.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans11.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating11 == 3) {
                    dreff.child("Good").push().setValue(ans11.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans11.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating11 == 4) {
                    dreff.child("Very Good").push().setValue(ans11.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans11.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }

                if (rating11 == 5) {
                    dreff.child("Excellent").push().setValue(ans11.getRating()).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Toast.makeText(feedbackActivity.this, "Submit", Toast.LENGTH_SHORT).show();
                            ans11.setRating(0);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(feedbackActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                        }
                    });
                }


            }
        });

    }

}
