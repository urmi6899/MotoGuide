package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllPlacesActivity extends AppCompatActivity {

    private RecyclerView recView;
    private placesRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_places);

        adapter = new placesRecViewAdapter(this);
        recView = findViewById(R.id.RecyclerView);
        recView.setAdapter(adapter);

        recView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setPlaces(Utilis.getAllPlaces());
    }
}
