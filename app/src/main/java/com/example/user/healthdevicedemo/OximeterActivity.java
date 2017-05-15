package com.example.user.healthdevicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.healthdevicedemo.bean.OxiGet;
import com.example.user.healthdevicedemo.bean.OxiResponse;
import com.example.user.healthdevicedemo.bean.TemperGet;
import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class OximeterActivity extends AppCompatActivity {
    EditText etOxi;
    Button btnSend,btnGet;
    TextView tvOxi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oximeter);
        etOxi=(EditText)findViewById(R.id.et_oximeter);
        tvOxi=(TextView)findViewById(R.id.tv_oxi);
        btnSend=(Button)findViewById(R.id.btn_oxi_send);
        btnGet=(Button)findViewById(R.id.btn_get_oxi);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkGo.post(UrlUtil.GET_HEALTH)
                        .tag(this)
                        .params("uid","267")
                        .params("p_id","11")
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                Log.d("onsuccess",s);
                                Gson gson=new Gson();
                                OxiGet og=gson.fromJson(s,OxiGet.class);
                                tvOxi.setText(og.getDes()+og.getStatus()+og.getData().get(0).getValue());
                            }
                        });
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oxi=etOxi.getText().toString();
                OkGo.post(UrlUtil.UP_HEALTH)
                        .tag(this)
                        .params("uid","267")
                        .params("device_id","10")
                        .params("p_id","11")
                        .params("value",oxi)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                Log.d("onSuccess",s);
                                Gson gson=new Gson();
                                OxiResponse or=gson.fromJson(s,OxiResponse.class);
                                Toast.makeText(OximeterActivity.this,or.getDes(),Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        });
            }
        });

    }
}
