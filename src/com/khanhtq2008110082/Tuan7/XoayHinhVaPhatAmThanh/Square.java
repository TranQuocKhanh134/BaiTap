/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Square extends Shape{
    protected String sound = "HinhVuong.HIF";
    protected Boolean click ;
    Square(Boolean c){
        click = c;
    }
    protected String PhatRaAmThanh(){
        System.out.println("Phát ra âm thanh : "+ sound);
        return sound;
    }
    private void clickOrUnclick(){
        if(click == true){
            Xoay();
            PhatRaAmThanh();
        }
        else System.out.println("Chưa click !!!");
        
    }
    public void getClick(){
        clickOrUnclick();       
    }
}
