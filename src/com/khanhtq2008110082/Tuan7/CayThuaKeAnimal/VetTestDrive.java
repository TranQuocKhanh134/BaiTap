/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

public class VetTestDrive {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d =  new Dog("Ki");
        Cat c = new Cat("mi");
        Hippo h = new Hippo("hippi");
        
        v.giveShot(d);
        v.giveShot(c);
    }
}
