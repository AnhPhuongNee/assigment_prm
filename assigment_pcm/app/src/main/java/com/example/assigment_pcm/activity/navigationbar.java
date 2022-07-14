package com.example.assigment_pcm.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.assigment_pcm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class navigationbar extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    home mhome = new home();
    giohangfragment giohangFragment = new giohangfragment();
    SupportFragment supportFragment = new SupportFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationbar);

        bottomNavigationView = findViewById(R.id.buttomNavigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, mhome).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_home:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,mhome)
                                .commit();
                        return true;
                    case R.id.ic_giohang:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,giohangFragment)
                                .commit();
                        return true;
                    case R.id.ic_hotro:
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container,supportFragment)
                                .commit();
                        return true;
                }
                return false;
            }
        });
    }
}