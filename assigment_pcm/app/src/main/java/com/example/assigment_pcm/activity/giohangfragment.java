package com.example.assigment_pcm.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assigment_pcm.R;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class giohangfragment extends Fragment {

    RecyclerView rcvgiohang;
    GiohangAdapter adapter;
    List<Giohang> giohangList;
    ApiBanThuoc apiBanThuoc;

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    public giohangfragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_giohangfragment, container, false);


        Button btnthanhtoan= view.findViewById(R.id.btnthanhtoan);
        btnthanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),thanh_toan_page.class);
                startActivity(intent);
            }
        });
        return view;
    }
}