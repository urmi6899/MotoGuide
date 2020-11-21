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

public class eventsRecViewAdapter extends RecyclerView.Adapter<eventsRecViewAdapter.ViewHolder>{
    private static final String TAG="EventsRecViewAdapter";
    private Context mContext;

    private ArrayList<EventsInfo> events = new ArrayList<>();
    public eventsRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public eventsRecViewAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.events_list_item,parent,false);
        ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.eventName.setText(events.get(position).getName());

        Glide.with(mContext)
                .asBitmap()
                .load(events.get(position).getImageUrl())
                .into(holder.eventImage);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,events.class);
                intent.putExtra("training", events.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView eventName;
        private ImageView eventImage;
        private CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventName=(TextView)itemView.findViewById(R.id.eventName);
            eventImage=(ImageView)itemView.findViewById(R.id.eventImage);
            cardView=(CardView)itemView.findViewById(R.id.cardView);
        }
    }

    public void setEvents(ArrayList<EventsInfo> events) {
        this.events = events;
        notifyDataSetChanged();
    }
}
