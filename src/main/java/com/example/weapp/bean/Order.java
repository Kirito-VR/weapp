package com.example.weapp.bean;

import java.util.Date;
import java.util.Objects;

/**
 * @Author: Cqmax
 * @Date: 2022/7/28 14:31
 * @Version 1.0
 */
public class Order {
    private int id;
    private int user_id;// 用户表的用户ID
    private String order_sn;// 订单编号
    private int order_status;// 订单状态
    private String consignee;// 收货人名称
    private String mobile;// 收货人手机号码
    private String address;// 收货人地址
    private String message;// 用户订单留言
    private double goods_price;// 商品总费用
    private double freight_price;// 配送费用
    private double coupon_price;// 优惠卷减免
    private double integral_price;//用户积分减免
    private double groupon_price;// 团购优惠价减免
    private double order_price;// 订单费用，=goods_price+freight_price-coupon_price
    private double actual_price;// 实付费用， = order_price - integral_price
    private String pay_id;// 微信付款编号
    private Date pay_time;// 微信付款时间
    private String ship_sn;// 发货编号
    private String ship_channel;// 发货快递公司
    private Date ship_time;// 发货开始时间
    private Date confirm_time;// 用户确认收货时间
    private int comments;// 待评价订单商品数量
    private Date end_time;// 订单关闭时间
    private int deleted;// 逻辑删除

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getOrder_sn() {
        return order_sn;
    }

    public void setOrder_sn(String order_sn) {
        this.order_sn = order_sn;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public double getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(double freight_price) {
        this.freight_price = freight_price;
    }

    public double getCoupon_price() {
        return coupon_price;
    }

    public void setCoupon_price(double coupon_price) {
        this.coupon_price = coupon_price;
    }

    public double getIntegral_price() {
        return integral_price;
    }

    public void setIntegral_price(double integral_price) {
        this.integral_price = integral_price;
    }

    public double getGroupon_price() {
        return groupon_price;
    }

    public void setGroupon_price(double groupon_price) {
        this.groupon_price = groupon_price;
    }

    public double getOrder_price() {
        return order_price;
    }

    public void setOrder_price(double order_price) {
        this.order_price = order_price;
    }

    public double getActual_price() {
        return actual_price;
    }

    public void setActual_price(double actual_price) {
        this.actual_price = actual_price;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public Date getPay_time() {
        return pay_time;
    }

    public void setPay_time(Date pay_time) {
        this.pay_time = pay_time;
    }

    public String getship_sn() {
        return ship_sn;
    }

    public void setship_sn(String ship_sn) {
        this.ship_sn = ship_sn;
    }

    public String getShip_channel() {
        return ship_channel;
    }

    public void setShip_channel(String ship_channel) {
        this.ship_channel = ship_channel;
    }

    public Date getShip_time() {
        return ship_time;
    }

    public void setShip_time(Date ship_time) {
        this.ship_time = ship_time;
    }

    public Date getConfirm_time() {
        return confirm_time;
    }

    public void setConfirm_time(Date confirm_time) {
        this.confirm_time = confirm_time;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && user_id == order.user_id && order_status == order.order_status && Double.compare(order.goods_price, goods_price) == 0 && Double.compare(order.freight_price, freight_price) == 0 && Double.compare(order.coupon_price, coupon_price) == 0 && Double.compare(order.integral_price, integral_price) == 0 && Double.compare(order.groupon_price, groupon_price) == 0 && Double.compare(order.order_price, order_price) == 0 && Double.compare(order.actual_price, actual_price) == 0 && comments == order.comments && deleted == order.deleted && Objects.equals(order_sn, order.order_sn) && Objects.equals(consignee, order.consignee) && Objects.equals(mobile, order.mobile) && Objects.equals(address, order.address) && Objects.equals(message, order.message) && Objects.equals(pay_id, order.pay_id) && Objects.equals(pay_time, order.pay_time) && Objects.equals(ship_sn, order.ship_sn) && Objects.equals(ship_channel, order.ship_channel) && Objects.equals(ship_time, order.ship_time) && Objects.equals(confirm_time, order.confirm_time) && Objects.equals(end_time, order.end_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, order_sn, order_status, consignee, mobile, address, message, goods_price, freight_price, coupon_price, integral_price, groupon_price, order_price, actual_price, pay_id, pay_time, ship_sn, ship_channel, ship_time, confirm_time, comments, end_time, deleted);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", order_sn='" + order_sn + '\'' +
                ", order_status=" + order_status +
                ", consignee='" + consignee + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                ", message='" + message + '\'' +
                ", goods_price=" + goods_price +
                ", freight_price=" + freight_price +
                ", coupon_price=" + coupon_price +
                ", integral_price=" + integral_price +
                ", groupon_price=" + groupon_price +
                ", order_price=" + order_price +
                ", actual_price=" + actual_price +
                ", pay_id='" + pay_id + '\'' +
                ", pay_time=" + pay_time +
                ", ship_sn='" + ship_sn + '\'' +
                ", ship_channel='" + ship_channel + '\'' +
                ", ship_time=" + ship_time +
                ", confirm_time=" + confirm_time +
                ", comments=" + comments +
                ", end_time=" + end_time +
                ", deleted=" + deleted +
                '}';
    }
}