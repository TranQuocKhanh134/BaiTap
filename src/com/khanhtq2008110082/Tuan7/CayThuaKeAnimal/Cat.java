/*
*Ngày tạo : 22 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class Cat extends Felidae {
    protected String food = "Chuột và cá (mèo nuôi thi ăn pate)";
    protected void eat(){
        System.out.println("Thức ăn của mèo là : " + food);
    }
}
