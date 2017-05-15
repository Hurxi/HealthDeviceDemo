package com.example.user.healthdevicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.user.healthdevicedemo.adapter.DeviceLVAdapter;
import com.example.user.healthdevicedemo.bean.DeviceResponse;
import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by 若希 on 2017/4/18.
 */

public class MyFragment1 extends Fragment {
    ListView lv;
    DeviceLVAdapter adapter;
    List<DeviceResponse.DataBean> dataList;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //通过布局文件 创建要给该fragment的view
        View view=inflater.inflate(R.layout.fragment_my1,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //View 创建完毕后执行的方法
        super.onViewCreated(view, savedInstanceState);
        lv= (ListView) view.findViewById(R.id.lv_device);
        dataList=new ArrayList<>();
        adapter=new DeviceLVAdapter(getContext(),dataList);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //list View的item点击监听
                Toast.makeText(getContext(),"dianji",Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                    {
                        Intent intent=new Intent(getContext(),TempertureActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case 1:
                        //跳血氧仪
                    {
                        Intent intent=new Intent(getContext(),OximeterActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case 2:
                    {
                        //电子血压仪
                        Intent intent=new Intent(getContext(),EletornicActivity.class);
                        startActivity(intent);

                    }
                    break;
                }

            }
        });
        getData();
    }
    private void getData() {
        OkGo.get(UrlUtil.DEVICE_LIST)
                .tag(this)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Gson gson=new Gson();
                        DeviceResponse deviceResponse=gson.fromJson(s,DeviceResponse.class);
                        deviceResponse.getStatus();
                        deviceResponse.getDes();
//                        dataList=deviceResponse.getData();两个集合不能直接画等号 有可能会拿不到值

                        dataList.addAll(deviceResponse.getData());//是一个集合
                        adapter.notifyDataSetChanged();
//                        dataList.get(0).getName();
//                        dataList.get(0).getPic();
//                        Log.d("MainActivity",s);
                    }
                });
    }
}
