package com.example.recycleranimals;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<GeneralAnimals> generalAnimals = new ArrayList<>();

        generalAnimals.add(new Tiger());
        generalAnimals.add(new Elephant());
        generalAnimals.add(new Butterfly());
        generalAnimals.add(new Wolf());

        recyclerView = findViewById(R.id.main_recycler);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(generalAnimals, this);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
