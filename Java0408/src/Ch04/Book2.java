package Ch04;

public class Book2 {
	String title, author;
	void show() {
		System.out.println(title + " " + author);
	}
	
	public Book2() {
		this("",""); // title="", author=""
		System.out.println("생성자 호출됨");
	}
	
	public Book2(String title) {
		this(title, "작가 미상");
	}
	
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book2 littlePriince = new Book2("어린완자", "생텍쥐페리");
		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBbook = new Book2();
		loveStory.show();
	}
}
