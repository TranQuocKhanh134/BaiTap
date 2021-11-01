/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Lion suTu = new Lion("Leo");
        System.out.println("Tên của con sư tử là : " + suTu.getName());
        suTu.makeNoise();
        suTu.eat();
        suTu.roam();
        suTu.findFood();
        System.out.println("================================================");
        Cat meo = new Cat("Tom");
        System.out.println("Tên của con mèo là : "+ meo.getName());
        meo.eat();
        meo.roam();
        meo.makeNoise();
        System.out.println("================================================");
        Dog cho = new Dog("Pluto");
        System.out.println("ten cua con cho la : "+cho.getName());
        cho.eat();
        cho.makeNoise();
        cho.Sleep();
        cho.roam();
        System.out.println("================================================");
        Woft soi = new Woft("Xam");
        System.out.println("ten cau con soi la : " + soi.getName());
        soi.eat();
        soi.roam();
        soi.makeNoise();
        System.out.println("================================================");
        
        Hippo haMa = new Hippo("ha ma ");
        System.out.println("ten cua ha ma la : " + haMa.getName());

    }
}
