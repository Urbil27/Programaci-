
public class Cuarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont2=0, num2=0;
		int num=100;
		int sumres=0;
		for(int cont=0;cont<6;cont++) {
			num2=num;
			if(cont%2==0) {
				sumres=-20;
				num=num-20;
				}
				else {
					sumres=+10;
					num=num+10;
				}
			for(cont2=0;cont2<6;cont2++) {
				System.out.print(num2+"\t");
				num2=num2+sumres;
			
		
			}
			System.out.println();
			
		}
	}

}
