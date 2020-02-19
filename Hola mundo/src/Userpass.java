import java.util.Scanner;

public class Userpass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un Usuario:");
		int usuario = teclado.nextInt();
		Scanner  teclado1 = new Scanner(System.in);
		System.out.println("Introduce una contraseña:");
		int contraseña=teclado1.nextInt();
		while ((usuario != 1809)||(contraseña != 1234)) {
			teclado = new Scanner(System.in);
			System.out.println("Introduce un Usuario:");
			usuario = teclado.nextInt();
			teclado1 = new Scanner(System.in);
			System.out.println("Introduce una contraseña:");
			contraseña=teclado1.nextInt();
		}
		System.out.println("Contraseña y usuario correctos");
		
	}

}
