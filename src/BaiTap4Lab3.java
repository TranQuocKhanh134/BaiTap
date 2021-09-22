import java.util.Scanner;
public class BaiTap4Lab3 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong sinh vien : ");
        Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        String[] MangTenSinhVien = new String[n];
        float[] MangDiemSinhVien = new float[n];
        NhapMangTenvaDiem(n, MangTenSinhVien, MangDiemSinhVien);
        System.out.println("====================================");
        XuatMangTenVaDiem(n, MangTenSinhVien, MangDiemSinhVien);
        System.out.println("====================================");
        XetHocLucSinhVien(n, MangTenSinhVien, MangDiemSinhVien);

    }
    public static void NhapMangTenvaDiem(int n ,String arr[], float arr1[]){
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhập tên của sinh viên số thứ tự " + (i+1) + " : ");
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextLine();
            System.out.print("Nhập điểm của sinh viên số thứ tự " + (i+1) + " : ");
            arr1[i] = input.nextFloat();
        }
    }
    public static void NhapMangTen(int n , String arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.print("Nhập tên của sinh viên số thứ tự " + (i+1) + " : ");
            Scanner input = new Scanner(System.in);
            arr[i] = input.nextLine();
        }
    }
    public static void XuatMangTenVaDiem(int n ,String arr1[], float arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.println("Tên của sinh viên số thứ tự " + (i+1) + " là : " + arr1[i]);
            System.out.println("Điểm của sinh viên số thứ tự " + (i+1) + " là : " + arr[i]);

        }
    }
    public static void XuatMangTen(int n , String arr[]){
        for(int i = 0 ; i < n ; i++){
            System.out.println("Tên của sinh viên số thứ tự " + (i+1) + " là : " + arr[i]);
        }
    }
    public static void XetHocLucSinhVien(int n,String A[] , float B[]){
        for(int i=0;i<n;i++) {
			if(B[i]<5) {
				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: yeu");
			}
			if(B[i]>5 && B[i]<6.5) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: trung binh");
			}
			if(B[i]>=6.5 && B[i]<7.5) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: kha");
			}
			if(B[i]>=7.5 && B[i]<9) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: gioi");
			}
			if(B[i]>=9) {

				System.out.println("Ten : "+A[i]+"\n Diem: "+B[i]+"\nHoc Luc: xuat sac");
			}
		} 
    }
}
