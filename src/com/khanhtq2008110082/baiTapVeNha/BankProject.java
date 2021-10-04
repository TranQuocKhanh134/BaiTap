/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.baiTapVeNha;

public class BankProject {
    public static void main(String[] args) {
        Account account = new Account(123456, 200000);
        account.Withdraw(20000);
        account.deposite(20000000);
        account.Show_Balance();
        System.out.println("<==============================================>");
        Customer account1 = new Customer();
        account1.getName();
        account1.getAddress();
        account1.printInformation();
        System.out.println("<==============================================>");
        Emloyee account2 = new Emloyee();
        account2.getName();
        account2.getSalary();
        account2.printInfomationEmployee();
        System.out.println("<==============================================>");
    }
}
