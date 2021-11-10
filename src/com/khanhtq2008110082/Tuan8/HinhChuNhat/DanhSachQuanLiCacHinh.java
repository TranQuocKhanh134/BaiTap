/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.HinhChuNhat;

import java.util.ArrayList;

public class DanhSachQuanLiCacHinh {
    private ArrayList<HinhChuNhat> list = new ArrayList<>();
    public void getList(ArrayList<HinhChuNhat> list){
        this.list = list ;
    }
    public ArrayList<HinhChuNhat> setList(){
        return this.list;
    }
    public void them(HinhChuNhat h){
        list.add(h);
    }
    public void xuatList(){
        for (HinhChuNhat hinhChuNhat : list) {
            hinhChuNhat.xuat();
        }
    }
}
