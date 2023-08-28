import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre = " ";
		while(true) {
			int cont = 0;
			System.out.println("Ingrese una palabra (o Exit para salir)");
			nombre = scanner.next();
			if(nombre.equalsIgnoreCase("Exit")) {
				System.out.println("Bye");
				System.exit(0);
			}
			//este programa le pide al usuario ingresar una palabra, y este revisa si es un palindromo. Para hacerlo,
			//con un for compara cada caracter de izquierda a derecha y, si son iguales , es un palindromo
			int i = 0;
			for(int j = nombre.length()-1; i < j; j--) {
				char ci = nombre.charAt(i);
				char cj = nombre.charAt(j);
				if(Character.isUpperCase(ci)) ci = Character.toLowerCase(ci);
				else if(Character.isUpperCase(cj)) cj = Character.toLowerCase(cj);
				if(ci == cj) cont++;
				i++;
			}
			if(cont == (nombre.length() / 2)) System.out.println("Esta palabra es un palindromo");
			else System.out.println("Esta palabra no es un palindromo");
		}
	}
}
