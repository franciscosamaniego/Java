import java.util.Scanner;
//java: ejercicios basicos
//1) Escribir por consola los numeros del 1 al 100 e informar si el mismo es par, imprimir su valor por pantalla.
//2) Escribir por consola los numeros del 50 al 100 e informar si es un numero primo, sino escribir sus divisores.
//3) Pedir numeros por pantalla solo hasta que alguno sea mayor a 100 y ademas sea numero primo.
//4) Realizar una calculadora con las operaciones aritmeticas simples(suma, resta, multiplicacion y division).
//5) Pensar y desarrollar un ejemplo donde se vea el uso de for each y comentarlo pertinentemente

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
