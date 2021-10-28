/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.ViDu;

public class Employee extends Person {
    protected int salary;
    public String toString(){
        String s;
        s = getName() +","+ getBirthday();
        s +=","+ salary;
        return s;
    }
}
