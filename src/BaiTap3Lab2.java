import java.util.Scanner;
public class BaiTap3Lab2 {
    public static void main(String[] args) throws Exception {
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
