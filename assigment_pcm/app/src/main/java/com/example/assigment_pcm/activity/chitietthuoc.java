package com.example.assigment_pcm.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.assigment_pcm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DecimalFormat;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class chitietthuoc extends AppCompatActivity {

    TextView tensp;
    TextView giasp;
    TextView chitietsp;
    ImageView hinhsp;
    Button muahang;
    BottomNavigationView bottomNavigationView;

    CompositeDisposable compositeDisposable = new CompositeDisposable();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietthuoc);

        innitView();
        initData();
        muahang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                muahang();
            }
        });

    }


    private  void initData(){
        Thuoc thuoc = (Thuoc) getIntent().getSerializableExtra("chitiet");
        tensp.setText(thuoc.getTensp());
        chitietsp.setText(thuoc.getMota());
        Glide.with(getApplicationContext()).load(thuoc.getHinhanh()).into(hinhsp);
        giasp.setText("Giá: "+thuoc.getGia());
    }

    private void  innitView(){
        tensp = findViewById(R.id.tenspchitiet);
        giasp = findViewById(R.id.giaspchitiet);
        chitietsp = findViewById(R.id.chitietsp);
        hinhsp = findViewById(R.id.hinhanhchitiet);
        muahang = findViewById(R.id.muahang);


    }

    private void muahang(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buy_dialog);
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }
        ImageView hinhspdl = dialog.findViewById(R.id.hinhdathang);
        TextView tenspdl = dialog.findViewById(R.id.tenspdathang);
        Thuoc thuoc = (Thuoc) getIntent().getSerializableExtra("chitiet");
        tenspdl.setText(thuoc.getTensp());
        Glide.with(getApplicationContext()).load(thuoc.getHinhanh()).into(hinhspdl);
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
        Button btnaddcart = dialog.findViewById(R.id.btnaddtocart);
        btnaddcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Sản phẩm đã được thêm vào giỏ hàng",Toast.LENGTH_SHORT).show();
//                Giohang giohang = new Giohang();
//                giohang.setTen(thuoc.getTensp());
//                giohang.setHinhanh(thuoc.getHinhanh());
//                Utils.manggiohang.add(giohang);
            }
        });
        dialog.show();
    }
}