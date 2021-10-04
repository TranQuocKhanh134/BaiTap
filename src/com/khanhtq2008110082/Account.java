/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082;

public class Account {
    int accout_number ;
    int accout_balance ;
    Account(int a , int b){
        accout_number = a;
        accout_balance = b;
    }
    public void Show_Balance() {
        System.out.println("accout_number = " + accout_number);
        System.out.println("accout_balance = " + accout_balance);
    }
    public void deposite(int ammout){
        accout_balance += ammout;
    }
    public void Withdraw(int ammout){
        accout_balance -= ammout;
    }
}
