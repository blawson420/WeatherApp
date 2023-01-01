package com.example.weatherapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.MyViewHolder> {
    Context context;
    ArrayList<WeatherModel> weatherModels;

    public WeatherRVAdapter(Context context, ArrayList<WeatherModel> weatherModels) {
        this.context = context;
        this.weatherModels = weatherModels;
    }


    @NonNull
    @Override
    public WeatherRVAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.forecast_rv_item, parent, false);
        return new WeatherRVAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.MyViewHolder holder, int position) {
        holder.icon.setImageResource(weatherModels.get(position).getIcon());
        holder.details.setText(weatherModels.get(position).weatherDetails);
    }

    @Override
    public int getItemCount() {
        return weatherModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView icon;
        TextView details;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.image);
            details = itemView.findViewById(R.id.time);
        }
    }
}
