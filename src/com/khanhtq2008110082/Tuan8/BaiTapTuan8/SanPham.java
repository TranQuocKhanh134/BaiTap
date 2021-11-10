/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.BaiTapTuan8;

import java.util.Scanner;

public class SanPham {
    private String name;
    private double gia;
    private double giamGia;
    private Scanner input = new Scanner(System.in);
    public SanPham(String n , double g , double gg){
        this.name = n;
        this.gia = g;
        this.giamGia = gg;
    }
    public SanPham(String n , double g){
        this(n,g,0);
    }
    public SanPham(){

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
        double thue;
        if(getGiamGia() != 0)
            thue = (gia - (gia*(getGiamGia()/100)))/10;
        else{
            thue = gia/10;
        }
        return thue;
    }
    public String toString(){
        String s;
        s = "Tên sản phẩm : " + getName() + "\nGiá sản phẩm trước thuế : " + getGia() + "\nGiảm giá : " + getGiamGia()+ " %" + "\nThuế :" + tinhThue()+" đ";
        return s;
    }
    public void xuat(){
        System.out.println(toString());
    }
    public void nhap(){
        System.out.print("Nhập tên sản phẩm : ");
        name = input.nextLine();
        System.out.print("Nhập giá sản phẩm : ");
        gia = input.nextDouble();
        System.out.print("Nhập phần trăm giảm giá : ");
        giamGia = input.nextDouble();

    }
    
}
