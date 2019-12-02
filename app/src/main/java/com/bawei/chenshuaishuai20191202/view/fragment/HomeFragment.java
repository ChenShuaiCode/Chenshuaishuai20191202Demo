package com.bawei.chenshuaishuai20191202.view.fragment;

import android.view.View;
import android.widget.Button;

import com.bawei.chenshuaishuai20191202.R;
import com.bawei.chenshuaishuai20191202.base.BaseFragment;
import com.bawei.chenshuaishuai20191202.view.activity.MainActivity;

public class HomeFragment extends BaseFragment {

    private Button tiao;

    @Override
    protected void initview(View inflate) {
        tiao = (Button) inflate.findViewById(R.id.tiao);
        tiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.jump();
            }
        });

    }

    @Override
    protected int layoutid() {
        return R.layout.home_fragment_layout;
    }

    @Override
    protected void initdata() {

    }
}
