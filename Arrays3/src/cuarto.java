import java.util.Scanner;
public class cuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a [] = new int [10];
		int b [] = new int [10];
		int c [] = new int [20];
		int arraya=0;
		
		System.out.println("Dame los numeros para el array A");
		for(int i =0;i<10;i++) {
			a[i]=teclado.nextInt();
		}
		System.out.println("Dame lo numeros para el array B");
		for(int i = 0; i<10;i++) {
			b[i]=teclado.nextInt();
		}
		for(int i=0;i<10;i++) {
			
				c[arraya]=a[i];
				arraya++;
						
				c[arraya]=b[i];
				arraya++;
				
			}
		System.out.println("ARRAY C:");
		for(int i=0;i<20;i++) {
			System.out.println(c[i]);
		}
		}
	}

