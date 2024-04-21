package Ch04;

import java.util.Scanner;

class Food {
	private String name;
	private int kcal;
	
	public int cal(int count) {
		return count * kcal;
	}
	
	public String setName() {
		return name;
	}
	
	public int setKcal() {
		return kcal;
	}
	
	public String getName(String name) {
		return this.name = name;
	}
	
	public int getKcal(int kcal) {
		return this.kcal = kcal;
	}
	
	public Food() {
		name = "김치";
		kcal = 10;
	}
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
}

public class FoodTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Food[] arr = new Food[2];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("음식정보 입력(이름, 칼로리)>> ");
			arr[i] = new Food(s.next(), s.nextInt());
		}
		
		System.out.println("=음식 정보 목록=");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("음식명 : " + arr[i].setName() + ", 칼로리 : " + arr[i].setKcal());
		}
		
		System.out.print("음식명>> ");
		String name = s.next();
		System.out.print("주문개수>> ");
		int count = s.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].setName().equals(name)) {
				System.out.println("총 칼로리 = " + arr[i].cal(count));
			}
		}
	}
}
