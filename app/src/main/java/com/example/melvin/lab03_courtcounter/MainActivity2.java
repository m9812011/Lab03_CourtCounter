package com.example.melvin.lab03_courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView threePointForA,twoPointForA,onePointForA;
    private TextView threePointForB,twoPointForB,onePointForB;
    private TextView scoreA,scoreB;
    private LinearLayout lauout1,lauout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViews();
        getDataAndShowDate();
    }


    private void findViews(){
//        threePointForA = (TextView)findViewById(R.id.add3ForTeamA_text);
//        twoPointForA = (TextView)findViewById(R.id.add2ForTeamA_text);
//        onePointForA = (TextView)findViewById(R.id.add1ForTeamA_text);
        threePointForB = (TextView)findViewById(R.id.add3ForTeamB_text);
        twoPointForB = (TextView)findViewById(R.id.add2ForTeamB_text);
        onePointForB = (TextView)findViewById(R.id.add1ForTeamB_text);
//        scoreA = (TextView)findViewById(R.id.scoreA);
        scoreB = (TextView)findViewById(R.id.scoreB);
//        lauout1 = (LinearLayout)findViewById(R.id.titleA);
        lauout2 = (LinearLayout)findViewById(R.id.titleB);
    }


    private void getDataAndShowDate() {
        Bundle bundle = getIntent().getExtras();
        int m3pointForA = bundle.getInt("m3pointForA");
        int m2pointForA = bundle.getInt("m2pointForA");
        int m1pointForA = bundle.getInt("m1pointForA");
        int m3pointForB = bundle.getInt("m3pointForB");
        int m2pointForB = bundle.getInt("m2pointForB");
        int m1pointForB = bundle.getInt("m1pointForB");
        int scoreTeamA = bundle.getInt("scoreTeamA");
        int scoreTeamB = bundle.getInt("scoreTeamB");
        threePointForA.setText("三分球 : " + String.valueOf(m3pointForA));
        twoPointForA.setText("二分球 : " + String.valueOf(m2pointForA));
        onePointForA.setText("罰球 : " + String.valueOf(m1pointForA));
        threePointForB.setText("三分球 : " + String.valueOf(m3pointForB));
        twoPointForB.setText("二分球 : " + String.valueOf(m2pointForB));
        onePointForB.setText("罰球 : " + String.valueOf(m1pointForB));
        scoreA.setText("總分 : " + String.valueOf(scoreTeamA));
        scoreB.setText("總分 : " + String.valueOf(scoreTeamB));

        if(scoreTeamA > scoreTeamB){
            lauout1.setBackgroundResource(android.R.color.holo_orange_light);
        }else{
            lauout2.setBackgroundResource(android.R.color.holo_orange_light);
        }

    }


    public void returnScore(View view) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
