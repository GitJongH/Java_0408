package Ch04;

class Boiler {
	int temp;
	public Boiler() {
		temp = 0;
	}
	
	public Boiler(int t) {
		temp = t;
	}
	
	public int tempUp() {		
		return ++temp;
	}
	
	public int tempDown() {		
		return --temp;
	}
	
	public int tempUpDown(int t) {
		temp += t;
		
		return temp;
	}
}

public class BoilerTest { // 김종현
	public static void main(String[] args) {
		Boiler t1 = new Boiler();
		System.out.println("T1의 현재 온도 : " + t1.temp + "도");
		t1.tempUp();
		System.out.println("T1의 현재 온도 : " + t1.temp + "도");
		
		Boiler t2 = new Boiler(10);
		System.out.println("T2의 현재 온도 : " + t2.temp + "도");
		t2.tempUpDown(-5);
		System.out.println("T2의 현재 온도 : " + t2.temp + "도");
	}
}
