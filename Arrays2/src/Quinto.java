
public class Quinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[5];
		for(int i=0;i<5;i++) {
			array[i]=i+1;
		}
		int array2[]= new int[5];
		for(int i =5, cont=0;i>0;i--, cont++) {
			array2[cont]=i;
		}
		System.out.println("-------ARRAY 1--------");
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
		System.out.println("-------ARRAY 2--------");
		for(int i=0;i<5;i++) {
			System.out.println(array2[i]);
		}
	}

}
