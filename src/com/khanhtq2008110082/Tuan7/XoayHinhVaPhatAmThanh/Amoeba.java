/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Amoeba extends Shape{
    Boolean click = true;
    int x;
    int y;
    Amoeba(int xx , int yy,String s){
        super(s);
        x=xx;
        y=yy;
       
    }
    Amoeba(String s){
        super(s);
    }
    protected void Xoay(){
            System.out.println("Xoay hình Amoeba theo tọa độ x = " + x + " và y = " + y );
            
    }
    protected void PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : " + getSound() + " !!! ");       
    }
}
