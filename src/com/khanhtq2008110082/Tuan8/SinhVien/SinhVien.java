/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.SinhVien;

import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private String nganh;
    private double diem ;
    public SinhVien(String hoTen , String nganh){
        this.hoTen = hoTen;
        this.nganh = nganh;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen ;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public String getNganh() {
        return nganh;
    }
    public void setDiem(double diem){
        this.diem = diem ;
    }
    public double getDiem(){ 
            return this.diem ;
    }
    public String getHocLuc(){
        if(getDiem() < 5 && getDiem() > 0){
            return "Yeu";
        }
        else if(getDiem() < 6.5 && getDiem() >= 5){
            return "Trung bình";
        }
        else if(getDiem() < 7.5 && getDiem() >= 6.5){
            return "Khá";
        }
        else if(getDiem() < 9 && getDiem() >= 7.5){
            return "Giỏi";
        }
        else return "Xuất sắc";
    }
    public String toString() {
        String s;
        s = "Tên sinh viên : " + getHoTen() +"\nNgành : " + getNganh() ;
        return s;
    }
    public void xuat(){
        System.out.println(toString());
    }

}
