/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan6;

public class Amoeba {
    String sound = "Reng.AIF";
    Boolean click = true;
    int x;
    int y;
    Amoeba(int xx , int yy){
        x=xx;
        y=yy;
    }
    Amoeba(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click== true)
            System.out.println("Xoay hình Amoeba theo "+ x +" và " + y );
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
    }

}
