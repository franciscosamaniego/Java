import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	String w1, w2;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese la primera palabra");
	w1 = scanner.next();
	System.out.println("Ingrese la segunda palabra");
	w2 = scanner.next();
	if(w2.length() == w1.length()) {
		int cont = 0;
		for(int i = 0; i < w1.length(); i++) {
			for(int j = 0; j < w2.length(); j++) {
				if(w2.charAt(i) == w1.charAt(j)) {
					cont++;
					break;
				}
			}
		}
		if(cont == w1.length()) System.out.println("Las palabra " + w1 + " es anagrama de la palabra " + w2);
		else System.out.println("Las palabras no son anagramas");
	}
	else System.out.println("Las palabras no son anagramas");
	}

}
