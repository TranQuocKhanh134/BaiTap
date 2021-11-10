/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.SinhVien;

public class TestDriveSinhVien {
    public static void main(String[] args) {
        SinhVien sv = new SinhVienIT("Tran Quoc Khanh", 10, 10, 10);
        sv.xuat();
        SinhVien sv1 = new SinhVienKT("Nguyen Thi Quoc Khanh", 1, 2);
        sv1.xuat();
        DanhSachQuanLiSinhVien ds = new DanhSachQuanLiSinhVien();
        ds.them(sv);
        ds.them(sv1);
        ds.timKiemTheoHocLuc("Yeu"); 
    }
}
