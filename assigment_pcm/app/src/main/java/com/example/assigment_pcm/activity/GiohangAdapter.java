package com.example.assigment_pcm.activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assigment_pcm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;
import java.util.List;

public class GiohangAdapter extends RecyclerView.Adapter<GiohangAdapter.MyViewHolder> {
    Context context ;
    List<Giohang> listgiohangs;

    public GiohangAdapter(Context context, List<Giohang> listgiohangs) {
        this.context = context;
        this.listgiohangs = listgiohangs;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_giohang,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Giohang giohang = listgiohangs.get(position);
        holder.tengiohang.setText(giohang.getTen());
        Glide.with(context).load(giohang.getHinhanh()).into(holder.hinhgiohang);

    }

    @Override
    public int getItemCount() {
        return listgiohangs.size();
    }


    public  class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView hinhgiohang;
        TextView tengiohang;
        TextView giagiohang;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            hinhgiohang = itemView.findViewById(R.id.item_hinhanhgiohang);
            tengiohang = itemView.findViewById(R.id.item_tenhanggh);
            giagiohang = itemView.findViewById(R.id.item_giagh);
        }
    }
}
