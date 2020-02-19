package figuras;

public abstract class Figura {
	private float area;
	private float perimetro;
	void setArea(float Anum){
		area=Anum;
	}
	
	float getArea() {
		return area;
	}
	
	void setPerimetro(float Pnum) {
		perimetro=Pnum;
	}
	
	float getPerimetro() {
		return perimetro;
	}
	
}
