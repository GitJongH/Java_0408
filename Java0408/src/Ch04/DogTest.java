package Ch04;

class Dog {
	String breed;
	int age;
	String color;
	public void print() {
		System.out.println("종 = " + breed + ", 나이 = " + age + ", 색상 = " + color);
	}
	
	public void barking() {
		System.out.println(breed + "가 멍멍 짖는다.");
	}
	
	public void eat(String food) {
		System.out.println(breed + "가 " + food +"을 먹는다.");
	}
	
	public Dog() {
		breed = "푸들";
		age = 1;
		color = "믹스";
	}
	
	public Dog(String b, int a, String c) {
		breed = b;
		age = a;
		color = c;
	}
}

public class DogTest {
	
	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.print();
		Dog d2 = new Dog("요크셔", 2, "갈색");
		d2.print();
		d2.eat("개껌");
		d2.barking();
	}

}
