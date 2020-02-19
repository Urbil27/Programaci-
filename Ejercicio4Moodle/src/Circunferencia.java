
public class Circunferencia {
	float radio;
	String color;
	final double PI=3.1416;
	
public Circunferencia(float r, String c) {
	radio = r ;
	color = c ;
}
double area(){
	return(2*PI*radio);//Calculamos el Area
}
void printPerimeter() {
	double perimetro;
	perimetro = PI*radio*radio;//Calculamos el perimetro
	System.out.println("El perimetro de la circunferencia es"+perimetro);//Imprimimeços el perimetro en pantalla
}
boolean isBig() {
	if(area()>20) {
		return true;//Si Area es mayor que 20 devolver VERDADERO
	}
	else {
		return false;//Si Area es menor que 20 devolver FALSO
	}
}

boolean isEqualTo(Circunferencia c) {
	
	return this.color==c.color&&this.radio==c.radio;//Devolvemos si esta circunferencia es igual a la que nos piden desde el main
	}
}
