package com.bawei.chenshuaishuai20191202.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;
import android.widget.RadioGroup;

import com.bawei.chenshuaishuai20191202.R;
import com.bawei.chenshuaishuai20191202.base.BaseActivity;
import com.bawei.chenshuaishuai20191202.view.fragment.HomeFragment;
import com.bawei.chenshuaishuai20191202.view.fragment.MyFragment;
import com.bawei.chenshuaishuai20191202.view.fragment.NewsFragment;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {
    private ArrayList<Fragment> list;
    private ViewPager viewPager;
    private RadioGroup radioGroup;


    @Override
    protected void initdata() {
        list=new ArrayList<>();
        list.add(new HomeFragment());
        list.add(new NewsFragment());
        list.add(new MyFragment());


        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }
            @Override
            public int getCount() {
                return list.size();
            }
        });
    }

    @Override
    protected void initview() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        radioGroup = (RadioGroup) findViewById(R.id.radiogrpup);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                switch (position%list.size()){
                    case 0:
                        radioGroup.check(R.id.btn_1);
                        break;
                    case 1:
                        radioGroup.check(R.id.btn_2);
                        break;
                    case 2:
                        radioGroup.check(R.id.btn_3);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.btn_1:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.btn_2:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.btn_3:
                        viewPager.setCurrentItem(2);
                        break;
                }
            }
        });


    }

    @Override
    protected int layoutid() {
        return R.layout.activity_main;
    }
    public void jump(){
        viewPager.setCurrentItem(1);
    }
}
