/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.KiemTraGiuaKi;

public class NhanVien extends Nguoi{
    private float heSoLuong;
    public void setHeSoLuong(float heSoLuong){
        if(heSoLuong > 0)
            this.heSoLuong = heSoLuong;
    }
    public double getHeSoLuong(){
        return this.heSoLuong;
    }
    protected double tinhLuong(){
        return (this.heSoLuong * 1500000);
    }
    public String toString(){
        String s ; 
        s = "\nTên nhân viên : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() +"\nHệ số lương nhân viên : " + getHeSoLuong() + "\n" +"Lương nhân viên : " + tinhLuong();
        return s; 
    }
}
