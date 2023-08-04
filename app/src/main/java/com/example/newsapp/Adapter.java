package com.example.newsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    ArrayList<ModelClass> modelClassArrayList;

    public Adapter(Context context, ArrayList<ModelClass> modelClassArrayList) {
        this.context = context;
        this.modelClassArrayList = modelClassArrayList;

    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // this method will be  called as many time as there are views inside this screen.
       // LayoutInflater is class which convert xml into view
       // View view = LayoutInflater.from(context).inflate(R.layout.layout_item,null,false);
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,null,false);
       return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        // this function bind the data with corresponding view

    holder.mHeading.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent intent = new Intent(context,webView.class);
            intent.putExtra("url",modelClassArrayList.get(position).getUrl());
            context.startActivity(intent);
        }
    });
    holder.mTime.setText("Published At:-"+modelClassArrayList.get(position).getPublishedAt());
    holder.mAuthor.setText("Author:-"+modelClassArrayList.get(position).getAuthor());
    holder.mHeading.setText("Title:-"+modelClassArrayList.get(position).getTitle());
    holder.mContent.setText("Description:-"+modelClassArrayList.get(position).getDescription());

        Glide.with(context).load(modelClassArrayList.get(position).getUrlToImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        //Called first time and will tell the no. of item inside it.
        return modelClassArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // For Adapter we need View Holder
        TextView mHeading, mContent, mAuthor, mTime;
        CardView cardView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mHeading = itemView.findViewById(R.id.main_heading);
            mContent = itemView.findViewById(R.id.content);
            mAuthor = itemView.findViewById(R.id.author);
            mTime = itemView.findViewById(R.id.Time);
            cardView = itemView.findViewById(R.id.card_View);
            imageView = itemView.findViewById(R.id.image_view);

        }
    }

}
