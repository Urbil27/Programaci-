
public class Item {
	private int code;
	private String title, author;
	
	Item(int code, String title, String author){
	this.code = code;
	this.title= title;
	this.author = author;
	
	}
	public int getCode() {
		return code;
	}
	public String getTitle() {
		return title;
	}
	public void show() {
		System.out.println("code: "+code+"\nTitle: "+title+"\nAuthor:"+author);
	}
}
