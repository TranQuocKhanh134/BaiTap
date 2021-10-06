/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.baiTapVeNha;

import java.util.Scanner;

public class Customer {
    String[] TenKhachHang = new String[100] ;
    String[] DiaChiKhachHang = new String[100] ;
    int soLuongKhachHang;
    Customer(int n){
        soLuongKhachHang = n;
    }
    void getName(){
        for(int i = 0 ; i < soLuongKhachHang ; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("STT " + (i+1) +" Nhập tên khách hàng : ");
            TenKhachHang[i] = input.nextLine();
        }
    }
    void getAddress(){
        for(int i = 0 ; i <soLuongKhachHang ; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Nhập địa chỉ khách hàng thứ "+ (i+1) + " : ");
            DiaChiKhachHang[i] = input.nextLine();
        }
    }
    void printInformation(){
        for(int i = 0 ; i < soLuongKhachHang ; i++){
            System.out.println("STT" + (i+1) + "Tên khách hàng : " + TenKhachHang[i]);
            System.out.println("Địa Chỉ : " + DiaChiKhachHang[i]);
        }
    }
}
