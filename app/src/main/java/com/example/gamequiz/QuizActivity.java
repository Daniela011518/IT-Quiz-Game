package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;
    private AppCompatButton option1, option2, option3, option4, nextBtn;
    private ImageView goBack;
    private Timer quizTimer;
    private  int totalTimeInMins = 1;
    private  int seconds = 0;
    private List<QuestionList> questionList;
    private int currentQuestionPosition = 0;
    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView topicName = findViewById(R.id.topicName);
        final TextView timer = findViewById(R.id.timer);

        questions = (TextView) findViewById(R.id.questions);
        question = (TextView) findViewById(R.id.question);

        option1 = (AppCompatButton) findViewById(R.id.option1);
        option2 = (AppCompatButton) findViewById(R.id.option2);
        option3 = (AppCompatButton) findViewById(R.id.option3);
        option4 = (AppCompatButton) findViewById(R.id.option4);

        nextBtn = (AppCompatButton) findViewById(R.id.nextBtn);
        goBack = (ImageView) findViewById(R.id.backBtn);

        final String getSelectedTopicName = getIntent().getStringExtra("selected topic");
        topicName.setText(getSelectedTopicName);

        questionList = QuestionsBank.getQuestions(getSelectedTopicName);

        startTimer(timer);

        questions.setText((currentQuestionPosition+1)+"/"+questionList.size());
        question.setText(questionList.get(0).getQuestion());
        option1.setText(questionList.get(0).getOption1());
        option2.setText(questionList.get(0).getOption2());
        option3.setText(questionList.get(0).getOption3());
        option4.setText(questionList.get(0).getOption4());

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option1.getText().toString();
                    option1.setBackgroundResource(R.drawable.round_back_red);
                    option1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option2.getText().toString();
                    option2.setBackgroundResource(R.drawable.round_back_red);
                    option2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option3.getText().toString();
                    option3.setBackgroundResource(R.drawable.round_back_red);
                    option3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = option4.getText().toString();
                    option4.setBackgroundResource(R.drawable.round_back_red);
                    option4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionList.get(currentQuestionPosition).setUserSelectedAnswer(selectedOptionByUser);
                }

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Please Select an option", Toast.LENGTH_SHORT).show();
                }
                else{
                    changeNextQuestion();
                }

            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });



    }

    private void changeNextQuestion(){
        currentQuestionPosition++;

        if((currentQuestionPosition+1) == questionList.size()){
            nextBtn.setText("Submit Quiz");
        }

        if(currentQuestionPosition < questionList.size()){
            selectedOptionByUser = "";

            option1.setBackgroundResource(R.drawable.round_back_white_stroke10);
            option1.setTextColor(Color.parseColor("#1F6BB8"));

            option2.setBackgroundResource(R.drawable.round_back_white_stroke10);
            option2.setTextColor(Color.parseColor("#1F6BB8"));

            option3.setBackgroundResource(R.drawable.round_back_white_stroke10);
            option3.setTextColor(Color.parseColor("#1F6BB8"));

            option4.setBackgroundResource(R.drawable.round_back_white_stroke10);
            option4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPosition+1)+"/"+questionList.size());
            question.setText(questionList.get(currentQuestionPosition).getQuestion());
            option1.setText(questionList.get(currentQuestionPosition).getOption1());
            option2.setText(questionList.get(currentQuestionPosition).getOption2());
            option3.setText(questionList.get(currentQuestionPosition).getOption3());
            option4.setText(questionList.get(currentQuestionPosition).getOption4());
        }
        else{
            Intent intent = new Intent(QuizActivity.this, QuizResult.class);
            intent.putExtra("correct", getCorrectAnswer());
            intent.putExtra("incorrect", getIncorrectAnswer());
            intent.putExtra("topic", getIntent().getStringExtra("selected topic"));
            startActivity(intent);

            finish();
        }
    }

    private void startTimer(TextView timerTextView){
                quizTimer = new Timer();

                quizTimer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        if(seconds == 0){
                            totalTimeInMins--;
                            seconds = 59;
                        }
                        else if(seconds == 0 && totalTimeInMins == 0){
                                quizTimer.purge();
                                quizTimer.cancel();
                            Toast.makeText(QuizActivity.this, "Game was Over", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(QuizActivity.this, QuizResult.class);
                            intent.putExtra("correct", getCorrectAnswer());
                            intent.putExtra("incorrect", getIncorrectAnswer());
                            startActivity(intent);

                            finish();
                        }
                        else{
                            seconds--;
                        }
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                String finalMinutes = String.valueOf(totalTimeInMins);
                                String finalSeconds = String.valueOf(seconds);

                                if(finalMinutes.length() == 1){
                                    finalMinutes ="0"+finalMinutes;
                                }

                                if(finalSeconds.length() == 1){
                                    finalSeconds = "0" + finalSeconds;
                                }

                                timerTextView.setText(finalMinutes + ":" + finalSeconds);
                            }
                        });
                    }
                }, 1000,1000);
    }



    private int getCorrectAnswer(){
        int correctAnswer = 0;

        for(int i = 0; i < questionList.size();i++){
            final String getUserSelectedAnswer = questionList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                correctAnswer++;
            }
        }
        return correctAnswer;
    }
    private int getIncorrectAnswer() {

        int correctAnswer = 0;

        for(int i = 0; i < questionList.size();i++){
            final String getUserSelectedAnswer = questionList.get(i).getUserSelectedAnswer();
            final String getAnswer = questionList.get(i).getAnswer();

            if(!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswer++;
            }
        }
        return correctAnswer;
    }

    @Override
    public void onBackPressed() {

        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();

    }

    private void revealAnswer(){
        final String getAnswer = questionList.get(currentQuestionPosition).getAnswer();

        if(option1.getText().toString().equals(getAnswer)){
            option1.setBackgroundResource(R.drawable.round_back_green10);
            option1.setTextColor(Color.WHITE);
        }
        else if(option2.getText().toString().equals(getAnswer)){
            option2.setBackgroundResource(R.drawable.round_back_green10);
            option2.setTextColor(Color.WHITE);
        }
        else if(option3.getText().toString().equals(getAnswer)){
            option3.setBackgroundResource(R.drawable.round_back_green10);
            option3.setTextColor(Color.WHITE);
        }
        else if(option4.getText().toString().equals(getAnswer)){
            option4.setBackgroundResource(R.drawable.round_back_green10);
            option4.setTextColor(Color.WHITE);
        }
    }
}