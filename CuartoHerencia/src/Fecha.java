
public class Fecha {
	int d;
	String m;
	int a;
	Fecha(int dia, String mes, int a�o){
		d=dia;
		m=mes;
		a=a�o;
	}
	 void ver() {
		System.out.println("Fecha: " + d + " de " + m + " de " + a);
	}
}
