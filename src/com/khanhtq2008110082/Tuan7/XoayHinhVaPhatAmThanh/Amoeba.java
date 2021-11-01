/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Amoeba extends Shape{
    private boolean click;
    private int x;
    private int y;
    public Amoeba(int xx , int yy,String s,boolean c){
        super(s,c);
        click = c;
        x=xx;
        y=yy;
       
    }
    public Amoeba(String s , boolean c){
        super(s,c);
    }
    protected void Xoay(){
        if(click == true)
            System.out.println("Xoay hình Amoeba theo tọa độ x = " + x + " và y = " + y );
        else
            System.out.println("Chưa click");
            
    }
    protected void PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : " + getSound() + " !!! ");       
    }
}
