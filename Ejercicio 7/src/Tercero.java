import java.util.Scanner;
public class Tercero {
	public static void main(String args[]) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dime un numero:");
		int numero= teclado.nextInt();
		int cont=1,num=2,num2=6,num3=12;
			while(cont<=numero) {
				System.out.print(num+" ");
				num=num+num2;
				num2=num2+num3;
				num3=num3+6;
				cont++;
		}
	}
}