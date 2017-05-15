package com.example.user.healthdevicedemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.user.healthdevicedemo.adapter.MyCityLVAdapter;
import com.example.user.healthdevicedemo.bean.CityResponse;
import com.example.user.healthdevicedemo.bean.DeviceResponse;
import com.example.user.healthdevicedemo.bean.RepairResponse;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by 若希 on 2017/4/18.
 */

public class MyFragment2 extends Fragment {
    ListView lvCity;
    List<RepairResponse.ResultBean> dataList;
    MyCityLVAdapter adapter;
//    ListView lvCity;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //通过布局文件 创建要给该fragment的view
        View view=inflater.inflate(R.layout.fragment_my2,container,false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lvCity=(ListView) view.findViewById(R.id.lv_city);
        dataList=new ArrayList<>();
        adapter=new MyCityLVAdapter(getContext(),dataList);
        lvCity.setAdapter(adapter);
        getData();
    }

    private void getData() {
        OkGo.get("http://v.juhe.cn/WNXG/selectRepair")
                .tag(this)
                .params("key","68c18352401ffe19822bbd660107fb25")
                .params("cityCode","suzhou")
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
//                        Gson gson=new Gson();
//                        CityResponse cityResponse=gson.fromJson(s,CityResponse.class);
//                        cityResponse.getError_code();
//                        cityResponse.getReason();
//
////                        deviceResponse.getDes();
////                        dataList=deviceResponse.getData();两个集合不能直接画等号 有可能会拿不到值
//
//
//
//                        dataList.addAll((Collection<? extends CityResponse.ResultBean>) cityResponse.getResult());//是一个集合
//                        adapter.notifyDataSetChanged();
//                        CityResponse cityResponse ;
//                      String a =    cityResponse.getResult().get上海();
                        Gson gson=new Gson();
                        RepairResponse reResponse=gson.fromJson(s,RepairResponse.class);
                        dataList.addAll(reResponse.getResult());
                        adapter.notifyDataSetChanged();
                    }
                });
    }
}
