import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Ingrese un numero del 50 al 100(sino, se saldra del programa)");
		//int numero = scanner.nextInt();
		//este for recorre 50 numeros y calcula si es primo o no. Para saber eso, se crea un for que por cada numero, calcula si es divisible por 
		//todos los numeros anteriores a este. Por cada numero que es divisible, se le suma a un contador y si este supera los dos numeros, el codigo imprime
		//todos los numeros que son divisores de i. En caso contrario, muestra el numero y dice que es primo
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
