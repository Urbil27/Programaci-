package Items;

public class Record extends Item {
	String disc;
	Record(int code, String title, String author, String discography){
		super(code, title, author);
		disc= discography;
	}
	void show() {
		System.out.println(disc);
	}
}
