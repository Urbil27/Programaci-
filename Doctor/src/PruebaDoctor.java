
public class PruebaDoctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cirujana c1=new Cirujana();
		Doctor d1 = new Doctor();
		DoctordeFamilia df1 = new DoctordeFamilia();
		c1.hacerIncision();
		df1.darConsejos();
		c1.tratarPaciente();
		df1.tratarPaciente();
		d1.tratarPaciente();
	}
}
