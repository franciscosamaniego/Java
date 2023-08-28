import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombre;
		//Programa que le pide al usuario una palabra y esta se imprime mas un saludo
		System.out.println("Ingrese su nombre");
		nombre = scanner.next();
		System.out.println("Bienvenido, " + nombre);
	}

}
