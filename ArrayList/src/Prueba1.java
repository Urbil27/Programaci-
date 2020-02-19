import java.util.*;
public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList();
		ArrayList<Integer> numbers = new ArrayList();
	
		names.add("Gorka");
		names.add("Ana");
		names.add("Xabi");
		names.add("Gerardo");
		System.out.println(names);
		names.add(2, "Carlos");
		names.add(4, "Carlos");
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
		//names.remove("Carlos");
		System.out.println(names);
		System.out.println(names.remove(0));
		System.out.println(names);
		//System.out.println(names.remove("Carlos"));
		System.out.println(names);
		System.out.println(names.size());
		//Recorrer ArrayList
		for(int i=0;i<names.size();i++) {
			String str = names.get(i);
			System.out.println(str);
		}
	
		for(int i=0;i<names.size();i++) {
			String str = names.get(i);
			if(str.contentEquals("Carlos")){
				names.remove(i);
			}
		}
		System.out.println(names);
		//Iterador
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
	}
	
}
