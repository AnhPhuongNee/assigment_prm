package com.example.assigment_pcm.activity;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.assigment_pcm.R;

import java.util.List;

public class ThuocAdapter extends RecyclerView.Adapter<ThuocAdapter.MyViewHolder> {
    Context context;
    List<Thuoc>  array;

    public ThuocAdapter(Context context, List<Thuoc> array) {
        this.context = context;
        this.array = array;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thuoc, parent, false);


        return new MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Thuoc thuoc = array.get(position);
        holder.txtten.setText(thuoc.getTensp());
        holder.txtgia.setText("Giá: "+thuoc.getGia());
        Glide.with(context).load(thuoc.getHinhanh()).into(holder.imghinh);
        holder.imghinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), chitietthuoc.class);
                intent.putExtra("chitiet",thuoc);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtgia,txtten;
        ImageView imghinh;
        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            txtten = itemView.findViewById(R.id.itemsp_tensp);
            txtgia = itemView.findViewById(R.id.itemsp_giasp);
            imghinh = itemView.findViewById(R.id.itemsp_image);
        }
    }
}
