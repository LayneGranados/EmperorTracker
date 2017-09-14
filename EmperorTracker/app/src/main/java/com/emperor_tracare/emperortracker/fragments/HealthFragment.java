package com.emperor_tracare.emperortracker.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.emperor_tracare.emperortracker.AlarmsActivity;
import com.emperor_tracare.emperortracker.FisicalActivitiesActivity;
import com.emperor_tracare.emperortracker.HeartRateRecordsActivity;
import com.emperor_tracare.emperortracker.R;
import com.emperor_tracare.emperortracker.SleepRecordsActivity;
import com.emperor_tracare.emperortracker.StepRecordsActivity;
import com.emperor_tracare.emperortracker.WeightRecordsActivity;
import com.emperor_tracare.emperortracker.model.MyApplication;
import com.emperor_tracare.emperortracker.model.Person;
import com.emperor_tracare.emperortracker.model.WeightRecord;

import java.util.ArrayList;

public class HealthFragment extends Fragment {

    public HealthFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health, container, false);
        Button checkSleepRecords = (Button)view.findViewById(R.id.button_check_sleep_records);
        Button checkBPMRecords = (Button)view.findViewById(R.id.button_check_bpm_records);
        Button checkFootstepsRecords = (Button)view.findViewById(R.id.button_check_footsteps_records);
        Button checkWeightRecords = (Button)view.findViewById(R.id.button_check_weight_records);
        Button checkFisicalActivities = (Button)view.findViewById(R.id.button_check_fisical_activities);


        checkSleepRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), SleepRecordsActivity.class);
                startActivity(intent);
            }
        });
        checkBPMRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), HeartRateRecordsActivity.class);
                startActivity(intent);
            }
        });
        checkFootstepsRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), StepRecordsActivity.class);
                startActivity(intent);
            }
        });
        checkWeightRecords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), WeightRecordsActivity.class);
                startActivity(intent);
            }
        });
        checkFisicalActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), FisicalActivitiesActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }


}
