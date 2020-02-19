import java.util.Scanner;
public class Arraysordenados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[20];
		System.out.println("Insertamos los datos en el Array A");
		for(int i=0;i<10;i++) {
			if(i==0) {
				A[i]=teclado.nextInt();
			}
			else {
				int insert= teclado.nextInt();
				while(A[i-1]>insert) {
					System.out.println("El numero es mas pequeño que el anerior del array");
					insert = teclado.nextInt();
			}
				A[i]=insert;
			}	
		}
		System.out.println("Insertamos los datos en el Array b");
		for(int i=0;i<10;i++) {
			if(i==0) {
				A[i]=teclado.nextInt();
			}
			else {
				int insert= teclado.nextInt();
				while(B[i-1]>insert) {
					System.out.println("El numero es mas pequeño que el anterior del array");
					insert = teclado.nextInt();
				}	
				B[i]=insert;
			}
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(A[i]);
		}
		for(int i=0;i<10;i++) {
			System.out.println(B[i]);
		}
	}

}
