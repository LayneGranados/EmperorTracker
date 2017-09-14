package com.emperor_tracare.emperortracker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;

import com.emperor_tracare.emperortracker.adapter.WeightRecordAdapterRecyclerView;
import com.emperor_tracare.emperortracker.model.MyApplication;
import com.emperor_tracare.emperortracker.model.WeightRecord;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


import java.util.ArrayList;

public class WeightRecordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_records);
        showToolbar("Weight Records", true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setEnterTransition(new Fade());
        }
        ((MyApplication)this.getApplication()).setFragment("weight");

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 3.5),
                new DataPoint(1, 4.2),
                new DataPoint(2, 7.3),
                new DataPoint(3, 4.9),
                new DataPoint(4, 9.2),
                new DataPoint(5, 5.2),
                new DataPoint(6, 9.5),
                new DataPoint(7, 7.8),
                new DataPoint(8, 8)
        });
        graph.addSeries(series);

        RecyclerView weightRecordsRecyclerView = (RecyclerView)findViewById(R.id.weight_records_list_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        weightRecordsRecyclerView.setLayoutManager(linearLayoutManager);
        WeightRecordAdapterRecyclerView weightRecordAdapterRecyclerView = new WeightRecordAdapterRecyclerView(buildWeightRecords(), R.layout.item_list_weight_record);
        weightRecordsRecyclerView.setAdapter(weightRecordAdapterRecyclerView);

    }

    public void showToolbar(String title, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    private ArrayList<WeightRecord> buildWeightRecords() {
        ArrayList<WeightRecord> weightRecords = new ArrayList<>();
        WeightRecord sr1 = new WeightRecord("14","JUL","67.2");
        WeightRecord sr2 = new WeightRecord("09","JUL","67.5");
        WeightRecord sr3 = new WeightRecord("01","JUL","66.9");
        WeightRecord sr4 = new WeightRecord("25","JUN","67.2");
        WeightRecord sr5 = new WeightRecord("16","JUN","68.1");
        WeightRecord sr6 = new WeightRecord("20","MAY","68.5");
        weightRecords.add(sr1);
        weightRecords.add(sr2);
        weightRecords.add(sr3);
        weightRecords.add(sr4);
        weightRecords.add(sr5);
        weightRecords.add(sr6);
        return weightRecords;
    }
}

