package com.cyj.a20181223_02_gradlelibrary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvent();
    public abstract void setValues();
    public abstract void bindViews();

}
