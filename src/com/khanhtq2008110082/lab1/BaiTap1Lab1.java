package com.khanhtq2008110082.lab1;
import java.util.Scanner;

public class BaiTap1Lab1 {
    public static void main(String[] args) throws Exception {
        String name;
        Float mark;
        System.out.print("Nhap ten sinh vien :");
        Scanner Ten = new Scanner(System.in);
        name = Ten.nextLine();
        System.out.print("Nhap diem cua sinh vien :");
        Scanner Diem = new Scanner(System.in);
        mark = Diem.nextFloat();
        System.out.println("------Thong tin cua sinh vien-------");
        System.out.println("Ten sinh vien : " + name + "\nDiem cua sinh vien :" + mark);
    }
}
