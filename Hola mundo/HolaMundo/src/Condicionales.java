
import java.util.Scanner;
public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=teclado.nextInt();
		if (numero > 5) {
			System.out.println("El número que has introducido es mayor que 5");
			
		}
		else {
			System.out.println("El número que has introducido es menor o igual que 5");
		}
	}

}
