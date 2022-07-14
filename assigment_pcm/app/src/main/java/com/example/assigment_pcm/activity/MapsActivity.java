package com.example.assigment_pcm.activity;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.example.assigment_pcm.R;
import com.example.assigment_pcm.databinding.ActivityMaps3Binding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps3Binding binding;

    private final LatLng LC1 = new LatLng(10.790425, 106.688791);
    private final LatLng LC2 = new LatLng(10.736759, 106.718017);
    private final LatLng LC3 = new LatLng(10.848219, 106.806450);
    private final LatLng LC4 = new LatLng(10.848709, 106.808430);
    private final LatLng LC5 = new LatLng(10.848209, 106.809401);
    private final LatLng LC6 = new LatLng(10.845332, 106.808387);
    private final LatLng LC7 = new LatLng(10.843931, 106.808028);
    private final LatLng LC8 = new LatLng(10.844557, 106.810479);
    private final LatLng LC9 = new LatLng(10.840975, 106.813322);

    private Marker markerLC1;
    private Marker markerLC2;
    private Marker markerLC3;
    private Marker markerLC4;
    private Marker markerLC5;
    private Marker markerLC6;
    private Marker markerLC7;
    private Marker markerLC8;
    private Marker markerLC9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.google_maps);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng fpt = new LatLng(10.841318, 106.809880);
        mMap.addMarker(new MarkerOptions().position(fpt).title("FPT UNIVERSITY"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fpt));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));

        markerLC1 = mMap.addMarker(new MarkerOptions().position(LC1).title("Nhà Thuốc FPT Long Châu").snippet("1286 Đ. Nguyễn Duy Trinh, Long Trường, Thành phố Thủ Đức, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC1.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC1.setTag(0);
        markerLC2 = mMap.addMarker(new MarkerOptions().position(LC2).title("Nhà Thuốc Tây Ánh Hạ").snippet("RRF5+758, Võ Văn Hát, Long Trường, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC2.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC2.setTag(0);
        markerLC3 = mMap.addMarker(new MarkerOptions().position(LC3).title("Nhà Thuốc Hoàng Châu").snippet("số 1 Đường Lò Lu, Trường Thạnh, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC3.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC3.setTag(0);
        markerLC4 = mMap.addMarker(new MarkerOptions().position(LC4).title("Nhà Thuốc Hải Đăng").snippet("250 Lã Xuân Oai, Long Trường, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC4.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC4.setTag(0);
        markerLC5 = mMap.addMarker(new MarkerOptions().position(LC5).title("Nhà Thuốc Tư Nhân Nhật Hiền").snippet("5 Đường Lò Lu, Trường Thạnh, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC5.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC5.setTag(0);
        markerLC6 = mMap.addMarker(new MarkerOptions().position(LC6).title("Nhà Thuốc Nguyên An").snippet("47 Đường Lò Lu, Trường Thạnh, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC6.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC6.setTag(0);
        markerLC7 = mMap.addMarker(new MarkerOptions().position(LC7).title("Nhà Thuốc An Khang").snippet("41 Đường Lò Lu, Trường Thạnh, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC7.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC7.setTag(0);
        markerLC8 = mMap.addMarker(new MarkerOptions().position(LC8).title("Nhà Thuốc Minh An").snippet("86A Lã Xuân Oai, Trường Thạnh, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC8.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC8.setTag(0);
        markerLC9 = mMap.addMarker(new MarkerOptions().position(LC9).title("Nhà Thuốc Phương Thảo 2").snippet("416 Lã Xuân Oai, Long Trường, Quận 9, Thành phố Hồ Chí Minh, Việt Nam"));
        markerLC9.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.eco1));
        markerLC9.setTag(0);
    }
}