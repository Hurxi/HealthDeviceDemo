package com.example.user.healthdevicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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

public class MainActivity extends AppCompatActivity {
    List<DeviceResponse.DataBean> dataList;
    ListView lv;
    DeviceLVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        dataList=new ArrayList<>();

        adapter=new DeviceLVAdapter(this,dataList);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //list View的item点击监听
                switch (position){
                    case 0:
                    {
                        Intent intent=new Intent(MainActivity.this,TempertureActivity.class);
                        startActivity(intent);
                    }
                    break;
                    case 1:
                        //跳血氧仪
                    {
                        Intent intent=new Intent(MainActivity.this,OximeterActivity.class);
                        startActivity(intent);
                    }
                        break;
                    case 2:
                    {
                        //电子血压仪
                        Intent intent=new Intent(MainActivity.this,EletornicActivity.class);
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
                        Log.d("MainActivity",s);
                    }
                });
    }


}
