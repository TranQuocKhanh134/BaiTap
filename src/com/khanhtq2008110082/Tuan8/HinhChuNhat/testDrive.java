/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.HinhChuNhat;

import java.util.Scanner;

public class testDrive {
    public static void main(String[] args) {
        //khởi tạo đối tượng hc không đổi số
		hinhchunhat hc = new hinhchunhat();
		hc.setchieudai(7);
		hc.setchieurong(3);
		
		//in kết quả theo thuộc tính
		System.out.println(hc.chieudai);
		System.out.println(hc.chieurong);
		//khởi tạo đối tượng hc1 có 2 đối cd và cr
		hinhchunhat hc1 = new hinhchunhat(16,7);
		System.out.println(hc1.chieudai);
		//in kết quả theo mẫu của tostring
		System.out.println(hc1);
		//nhập các thuộc tính từ bàn phím
		//khởi tạo đối tượng sc của scanner để đọc giá trị từ bàn phím vào biến nhớ
		Scanner sc = new Scanner(System.in);
		//nhập từ bàn phím
		System.out.println("nhập chiều dài: ");
		double cd=sc.nextDouble();
		hc.setchieudai(cd);
		//cách khác
		System.out.println("chiều rộng: ");
		hc.setchieurong(sc.nextDouble());
		System.out.println(hc);
		//cách khác nhập chiều dài và chiều rộng
		System.out.println("nhập chiều dài và chiều rộng: ");
		hinhchunhat hc3=new hinhchunhat(sc.nextDouble(), sc.nextDouble());
		System.out.println(hc3);
		
		System.out.println("chu vi hình chữ nhật hc: "+hc.tinhchuvi(hc.getchieudai(),hc.getchieurong()));
		System.out.println("dien tich hình chữ nhật hc:"+hc.tinhdientich(hc.getchieudai(), hc.getchieurong()));
    }
}
