package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*Code for Team A layout*/
    /*Increase the score for Team A by 3*/
    public void submit3Points_A(View V){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    /*Increase the score for Team A by 2*/
    public void submit2Points_A(View V){

        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    /*Increase the freethrowscore for Team A */
    public void submitFreeThrow_A(View V){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Code for Team B layout*/
    /*Increase the score for Team B by 3*/
    public void submit3Points_B(View V){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    /*Increase the score for Team B by 2*/
    public void submit2Points_B(View V){

        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    /*Increase the score for Team A by 1*/
    public void submitFreeThrow_B(View V){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    /*DISPLAY score for team B*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*Reset score of both team to 0*/
    public void reset(View v){
        scoreTeamA =0;
        scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}
