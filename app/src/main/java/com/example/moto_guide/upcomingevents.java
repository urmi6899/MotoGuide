package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class upcomingevents extends AppCompatActivity {
    private RecyclerView recView;
    private eventsRecViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcomingevents);

        adapter = new eventsRecViewAdapter(this);
        recView = findViewById(R.id.RecyclerView);
        recView.setAdapter(adapter);

        recView.setLayoutManager(new LinearLayoutManager(this));

        /*adapter.setEvents(eventText.getAllEvents());*/
    }
}
