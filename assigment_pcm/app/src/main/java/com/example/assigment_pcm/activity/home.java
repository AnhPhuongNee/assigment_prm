package com.example.assigment_pcm.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.example.assigment_pcm.R;
import java.util.ArrayList;
import java.util.List;



import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import me.relex.circleindicator.CircleIndicator;

public class home extends Fragment {

    private ViewPager viewPager;
    private CircleIndicator circleIndicator;
    private  photoAdaptor photoAdaptor;
    RecyclerView rcvmanghinhchinh;
    LinearLayout btndoncuatoi;
    List<Thuoc> mangThuoc;
    ThuocAdapter spAdapter;
    ApiBanThuoc apiBanThuoc;

    CompositeDisposable compositeDisposable = new CompositeDisposable();


    public home() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        apiBanThuoc = RetrofitClient.getInstance(Utils.BASE_URL).create(ApiBanThuoc.class);

        viewPager = view.findViewById(R.id.viewpaper);
        circleIndicator = view.findViewById(R.id.circle);

        photoAdaptor = new photoAdaptor( view.getContext(), getListPhoto());
        viewPager.setAdapter(photoAdaptor);

        circleIndicator.setViewPager(viewPager);
        photoAdaptor.registerDataSetObserver(circleIndicator.getDataSetObserver());

        LinearLayout  btntimnhathuoc = view.findViewById(R.id.btntim_nha_thuoc);
        btntimnhathuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( view.getContext(),MapsActivity.class);
                startActivity(intent);
            }
        });

        btndoncuatoi = view.findViewById(R.id.don_cua_toi);
        btndoncuatoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),don_cua_toi45.class);
                startActivity(intent);
            }
        });

        rcvmanghinhchinh = view.findViewById(R.id.rcv_manhinhchinh);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(view.getContext(),2);
        rcvmanghinhchinh.setLayoutManager(layoutManager);
        rcvmanghinhchinh.setHasFixedSize(true);
        mangThuoc = new ArrayList<>();
        getThuoc();

        return view;
    }

    private void getThuoc(){
        compositeDisposable.add(apiBanThuoc.getMedicine()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        thuocModel -> {
                            if(thuocModel.isSuccess()){
                                mangThuoc = thuocModel.getResult();
                                spAdapter = new ThuocAdapter(this.getContext(), mangThuoc);
                                rcvmanghinhchinh.setAdapter(spAdapter);
                            }
                        },
                        throwable -> {
                            Toast.makeText(this.getContext(),""+throwable.getMessage(), Toast.LENGTH_LONG).show();
                        }

                ));
    }


    private List<photo> getListPhoto(){
        List<photo> List = new ArrayList<>();
        List.add(new photo(R.drawable.detailsale));
        List.add(new photo(R.drawable.detailsale2));
        List.add(new photo(R.drawable.ima3));
        List.add(new photo(R.drawable.ima4));
        List.add(new photo(R.drawable.ima5));
        return List;
    }


}