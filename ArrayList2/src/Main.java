import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i = new Item(1,"hola", "Urbil");
		Item i1 = new Item(2,"hola", "Urbil");
		Item i2 = new Item(3,"hola", "Urbil");
		ArrayList<Item> items= new ArrayList();
		items.add(i);
		items.add(i1);
		items.add(i2);
		for(int c=0;c<items.size();c++) {
			//System.out.println(items.get(c).getCode());
			items.get(c).show();
			
		}
	}

}
