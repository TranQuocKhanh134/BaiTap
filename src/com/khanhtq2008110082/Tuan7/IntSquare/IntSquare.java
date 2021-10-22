/*
*Ngày tạo : 21 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan7.IntSquare;

public class IntSquare {
    private int intValue;
    public IntSquare(int n){
        intValue = n;
    }
    private int calculateIntValue() {
       return intValue*intValue;
    }
    public int getIntValue() {
        return calculateIntValue();
    }
}
