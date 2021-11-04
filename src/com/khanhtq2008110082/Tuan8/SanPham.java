/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8;

public class SanPham {
    private String name;
    private double gia;
    private double giamGia;
    public SanPham(String n , double g , double gg){
        this.name = n;
        this.gia = g;
        this.giamGia = gg;
    }
    public void setName(String n){
        this.name = n ;
    }
    public String getName(){
        return this.name;
    }
    public void setGia(double g){
        this.gia = g;
    }
    public double getGia(){
        return this.gia;
    }
    public void setGiaGia(double gg){
        this.giamGia = gg;
    }
    public double getGiamGia(){
        return this.giamGia;
    }
    public double tinhThue(){
        double thue = (gia*(getGiamGia()/100))/10;
        return thue;
    }
    public void inThongTin(){
        
    }
}
