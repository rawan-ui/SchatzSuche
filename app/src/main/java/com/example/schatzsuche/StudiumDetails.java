package com.example.schatzsuche;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class StudiumDetails extends AppCompatActivity {
    private PseudoDatabase pseudoDatabase;
    private Studium bachelorStudium;
    private RecyclerView recyclerView;
    private StudiumDetailsRecylerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        setContentView(R.layout.studium_course_result);
        pseudoDatabase = new PseudoDatabase();
        bachelorStudium = pseudoDatabase.createBachelorStudium();
        setAdapter();


    }

    private void setAdapter(){
        //System.out.println("size of lv :" + bachelorStudium.getLVS().size());
        ArrayList<Veranstaltung>ver = new ArrayList<>(bachelorStudium.getLVS());
        recyclerView = findViewById(R.id.rc);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        adapter = new StudiumDetailsRecylerAdapter(ver);
        recyclerView.setAdapter(adapter);



    }

    }



