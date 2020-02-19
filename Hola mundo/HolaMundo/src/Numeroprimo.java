import java.util.Scanner;

public class Numeroprimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  teclado = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = teclado.nextInt();
		
		System.out.println("Introduce un número:");
		int num2 = teclado.nextInt();
		int contdiv=0;
		int div=0;
		int j=0;
		for(j=num;j<=num2;j++) 
		{
			
			for(div=1; div<=j;div++) {
				
				if(j%div==0) contdiv++;
				
			}
			if(contdiv==2) { 
				System.out.println(j+" es primo");
				
			}
			//System.out.println(contdiv+" "+j);
			contdiv=0;
		}
	}
}
