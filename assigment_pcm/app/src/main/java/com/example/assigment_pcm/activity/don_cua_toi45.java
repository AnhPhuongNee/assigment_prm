package com.example.assigment_pcm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assigment_pcm.R;

import java.util.List;

public class don_cua_toi45 extends AppCompatActivity {
    RecyclerView rcvgiohang;
    GiohangAdapter adapter;
    List<Giohang> giohangList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_cua_toi45);

        RelativeLayout btnthongtin= findViewById(R.id.thongtin);
        btnthongtin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), thong_tin_don_hang.class);
                startActivity(intent);
            }
        });

////        rcvgiohang.setHasFixedSize(true);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
//        rcvgiohang.setLayoutManager(layoutManager);
//        adapter = new GiohangAdapter(getApplicationContext(),Utils.manggiohang);
//        rcvgiohang.setAdapter(adapter);


        ImageButton btnback= findViewById(R.id.backtdoncuatoi45);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(view.getContext(), navigationbar.class);
                startActivity(intent);
            }
        });
    }
}