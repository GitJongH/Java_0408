package Ch04;

class Movie {
	int year;
	double score;
	String title;
	public void print() {
		System.out.println("제목 : " + title + ", 평정 : " + score + ", 연도 : " + year);
	}
	public Movie() {
		title = "파묘";
		score = 5.0;
		year = 2023;
	}
	
	public Movie(String t, double s, int y) {
		title = t;
		year = y;
		score = s;
	}
}

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		Movie m2 = new Movie("알라딘", 4.5, 2019); 
		m2.print();
		m1.year = 2024;
		m1.print();
	}
}
