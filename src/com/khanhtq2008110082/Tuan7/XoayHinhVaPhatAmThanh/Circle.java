/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Circle extends Shape {
    private Boolean click;
    protected Circle(String s){
        super(s);
    }
    protected void PhatRaAmThanh(){
        System.out.println("Phát ra âm thanh : "+ getSound());
    }


}
