package com.example.user.healthdevicedemo.bean;

import java.util.List;

/**
 * Created by 若希 on 2017/4/18.
 */

public class RepairResponse {

    /**
     * reason : 查询成功
     * result : [{"price":"面议","rid":1009,"name":"开锁换锁"},{"price":"面议","rid":1001,"name":"灯具电路维修"},{"price":"面议","rid":1002,"name":"水龙头管件维修安装  "},{"price":"面议","rid":1003,"name":"卫浴洁具维修"},{"price":"面议","rid":1004,"name":"打孔管道疏通维修"},{"price":"面议","rid":1005,"name":"门窗家具维修"},{"price":"面议","rid":1006,"name":"墙面地面维修"},{"price":"面议","rid":1007,"name":"家电维修安装"},{"price":"面议","rid":1008,"name":"家居建材安装"},{"price":"面议","rid":1011,"name":"投影仪"}]
     * error_code : 0
     */

    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * price : 面议
         * rid : 1009
         * name : 开锁换锁
         */

        private String price;
        private int rid;
        private String name;

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public int getRid() {
            return rid;
        }

        public void setRid(int rid) {
            this.rid = rid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
