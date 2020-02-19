import java.util.Scanner;
public class Cuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float nota;
		boolean notavalida=true;
		float [] notas = new float[10];
		String [] nombre=new String [10];
		String [] palabra = new String [10];
		for(int i=0;i<10;i++) {
			System.out.println("Dame el nombre del alumno "+(i+1));
			nombre[i]=teclado.nextLine();
		}
	for(int i=0;i<10 ;i++) {
		System.out.println("Dame la nota del alumno "+nombre[i]);
		nota=teclado.nextFloat();
		while(nota<0||nota>10) {
			System.out.println("Nota no valida");
			System.out.println("Dame la nota del alumno "+nombre[i]);
			nota=teclado.nextFloat();			
		}
		if(nota<5) {
			palabra[i]="Suspenso";
		}
		else if(nota<7) {
			palabra[i]="Bien";
		}
		else if(nota<9) {
			palabra[i]="Notable";
		}
		else {
			palabra[i]="Sobresaliente";
		}
		notas[i]=nota;
		}

	
	
	for(int i =0;i<10;i++) {
		System.out.println("el alumno "+nombre[i]+" ha sacado un "+notas[i]+", por lo tanto es un "+palabra[i]);
	}
	
	}

}
