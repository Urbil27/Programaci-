import java.util.Scanner;
public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int array []= new int[5];
		for(int i =0;i<5;i++) {
			array [i] = teclado.nextInt();
		}
		for(int i=4;i>=0;i--) {
			System.out.println(array[i]);
		}
	}

}
