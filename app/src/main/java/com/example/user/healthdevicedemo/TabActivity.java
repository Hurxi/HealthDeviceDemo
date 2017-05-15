package com.example.user.healthdevicedemo;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.user.healthdevicedemo.adapter.MyVPAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager vp;
    List<Fragment> fragments;
    Button btn1,btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        vp=(ViewPager)findViewById(R.id.vp);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        fragments=new ArrayList<>();
        fragments.add(new MyFragment1());
        fragments.add(new MyFragment2());
        fragments.add(new MyFragment3());
        vp.setAdapter(new MyVPAdapter(getSupportFragmentManager(),fragments));
        //页面切换的监听
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                Log.e("onPageScrolled",position+"  "+positionOffset+"  "+positionOffsetPixels);
//                Log.e("dddd", "onPageScrolled: "+position+"..."+positionOffset);
            }

            @Override
            public void onPageSelected(int position) {
                //position为当前选中界面的位置
                switch (position){
                    case 0: {
                        btn1.setText("BTN1");
                        btn2.setText("按钮2");
                        btn3.setText("按钮3");
                    }
                    break;
                    case 1: {
                        btn2.setText("BTN2");
                        btn1.setText("按钮1");
                        btn3.setText("按钮3");
                    }
                    break;
                    case 2: {
                        btn3.setText("BTN3");
                        btn1.setText("按钮1");
                        btn2.setText("按钮2");
                    }
                    break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e("ccccc", "onPageScrollStateChanged: "+state);
            }

        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                //切换至页面1
            {
                vp.setCurrentItem(0);
            }
                break;
            case R.id.btn2:
                //切换至页面2
            {
                vp.setCurrentItem(1);
            }
                break;
            case R.id.btn3:
                //切换至页面3
            {
                vp.setCurrentItem(2);
            }
                break;
        }
    }
}
