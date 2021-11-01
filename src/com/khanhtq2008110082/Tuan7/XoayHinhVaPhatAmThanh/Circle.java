/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Circle extends Shape {
    protected Circle(String s , boolean c){
        super(s,c);
    }
    protected void PhatRaAmThanh(){
        System.out.println("Phát ra âm thanh : "+ getSound());
    }


}
