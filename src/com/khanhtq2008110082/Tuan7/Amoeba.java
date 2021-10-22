/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7;

public class Amoeba extends Shape{
    String sound = "Amoeba.AIF";
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
            System.out.println("Xoay hình Amoeba theo " + x + " và " + y );
    }
    void PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
    }

}
