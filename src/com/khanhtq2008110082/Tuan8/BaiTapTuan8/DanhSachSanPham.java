/*
*Ngày tạo : 09 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.BaiTapTuan8;
import java.util.ArrayList;
public class DanhSachSanPham  {
    private ArrayList<SanPham> list = new ArrayList<SanPham>();
    public void setList(ArrayList<SanPham> list){
        this.list = list;
    }
    public ArrayList<SanPham> getList(){
        return this.list;
    }
    public void them(SanPham sp){
        list.add(sp);
    }
    public void xuatListSanPham(){
        for (SanPham sanPham : list) {
            sanPham.xuat();
        }
    }
}
