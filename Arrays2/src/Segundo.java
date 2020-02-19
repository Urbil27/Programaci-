
public class Segundo {
	
	public  static void main(String[]args) {
	//TODO Auto-generated method stub
		int suma =0;
		int media=0;
		int array[] = new int [100];
		for(int i =0; i<100;i++) {
			array[i]=i+1;
		}
		for(int i =0; i<100;i++) {
			suma = suma+ array[i];
		}
			media = suma/array.length;
		System.out.println("Media: "+media);
		System.out.println("Suma: "+suma);
}
}
