
public class Fecha {
	int d;
	String m;
	int a;
	Fecha(int dia, String mes, int año){
		d=dia;
		m=mes;
		a=año;
	}
	 void ver() {
		System.out.println("Fecha: " + d + " de " + m + " de " + a);
	}
}
