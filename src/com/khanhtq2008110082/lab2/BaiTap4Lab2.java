package com.khanhtq2008110082.lab2;
import java.util.Scanner;
public class BaiTap4Lab2 {
    public static void main(String[] args) throws Exception {
        System.out.print("1.Giải phương trình bậc 1\n2.Giải phương trình bậc 2\n3.Tính tiền điện\n4.Thoát\nNhập Lựa chọn : ");
        Scanner lc = new Scanner(System.in);
        int luaChon = lc.nextInt();
        switch (luaChon){
            case 1 : GiaiPhuongTrinhBac1(); break;
            case 2 : GiaiPhuongTrinhBac2(); break;
            case 3 : TinhTienDien();break;
            case 4 : break; 
        }
    }
    public static void GiaiPhuongTrinhBac1() {
        System.out.print("Nhập hệ số a b : ");
        Scanner hs = new Scanner(System.in);
        Float a = hs.nextFloat();
        Float b = hs.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm !!");
        }
        else{
            System.out.println("Phương trình vô nghiệm !!");
            }
        }
        else {
            System.out.println("Phương trình có nghiệm x = " + -b/a);
        }
    }
    public static void GiaiPhuongTrinhBac2(){
        System.out.print("Nhập hệ số a b c :");
        Scanner hs = new Scanner (System.in);
        Float a = hs.nextFloat();
        Float b = hs.nextFloat();
        Float c = hs.nextFloat();
        if(a==0){
            if(b==0 && c==0){
                System.out.println("Phương trình vô số nghiệm !!!");
            }
            else if( b!=0 ){
                System.out.println("Phương trình có nghiệm x =" + -c/b);
            }
        }
        else {
            Float delta = b*b - 4*a*c;
            if(delta > 0){
                System.out.println("Phương trình có 2 nghiệm \nx1 = " + (-Math.sqrt(delta)+b)/2*a + "\n"+"x2 = " + (-Math.sqrt(delta)-b)/2*a);
            }
            else if(delta == 0){
                System.out.println("Phương trình có nghiệm kép x = " + -b/2*a);
            }
            else{
                System.out.println("Phương trình vô nghiệm !!");
            }
        }
    }
    public static void TinhTienDien(){
        System.out.print("Nhập số điện tháng này : ");
        Scanner td = new Scanner (System.in);
        int diensd = td.nextInt();
        if(diensd <= 50 && diensd >0){
            System.out.println("Số tiền điện phải trả là : " + diensd*1000);
        }
        else if(diensd < 0){
            System.out.println("Số diện sử dụng vừa nhập không hợp lệ !!");
        }
        else{
            System.out.println("Số tiền điện phải trả là : " + (50*1000 + (diensd-50)*1200));
        }
    }
}
