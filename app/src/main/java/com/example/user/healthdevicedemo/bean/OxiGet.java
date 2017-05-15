package com.example.user.healthdevicedemo.bean;

import java.util.List;

/**
 * Created by 若希 on 2017/4/17.
 */

public class OxiGet {

    /**
     * status : 1
     * des : 获取成功！
     * data : [{"id":"399","uid":"267","device_id":"10","p_id":"11","value":"20","day":"20170417","addtime":"2017-04-17 10:35:06","device_name":"血氧仪","p_cn":"血氧浓度","health_title":"低血氧症"},{"id":"398","uid":"267","device_id":"10","p_id":"11","value":"20","day":"20170417","addtime":"2017-04-17 10:31:32","device_name":"血氧仪","p_cn":"血氧浓度","health_title":"低血氧症"}]
     */

    private int status;
    private String des;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 399
         * uid : 267
         * device_id : 10
         * p_id : 11
         * value : 20
         * day : 20170417
         * addtime : 2017-04-17 10:35:06
         * device_name : 血氧仪
         * p_cn : 血氧浓度
         * health_title : 低血氧症
         */

        private String id;
        private String uid;
        private String device_id;
        private String p_id;
        private String value;
        private String day;
        private String addtime;
        private String device_name;
        private String p_cn;
        private String health_title;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public String getP_id() {
            return p_id;
        }

        public void setP_id(String p_id) {
            this.p_id = p_id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }

        public String getDevice_name() {
            return device_name;
        }

        public void setDevice_name(String device_name) {
            this.device_name = device_name;
        }

        public String getP_cn() {
            return p_cn;
        }

        public void setP_cn(String p_cn) {
            this.p_cn = p_cn;
        }

        public String getHealth_title() {
            return health_title;
        }

        public void setHealth_title(String health_title) {
            this.health_title = health_title;
        }
    }
}
