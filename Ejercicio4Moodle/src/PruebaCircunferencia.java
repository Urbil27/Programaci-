
public class PruebaCircunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circunferencia c1 = new Circunferencia(4,"Rojo");
Circunferencia c = new Circunferencia(5,"Azul");
c1.printPerimeter();
System.out.println(c1.area());
System.out.println("Is big? " + c1.isBig());
System.out.println("Is Equal? "+ c1.isEqualTo(c));
	}

}
