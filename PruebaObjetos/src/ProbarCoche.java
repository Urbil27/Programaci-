public class ProbarCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		coche c1 = new coche ("Opel Corsa", "Rojo",90);
		coche c2 = new coche ("Renault Clio","Negro",128);
		//Mostrar los KM de los 2 coches
		System.out.println("El coche 1 tiene: "+c1.ObtenerKm()+"Km" );
		System.out.println("El coche 2 tiene: "+c2.ObtenerKm()+" Km"); 
		
		//Añadimos 50Km al coche 1
		c1.AñadirKM(50);
		//Mostramos los Km que ahora tiene el coche 1
		System.out.println("El coche 1 ahora tiene: "+c1.ObtenerKm()+"Km" );
	}
}
