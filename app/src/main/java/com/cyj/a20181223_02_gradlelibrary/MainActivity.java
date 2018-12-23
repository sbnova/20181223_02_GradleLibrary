package com.cyj.a20181223_02_gradlelibrary;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends BaseActivity {

    private android.widget.ImageView profileImgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvent();
        setValues();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {
        String iuProfileImageURL = "http://www.topstarnews.net/news/photo/201807/450297_101922_452.jpg";

        Glide.with(mContext).load(iuProfileImageURL).into(profileImgView);
    }

    @Override
    public void bindViews() {
        this.profileImgView = (ImageView) findViewById(R.id.profileImgView);
    }
}
