/*
*Ngày tạo : 28 thg 10, 2021
*Tác giả : Trần Quốc Khánh
*/
package com.khanhtq2008110082.Tuan8.HinhChuNhat;

public class HinhChuNhat {
	//khai báo thuộc tính
	double chieudai;
	double chieurong;
	//đóng gói
	public  void setchieudai(double cd) {
		if (cd>0) {
			this.chieudai=cd;
		}else {
			System.out.println("lỗi 1");
		}

	}
	public double getchieudai() {
		return this.chieudai;
	}
	
	public  void setchieurong(double cr) {
		if (cr>0) {
			this.chieurong=cr;
		}else {
			System.out.println("lỗi 2");
		}

	}
	public double getchieurong() {
		return this.chieurong;
	}
	//hàm tạo dùng để khởi tạo đối tượng
	public  HinhChuNhat() {}
	public HinhChuNhat(double cd,double cr) {
		if (cd>0) {
			this.chieudai=cd;
		}else {
			System.out.println("lỗi 3");
		}
		if (cr>0) {
			this.chieurong=cr;
		}else {
			System.out.println("lỗi 4");
		}
	}
	//cài đặt phương thức tính chu vi
	public double tinhchuvi(double cd,double cr) {
		return (cd+cr)*2;
	}
	//cài đặt phương thức tính diện tích
	public double tinhdientich(double cd,double cr) {
		return cd*cr;
	}
	@Override
	//tạo mẫu in
	public String toString() {
		String s;
		s = "Chiều dài là : " + getchieudai() +"\nChiều rộng là : " + getchieurong() + "\nChu vi là : " + tinhchuvi(getchieudai(), getchieurong()) + "\nDiện tích là : " + tinhdientich(getchieudai(), getchieurong());
		return s;
	}
	public void xuat(){
		System.out.println(toString());
	}
}
