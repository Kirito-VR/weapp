package com.example.weapp.bean;

public class Cart {
    int Count;
    String gName;
    String Id;
    String uid;
    String gid;
    double Price;



    public void setCount(int Count){this.Count =Count;}
    public int getCount(){
        return Count;
    }

    public void setId(String Id){
        this.Id =Id;
    }
    public String getId(){
        return Id;
    }

    public void setgName(String gName){this.gName=gName;}
    public String getgName(){
        return gName;
    }

    public void setPrice(double Price){
        this.Price=Price;
    }
    public double getPrice(){
        return Price;
    }

    public void setuid(String uid){
        this.uid =uid;
    }
    public String getuid(){
        return uid;
    }

    public void setgid(String gid){
        this.gid =gid;
    }
    public String getgid(){
        return gid;
    }


}
