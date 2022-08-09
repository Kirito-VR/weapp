package com.example.weapp.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

    private long id;//序号,主键
    private int user_id;//用户id
    private String order_sn;//订单编号
    private short order_status;//订单状态
    private String consignee;//收货人名称
    private String mobile;//收货人手机号
    private String address;//收货人地址
    private String message;//用户订单留言
    private BigDecimal goods_price;//商品总费用
    private BigDecimal freight_price;//配送费用
    private BigDecimal coupon_price;//优惠券减免
    private BigDecimal integral_price;//用户积分减免
    private BigDecimal groupon_price;//团购优惠价减免
    private BigDecimal order_price;//订单费用
    private BigDecimal actual_price;//实付费用
    private String pay_id;//微信付款编号
    private Date pay_time;//微信付款时间
    private String ship_sn;//发货编号
    private String ship_channel;//发货快递公司
    private Date ship_time;//发货开始时间
    private Date confirm_time;//用户确认收货时间
    private short comments;//待评价订单商品数量
    private Date end_time;//订单关闭时间
    private boolean deleted;//逻辑删除

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public short getOrder_status() {
        return order_status;
    }

    public void setOrder_status(short order_status) {
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

    public BigDecimal getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(BigDecimal goods_price) {
        this.goods_price = goods_price;
    }

    public BigDecimal getFreight_price() {
        return freight_price;
    }

    public void setFreight_price(BigDecimal freight_price) {
        this.freight_price = freight_price;
    }

    public BigDecimal getCoupon_price() {
        return coupon_price;
    }

    public void setCoupon_price(BigDecimal coupon_price) {
        this.coupon_price = coupon_price;
    }

    public BigDecimal getIntegral_price() {
        return integral_price;
    }

    public void setIntegral_price(BigDecimal integral_price) {
        this.integral_price = integral_price;
    }

    public BigDecimal getGroupon_price() {
        return groupon_price;
    }

    public void setGroupon_price(BigDecimal groupon_price) {
        this.groupon_price = groupon_price;
    }

    public BigDecimal getOrder_price() {
        return order_price;
    }

    public void setOrder_price(BigDecimal order_price) {
        this.order_price = order_price;
    }

    public BigDecimal getActual_price() {
        return actual_price;
    }

    public void setActual_price(BigDecimal actual_price) {
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

    public String getShip_sn() {
        return ship_sn;
    }

    public void setShip_sn(String ship_sn) {
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

    public short getComments() {
        return comments;
    }

    public void setComments(short comments) {
        this.comments = comments;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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