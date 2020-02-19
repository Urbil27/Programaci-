import java.util.Scanner;
public class Triangulonumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		int cont2;
		for(int cont=0;cont<=numero;cont++) {
			for(cont2=1;cont2<=cont;cont2++) {
				System.out.print(cont2);
			}
			System.out.println();
		}
	}

}
