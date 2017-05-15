package com.example.user.healthdevicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.lzy.okgo.OkGo;

public class EletornicActivity extends AppCompatActivity {
    EditText etEle;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eletornic);
        etEle=(EditText)findViewById(R.id.et_electornic);
        btnSend=(Button)findViewById(R.id.btn_ele_send);
//        btnSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String ele=etEle.getText().toString();
//                OkGo.post(UrlUtil.UP_HEALTH)
//                        .tag(this)
//                        .
//            }
//        });

    }
}
