package com.example.rcyclerviewsample;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ImageviewHolder> {

    String image[];

    public RecyclerAdapter(String[] image) {
        this.image = image;
    }

    @NonNull
    @Override
    public ImageviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);
        return new ImageviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageviewHolder holder, int position) {

        holder.textView.setText(image[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class ImageviewHolder extends RecyclerView.ViewHolder
    {

        Context context;
        ImageView img;
        TextView textView;

        public ImageviewHolder(@NonNull View itemView) {
            super(itemView);


            textView = (TextView) itemView.findViewById(R.id.texi);

        }
    }
}
