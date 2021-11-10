/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.SinhVien;

import java.util.Scanner;

public class SinhVienIT extends SinhVien {
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    private Scanner input = new Scanner(System.in);
    public SinhVienIT(String hoTen , double diemJava , double diemCss , double diemHtml){
        super(hoTen, "Công nghệ thông tin");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
        if((diemJava < 0 || diemCss < 0 || diemHtml < 0)||(diemJava > 10 || diemCss > 10 || diemHtml > 10)){
            System.out.println("Khởi tạo điểm sai !!! nhập lại !!!");
            setDiem();
        }
    }
    public void setDiem(){
        System.out.print("Nhập điểm java : ");
        this.diemJava = input.nextDouble();
        System.out.print("Nhập điểm Css : ");
        this.diemCss = input.nextDouble();
        System.out.print("Nhập điểm Html : ");
        this.diemHtml = input.nextDouble();
        if((diemJava < 0 || diemCss < 0 || diemHtml < 0)||(diemJava > 10 || diemCss > 10 || diemHtml > 10)){
            System.out.println("Nhập điểm sai !!! nhập lại !!!");
            setDiem();

        }
    }
    @Override
    public double getDiem() {        
        return ((diemJava*2 + diemCss + diemHtml)/4);
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
