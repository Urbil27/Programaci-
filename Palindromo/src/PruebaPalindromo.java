
public class PruebaPalindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Palindromo p1 = new Palindromo(123321);
		
		if(p1.esPalindromo()) {
			System.out.println("El numero es palindromo");
		}
		else {
			System.out.println("El numero NO es palindromo");
		}
	}

}
