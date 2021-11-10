/*
*Ngày tạo : 04 thg 11, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.CayThuaKeAnimal;

import java.util.ArrayList;

public class AnimalIntroduce {
    public static void main(String[] args) {

        ArrayList<Animal> list = new ArrayList<>();
        Dog d =  new Dog("Ki");
        Cat c = new Cat("mi");
        Hippo h = new Hippo("hippi");
        list.add(d);
        list.add(c);
        list.add(h);
        for (Animal animal : list) {
            animal.Introduce();
        }

    }
}
