import java.util.Scanner;

public class PruebaFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de filas");
		int columnas=teclado.nextInt();
		for(int c=1;c<=columnas;c++) {
			
			for(byte f=1;f<=columnas;f++) {
				if((f==1)||(f==columnas)||(c==1)||(c==columnas)) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			
			}
			System.out.println();
		}		
	}
}
