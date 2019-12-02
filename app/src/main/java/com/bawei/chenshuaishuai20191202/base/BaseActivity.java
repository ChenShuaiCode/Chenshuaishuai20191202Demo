package com.bawei.chenshuaishuai20191202.base;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(layoutid());
        initview();
        initdata();

    }

    protected abstract void initdata();

    protected abstract void initview();

    protected abstract int layoutid();




    public boolean hasnet(Context context){
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo!=null&&activeNetworkInfo.isAvailable()){
            return true;
        }else {
            return false;
        }
    }
}
