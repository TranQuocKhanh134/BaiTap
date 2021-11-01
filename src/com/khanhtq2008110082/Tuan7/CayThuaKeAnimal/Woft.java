/*
*Ngày tạo : 22 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class Woft extends Canine {
    public Woft(String n) {
        super(n);
    }
    private String food = " Thịt "; 
    protected void eat(){
        System.out.println("Sói thì ăn : " + food);
    }
}
