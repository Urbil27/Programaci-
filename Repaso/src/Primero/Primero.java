
package Primero;
import java.util.Scanner;
public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la contidad de mçumeros de la serie.");
		int num = teclado.nextInt();
		int cont=0;
		int numero=1;
		while(cont<num) {
			if(cont==0) {
				numero =2;
				System.out.println(numero);
				
			}
			else {
				numero = (numero*2)-1;
				System.out.println(numero);	
			}
		
		
		cont++;
		}
		
	}

}
