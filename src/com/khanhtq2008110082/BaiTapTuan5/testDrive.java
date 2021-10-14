/*
*Ngày tạo : 10 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.BaiTapTuan5;

public class TestDrive {
    public static void main(String[] args) {
        Book sach = new Book();
        sach.nhapThongTinSach();
        sach.xuatThongTinSach();
        System.out.println("==========================================================");
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.nhapThongTinNhanVien();
        nhanVien1.xuatThongTinNhanVien();
        System.out.println("==========================================================");
        Car xeMoi = new Car("khanh","honda","phoThong",true,110);
        xeMoi.inThongTinXe();
        System.out.println("==========================================================");
        Computer mayTinhMoi = new Computer("ACER", "Window","i5-10300H",2020,8,2021,19500000);
        mayTinhMoi.inThongTinMayTinh();
        System.out.println("==========================================================");
        Account taiKhoanMoi = new Account("khanh", 121212, 50000);
        taiKhoanMoi.deposite(200000);
        taiKhoanMoi.Withdraw(20000);
        taiKhoanMoi.Show_Balance();
        System.out.println("==========================================================");
        Cow boCon = new Cow(2, 15);
        boCon.keu();
        boCon.an();
        System.out.println("==========================================================");
    }
}
