import java.util.Scanner;

public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		 int num=teclado.nextInt();
		 int num2=1;
		 int respuesta=0;
		for(int cont=1;cont<=num;cont++) {
			respuesta=respuesta*cont+cont;
			System.out.println(respuesta);
		}
	}

}
