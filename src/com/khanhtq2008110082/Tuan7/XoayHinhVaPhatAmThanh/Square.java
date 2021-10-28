/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Square extends Shape{
    protected Boolean click ;
    Square(String s){
        super(s);
    }
    protected void PhatRaAmThanh(){
        System.out.println("Phát ra âm thanh : "+ getSound());
    }
    
}
