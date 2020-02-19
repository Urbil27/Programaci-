
public class coche {
	private String marca;//Marca del coche
	private String color;//Color del coche
	private double km;//Kms recorridos
	public coche (String m, String c, double kilometros) {
		marca = m;//Asigna la marca
		color = c;//Asigna el color
		km = kilometros;//Asigna los Km
	}
	public void AñadirKM(double km_de_mas) {
		km = km + km_de_mas;
	}
	public double ObtenerKm(){
		return km;
	}
	public String ObjetosColor() {
		return color;
	}
}
