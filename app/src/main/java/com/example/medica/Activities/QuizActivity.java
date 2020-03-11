package com.example.medica.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.medica.Adapters.QuestionsAdapter;
import com.example.medica.R;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    QuestionsAdapter adapter;
    List<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        setdata();
        recyclerView=findViewById(R.id.recycler_view);
        adapter=new QuestionsAdapter(data);
        recyclerView.setAdapter(adapter);
    }


    void setdata(){

        data=new ArrayList<>();
        data.add("Heat capability");
        data.add("Heat dissipation");
        data.add("Focal spot sizes");
        data.add("Powering rate");
        data.add("KV range");
        data.add("MA range");
        data.add("Continuous Scan time");
        data.add("Scan range");
        data.add("Max. patient load");
        data.add("Pitch range");
        data.add("Reconstruction Speed");
        data.add("Image area matrix dimensions");
        data.add("Number of detectors ");
        data.add("Detector rows");
        data.add("Dectetor row slice thickness");
        data.add("Detector coverage");
        data.add("Rotation times for axial scan(s) ");

    }
}
