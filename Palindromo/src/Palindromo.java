public class Palindromo {
	long numero;
	int contnumero = 0;

	Palindromo(long num) {
		numero = num;
	}

	int contardigitos() {
		int contador = 0;
		long copianum = numero;
		while (copianum > 0) {
			contador++;
			copianum = copianum / 10;
		}
		return contador;
	}

	long digiPosN(int pos) {
		long aux = numero;
		int cont = 1;
		long copianum = numero;
		while (contardigitos() >= pos && cont < pos) {

			copianum = copianum / 10;
			cont++;
		}
		return (int) copianum % 10;
	}

	boolean esPalindromo() {
		int cont = contardigitos();
		int aux1 = 0;
		int aux2 = 0;
		boolean palindromo = true;
		for (int cont1 = 1; cont1 < contardigitos() + 1 && palindromo; cont1++, cont--) {
			aux1 = (int) digiPosN(cont1);
			aux2 = (int) digiPosN(cont);
			if (aux1 != aux2) {
				palindromo = false;
			}

		}
		return palindromo;
	}
}
