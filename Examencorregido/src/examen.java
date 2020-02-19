import java.util.Scanner;
public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		int opcionsalir=0;
		int contveces=0,filas=0;
		do {
			System.out.println("Escoje una de las siguientes opciones");
			System.out.println("1. Piramide");
			System.out.println("2. Numeros amigos");
			opcion=teclado.nextInt();
			if(opcion==1) {
				contveces++;
				System.out.println("Dime la dimaension de la piramide");
				int dimension=teclado.nextInt();
				//if(dimension>3 || dimension<9 && dimension%2!=0) {
					for(filas=1;filas<=dimension*2-1;filas++) {
						System.out.print("X ");}
					
					System.out.println();
					
					for(filas=1;filas<=dimension-1;filas++)
					{
						
						for(int izq=1; izq<=dimension-filas;izq++) {
							System.out.print("X ");
						}
						for(int numero=1;numero<=filas*2-1;numero++) {
							System.out.print(filas+" ");
						}
						for(int izq=1; izq<=dimension-filas;izq++) {
							System.out.print("X ");
						}
						
						
						System.out.println();
					}
			}
				
				
			
			
			else if(opcion==2) {
				contveces++;
				System.out.println("He entrado en 2");
				
			}
			System.out.println("Desea salir?");
			opcionsalir=teclado.nextInt();
			
		}
		while(opcionsalir!=1 && opcionsalir!=2 &&contveces<3 );
	}

}
