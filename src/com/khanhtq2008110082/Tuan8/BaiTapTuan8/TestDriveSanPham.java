/*
*Ngày tạo : 09 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.BaiTapTuan8;

public class TestDriveSanPham {
    public static void main(String[] args) {
        DanhSachSanPham ds = new DanhSachSanPham();
        SanPham sp1 = new SanPham("ca",20000,20);
        SanPham sp2 = new SanPham("thit",50000);
        ds.them(sp1);
        ds.them(sp2);
        ds.xuatListSanPham();
    }
}
