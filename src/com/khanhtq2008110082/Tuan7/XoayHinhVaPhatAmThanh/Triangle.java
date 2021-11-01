/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Triangle extends Shape{
    Boolean click ;
    protected Triangle(String s,boolean c){
        super(s,c);
    }
    protected void PhatRaAmThanh(){
        System.out.println("Phát ra âm thanh : "+ getSound());
    }
    
}
