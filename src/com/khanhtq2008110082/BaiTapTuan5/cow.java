/*
*Ngày tạo : 11 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.BaiTapTuan5;

public class Cow {
    float weight;
    int age;
    Cow(int tuoi , float canNang){
        age = tuoi;
        weight = canNang;
    }
    void keu(){
        System.out.println(" MOO MOO MOO ");
    }
    void an(){
        System.out.println(" Măm măm măm");
    }
}
