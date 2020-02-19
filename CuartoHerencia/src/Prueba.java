public class Prueba {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alumno a1 = new Alumno("Urbil",27,"junio",2001);
		//a1.mostrar();
		AlumnoDep ad1 = new AlumnoDep("piragua",200,"urbil",27,"junio",2001);
		AlumnoDep ad2 = new AlumnoDep("piragua",250,"miguel",27,"junio",2001);
		ad1.ver();
		AlumnoDep ad3=ad1.elmejor(ad2);
		ad3.ver();
		
	}

}
