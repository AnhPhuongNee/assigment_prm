package com.example.assigment_pcm.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assigment_pcm.R;

import java.util.ArrayList;
import java.util.List;

public class chat_page extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MessageAdapter messageAdapter;
    private List<message> mlistmessage;
    private EditText edmessage;
    private ImageButton imgsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_page);

        edmessage = findViewById(R.id.ed_message);
        imgsend = findViewById(R.id.send);
        recyclerView = findViewById(R.id.rcv_message);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        mlistmessage = new ArrayList<>();
        messageAdapter = new MessageAdapter();
        messageAdapter.setDate(mlistmessage);

        recyclerView.setAdapter(messageAdapter);

        imgsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendmess();
            }
        });

        ImageButton btnback1 = findViewById(R.id.backt11);
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onBackPressed();
            }
        });
    }

    private void sendmess(){
        String strmess = edmessage.getText().toString().trim();
        if(TextUtils.isEmpty(strmess)){
            return;
        }
        mlistmessage.add(new message(strmess));
        messageAdapter.notifyDataSetChanged();
        recyclerView.scrollToPosition(mlistmessage.size() - 1);

        edmessage.setText("");
    }
}
