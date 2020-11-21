package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class places extends AppCompatActivity {
    private TextView placeName,desc;
    private ImageView placeImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        initialize();

        Intent intent = getIntent();
        try{
            final PlacesInfo incomingTraining = intent.getParcelableExtra("training");
            placeName.setText(incomingTraining.getName());
            Glide.with(this)
                    .asBitmap()
                    .load(incomingTraining.getImageUrl())
                    .into(placeImage);
            desc.setText(incomingTraining.getDesc());
        }catch (NullPointerException e){
            e.getMessage();
        }
    }
    private void initialize()
    {
        placeImage = findViewById(R.id.trainingImage);
        placeName = findViewById(R.id.trainingName);
        desc=findViewById(R.id.longDesc);
    }
}
