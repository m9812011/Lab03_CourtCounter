package com.example.melvin.lab03_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreView;
    private int scoreTeamA = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }


    private void findViews(){
        scoreView = (TextView)findViewById(R.id.team_a_score);
    }

    public void addForTeamA(View view) {
        switch (view.getId()){
            case R.id.add3ForTeamA:
                scoreTeamA += 3;
                break;
            case R.id.add2ForTeamA:
                scoreTeamA += 2;
                break;
            case R.id.add1ForTeamA:
                scoreTeamA += 1;
                break;
        }
        scoreView.setText(String.valueOf(scoreTeamA));

    }


    public void resetScoreView(View view) {
        if(view.getId() == R.id.reset){
            scoreTeamA = 0;
            scoreView.setText(String.valueOf(scoreTeamA));
        }
    }



}
