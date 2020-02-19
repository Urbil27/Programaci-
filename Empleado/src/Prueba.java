
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado();
		Programador p1 = new Programador();
		DatabasePro d1 = new DatabasePro();
		p1.nombre="pepe";
		p1.edad=56;
		p1.salario=3000;
		p1.lenguaje="Java";
		e1.nombre="Ana";
		e1.edad=35;
		e1.salario=2950;
		e1.printData();
		d1.nombre="Haizea";
		d1.edad=21;
		d1.salario=3500.5;
		d1.databaseTool="phpMyAdmin";
		
		System.out.println();
		p1.printData();
		System.out.println();
		d1.printData();
	}

}
