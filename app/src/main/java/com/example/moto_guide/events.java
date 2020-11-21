package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class events extends AppCompatActivity {
    private TextView eventName,desc;
    private ImageView eventImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        initialize();

        Intent intent = getIntent();
        try{
            final EventsInfo incomingTraining = intent.getParcelableExtra("training");
            eventName.setText(incomingTraining.getName());
            Glide.with(this)
                    .asBitmap()
                    .load(incomingTraining.getImageUrl())
                    .into(eventImage);
            desc.setText(incomingTraining.getDesc());
        }catch (NullPointerException e){
            e.getMessage();
        }
    }
    private void initialize()
    {
        eventImage = findViewById(R.id.trainingImage);
        eventName = findViewById(R.id.trainingName);
        desc=findViewById(R.id.longDesc);
    }
}
