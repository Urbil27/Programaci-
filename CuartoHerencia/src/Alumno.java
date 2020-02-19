
public class Alumno {
	String nombre;
	Fecha fecha;
	
	Alumno(String n, Fecha f){
		nombre = n;
		fecha = f;
	}
	Alumno(String n, int d,String m, int a){
		fecha= new Fecha(d,m,a);
		nombre =n;
		
		
	}
	void mostrar() {
		System.out.println("El nombre es: "+ nombre);
		fecha.ver();
	}
}
