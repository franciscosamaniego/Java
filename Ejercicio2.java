import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Ingrese un numero del 50 al 100(sino, se saldra del programa)");
		//int numero = scanner.nextInt();
		for(int numero = 50; numero <= 100; numero++) {
			int cont = 0;
				for(int i = 1; i <= numero; i++) {
					if(numero % i == 0) cont++;
				}
			if(cont > 2) {
				System.out.println("Divisores de este numero " + numero);
				for(int j = 1; j <= numero; j++) {
					if(numero % j == 0) System.out.println(j);
				}
			}
			else System.out.println("Este numero es primo: " + numero);
		}
	}

}
