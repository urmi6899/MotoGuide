package com.example.moto_guide;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class placesRecViewAdapter extends RecyclerView.Adapter<placesRecViewAdapter.ViewHolder>{
    private static final String TAG="PlacesRecViewAdapter";
    private Context mContext;

    private ArrayList<PlacesInfo> places = new ArrayList<>();
    public placesRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public placesRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.places_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.placeName.setText(places.get(position).getName());

        Glide.with(mContext)
                .asBitmap()
                .load(places.get(position).getImageUrl())
                .into(holder.placeImage);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,places.class);
                intent.putExtra("training", places.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView placeName;
        private ImageView placeImage;
        private CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            placeName=(TextView)itemView.findViewById(R.id.placeName);
            placeImage=(ImageView)itemView.findViewById(R.id.placeImage);
            cardView=(CardView)itemView.findViewById(R.id.cardView);
        }
    }

    public void setPlaces(ArrayList<PlacesInfo> places) {
        this.places = places;
        notifyDataSetChanged();
    }
}
