import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		int cont = 0;
		System.out.println("Ingrese una palabra");
		nombre = scanner.next();
		//Este programa le pide al usuario ingresar una palabra y, con un for, se revisa cada caracter y si este es una vocal. En caso de serlo
		// se le suma a un contador para luego mostrar el total de vocales
		for(int i = 0; i < nombre.length(); i++) {
			if(nombre.charAt(i) == 'a' || nombre.charAt(i) == 'e' || nombre.charAt(i) == 'i' || nombre.charAt(i) == 'o' || nombre.charAt(i) == 'u') {
				cont++;
			}
			else if(nombre.charAt(i) == 'A' || nombre.charAt(i) == 'E' || nombre.charAt(i) == 'I' || nombre.charAt(i) == 'O' || nombre.charAt(i) == 'U') {
				cont++;
			}
		}
		System.out.println("Cantidad de vocales: " + cont);
	}

}
