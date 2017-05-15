package com.example.user.healthdevicedemo.bean;

import java.util.List;

/**
 * Created by 若希 on 2017/4/17.
 */

public class TemperGet {

    /**
     * status : 1
     * des : 获取成功！
     * data : [{"id":"397","uid":"267","device_id":"12","p_id":"18","value":"38","day":"20170417","addtime":"2017-04-17 10:21:57","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低热"},{"id":"396","uid":"267","device_id":"12","p_id":"18","value":"38","day":"20170417","addtime":"2017-04-17 10:20:44","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低热"},{"id":"395","uid":"267","device_id":"12","p_id":"18","value":"38","day":"20170417","addtime":"2017-04-17 10:18:34","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低热"},{"id":"394","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:32","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"393","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:32","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"392","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:31","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"391","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:31","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"390","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:27","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"389","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:27","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"388","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:26","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"387","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:16:25","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"386","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:13:43","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"385","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:13:40","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"384","uid":"267","device_id":"12","p_id":"18","value":"38","day":"20170417","addtime":"2017-04-17 10:12:31","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低热"},{"id":"383","uid":"267","device_id":"12","p_id":"18","value":"28","day":"20170417","addtime":"2017-04-17 10:12:20","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"382","uid":"267","device_id":"12","p_id":"18","value":"42","day":"20170417","addtime":"2017-04-17 10:09:26","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"超高热"},{"id":"381","uid":"267","device_id":"12","p_id":"18","value":"~!@","day":"20170417","addtime":"2017-04-17 10:08:55","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"无"},{"id":"380","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:08:51","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"379","uid":"267","device_id":"12","p_id":"18","value":"abcd","day":"20170417","addtime":"2017-04-17 10:08:41","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"无"},{"id":"378","uid":"267","device_id":"12","p_id":"18","value":"36","day":"20170417","addtime":"2017-04-17 10:08:30","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"377","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170417","addtime":"2017-04-17 10:02:03","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"376","uid":"267","device_id":"12","p_id":"18","value":"19","day":"20170417","addtime":"2017-04-17 10:01:42","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"373","uid":"267","device_id":"12","p_id":"18","value":"36","day":"20170327","addtime":"2017-03-28 16:02:01","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"372","uid":"267","device_id":"12","p_id":"18","value":"36","day":"20170327","addtime":"2017-03-28 16:01:58","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"371","uid":"267","device_id":"12","p_id":"18","value":"35","day":"20170327","addtime":"2017-03-28 16:01:52","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"370","uid":"267","device_id":"12","p_id":"18","value":"39","day":"20170327","addtime":"2017-03-28 16:01:44","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"中等度热"},{"id":"369","uid":"267","device_id":"12","p_id":"18","value":"33.3","day":"20170328","addtime":"2017-03-28 16:01:32","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"368","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170328","addtime":"2017-03-28 15:12:52","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"367","uid":"267","device_id":"12","p_id":"18","value":"33","day":"20170328","addtime":"2017-03-28 15:12:47","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"366","uid":"267","device_id":"12","p_id":"18","value":"39.1","day":"20170328","addtime":"2017-03-28 15:12:40","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"无"},{"id":"365","uid":"267","device_id":"12","p_id":"18","value":"37.2","day":"20170328","addtime":"2017-03-28 15:12:33","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"364","uid":"267","device_id":"12","p_id":"18","value":"37.1","day":"20170328","addtime":"2017-03-28 15:12:29","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"363","uid":"267","device_id":"12","p_id":"18","value":"42.6","day":"20170328","addtime":"2017-03-28 15:12:20","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"超高热"},{"id":"362","uid":"267","device_id":"12","p_id":"18","value":"41.0","day":"20170328","addtime":"2017-03-28 15:12:12","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"高热"},{"id":"361","uid":"267","device_id":"12","p_id":"18","value":"42.7","day":"20170328","addtime":"2017-03-28 15:12:05","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"超高热"},{"id":"360","uid":"267","device_id":"12","p_id":"18","value":"39.9","day":"20170328","addtime":"2017-03-28 15:11:57","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"高热"},{"id":"359","uid":"267","device_id":"12","p_id":"18","value":"34.8","day":"20170328","addtime":"2017-03-28 15:11:50","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"358","uid":"267","device_id":"12","p_id":"18","value":"38.1","day":"20170328","addtime":"2017-03-28 15:11:42","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"无"},{"id":"357","uid":"267","device_id":"12","p_id":"18","value":"35.9","day":"20170328","addtime":"2017-03-28 15:11:34","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"},{"id":"356","uid":"267","device_id":"12","p_id":"18","value":"38.2","day":"20170328","addtime":"2017-03-28 15:11:26","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"中等度热"},{"id":"355","uid":"267","device_id":"12","p_id":"18","value":"36.7","day":"20170328","addtime":"2017-03-28 15:11:17","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"354","uid":"267","device_id":"12","p_id":"18","value":"39","day":"20170328","addtime":"2017-03-28 15:11:07","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"中等度热"},{"id":"353","uid":"267","device_id":"12","p_id":"18","value":"38","day":"20170328","addtime":"2017-03-28 15:11:02","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低热"},{"id":"352","uid":"267","device_id":"12","p_id":"18","value":"37","day":"20170328","addtime":"2017-03-28 15:10:55","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"正常"},{"id":"351","uid":"267","device_id":"12","p_id":"18","value":"36","day":"20170328","addtime":"2017-03-28 15:10:47","device_name":"红外体温计BLIR-3","p_cn":"温度","health_title":"低体温"}]
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
         * id : 397
         * uid : 267
         * device_id : 12
         * p_id : 18
         * value : 38
         * day : 20170417
         * addtime : 2017-04-17 10:21:57
         * device_name : 红外体温计BLIR-3
         * p_cn : 温度
         * health_title : 低热
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
