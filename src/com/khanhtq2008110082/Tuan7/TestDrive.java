/*
*Ngày tạo : 20 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        int luaChon;
        do{
        System.out.print("Xoay các hình : \n1.Vuông\n2.Tròn\n3.Tam Giác\nVà phát ra âm thanh\n4.Amueba\nNhập lựa chọn : ");
        Scanner output = new Scanner(System.in);
        luaChon = output.nextInt();
        System.out.println("================================================");
        switch (luaChon) {
            case 1:
                Square hinh1 = new Square(true);//cho rằng đây là click 
                hinh1.getClick();
                System.out.println("================================================");   
                break;
            case 2:
                Circle hinh2 = new Circle(true);//cho rằng đây là click 
                hinh2.getClick();
                System.out.println("================================================");
                break;
            case 3:
                Triangle hinh3 = new Triangle(true);//cho rằng đây là click 
                hinh3.getClick();
                System.out.println("================================================");
                break;
            case 4:
                Amoeba hinh4 = new Amoeba(10, 5,true);//cho rằng đây là click & x=1=;y=5;
                hinh4.getClick();
                System.out.println("================================================");
                break;
            default:
                break;
        }
    }while(luaChon <= 4);
    }
}
