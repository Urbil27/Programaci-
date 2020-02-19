import java.util.Scanner;
public class OpArray {
	int[] array;
	OpArray(int longitud){
		 array = new int [longitud];
	}

	Scanner teclado = new Scanner(System.in);
	
	void cargaArray() {
		for(int i=0, entero=-1; i<10 && entero!=0;i++) {
			array[i] = entero;
			System.out.println("Dame un numero para la posicion "+i+" del array");
			entero = teclado.nextInt();
			
		}
	}
	
	void reemplazo(int num) {
		System.out.println("Dame un numero para reemplazarlo en el Array:");
		int aReemplazar = teclado.nextInt();
		System.out.println("Por que numero desea reemplazarlo?");
		int aColocar = teclado.nextInt();
		
	for(int i=0; i<10;i++) {
		if (array[i]==num) {
			
		}
	}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
