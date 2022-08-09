package com.example.weapp.bean;

public class Cart {
    int user_id;
    int goods_id;
    String goods_sn;
    String goods_name;
    int product_id;
    double price;
    int cart_number;
    String specifications;
    int checked;
    String pic_url;
    int deleted;

    public void setuser_id(int user_id){this.user_id =user_id;}
    public int getuser_id(){
        return user_id;
    }

    public void setgoods_id(int goods_id){
        this.goods_id =goods_id;
    }
    public int getgoods_id(){
        return goods_id;
    }

    public void setgoods_sn(String goods_sn){this.goods_sn=goods_sn;}
    public String getgoods_sn(){
        return goods_sn;
    }

    public void setgoods_name(String goods_name){this.goods_name=goods_name;}
    public String getgoods_name(){
        return goods_name;
    }

    public void setproduct_id(int product_id){this.product_id =product_id;}
    public int getproduct_id(){
        return product_id;
    }

    public void setprice(double price){
        this.price=price;
    }
    public double getprice(){
        return price;
    }

    public void setcart_number(int cart_number){this.cart_number =cart_number;}
    public int getcart_number(){
        return cart_number;
    }

    public void setspecifications(String specifications){
        this.specifications =specifications;
    }
    public String getspecifications(){
        return specifications;
    }

    public void setchecked(int checked){
        this.checked =checked;
    }
    public int getchecked(){
        return checked;
    }

    public void setpic_url(String pic_url){
        this.pic_url =pic_url;
    }
    public String getpic_url(){
        return pic_url;
    }

    public void setdeleted(int deleted){
        this.deleted =deleted;
    }
    public int getdeleted(){
        return deleted;
    }


}
