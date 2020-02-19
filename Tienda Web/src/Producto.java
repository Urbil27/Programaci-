
public class Producto {
	private String nombre;
	private double precio;
	private int cantidad;
public Producto(String n, double p, int c) {
	nombre = n ;
	precio = p ;
	cantidad = c ;
	
}
void escribirProducto() {
	System.out.println(nombre+", precio "+precio+" cantidad "+cantidad);
}
}
