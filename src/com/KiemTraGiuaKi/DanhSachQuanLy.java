/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.KiemTraGiuaKi;

import java.util.ArrayList;

public class DanhSachQuanLy {
    private ArrayList<Nguoi> danhSach = new ArrayList<Nguoi>();
    public void them(Nguoi nguoi){
        this.danhSach.add(nguoi);
    }
    public void inDanhSach(){
        System.out.println(danhSach);
    }
}
