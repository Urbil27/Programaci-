package Items;

public class Item {
	int c;
	String t;
	String a;
	Item(int code, String title, String Author){
		 c = code;
		 t = title;
		 a = Author;
	}
	void Show(){
	System.out.println("Codigo: "+ c);
	System.out.println("Titulo: "+ t);
	System.out.println("Author: "+ a);
	}
}
