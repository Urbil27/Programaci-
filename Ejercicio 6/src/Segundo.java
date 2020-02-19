import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int numero=teclado.nextInt();
		System.out.println("Dame una posición");
		int posicion=teclado.nextInt();
		int cont=0;
		int cont2=0;
		int aux,b=0;
		aux=numero;
		while(numero>0) {
			numero=numero/10;
			cont2++;
			}
		while(cont<=(cont2-posicion)) {
			b=aux%10;
			aux=aux/10;
			cont++;
			
		}
		System.out.println(b);
}
}