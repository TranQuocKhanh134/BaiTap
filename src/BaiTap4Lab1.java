import java.util.Scanner;
public class BaiTap4Lab1 {
    public static void main(String[] args) throws Exception {
        System.out.print("Nhap he so a b c :");
        Scanner input = new Scanner(System.in);
        Float a = input.nextFloat();
        Float b = input.nextFloat();
        Float c = input.nextFloat();
        Float delta = b*b - 4*a*c;
        Double cdelta = Math.sqrt(delta);
        System.out.println("Delta cua ptb2 nay la : " + delta + "\nCan delta cua pt nay la : " + cdelta);
    }
}
