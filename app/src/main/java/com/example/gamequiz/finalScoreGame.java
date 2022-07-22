package com.example.gamequiz;

public class finalScoreGame {

    String totalScore;
    String incorrectScore;
    String email;
    String topic;

    public finalScoreGame(){

    }

    public finalScoreGame(String totalScore, String incorrectScore, String email, String topic) {
        this.totalScore = totalScore;
        this.incorrectScore = incorrectScore;
        this.email = email;
        this.topic = topic;
    }

    public String getTotalScore() {
        return totalScore;
    }

    public String getIncorrectScore() {
        return incorrectScore;
    }

    public String getEmail() {
        return email;
    }

    public String getTopic() { return topic;}
}
