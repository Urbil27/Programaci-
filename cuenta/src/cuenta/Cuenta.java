package cuenta;

public class Cuenta {
	Persona p1;
	long saldo;
	boolean rojos;
	Cuenta(Persona p){
		p1 = p;
		saldo = 0;
		rojos = false;
	}
	Cuenta(String nom,int edad,char sexo, long sal){
		saldo = sal;
	}
	void Deposito(long incrementar){
	saldo = saldo + incrementar;	
	}
	void Retiro(long disminuir) {
			saldo = saldo - disminuir;
			if (saldo<0) {
				rojos = true;
			}
			else {
				rojos = false;
			}
	}
	void Mostrar() {
		p1.mo
		System.out.println("Tu saldo es "+ saldo);
	}
}
