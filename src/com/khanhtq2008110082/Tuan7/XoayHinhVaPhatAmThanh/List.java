/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.XoayHinhVaPhatAmThanh;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<Shape>();
        Circle tron = new Circle("HinhTron.HIF", true);
        Square vuong = new Square("HinhVuong.HIF" , false);
        Amoeba amoeba = new Amoeba(1,2,"Amoeba.HIF",true);
        list.add(tron);
        list.add(vuong);
        list.add(amoeba);
        for (Shape shape : list ) {
            shape.Xoay();
            shape.PhatRaAmThanh();
            
        }

    }
}
