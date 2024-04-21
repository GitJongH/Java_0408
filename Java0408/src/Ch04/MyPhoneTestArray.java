package Ch04;

import java.util.Scanner;

class MyPhone2 {
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
	
	public MyPhone2() {
		year = 2023;
		vol = 10;
	}
	
	public MyPhone2(int year, int vol) {
		this.year = year;
		this.vol = vol;
	}
}

public class MyPhoneTestArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		MyPhone2[] arr = new MyPhone2[2];
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print("폰정보 입력(출시년도,볼륨)>> ");
			arr[i] = new MyPhone2(s.nextInt(), s.nextInt());
		}
		
		System.out.println("=폰 정보 목록=");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + ") ");
			arr[i].show();
			if(i == 1) arr[i].volUp();
			System.out.println("볼륨 : " + arr[i].getVol());
		}
	}
}
