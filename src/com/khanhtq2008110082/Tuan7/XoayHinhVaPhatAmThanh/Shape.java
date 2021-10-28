/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Shape {
        private String sound = "a";
    public Shape(String s) {
        sound = s;
        }
    protected void Xoay(){
            System.out.println("Xoay hình 360 độ !!");
    }
    protected void PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : "+ sound +"  !!! ");     
    }
    public void setSound(String sound){
        this.sound = sound; 
    }
    public String getSound(){
        return this.sound;
    }
}
