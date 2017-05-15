package com.example.user.healthdevicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.healthdevicedemo.bean.TemperGet;
import com.example.user.healthdevicedemo.bean.TemperResponse;
import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class TempertureActivity extends AppCompatActivity {
    EditText etTemperture;
    Button btnSend,btnGet;
    TextView tvTemper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperture);
        etTemperture=(EditText)findViewById(R.id.et_temperture);
        btnSend=(Button)findViewById(R.id.btn_send);
        btnGet=(Button)findViewById(R.id.btn_get_temper);
        tvTemper=(TextView)findViewById(R.id.tv_temper);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OkGo.post(UrlUtil.GET_HEALTH)
                        .tag(this)
                        .params("uid","267")
                        .params("p_id","18")
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                Log.d("onsuccess",s);
                                Gson gson=new Gson();
                                TemperGet tg=gson.fromJson(s,TemperGet.class);
                                tvTemper.setText(tg.getDes()+tg.getStatus()+tg.getData().get(0).getValue());
                            }
                        });
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //上传用户输入的温度
                String temper=etTemperture.getText().toString();
                OkGo.post(UrlUtil.UP_HEALTH)
                        .tag(this)
                        .params("uid","267")
                        .params("device_id","12")
                        .params("p_id","18")
                        .params("value",temper)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                Log.d("onSuccess",s);
                                //使用Gson解析 服务端返回的内容
                                Gson gson=new Gson();
                                TemperResponse tp=gson.fromJson(s, TemperResponse.class);
                                Toast.makeText(TempertureActivity.this,tp.getDes(),Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        });
            }
        });
    }
}
