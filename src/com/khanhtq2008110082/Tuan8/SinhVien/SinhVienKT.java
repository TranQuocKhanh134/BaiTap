/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.SinhVien;

import java.util.Scanner;

public class SinhVienKT extends SinhVien{
    private double diemMKT;
    private double diemSale;
    private Scanner input = new Scanner(System.in);
    public SinhVienKT(String hoTen , double diemMKT , double diemSale){
        super(hoTen, "Kinh tế");
        this.diemMKT = diemMKT;
        this.diemSale = diemSale;
        if((diemMKT < 0 || diemSale < 0)||(diemMKT > 10 || diemSale > 10)){
            System.out.println("Khởi tạo điểm sai !!! nhập lại !!!");
            setDiem();
        }
    }
    public void setDiem(){
        System.out.print("Nhập điểm MKT : ");
        this.diemMKT = input.nextDouble();
        System.out.print("Nhập điểm Sale : ");
        this.diemSale = input.nextDouble();
        if((diemMKT < 0 || diemSale < 0 )||(diemMKT > 10 || diemSale > 10)){
            System.out.println("Nhập điểm sai !!! nhập lại !!!");
            setDiem();

        }
    }
    @Override
    public double getDiem() {        
        return ((diemMKT*2 + diemSale)/3);
    }
    public String getHocLuc(){
        super.setDiem(getDiem());
        return super.getHocLuc();
    }
    @Override
    public String toString() {
        String s;
        s = super.toString() +"\nĐiểm : " + getDiem() + "\nHọc lực : " + getHocLuc();
        return s;
    }
    public void xuatDiem(){
        System.out.println(toString());
    }
}
