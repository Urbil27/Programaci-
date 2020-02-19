import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Agenda {
	
	private Map<String,int[]> ag;
	int topeMax;
	Agenda(int tope){
	
		ag=new HashMap<String,int[]>();
		//arr=new int[10];
		topeMax=tope;
		
	}
	public void addEntry(String nombre,int[] a) {
		Scanner teclado=new Scanner(System.in);
		
		if (ag.containsKey(nombre)) {
			System.out.println("su agenda tiene estos numeros de tfno para\n"+nombre+searchName(nombre));
			System.out.println("quieres reemplazarlos 1 SI 2 NO");
			int num =teclado.nextInt();
			if ( num==1) {
				ag.put(nombre,a);
			}
			
		}
		else {
			if (ag.size()==topeMax) {
				System.out.println("Agenda llena");
			}
			else {
				ag.put(nombre,a);
			}
		}
		
	}
	public String searchName(String n) {
		String rdo="";
		if (ag.containsKey(n)) {
			int[] a=ag.get(n).clone();
			for(int i=0;i<a.length;i++) {
				rdo=rdo+","+a[i];
			}
		
			
			
		}
		else {
			rdo=n+"no esta en la agenda";
		}
		return rdo;
	}
	
	public  int mostrar(int numtfno) {
		/*System.out.println("devuelvo cuantas personas tienen el mismo tel�fono");
		int[]a;
		int conttfno=0;
		Iterator it=ag.keySet().iterator();
		while (it.hasNext()) {
			String key=(String) it.next();
			 a =  ag.get(key);
			for(int i=0;i<a.length;i++) {
				if (a[i]==numtfno) {
					conttfno++;
				}
			}
		
		}
		return conttfno;*/
		
		System.out.println("devuelvo cuantas personas tienen el mismo telefono");
		int[]a;
		int conttfno=0;
		Iterator it=ag.values().iterator();
		while (it.hasNext()) {
			a=(int[]) it.next();
			
			for(int i=0;i<a.length;i++) {
				if (a[i]==numtfno) {
					conttfno++;
				}
			}
		}
		return conttfno;
		
	}
		public void mostrar() {
		System.out.println("Saco la informacion de la agenda");
		int[]a;
		Iterator it=ag.keySet().iterator();
		while (it.hasNext()) {
			String key=(String) it.next();
			 a =  ag.get(key);
			System.out.print("clave:"+ key);
			for(int i=0;i<a.length;i++) {
				System.out.print("   "+a[i]+",");
			}
			System.out.println("");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda agen=new Agenda(2);
		int [] a1= {123456789,615789878,222222222,999999999,77777777};
		int [] a2= {222222222,123456789,444444444};
		int [] a3= {3333333,9999999,666666666};
		
		agen.addEntry("iko", a1);
		agen.addEntry("iko", a2);
		agen.addEntry("gorka", a2);
		agen.addEntry("mar", a3);
		
		agen.mostrar();
		System.out.println("tienen el mismo tfno:"+agen.mostrar(123456789));
	}
}