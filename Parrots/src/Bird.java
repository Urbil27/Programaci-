
public class Bird {
	static int numeroDePajaros;
	char sex;
	int ed;
 Bird(char sexo,int edad){
	 sex=sexo;
	 ed=edad;
 }
 int numeroPajaros(){
	 return numeroDePajaros;
 }
 void quienSoy() {
	 System.out.println("mi sexo es:"+sex+" y mi edad es: "+ed);
 }
}
