package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePage extends AppCompatActivity {
ImageButton imageButton1, imageButton7, imageButton8,imageButton9,imageButton12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Utilis.initializeAll();
        /*eventText.eventInitialize();*/

        imageButton1=findViewById(R.id.aboutcity);
        imageButton7=findViewById(R.id.tourist);
        /*imageButton8=findViewById(R.id.events);*/
        imageButton9=findViewById(R.id.holidays);
        imageButton12=findViewById(R.id.emergency);




        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomePage.this, aboutcity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomePage.this, AllPlacesActivity.class);
                startActivity(intentLoadNewActivity);
            }
        });
        /*imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomePage.this,upcomingevents.class );
                startActivity(intentLoadNewActivity);
            }
        });*/
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomePage.this,holidays.class );
                startActivity(intentLoadNewActivity);
            }
        });
        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(HomePage.this,emergency_no.class );
                startActivity(intentLoadNewActivity);
            }
        });
    }
}