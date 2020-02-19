import java.util.Scanner;

public class multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número y te daré la tabla de multiplicar");
		int numero=teclado.nextInt();
		for(int cont=0;cont<=10;cont++) {
			System.out.println(numero+"*"+cont+"="+numero*cont);
		}
	}
}

