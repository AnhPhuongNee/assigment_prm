package com.example.assigment_pcm.activity;


import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;

public interface ApiBanThuoc {
    @GET("getmedicine.php")
    Observable<ThuocModel> getMedicine();
}
