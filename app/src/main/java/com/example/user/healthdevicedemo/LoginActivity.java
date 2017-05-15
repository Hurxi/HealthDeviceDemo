package com.example.user.healthdevicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.healthdevicedemo.bean.UserInfo;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etUserName,etPwd;
    Button btnLogin,btnRegist;
    SimpleDraweeView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=(EditText)findViewById(R.id.et_user_name);
        etPwd=(EditText)findViewById(R.id.et_pwd);
        btnLogin=(Button)findViewById(R.id.btn_login);
        btnRegist=(Button)findViewById(R.id.btn_regist);
        pic=(SimpleDraweeView)findViewById(R.id.pic);
        pic.setImageURI("http://115.159.75.231/upload/device/20160820150015.jpg");
        btnLogin.setOnClickListener(this);
        btnRegist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                login();
                break;
            case R.id.btn_regist:
                regist();
                break;
        }
    }

    private void regist() {
        //做注册操作
        Intent intent=new Intent(LoginActivity.this,RegActivity.class);
        startActivity(intent);
    }

    private void login() {
        //做登录操作 OKGO请求相关接口
        //http://115.159.75.231/api.php?a=Home&f=login
        String phone=etUserName.getText().toString();
        String password=etPwd.getText().toString();
        OkGo.post("http://115.159.75.231/api.php?a=Home&f=login")//请求方式post 请求地址
                .tag(this)
                .params("phone",phone)
                .params("password",password)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        //请求成功后的回调方法 请求成功后会进入到此方法
                        //把所有值用字符串返回
                        Gson gson=new Gson();
                        UserInfo user=gson.fromJson(s,UserInfo.class);
                        int status=user.getStatus();
                        String des=user.getDes();
                        if(status==1){
                            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);

                        }
                        Toast.makeText(LoginActivity.this,des,Toast.LENGTH_SHORT).show();
                        Log.e("LoginActivity",s);
                    }

                             @Override
                             public void onError(Call call, Response response, Exception e) {
                                 super.onError(call, response, e);
                                 //当请求地址错误时调用
                             }
                         }
                );
    }
}
