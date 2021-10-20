/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan6;

public class Circle {
    String sound = "Reng";
    Boolean click = false;
    Circle(Boolean c){
        click = c;
    }
    void Xoay(){
        if(click== true)
            System.out.println("Xoay hình tròn 360 độ !!");
    }
    void PhatRaAmThanh(){
        if(click == true)
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
    }


}
