import java.util.Scanner;

public class BaiTap2Lab1 {
    public static void main(String[] args) {
        Float ChieuDai , ChieuRong , DienTich , ChuVi , CanhNhoNhat;
        System.out.print("Nhap chieu dai va chieu rong cua hinh chu nhat : ");
        Scanner input = new Scanner(System.in);
        ChieuDai = input.nextFloat();
        ChieuRong = input.nextFloat();
        DienTich = ChieuDai*ChieuRong;
        ChuVi = (ChieuDai + ChieuRong)*2;
        CanhNhoNhat = Math.min(ChieuDai , ChieuRong);
        System.out.println("Dien tich cua hinh chu nhat la : " + DienTich + "\nChu vi cua hinh chu nhat la : " + ChuVi + "\nCanh nho nhat cua hinh chu nhat la : "+ CanhNhoNhat);
    }
}
