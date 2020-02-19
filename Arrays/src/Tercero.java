import java.util.Scanner;
public class Tercero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int meses [] = new int [13];
		
		meses[1] = 31;
		meses[2] = 28;
		meses[3] = 31;
		meses[4] = 30;
		meses[5] = 31;
		meses[6] = 30;
		meses[7] = 31;
		meses[8] = 31;
		meses[9] = 30;
		meses[10] = 31;
		meses[11] = 30;
		meses[12] = 31;
		
		System.out.println("Dame un numero de mes");
		int numero = teclado.nextInt();
		System.out.println(meses[numero]);
	}

}
