package Ch04;

import java.util.Scanner;

class MyPhone {
	private int year, vol;
	
	public void show() {
		System.out.println("출시년도 : " + year + "년 볼륨 " + vol);
	}
	
	public int volUp() {
		return vol += 10;
	}
	
	public int volDown() {
		return vol -= 10;
	}
	
	public int getYear() {
		return year;
	}
	
	public int setYear(int year) {
		return this.year = year;
	}
	
	public int getVol() {
		return vol;
	}
	
	public int setVol(int vol) {
		return this.vol = vol;
	}
	
	public MyPhone() {
		year = 2023;
		vol = 10;
	}
	
	public MyPhone(int year, int vol) {
		this.year = year;
		this.vol = vol;
	}
}

public class MyPhoneTest {
	public static void main(String[] args) { // 김종현
		Scanner s = new Scanner(System.in);
		System.out.print("폰정보 입력(출시년도,볼륨)>> ");
		MyPhone mp1 = new MyPhone(s.nextInt(), s.nextInt());
		
		System.out.print("폰정보 입력(출시년도,볼륨)>> ");
		MyPhone mp2 = new MyPhone(s.nextInt(), s.nextInt());
		
		System.out.println("=폰 정보 목록=");
		System.out.print("1) ");
		mp1.show();
		System.out.println("볼륨 : " + mp1.getVol());
		
		mp2.volUp(); // mp2.setVol(20);
		
		System.out.print("2) ");
		mp2.show();
		System.out.println("볼륨 : " + mp2.getVol());
	}
}
