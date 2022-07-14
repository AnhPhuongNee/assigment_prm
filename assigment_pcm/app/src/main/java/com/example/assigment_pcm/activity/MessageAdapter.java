package com.example.assigment_pcm.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assigment_pcm.R;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder>{
    private List<message> mlistmessage;
    public void setDate(List<message> list){
        this.mlistmessage = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat,parent,false);


        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        message messages = mlistmessage.get(position);
        if(messages==null){
            return;
        }
        holder.tvMess.setText(messages.getMesseage());

    }

    @Override
    public int getItemCount() {
        if(mlistmessage !=null){
            return mlistmessage.size();
        }
        return 0;
    }

    public class MessageViewHolder extends RecyclerView.ViewHolder{

        private TextView tvMess;
        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMess = itemView.findViewById(R.id.tvmess);
        }
    }
}
