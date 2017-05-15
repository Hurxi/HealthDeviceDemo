package com.example.user.healthdevicedemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.healthdevicedemo.R;
import com.example.user.healthdevicedemo.bean.CityResponse;
import com.example.user.healthdevicedemo.bean.RepairResponse;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by 若希 on 2017/4/18.
 */

public class MyCityLVAdapter extends BaseAdapter {
    Context context;
    List<RepairResponse.ResultBean> dataList;

    public MyCityLVAdapter(Context context, List<RepairResponse.ResultBean> dataList) {
        this.context = context;
        this.dataList = dataList;
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
        View view= LayoutInflater.from(context).inflate(R.layout.item_city,parent,false);
        TextView tvName= (TextView) view.findViewById(R.id.tv_item_name);
        TextView tvPrice=(TextView)view.findViewById(R.id.tv_item_price);
        tvName.setText(dataList.get(position).getName());
        tvPrice.setText(dataList.get(position).getPrice());
        return view;
    }
}
