package com.example.melvin.lab03_courtcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment {


    private TextView m_tv_team_score;
    private Button m_btn_3_points, m_btn_2_points, m_btn_1_point;
    private int m_scoreTeam = 0;
//    private int scoreTeamB = 0;
    private int m3pointFor,m2pointFor,m1pointFor = 0;
//    private int m3pointForB,m2pointForB,m1pointForB = 0;

    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);
        m_btn_3_points = (Button)getView().findViewById(R.id.btn_3_points);
        m_btn_2_points = (Button)getView().findViewById(R.id.btn_2_points);
        m_btn_1_point = (Button)getView().findViewById(R.id.btn_1_point);
        m_btn_3_points.setOnClickListener(listener);
        m_btn_2_points.setOnClickListener(listener);
        m_btn_1_point.setOnClickListener(listener);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_3_points:
                    m_scoreTeam += 3;
                    ++m3pointFor;
                    break;
                case R.id.btn_2_points:
                    m_scoreTeam += 2;
                    ++m2pointFor;
                    break;
                case R.id.btn_1_point:
                    m_scoreTeam += 1;
                    ++m1pointFor;
                    break;
            }
            m_tv_team_score.setText(String.valueOf(m_scoreTeam));
        }
    };

}
