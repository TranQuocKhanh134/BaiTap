package com.khanhtq2008110082.lab3;
public class BaiTap2Lab3 {
    public static void main(String[] args) {
        for(int i = 1 ; i < 10 ; i++){
            System.out.println();
            for(int j = 1 ; j <= 10 ; j++){
                System.out.printf("\t%d * %d = %d" , j , i , j*i); 
            }
        }
    }
}
