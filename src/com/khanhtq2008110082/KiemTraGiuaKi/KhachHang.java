/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.KiemTraGiuaKi;

public class KhachHang extends Nguoi {
    private String tenCongTy;
    private double triGiaDonHang;
    public void setTenCongTy(String tenCongTy){
        this.tenCongTy = tenCongTy;
    }
    public String getTenCongTy(){
        return this.tenCongTy;
    }
    public void setTriGiaDonHang(double triGiaDonHang){
        if(triGiaDonHang > 0)
            this.triGiaDonHang = triGiaDonHang;
    }
    public double getTriGiaDonHang(){
        return this.triGiaDonHang;
    }
    public String toString(){
        String s ; 
        s = "\nTên khách hàng : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() + "\nTên công ty : " + getTenCongTy() + "\n" + "Trị giá đơn hàng : " + getTriGiaDonHang();
        return s; 
    }
}
