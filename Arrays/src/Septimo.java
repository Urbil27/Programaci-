import java.util.Scanner;
public class Septimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int respuesta2 = 0;
		int[] datos = new int [1000];
		System.out.println("Pulsa 1 si queres escribir un dato y pulsa 2 si no.");
		int respuesta = teclado.nextInt();
		while(respuesta==1) {
		for (int i=0;i<1000 && respuesta==1;i++) {
			System.out.println("Dame un numero:");
			datos [i]=teclado.nextInt();
			System.out.println("Quieres continuar?(1=SI,2=NO)");
			respuesta=teclado.nextInt();
		}
		System.out.println("¿Quieres comprobar si un numero está en el Array?(1=SI, 2=NO)");
		respuesta2=teclado.nextInt();
		}
		while(respuesta2==1) {
		for (int i=0;i<5;i++) {
			
		}
		}
	}

}
