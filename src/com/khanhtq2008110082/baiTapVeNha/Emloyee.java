/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.baiTapVeNha;

import java.util.Scanner;

public class Emloyee {
    String[] Name = new String[100];
    float[] Salary = new float[100];
    int soLuongNhanVien ;
    Emloyee(int n){
        soLuongNhanVien = n;
    }
    void getName(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.print("Nhập tên của nhân viên STT " + (i+1) +" : ");
            Scanner input = new Scanner(System.in);
            Name[i] = input.nextLine(); 
        }
    }
    void getSalary(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.print("Nhập lương của nhân viên STT " + (i+1) + " : ");
            Scanner input = new Scanner(System.in);
            Salary[i] = input.nextFloat();
        }
    }
    void printInfomationEmployee(){
        for(int i = 0 ; i < soLuongNhanVien ; i++){
            System.out.println("Tên nhân viên là : " + Name[i]);
            System.out.println("Lương nhân viên là : " + Salary[i]);
        }
    }
}
