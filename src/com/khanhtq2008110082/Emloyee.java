/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082;

import java.util.Scanner;

public class Emloyee {
    String[] Name = new String[100];
    float Salary;
    Emloyee(){}
    void getName(){
        System.out.print("Nhập tên của nhân viên : ");
        Scanner input = new Scanner(System.in);
        Name[1] = input.nextLine(); 
    }
    void getSalary(){
        System.out.print("Nhập lương của nhân viên : ");
        Scanner input = new Scanner(System.in);
        Salary = input.nextFloat();
    }
    void printInfomationEmployee(){
        System.out.println("Tên nhân viên là : " + Name[1]);
        System.out.println("Lương nhân viên là : " + Salary);
    }
}
