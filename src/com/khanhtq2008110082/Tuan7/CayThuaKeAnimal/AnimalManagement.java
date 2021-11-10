/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

import java.util.ArrayList;

public class AnimalManagement {
    private ArrayList<Animal> list;
    public AnimalManagement(){
        list = new ArrayList<>();
    }
    public void them(Animal a){
        list.add(a);
    }
    public Animal timKiemTheoTen(String name){
        Dog d = null;
        for (Animal animal : list) {
            if(animal instanceof Dog){
                Dog dog = (Dog)animal;
                if(dog.getName().equalsIgnoreCase(name)){
                    d = dog ;
                }
            }
        }
        return d ;

    }
}
