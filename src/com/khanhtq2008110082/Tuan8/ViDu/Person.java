/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.ViDu;

public class Person {
    private String name;
    private String birthday;
    protected void setName(String n){
        this.name = n;
    }
    protected String getName(){
        return this.name;
    }
    protected void setBirthday(String bd){
        this.birthday = bd;
    }
    protected String getBirthday(){
        return this.birthday;
    }
}
