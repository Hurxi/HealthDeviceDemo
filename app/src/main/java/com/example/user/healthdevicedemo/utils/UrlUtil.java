package com.example.user.healthdevicedemo.utils;

/**
 * Created by user on 2017/4/14.
 */

public class UrlUtil {
    //用常量存放 主机地址
    public static final String HOST="http://115.159.75.231";
    //接口地址
    public static final String LOGIN=HOST+"/api.php?a=Home&f=login";
    public static final String REGIST=HOST+"/api.php?a=Home&f=reg";
    public static final String DEVICE_LIST=HOST+"/api.php?a=Device&f=get_list";
    public static final String UP_HEALTH=HOST+"/api.php?a=Device&f=up_health";
    public static final String GET_HEALTH=HOST+"/api.php?a=Device&f=parameter_data";
}
