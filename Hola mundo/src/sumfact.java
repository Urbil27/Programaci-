import java.util.Scanner;
public class sumfact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número y calcularé el sumatorio y el factorial");
		int numero=teclado.nextInt();
		//Calculamos el sumatorio
		int sum=0;
		for(int cont=1;cont<=numero;cont++) {
			sum=sum+cont;
		}
		//Calculamos el factorial
		int fact=1;
		for(int cont2=1;cont2<=numero;cont2++) {
			fact=fact*cont2;
		}
		System.out.println("El sumatorio es "+sum+" y el factorial es "+ fact);
	}

}
