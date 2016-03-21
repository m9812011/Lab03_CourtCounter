package com.example.melvin.lab03_courtcounter;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment_horizontal extends Fragment {

    private TextView m_tv_3_points,m_tv_2_points,m_tv_1_point;
    private TextView threePointForB,twoPointForB,onePointForB;
    private TextView m_tv_team_score,scoreB;
    private LinearLayout lauout1,lauout2;

    public CourtCounterFragment_horizontal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_court_counter_fragment_horizontal, container, false);
    }


    @Override
    public void onStart() {
        super.onStart();

        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score_page);
        m_tv_3_points = (TextView)getView().findViewById(R.id.tv_3ForTeam_page);
        m_tv_2_points = (TextView)getView().findViewById(R.id.tv_2ForTeam_page);
        m_tv_1_point  = (TextView)getView().findViewById(R.id.tv_1ForTeam_page);


    }


}
