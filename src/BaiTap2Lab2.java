import java.util.Scanner;
public class BaiTap2Lab2 {
    public static void main(String[] args) throws Exception {
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
}
