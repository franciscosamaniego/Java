import java.util.Scanner;

public class Ejercicio3 {
	public static boolean esPrimo(int n) {
		int cont = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) cont++;
		}
		if(cont > 2) return false;
		else return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Ingrese un numero del 1 al 100 (en caso de ser mayor y ser primo se saldra");
			int numero = scanner.nextInt();
			if(numero > 100 && (esPrimo(numero) == true)) {
				System.out.println("Bye");
				System.exit(0);
			}
		}
	}
}
