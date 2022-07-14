package com.example.assigment_pcm.activity;

import java.io.Serializable;

public class Thuoc implements Serializable {
    int id;
    String tensp;
    String hinhanh;
    String gia;
    String mota;

    public Thuoc(int id, String tensp, String hinhanh, String gia, String mota) {
        this.id = id;
        this.tensp = tensp;
        this.hinhanh = hinhanh;
        this.gia = gia;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
