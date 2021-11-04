/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.KiemTraGiuaKi;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return this.hoTen;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String getDiaChi(){
        return this.diaChi;
    }
    public String toString(){
        String s ; 
        s = "Tên :" + getHoTen() + "\n" + "Địa chỉ : " + getDiaChi();
        return s; 
    }
}
