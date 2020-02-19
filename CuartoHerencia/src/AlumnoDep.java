
public class AlumnoDep extends Alumno {
String deporte;
int record;


	AlumnoDep(String dep, int rec, Fecha f, String n) {
		super(n,f);
		deporte= dep;
		record = rec;
	}
	AlumnoDep(String dep, int rec, String n, int d,String m,int a){
		super(n,d,m,a);
		deporte = dep;
		record = rec;
	}
	void ver() {
		super.mostrar();
		System.out.println("deporte: " + deporte);
		System.out.println("record: " + record);
	}
	AlumnoDep elmejor(AlumnoDep ad1){
	if(this.record>ad1.record) {
		return this;
	}
	else {
		return ad1;
	}
}
}