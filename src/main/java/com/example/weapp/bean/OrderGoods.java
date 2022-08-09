package com.example.weapp.bean;

import java.math.BigDecimal;

public class OrderGoods {// 订单详情表
    private Integer id;
    private Integer order_id;// 订单表的商品订单ID
    private Integer goods_id;// 商品表的商品ID
    private String goods_name;// 商品名称
    private String goods_sn;// 商品编号
    private Integer product_id;// 商品货品表的货品ID
    private Integer goods_number;// 商品货品的购买数量
    private BigDecimal price;// 商品货品的售价
    private String specifications;// 商品货品的规格列表
    private String pic_url;// 商品货品图片或者商品图片
    private Integer goods_comment;//订单商品评论，如果是-1，则超期不能评价；如果是0，则可以评价；如果其他值，则是comment表里面的评论ID。
    private Integer deleted;// 逻辑删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public Integer getGoods_comment() {
        return goods_comment;
    }

    public void setGoods_comment(Integer goods_comment) {
        this.goods_comment = goods_comment;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
