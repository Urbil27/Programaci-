
public class Canary extends Bird {
	char sex;
	int ed;
	char reg;
	Canary(char sexo, int edad,char region) {
		super (sexo,edad);
		sex=sexo;
		ed=edad;
		reg=region;
	}
	void deDondeSoy() {
		if(reg=='N') {
			System.out.println("Norte");
		}
		else if(reg=='S') {
			System.out.println("Sur");
		}
		else if(reg=='E') {
			System.out.println("Este");
		}
		else if(reg=='O') {
			System.out.println("Oeste");
			
		}
		else {
			System.out.println("ERROR Caracter de región no permitido");
		}
	}

}
