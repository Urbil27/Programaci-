import java.util.Scanner;
public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		int cont=0;
		
		while(numero>0) {
			numero=numero/10;
			if(numero%2==0) {
				cont++;
			}
		}
		System.out.println(cont);
	}
}
