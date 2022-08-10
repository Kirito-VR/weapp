package com.example.weapp.bean;

public class OrderInfo {// 订单详情表
    private String orderinfo_id;//序号，原来当主键
    private String orderinfo_gid;// 商品编号
    private String orderinfo_oid;// 订单编号
    private Double orderinfo_price;// 商品价格
    private int orderinfo_count;// 商品数量
    private String orderinfo_name;// 商品名称

    public String getOrderinfo_id() {
        return orderinfo_id;
    }

    public void setOrderinfo_id(String orderinfo_id) {
        this.orderinfo_id = orderinfo_id;
    }

    public String getOrderinfo_gid() {
        return orderinfo_gid;
    }

    public void setOrderinfo_gid(String orderinfo_gid) {
        this.orderinfo_gid = orderinfo_gid;
    }

    public String getOrderinfo_oid() {
        return orderinfo_oid;
    }

    public void setOrderinfo_oid(String orderinfo_oid) {
        this.orderinfo_oid = orderinfo_oid;
    }

    public Double getOrderinfo_price() {
        return orderinfo_price;
    }

    public void setOrderinfo_price(Double orderinfo_price) {
        this.orderinfo_price = orderinfo_price;
    }

    public int getOrderinfo_count() {
        return orderinfo_count;
    }

    public void setOrderinfo_count(int orderinfo_count) {
        this.orderinfo_count = orderinfo_count;
    }

    public String getOrderinfo_name() {
        return orderinfo_name;
    }

    public void setOrderinfo_name(String orderinfo_name) {
        this.orderinfo_name = orderinfo_name;
    }
}
