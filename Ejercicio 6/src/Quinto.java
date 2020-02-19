
import java.util.Scanner;
public class Quinto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		int N=teclado.nextInt();
		int num, primero=1,cont2;
		
		for(int cont=1;cont<=N;cont++) {
			num=primero;
			for(cont2=1;cont2<=N;cont2++) {
				System.out.print(num+"\t");
				num=num-cont;		
			}
			System.out.println();
			primero=primero*2;
		}
	}

}
