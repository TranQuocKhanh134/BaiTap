/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Shape {
    private boolean click;
    private String sound ;
    public Shape(String s) {
        sound = s;
        }
    public Shape(String s, boolean c) {
        sound = s;
        click = c;
    }
    protected void Xoay(){
        if(click == true)
            System.out.println("Xoay hình 360 độ !!");
        else 
            System.out.println("Chưa click !!!!");
    }
    protected void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : "+ sound +"  !!! "); 
        else
            System.out.println("Chưa click !!!");    
    }
    public void setSound(String sound){
        this.sound = sound; 
    }
    public String getSound(){
        return this.sound;
    }
}
