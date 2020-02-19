import java.util.Scanner;
public class Sexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		long[] datos = new long [10];
	int t=0;
		long input =0;
		while(input!=-1) {
		boolean esta=false;	
		
		for (int i=0;i<10;i++) {
			System.out.println("Dame un numero:");
			t =teclado.nextInt();
			datos [i]= t;
		}
		System.out.println("¿Que numero quieres buscar?");
		 input=teclado.nextInt();
		for (int i=0;i<datos.length && !esta;i++) {
			if(datos[i]==input) {
				esta=true;
				System.out.println("El numero que has indicado está en la posicion "+i+" del array");
			}
		}
		if(esta==false) {
			System.out.println("El numero no está en el array ");
		}
	
	}

}
}