import java.util.Scanner;
public class Ejerciciocondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=teclado.nextInt();
		if (numero > 0) {
			System.out.println("Has intoducido un numero positivo");
			
		}
		else if(numero == 0) {
			System.out.println("El numero que has introducido es 0");
		}
		else {
			System.out.println("El número que has introducido es negativo");
		}
	}

}
