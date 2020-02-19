
public class Funciones {
static void saludo(){
	System.out.println("HOLA AQUI ESTOY");
}
static void saludoquien(String quien){
	System.out.println("HOLA SOY "+ quien);
}
static int suma(int sum1,int sum2){
	int sdo=sum1 + sum2;
	return sdo;
}
static void factolisto (int n) {
	int num=1;
	for(int cont=1;cont<=n;cont++) {
		num=num*cont;
		
	}
	
	System.out.println("El factorial de "+n+" es "+num);
}
static int factotonto (int n){
	int num=1;
	for(int cont=1;cont<=n;cont++) {
		num=num*cont;
		
	}
	return num;
	
}
static int factrec(int n) {
	if (n==1) {
		return 1;
	}
	else return n*factrec(n-1);
			
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	saludo();
	saludoquien("Urbil");
	suma(2,2);
	System.out.println("La suma de ambos numeros es "+ suma(2,2));
	factolisto(7);
	System.out.println(factotonto(7));
	System.out.println(factrec(7));
}
}