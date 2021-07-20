package com.example.recyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.programingview> {

  private String [] data;

    public adapter(String[] data) {
        this.data = data;
    }


    @Override
    public programingview onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.itemdesign,parent,false);


        return new programingview(view);

    }

    @Override
    public void onBindViewHolder(@NonNull  adapter.programingview holder, int position) {

        String title =data[position];
        holder.text.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programingview extends RecyclerView.ViewHolder{
         ImageView image;
         TextView text;

        public programingview(@NonNull  View itemView) {
            super(itemView);

            image =(ImageView)itemView.findViewById(R.id.imageView4);
            text =(TextView)itemView.findViewById(R.id.textView2);
        }
    }
}
