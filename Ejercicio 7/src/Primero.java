import java.util.Scanner;
public class Primero {
	public static void main(String args[]) {
		System.out.print("Dime un numero:");
		Scanner teclado = new Scanner(System.in);
			long n = teclado.nextLong();
			int cont=0,num1=1,num2=2;
			while(cont<=n) {
				System.out.print(num2+" ");
				num2= num2+num1;
				num1=num1*2;
				cont++;
			}
	}

}