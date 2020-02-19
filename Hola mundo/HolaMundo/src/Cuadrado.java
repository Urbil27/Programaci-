import java.util.Scanner;
public class Cuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero = teclado.nextInt();
		
		while (numero != 0) {
			
			int respuesta = (numero)*(numero);
			System.out.println(respuesta);
			teclado = new Scanner(System.in);
			System.out.println("Introduce un número:");
			 numero = teclado.nextInt();
		}
	}

}
