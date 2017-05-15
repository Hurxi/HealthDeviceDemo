package com.example.user.healthdevicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.healthdevicedemo.bean.RegResponse;
import com.example.user.healthdevicedemo.utils.UrlUtil;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class RegActivity extends AppCompatActivity {
    EditText etPhone,etPwd,etPwd2;
    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        etPhone=(EditText)findViewById(R.id.et_reg_user_name);
        etPwd=(EditText)findViewById(R.id.et_reg_pwd);
        etPwd2=(EditText)findViewById(R.id.et_reg_pwd2);
        btnReg=(Button)findViewById(R.id.btn_reg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regist();
            }
        });
    }

    private void regist() {
        String phone=etPhone.getText().toString();
        String pwd1=etPwd.getText().toString();
        String pwd2=etPwd2.getText().toString();
        if(phone.equals("")||pwd1.equals("")||pwd2.equals("")){
            Toast.makeText(RegActivity.this,"账号或密码不能为空",Toast.LENGTH_SHORT).show();
        }
        else {
            if(!pwd1.equals(pwd2)){
                Toast.makeText(RegActivity.this,"两次密码不一致",Toast.LENGTH_SHORT).show();
            }
            else{
                //输入无误 去请求服务端注册接口
                OkGo.post(UrlUtil.REGIST)
                        .tag(this)
                        .params("phone",phone)
                        .params("password",pwd1)
                        .execute(new StringCallback() {
                            @Override
                            public void onSuccess(String s, Call call, Response response) {
                                Gson gson=new Gson();
                                RegResponse regResponse=gson.fromJson(s,RegResponse.class);
                                int status=regResponse.getStatus();
                                String des=regResponse.getDes();
                                if(status==1){
                                    Intent intent=new Intent(RegActivity.this,LoginActivity.class);
                                    startActivity(intent);

                                }
                                Toast.makeText(RegActivity.this,des,Toast.LENGTH_SHORT).show();
                                Log.d("RegActivity",s);
                            }
                        });
            }
        }
    }
}
