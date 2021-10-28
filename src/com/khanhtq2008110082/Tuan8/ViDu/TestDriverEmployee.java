/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.ViDu;

public class TestDriverEmployee {
    public static void main(String[] args) {
        Employee nhanVien = new Employee();
        nhanVien.salary = 20;
        nhanVien.setBirthday("13/04/02");
        nhanVien.setName("Tran Quoc Khanh");
        System.out.println(nhanVien);
    }
}
