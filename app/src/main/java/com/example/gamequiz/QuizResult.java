package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class QuizResult extends AppCompatActivity {
    private FirebaseAuth mAuth;
    DatabaseReference danielaDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuiz);
         TextView correctAnswers = findViewById(R.id.correctAnswers);
         TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);
        final String getTopic = getIntent().getStringExtra("topic");

        danielaDb = FirebaseDatabase.getInstance().getReference().child("Score");
        mAuth = FirebaseAuth.getInstance();

        correctAnswers.setText(String.valueOf(getCorrectAnswers));
        incorrectAnswers.setText(String.valueOf(getIncorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String totalScore = correctAnswers.getText().toString();
                String incorrectScore = incorrectAnswers.getText().toString();
                String mUser = mAuth.getCurrentUser().getEmail();
                finalScoreGame finalScoreGame = new finalScoreGame(totalScore, incorrectScore,mUser, getTopic);
                danielaDb.push().setValue(finalScoreGame);
                startActivity(new Intent(QuizResult.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(QuizResult.this, MainActivity.class));
        finish();
    }
}