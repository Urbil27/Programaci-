import java.util.Scanner;
public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un n�mero: ");
		Scanner teclado = new Scanner(System.in);
		int numero1 = teclado.nextInt();
		System.out.println("Introduzca otro n�mero: ");
		Scanner teclado2 = new Scanner(System.in);
		int numero2 = teclado2.nextInt();
		
		if((numero1 > 5)|| (numero2<7)) {
			System.out.println("Se cumple la condici�n");
			
		}
		else
			System.out.println("no se comple la condici�n");
	}

}

