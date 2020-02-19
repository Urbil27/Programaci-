import java.util.Scanner;
public class Numeromayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero=teclado.nextInt();
		Scanner  teclado2 = new Scanner(System.in);
		System.out.println("Introduce otro número:");
		int numero2=teclado2.nextInt();
		if(numero > numero2) {
			System.out.println(numero);
		}
		else System.out.println(numero2);
		
	}

}
