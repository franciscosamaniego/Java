import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
	String w1, w2;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Ingrese la primera palabra");
	w1 = scanner.next();
	System.out.println("Ingrese la segunda palabra");
	w2 = scanner.next();
		//primero compara que las longitudes sean iguales, ya que para que una palbra sea anagrama de otra tienen que tener la misma
		//cantidad de caracteres. Luego, con dos for se recorre para comparar que los caracteres que hay en una palabra esten en otras.
		//Al sumarle a un contador, si este es igual a la longitud de las palbras, significa que son anagramas
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
		//Si no son anagramas, se le avisa al usuario
		if(cont == w1.length()) System.out.println("Las palabra " + w1 + " es anagrama de la palabra " + w2);
		else System.out.println("Las palabras no son anagramas");
	}
	else System.out.println("Las palabras no son anagramas");
	}

}
