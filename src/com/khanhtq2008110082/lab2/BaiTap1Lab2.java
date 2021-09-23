package com.khanhtq2008110082.lab2;
import java.util.Scanner;
public class BaiTap1Lab2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhập hệ số a b : ");
        Scanner hs = new Scanner(System.in);
        Float a = hs.nextFloat();
        Float b = hs.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm !!");
            }
            else{
                System.out.println("Phương trình vô nghiệm !!");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm x = " + -b/a);
        }
    }
}
