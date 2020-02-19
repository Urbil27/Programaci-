import java.util.Scanner;

public class Flecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		int cont2=0;
		int cont=0;
		for(cont=0;cont<=(numero/2+numero%2);cont++) {
			for(cont2=0;cont2<cont;cont2++) {
				System.out.print("*");
		
				}
				System.out.println();
			}
		for(cont=numero/2;cont>=1;cont--) {
			for(cont2=0;cont2<=cont/2;cont2++) {
				System.out.print("*");
			}
			System.out.println();
	}
		
}
}