/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class Lion extends Felidae {
    private String food = "thịt";
    protected void eat(){
        System.out.println("Ăn thức ăn : " + food);
    } 
    protected void makeNoise(){
        System.out.println("Gàoooooooooooooooooooo");
    }
    public Lion(String n){
        super(n);
    }
}
