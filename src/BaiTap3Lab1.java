import java.util.Scanner;
public class BaiTap3Lab1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap canh cua hinh lap phuong : ");
        Scanner input = new Scanner(System.in);
        Float Canh = input.nextFloat();
        Double TheTich = Math.pow(Canh , 3);
        System.out.println("The tich cua hinh lap phuong la : " + TheTich);

    }
}
