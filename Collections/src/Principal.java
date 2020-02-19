import java.util.ArrayList;
import java.util.Iterator;
public class Principal {
	ArrayList <Integer> nume;
	Principal(){
		nume=new ArrayList<Integer>();
	}
	public void prime10div(int num) {
		for(int i=1,numdiv=0;i<=num&&numdiv<=9;i++) {
			if(num%i==0) {
				nume.add(i);
				numdiv++;
			}
		}
	}
	public void mostrar() {
		System.out.println(nume.contains(10));
		Iterator <Integer> ite=nume.iterator();
		while(ite.hasNext()) {
			int i=ite.next();
			System.out.println(i);
		}
	}
	public void mostrar1() {
		for(int i:nume) {
			System.out.println(i);
		}
	}
	public void mostrar2() {
		for(int i=0;i<nume.size();i++) {
			System.out.println(nume.get(i));
		}
	}
	public void borrar() {
		nume.clear();
	}
	public void cargaAleatorios() {
		for(int i=0;i<=100;i++) {
			int ale=(int)(Math.random()*100+1);
			System.out.println(ale);
			nume.add(ale);
			System.out.println(nume.contains(ale));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal e1=new Principal();
		e1.prime10div(880);
		System.out.println("con el metodo totring del ArrayList");
		System.out.println(e1.nume);
		System.out.println("con un iterator");
		e1.mostrar();
		System.out.println("Con un for elegante");
		System.out.println("Con un for hasta size()");
		e1.mostrar2();
		e1.borrar();
		System.out.println("Despues de borrar");
		e1.mostrar();
		System.out.println(e1.nume);
		e1.cargaAleatorios();
	}

}
