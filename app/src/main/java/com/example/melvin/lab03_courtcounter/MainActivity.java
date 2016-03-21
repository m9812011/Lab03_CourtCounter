package com.example.melvin.lab03_courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreViewB ;
//    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
//    private int m3pointForA,m2pointForA,m1pointForA = 0;
    private int m3pointForB,m2pointForB,m1pointForB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }


    private void findViews(){
//        scoreViewA = (TextView)findViewById(R.id.team_a_score);
        scoreViewB = (TextView)findViewById(R.id.team_b_score);
    }

//    public void addForTeamA(View view) {
//        switch (view.getId()){
//            case R.id.add3ForTeamA:
//                scoreTeamA += 3;
//                ++m3pointForA;
//                break;
//            case R.id.add2ForTeamA:
//                scoreTeamA += 2;
//                ++m2pointForA;
//                break;
//            case R.id.add1ForTeamA:
//                scoreTeamA += 1;
//                ++m1pointForA;
//                break;
//            }
//        scoreViewA.setText(String.valueOf(scoreTeamA));
//
//    }


    public void addForTeamB(View view) {
        switch (view.getId()){
            case R.id.add3ForTeamB:
                scoreTeamB += 3;
                ++m3pointForB;
                break;
            case R.id.add2ForTeamB:
                scoreTeamB += 2;
                ++m2pointForB;
                break;
            case R.id.add1ForTeamB:
                scoreTeamB += 1;
                ++m1pointForB;
                break;
        }
        scoreViewB.setText(String.valueOf(scoreTeamB));

    }

    public void resetScoreView(View view) {
        if(view.getId() == R.id.reset){
//            scoreTeamA = 0;
            scoreTeamB = 0;
//            m3pointForA =0;
//            m2pointForA =0;
//            m1pointForA =0;
            m3pointForB =0;
            m2pointForB =0;
            m1pointForB =0;
//            scoreViewA.setText(String.valueOf(scoreTeamA));
            scoreViewB.setText(String.valueOf(scoreTeamB));
        }
    }

    public void dataAnalysis(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        Bundle bundle = new Bundle();
//        bundle.putInt("m3pointForA",m3pointForA);
//        bundle.putInt("m2pointForA",m2pointForA);
//        bundle.putInt("m1pointForA",m1pointForA);
        bundle.putInt("m3pointForB",m3pointForB);
        bundle.putInt("m2pointForB",m2pointForB);
        bundle.putInt("m1pointForB",m1pointForB);
//        bundle.putInt("scoreTeamA",scoreTeamA);
        bundle.putInt("scoreTeamB",scoreTeamB);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}
