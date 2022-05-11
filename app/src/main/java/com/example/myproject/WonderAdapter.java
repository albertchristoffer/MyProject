package com.example.myproject;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class WonderAdapter extends RecyclerView.Adapter<WonderViewHolder> {

    private List<Wonder> wonders = new ArrayList();

    @NonNull
    @Override
    public WonderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new WonderViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull WonderViewHolder holder, int position) {
        Wonder wonder = wonders.get(position);

        holder.name.setText(wonder.getName());
        holder.location.setText(wonder.getLocation());
        holder.category.setText(wonder.getCategory());
        holder.auxdata.setText(wonder.getAuxdata());
    }

    @Override
    public int getItemCount() {
        return wonders.size();
    }

    public void setWonders(List<Wonder> mountains) {
        this.wonders = wonders;
    }
}
