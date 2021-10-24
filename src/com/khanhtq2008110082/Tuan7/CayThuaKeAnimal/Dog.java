/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class Dog extends Canine {
    String food = "thức ăn cho chó ";
    protected void makeNoise(){
        System.out.println("gauuu gauuu");
    }
    protected void eat(){
        System.out.println("Ăn thức ăn : " + food);
    }
}
