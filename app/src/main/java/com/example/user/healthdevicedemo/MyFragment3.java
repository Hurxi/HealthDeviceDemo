package com.example.user.healthdevicedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 若希 on 2017/4/18.
 */

public class MyFragment3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //通过布局文件 创建要给该fragment的view
        View view=inflater.inflate(R.layout.fragment_my3,container,false);

        return view;
    }
}
