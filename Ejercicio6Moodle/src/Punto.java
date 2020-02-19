
public class Punto {
	int Xi;
	int Yi;
  Punto(int X, int Y){
	 Xi=X;
	 Yi=Y;
 }
 boolean xespositivo() {
	if(Xi>0) {
		return true;
	}
	else{
		return false;
	}
 }
 boolean yespositivo(){
	 if(Yi>0) {
		 return true;
	 }
	 else {
		 return false;
	 }
 }
 void muestra() {
	 if(xespositivo()==false && yespositivo()==true) {
		 System.out.println("El punto está en el primer cuadrante");
	 }
	 else if(xespositivo()==true && yespositivo()==true) {
		 System.out.println("El punto está en el segundo cuadrante");
	 }
	 else if(xespositivo()==false && yespositivo()==false) {
		 System.out.println("El punto está en el tercer cuadrante");
	 }
	 else if(xespositivo()==true && yespositivo()==false) {
		 System.out.println("El punto está en el cuarto cuadrante");
	 }
 }
}
