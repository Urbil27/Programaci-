package cuenta;

public class Pruebacuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Urbil", 'h', 18);
		Cuenta c1 = new Cuenta(p1);
		c1.Deposito(5000000);
		c1.Retiro(1500);
		c1.Mostrar();
	}
}
