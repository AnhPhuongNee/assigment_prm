package com.example.assigment_pcm.activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.example.assigment_pcm.R;

import java.util.List;

public class photoAdaptor extends PagerAdapter {

    private Context mContext;
    private List<photo> mListPhoto;

    public photoAdaptor(Context mContext, List<photo> mListPhoto) {
        this.mContext = mContext;
        this.mListPhoto = mListPhoto;
    }
    public photoAdaptor( List<photo> mListPhoto) {
        this.mListPhoto = mListPhoto;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.item_detail,container,false);
        ImageView imageView = view.findViewById(R.id.imagedetail);

        photo mphoto = mListPhoto.get(position);
        if(mphoto != null){
            Glide.with(mContext).load(mphoto.getResourceID()).into(imageView);
        }
        container.addView(view);

        return view;
    }

    @Override
    public int getCount() {
        if(mListPhoto != null){
            return mListPhoto.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
