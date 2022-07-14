package com.example.assigment_pcm.activity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.assigment_pcm.R;

import java.text.DecimalFormat;

public class dialogmuachitiet extends AppCompatActivity {

    TextView tensp;
    ImageView hinhsp;

    protected void onCreate() {

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.buy_dialog);
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }
        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
//        innitView();
//        initData();


    }


    private  void initData(){
        Thuoc thuoc = (Thuoc) getIntent().getSerializableExtra("chitiet");
        tensp.setText(thuoc.getTensp());
        Glide.with(getApplicationContext()).load(thuoc.getHinhanh()).into(hinhsp);
    }

    private void  innitView(){
        tensp = findViewById(R.id.tenspdathang);
        hinhsp = findViewById(R.id.hinhdathang);
    }

//    private void muahang(){
//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(R.layout.buy_dialog);
//        Window window = dialog.getWindow();
//        if(window == null){
//            return;
//        }
//        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
//
//        Button btnaddcart = dialog.findViewById(R.id.btnaddtocart);
//        btnaddcart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Sản phẩm đã được thêm vào giỏ hàng",Toast.LENGTH_SHORT).show();
//                dialog.cancel();
//            }
//        });
//        dialog.show();
//    }




}