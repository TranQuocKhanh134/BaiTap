/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.KiemTraGiuaKi;

public class HocVien extends Nguoi {
    private float diemMonHoc1;
    private float diemMonHoc2;
    private static int soLuongHV;
    public void setDiemMonHoc1(float diemMonHoc1){
        if(diemMonHoc1 >= 0 && diemMonHoc1 <=10)
            this.diemMonHoc1 = diemMonHoc1;
    }
    public float getDiemMonHoc1(){
        return this.diemMonHoc1;
    }
    public void setDiemMonHoc2(float diemMonHoc2){
        if(diemMonHoc2 >= 0 && diemMonHoc2 <=10)
            this.diemMonHoc2 = diemMonHoc2;
    }
    public float getDiemMonHoc2(){
        return this.diemMonHoc2;
    }
    public void setSoLuongHV(int soLuongHV){
        HocVien.soLuongHV = soLuongHV;
    }
    public int getSoLuongHV(){
        return HocVien.soLuongHV;
    }
    protected float diemTB(){
        float diemTB = (getDiemMonHoc1() + getDiemMonHoc2())/2 ;
        return diemTB;
    }
    public String toString(){
        String s ; 
        s = "Tên học viên : "+getHoTen() + "\n" +"Địa chỉ : "+getDiaChi() +"\nĐiểm môn học 1 : " + getDiemMonHoc1() + "\n" + "Điểm môn học 2 : " + getDiemMonHoc2() + "\n" + "Điểm trung bình : " + diemTB()+"\nSố lượng học viên : " + getSoLuongHV();
        return s; 
    }
}
