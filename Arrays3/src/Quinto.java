import java.util.Scanner;
public class Quinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int a [] = new int [12];
		int b [] = new int [12];
		int c [] = new int [24];
		int arraya=0;
		
		System.out.println("Dame los numeros para el array A");
		for(int i =0;i<12;i++) {
			a[i]=teclado.nextInt();
		}
		System.out.println("Dame lo numeros para el array B");
		for(int i = 0; i<12;i++) {
			b[i]=teclado.nextInt();
		}
		for(int i=0;i<12;i++) {
			for(int cont =0;cont<3;cont++) {
				c[arraya]=a[i];
				arraya++;
			}
			for(int cont =0;cont<3;cont++) {
				c[arraya]=b[i];
				arraya++;
			}
						
				
				
			}
		System.out.println("ARRAY C:");
		for(int i=0;i<24;i++) {
			System.out.println(c[i]);
		}
		}
	}

