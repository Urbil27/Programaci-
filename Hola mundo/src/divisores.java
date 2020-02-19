import java.util.Scanner;

public class divisores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int numero = teclado.nextInt();
		
		for(int cont=1;cont<=numero;cont++) {
			if((numero%cont)==0) {
				System.out.println(cont);
			}
			
		}
	}

}
