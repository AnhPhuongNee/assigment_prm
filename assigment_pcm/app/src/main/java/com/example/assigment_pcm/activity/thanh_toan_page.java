package com.example.assigment_pcm.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assigment_pcm.R;

public class thanh_toan_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanh_toan_page);

        Button btndathang = findViewById(R.id.btndathang);
        btndathang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dathang();
            }
        });
    }

    private void dathang(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dat_hang_dialog);
        Window window = dialog.getWindow();
        if(window == null){
            return;
        }

        window.setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);

        Button btncontinues = dialog.findViewById(R.id.tieptuc);
        btncontinues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), navigationbar.class);
                startActivity(intent);
            }
        });
        Button btndoncuatoi = dialog.findViewById(R.id.gotosoncuaban);
        btndoncuatoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), don_cua_toi45.class);
                startActivity(intent);
            }
        });
        dialog.show();
    }
}