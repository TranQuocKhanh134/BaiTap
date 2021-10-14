/*
*Ngày tạo : 11 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.BaiTapTuan5;

public class Car {
    /*
        Tên chủ xe
		Hảng sản xuất
		Dòng
		Giấy phép
		Dung tích xăng
	*/
    String tenChuXe,hangSanXuat,dong;
    Boolean giayPhep;
    float dungTichXang;
    Car(String t , String h , String d ,Boolean g,float dtx){
        tenChuXe = t;
        hangSanXuat = h;
        dong = d;
        giayPhep = g;
        dungTichXang = dtx;
    }
    void inThongTinXe(){
        System.out.println("Tên chủ xe : " + tenChuXe);
        System.out.println("Hảng sản xuất : " + hangSanXuat);
        System.out.println("Dòng xe : " + dong);
        System.out.println("Giấy phép : " + giayPhep);
        System.out.println("dung tích xăng : " + dungTichXang);
        
    }
}
