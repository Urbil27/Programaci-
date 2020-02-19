
public class Biblioteca {
	int numero;
	
	public Biblioteca(int n) {//Constructor
		numero=n;
	}
	public boolean espar() {//Metodo
		return numero%2==0;
		}
	int cantidaddigitos() {//Metodo
		int aux;
		int cont=0;
		aux=numero;
		while (aux!=0) {//Metodo
			aux=aux/10;
			cont++;
			
		}
		return cont;
	
	}
		boolean tiene5() {//Metodo
			return cantidaddigitos()>5;
	}
		boolean multiplode10() {//Metodo
			return numero%10==0;
		}
	}


