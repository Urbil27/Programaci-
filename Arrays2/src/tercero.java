import java.util.Scanner;
public class tercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		char [] letra= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("Dame el numero de tu DNI y te dare la lerta");
		int num = teclado.nextInt();
		int pos=num%23;
		System.out.println("La letra es: "+letra[pos]);
	
	}

}