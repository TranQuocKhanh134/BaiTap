/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.HinhChuNhat;


public class testDrive {
    public static void main(String[] args) {
		DanhSachQuanLiCacHinh ds = new DanhSachQuanLiCacHinh();
		HinhChuNhat hcn = new HinhChuNhat(16,7);
		HinhChuNhat hv = new HinhVuong(5);
		HinhChuNhat hcn1 = new HinhChuNhat(4,5);
		ds.them(hcn);
		ds.them(hv);
		ds.them(hcn1);
		ds.xuatList();
    }
}
