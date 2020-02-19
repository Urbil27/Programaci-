import java.util.Scanner;
public class Segundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int [] numeros= new int[8];
		int masalto = -9999;
		for(int i=0;i<8;i++) {
			System.out.println("Dame un numero:");
			numeros [i]= teclado.nextInt();
		}
		for(int i=0;i<8;i++) {
			if(numeros[i]>masalto) {
				masalto=numeros[i];
			}
		}
		System.out.println("El numero mas alto es: "+ masalto);  
	}

}
