/*
*Ngày tạo : 04 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.baiTapVeNha;

import java.util.Scanner;

public class BankProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int luaChon;
        do{
        System.out.println("**********CHƯƠNG*TRÌNH*NGÂN*HÀNG****************");
        System.out.println("**    1.Chức năng rút ,gửi ,kiểm tra số dư    **");
        System.out.println("**    2.Chức năng của đối tượng khách hàng    **");
        System.out.println("**    3.Chức năng của đối tượng nhân viên     **");
        System.out.println("**    anyNumber.Kết thúc                      **");
        System.out.println("************************************************");
        System.out.print("Nhập lựa chọn : ");
        luaChon = input.nextInt();
        switch (luaChon) {
            case 1:{
                Account account = new Account(123456, 200000);
                int luaChon1;
                do{
            System.out.println("**********CHƯƠNG*TRÌNH*NGÂN*HÀNG****************");
            System.out.println("**    1.Chức năng rút tiền                    **");
            System.out.println("**    2.Chức năng gửi tiền                    **");
            System.out.println("**    3.Chức năng kiểm tra số dư              **");
            System.out.println("**    anyNumber.Kết thúc                      **");
            System.out.println("************************************************");
            System.out.print("Nhập lựa chọn : ");
            luaChon1 = input.nextInt();
            switch (luaChon1) {
                case 1:{
                    System.out.print("Nhập số tiền muốn rút :");
                    int tienRut = input.nextInt();
                    account.Withdraw(tienRut);
                    account.Show_Balance();
                    break;
                }
                case 2 :{
                    System.out.print("Nhập số tiền muốn gửi :");
                    int tienGui = input.nextInt();
                    account.deposite(tienGui);
                    account.Show_Balance();
                    break;
                }
                case 3 :{
                    account.Show_Balance();
                }
               
            }
                }
                while(luaChon1 <=3 && luaChon1 > 0);
                break;
            }
            case 2 :{
                Customer account1 = new Customer();
                int luaChon2;
                do{ 
                System.out.println("**********CHƯƠNG*TRÌNH*NGÂN*HÀNG****************");
                System.out.println("**    1.Nhập tên khách hàng                   **");
                System.out.println("**    2.Nhập địa chỉ khách hàng               **");
                System.out.println("**    3.In thông tin khách hàng               **");
                System.out.println("**    anyNumber.Kết thúc                      **");
                System.out.println("************************************************");
                System.out.print("Nhập lựa chọn : ");
                luaChon2 = input.nextInt();
                switch (luaChon2) {
                    case 1:{
                        account1.getName();
                        break;
                        }
                    case 2 :{
                        account1.getAddress();
                        break;
                        }
                    case 3 :{
                        account1.printInformation();
                        break;
                        }
                    }
                }while(luaChon2 <=3 && luaChon2 > 0);
                break;
            }
            case 3 :{
                Emloyee account2 = new Emloyee();
                int luaChon3;
                do{ 
                System.out.println("**********CHƯƠNG*TRÌNH*NGÂN*HÀNG****************");
                System.out.println("**    1.Nhập tên nhân viên                    **");
                System.out.println("**    2.Nhập lương nhân viên                  **");
                System.out.println("**    3.In thông tin nhân viên                **");
                System.out.println("**    anyNumber.Kết thúc                      **");
                System.out.println("************************************************");
                System.out.print("Nhập lựa chọn : ");
                luaChon3 = input.nextInt();
                switch (luaChon3) {
                    case 1:{
                        account2.getName();
                        break;
                        }
                    case 2 :{
                        account2.getSalary();
                        break;
                        }
                    case 3 :{
                        account2.printInfomationEmployee();
                        break;
                        }
                    }
                }while(luaChon3 <=3 && luaChon3 > 0);
            }
            default:
                break;
        }
    }while (luaChon <=3 && luaChon >0);
        
    
        
        /*System.out.println("<==============================================>");
        
        System.out.println("------------------------------------------------");
        account.deposite(20000000);
        System.out.println("------------------------------------------------");
        account.Show_Balance();
        System.out.println("<==============================================>");
        
        account1.getName();
        System.out.println("------------------------------------------------");
        account1.getAddress();
        System.out.println("------------------------------------------------");
        account1.printInformation();
        System.out.println("<==============================================>");
        Emloyee account2 = new Emloyee(2);
        account2.getName(2);
        System.out.println("------------------------------------------------");
        account2.getSalary(2);
        System.out.println("------------------------------------------------");
        account2.printInfomationEmployee(2);
        System.out.println("<==============================================>");*/
    }

}
