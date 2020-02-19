import java.util.Scanner;

public class numperfecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int suma = 0; 
		 int num=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número y te diré si es perfecto o no");
		 num=teclado.nextInt();
		for (int cont = 1; cont < num; cont++) { 
            if (num % cont == 0) {
                suma = suma + cont;    
            }
        }
        if (suma == num) {  
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");}
		
	}

}
