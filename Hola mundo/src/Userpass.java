import java.util.Scanner;

public class Userpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un Usuario:");
		int usuario = teclado.nextInt();
		Scanner  teclado1 = new Scanner(System.in);
		System.out.println("Introduce una contrase�a:");
		int contrase�a=teclado1.nextInt();
		while ((usuario != 1809)||(contrase�a != 1234)) {
			teclado = new Scanner(System.in);
			System.out.println("Introduce un Usuario:");
			usuario = teclado.nextInt();
			teclado1 = new Scanner(System.in);
			System.out.println("Introduce una contrase�a:");
			contrase�a=teclado1.nextInt();
		}
		System.out.println("Contrase�a y usuario correctos");
		
	}

}
