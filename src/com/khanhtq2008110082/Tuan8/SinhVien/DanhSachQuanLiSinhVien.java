/*
*Ngày tạo : 10 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.SinhVien;

import java.util.ArrayList;

public class DanhSachQuanLiSinhVien {
    private ArrayList<SinhVien> list = new ArrayList<>();
    public void getList(ArrayList<SinhVien> list){
        this.list = list ;
    }
    public ArrayList<SinhVien> setList(){
        return this.list;
    }
    public void them(SinhVien sVien){
        list.add(sVien);
    }
    public void xuatList(){
        for (SinhVien sinhVien : list) {
            sinhVien.xuat();
        }
    }
    public SinhVien timKiemTheoHocLuc(String hocLuc){
        System.out.println("Những sinh viên có học lực " + hocLuc + " là :");
        SinhVien a = null;
        for (SinhVien sinhVien : list) {
            if(sinhVien instanceof SinhVien){
                SinhVien b = (SinhVien)sinhVien;
                if(b.getHocLuc().equalsIgnoreCase(hocLuc)){
                    System.out.println(b);
                }
            }
        }
        return a;
    }
}
