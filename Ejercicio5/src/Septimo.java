import java.util.Scanner;

public class Septimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		int cont,cont2,blancos;
		int N=0;
		for(cont=0;cont<=numero;cont++) {
			for(blancos=1;blancos<=numero-cont;blancos++) {
				System.out.print(" ");
				
			}
			for(cont2=0;cont2<=cont;cont2++) {
				N++;
				System.out.print(N+" ");
			}
			System.out.println();
		}
	}

}

	


