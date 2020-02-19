package Items;

public class Book extends Item {
	int Pages;
	 Book(int code, String title, String author,int numPages){
		super(code, title, author);
		Pages=numPages;
	}
	 void show(){
		super.Show();
		System.out.println(Pages);
	 }
	 void fullCode() {
		 System.out.println(c+t+Pages);
	 }
}
