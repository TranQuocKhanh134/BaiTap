/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.HinhChuNhat;

public class HinhVuong extends HinhChuNhat{
    private double canh;
    public HinhVuong(double canh){
        super(canh,canh);
        this.canh = canh;
    }
    @Override
    public String toString() {
        String s;
        s ="Cạnh của hình vuông : " +  getchieudai() + "\nChu vi của hình vuông : " + tinhchuvi(canh,canh) + "\nDiện tích của hình vuông : " + tinhdientich(canh,canh);
        return s ;
    }
    @Override
    public void xuat() {
        System.out.println(toString());
    }

}
