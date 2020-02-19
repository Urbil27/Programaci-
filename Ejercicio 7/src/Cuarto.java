import java.util.Scanner;

public class Cuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int entrar=0;
		int num=0;
		Scanner teclado = new Scanner(System.in);
	
		do {
			
			System.out.println("ELIGE UN PROGRAMA:");
			System.out.println("1. Calcula el cuadrado.");
			System.out.println("2. Calcula el cubo.");
			System.out.println("3. Calcula el sumatorio.");
			System.out.println("4. Calcula el factorial");
			System.out.println("5. Calcula la raiz cuadrada");
			System.out.println("6. Calcula si el numero es primo");
			System.out.println("7. Salir.");
			 entrar=teclado.nextInt();
			 switch(entrar) {
			 	case 1:
			 		System.out.println("Calculo el cuadrado");
			 		System.out.println("Dame un numero:");
			 		num=teclado.nextInt();
			 		num=num*num;
			 		System.out.println("El cuadrado es "+num);
				break;
			 	case 2:
			 		System.out.println("calculo el cubo");
			 		System.out.println("Dame un numero:");
			 		num=teclado.nextInt();
			 		num=num*num*num;
			 		System.out.println("El cubo es "+num);
			 	break;
			 	case 3:
			 		System.out.println("Calcula el sumatorio");
			 		System.out.println("Dame un numero:");
			 		num=teclado.nextInt();
			 		int sum=0;
					for(int cont=1;cont<=num;cont++) {
						sum=sum+cont;
					}
					System.out.println("El sumatorio es "+ sum);
			 	break;
			 	case 4:
			 		System.out.println("Calcula el factorial");
			 		int fact=1;
			 		System.out.println("Dame un numero:");
			 		num=teclado.nextInt();
					for(int cont2=1;cont2<=num;cont2++) {
						fact=fact*cont2;
					}
					System.out.println("El factorial es "+fact);
			 	break;
			 	case 5:
			 		System.out.println("Calcula raiz cuadrada");
			 		System.out.println("Dame un numero: ");
			 		num = teclado.nextInt();
			 		float resultado = (float) Math.sqrt(num);
			 		System.out.println("La raiz cuadrada de "+ num +  " es: " + resultado);
			 	break;
			 	case 6:
			 		System.out.println("Calcula si el numero es primo");
			 	      System.out.print("Dame un numero: ");
			 	        num = teclado.nextInt();
			 	        int cont = 0;
			 	        for(int I = 1; I <= num; I++){
			 	            if((num % I) == 0){
			 	                cont++;
			 	            }
			 	        }
			 	 if(cont <= 2){
			 	            System.out.println("El numero es primo");
			 	        }
			 	 else{
			 	            System.out.println("El numero no es primo");
			 	        }
			 	break;
			 	case 7:
			 		System.out.println("Saliendo...");
			 	break;
			 	default:
			 		System.out.println("Introduce un numero del 1 al 7");
			 	break;			 	
			 }			 
		}
		while(entrar!= 7);
	}
}
