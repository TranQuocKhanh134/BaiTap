/*
*Ngày tạo : 10 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.BaiTapTuan5;

import java.util.Scanner;

public class Book{
    double giaBan;
    String nhaXuatBan;
    String tenSach;
    int namXuatban;
    int soLuong;
    String loaiSach;
    Scanner input = new Scanner(System.in);
    Book(){
        
    }
    void nhapThongTinSach(){
        System.out.print("Nhập tên sách : ");
        tenSach = input.nextLine();
        System.out.print("Nhập loại sách : ");
        loaiSach = input.nextLine();
        System.out.print("Nhập tên nhà xuất bản của sách : ");
        nhaXuatBan = input.nextLine();
        System.out.print("Nhập năm xuất bản của sách : ");
        namXuatban = input.nextInt();
        System.out.print("Nhập số lượng sách : ");
        soLuong = input.nextInt();
        System.out.print("Nhập giá sách :");
        giaBan = input.nextFloat();
    }
    void xuatThongTinSach(){
        System.out.println("Tên sách : " + tenSach);
        System.out.println("Loại sách : " + loaiSach);
        System.out.println("Tên nhà xuất bản của sách : " + nhaXuatBan);
        System.out.println("Năm xuất bản của sách : " + namXuatban);
        System.out.println("Số lượng sách : " + soLuong);
        System.out.println("Giá sách :" + giaBan);
    }
}
