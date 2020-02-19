import java.util.Scanner;
public class Primero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double[] datos = new double [5];
		double total = 0;
		double media = 0;
		for (int i=0;i<5;i++) {
			System.out.println("Dame el numero "+i+" :");
			datos [i]= teclado.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			total=total+datos[i];
			media = total/5;
		}
		System.out.println("La media es: "+media);
	}

}
