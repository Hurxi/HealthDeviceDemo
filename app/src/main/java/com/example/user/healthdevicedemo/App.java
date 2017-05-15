package com.example.user.healthdevicedemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.lzy.okgo.OkGo;

/**
 * Created by user on 2017/4/14.
 */

public class App extends Application {
    //会在应用启动时立即调用 做初始化工作 需要在manifest中设置那么属性

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化OKGO框架
        OkGo.init(this);
        //可以额外设置OKGO属性  比如 超时 缓存
        Fresco.initialize(this);//初始化Fresco框架
    }
}
