import java.util.Scanner;
public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int array [] = new int [10];
		for(int i=0;i<10;i++) {
			System.out.println("Dame un numero para la posicion "+i+" del array");
			array[i]=teclado.nextInt();
		}
		System.out.println("-------------RESPUESTA------------");
		for(int i2 = 0; i2<10;i2++) {
			System.out.println("en la posicion "+ i2+" del array hay un " + array[i2]);
		}
	}

}
