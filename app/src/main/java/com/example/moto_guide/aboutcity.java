package com.example.moto_guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class aboutcity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutcity);
        String str="Surat is a city in the Indian state of Gujarat. It used to be a large seaport and is now the " +
                "commercial and economic center in South Gujarat, which is famous for its diamonds and textile Industries and as a shopping centre for apparels and accessories . It is the eighth largest city and ninth largest urban agglomeration in India. It is the administrative capital of the Surat district. The city is located 284 kilometres (176 mi) south of the state capital, Gandhinagar; 265 kilometres (165 mi) south of Ahmedabad; and 289 kilometres (180 mi) north of Mumbai." +
                " The city centre is located on the Tapti River, close to Arabian Sea ";
        TextView txv=(TextView)findViewById(R.id.txt_data);
        txv.setText(str);
    }
}
