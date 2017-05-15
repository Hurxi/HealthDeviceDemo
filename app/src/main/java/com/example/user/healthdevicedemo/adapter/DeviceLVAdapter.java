package com.example.user.healthdevicedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.healthdevicedemo.R;
import com.example.user.healthdevicedemo.bean.DeviceResponse;
import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by user on 2017/4/14.
 */

public class DeviceLVAdapter extends BaseAdapter {
    Context context;
    List<DeviceResponse.DataBean> dataList;
    public DeviceLVAdapter(Context context, List<DeviceResponse.DataBean> dataList){
        this.context=context;
        this.dataList=dataList;
    }



    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_device,parent,false);
        SimpleDraweeView iv= (SimpleDraweeView) view.findViewById(R.id.iv_item_device);
        TextView tvName= (TextView) view.findViewById(R.id.tv_item_name);
        TextView tvDes= (TextView) view.findViewById(R.id.tv_item_des);
//        iv.setImageResource(R.mipmap.ic_launcher);
        iv.setImageURI(UrlUtil.HOST+dataList.get(position).getPic().substring(1));
        tvName.setText(dataList.get(position).getName());
        tvDes.setText(dataList.get(position).getDesc());
        return view;
    }
}
