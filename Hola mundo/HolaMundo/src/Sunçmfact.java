import java.util.Scanner;

public class Sunçmfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = teclado.nextInt();
		int sum=0;
		for(int cont=0;cont<=num;cont++) {
			sum=cont+num;
			
		}
		System.out.println("el sumatorio es"+sum);
	}

}
