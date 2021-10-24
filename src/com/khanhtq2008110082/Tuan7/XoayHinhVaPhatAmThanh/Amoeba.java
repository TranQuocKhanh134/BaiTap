/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

public class Amoeba extends Shape{
    String sound = "Amoeba.AIF";
    Boolean click = true;
    int x;
    int y;
    Amoeba(int xx , int yy,Boolean c){
        x=xx;
        y=yy;
        click = c;
    }
    Amoeba(){
        
    }
    protected String Xoay(){
            System.out.println("Xoay hình Amoeba theo tọa độ x = " + x + " và y = " + y );
            return sound;
    }
    protected String PhatRaAmThanh(){
            System.out.println("Phát ra âm thanh : " + sound + " !!! ");
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
