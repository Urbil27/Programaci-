public class recta {
	Punto p1 = new Punto (1,3);
	Punto p2 = new Punto (3, -5);
	int punto1x;
	int ancho;
	public recta(Punto p1, Punto p2, int ach) {
		this.p1=p1;
		this.p2=p2;
		this.ancho=ach;
	}
	public recta(int x1,int y1,int x2, int y2, int ach) {
		this.ancho=ach;
		p1=new Punto(x1,y1);
		p2=new Punto(x2,y2);
	}
	boolean esHorizontal(){

		if(p1.Yi == p2.Yi) {
			return true;
		}
		else {
			return false;
		}
		
	}
	boolean esVertical() {
		if(p1.Xi == p2.Xi) {
			return true;
		}
		else {
			return false;
		}
	}
	Punto puntoAlto() {
		if(p1.Yi>p2.Yi) {
			return p1;
		}
		else {
			return p2;
		}
	}
public double longitud() {
		
		return Math.sqrt(Math.pow(p2.Xi-p1.Xi,2)+Math.pow(p2.Yi-p1.Yi, 2));
	}
}