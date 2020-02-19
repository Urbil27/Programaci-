import java.util.Scanner;

public class asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=teclado.nextInt();
		int contador = 0;
		while(contador<numero) {
			contador++;
			System.out.print("*");
			
		}
	}

}
