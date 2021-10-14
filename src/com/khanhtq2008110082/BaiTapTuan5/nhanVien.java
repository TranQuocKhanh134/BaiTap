/*
*Ngày tạo : 11 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.BaiTapTuan5;

import java.util.Scanner;

public class NhanVien {
    String tenNhanVien;
    float luong;
    String boPhanLamViec;
    String ngaySinh;
    Scanner input = new Scanner(System.in);
    NhanVien(){

    }
    void nhapThongTinNhanVien(){
        System.out.print("Nhập tên nhân viên : ");
        tenNhanVien = input.nextLine();
        System.out.print("Nhập ngày sinh của nhân viên : ");
        ngaySinh = input.nextLine();
        System.out.print("Nhập bộ phận làm việc của nhân viên : ");
        boPhanLamViec = input.nextLine();       
        System.out.print("Nhập lương nhân viên : ");
        luong = input.nextFloat();
    }
    void xuatThongTinNhanVien(){
        System.out.println("Tên nhân viên : " + tenNhanVien);
        System.out.println("Ngày sinh của nhân viên : " + ngaySinh);
        System.out.println("Bộ phận làm việc của nhân viên : " + boPhanLamViec);
        System.out.println("Lương nhân viên : " + luong);
    }
}
