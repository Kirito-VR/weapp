package com.example.weapp.bean;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 14:31
 * @Version 1.0
 */
public class Order {
    private String order_id;// 订单编号
    private String order_uid;// 用户编号
    private Double order_Trademoney;// 付款金额
    private String order_Tradeld;// 交易编号
    private int status;// 订单状态

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_uid() {
        return order_uid;
    }

    public void setOrder_uid(String order_uid) {
        this.order_uid = order_uid;
    }

    public Double getOrder_Trademoney() {
        return order_Trademoney;
    }

    public void setOrder_Trademoney(Double order_Trademoney) {
        this.order_Trademoney = order_Trademoney;
    }

    public String getOrder_Tradeld() {
        return order_Tradeld;
    }

    public void setOrder_Tradeld(String order_Tradeld) {
        this.order_Tradeld = order_Tradeld;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
