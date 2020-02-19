import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = teclado.nextInt();
		for(int cont=0;cont<=10;cont++) {
			System.out.println(num+"*"+cont+"="+num*cont);
		}
	}

}
