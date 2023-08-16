import java.util.Scanner;

public class Clase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			//System.out.println("Ingrese un numero del 1 al 100, de caso contrario saldra del programa");
			//int numero = scanner.nextInt();
		for(int numero = 1; numero <= 100; numero++) {
			if(numero < 100 && numero > 0) {
				if(numero % 2 == 0) System.out.println("Este numero es par: " + numero);
				}
			}
		System.out.println("Bye");
		System.exit(0);
		}
	}
}
