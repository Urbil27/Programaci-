import java.util.Scanner;

public class Contraseña1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
			Scanner  teclado = new Scanner(System.in);
			int contra = 0;
			while(contra!=1234) {
				System.out.println("Introduce una contraseña:");
				contra=teclado.nextInt();
			}
			System.out.println("Contraseña correcta, Estás dentro!");
			
	}

}
