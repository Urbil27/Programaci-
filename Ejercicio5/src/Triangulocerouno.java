import java.util.Scanner;

public class Triangulocerouno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.Scanner;

		public class piramideasteriscos {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);
				System.out.println("Dame un numero");
				int numero=teclado.nextInt();
				int cont,cont2,blancos;
				for(cont=0;cont<=numero;cont++) {
					for(blancos=1;blancos<=numero-cont;blancos++) {
						System.out.print(" ");
						
					}
					for(cont2=0;cont2<=cont;cont2++) {
						
						System.out.print("* ");
					}
					System.out.println();
				}
			}

		}

		int cont2;
		int N=0;
		for(int cont=0;cont<=numero;cont++) {
			for(cont2=1;cont2<=cont;cont2++) {
				if(cont2==1) {
					if(cont%2!=0) {
						N=1;
						}
					else {
						N=0;
					}
				}
				else {
					if(N==0) {
						N=1;
					}
					else {
						N=0;
						
					}
					System.out.print(N);
				}
			}
		System.out.println();
		}
	}
}
