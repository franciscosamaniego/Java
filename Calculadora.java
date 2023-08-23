import java.util.Scanner;
import java.util.ArrayList;


public class Calculadora {
	public static void sumar() {
		double res = 0.0;
		//creacion de un array dinamico para luego sumar los numeros ingresados por el usuario
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//le pido al usuario ingresar numeros hasta que el ingrese -1
		System.out.println("Ingrese los numeros que quiere sumar (o -1 para terminar)");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) break;
			numeros.add(n);
		}
		//el for each genera un valor (num) por cada espacio de una variable(numeros)
		//en este caso cada numero se suma a una variable resultado
		for(int num : numeros) {
			res += num;
		}
		System.out.println("Res: " + res);
	}
	
	public static void restar() {
		double res = -1.0;
		//creacion de un array dinamico para luego restar los numeros ingresados por el usuario
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//le pido al usuario ingresar numeros hasta que el ingrese -1
		System.out.println("Ingrese los numeros que quiere restar (o -1 para terminar)");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) break;
			numeros.add(n);
		}
		//en este caso cada numero se resta en una variable resultado, como la variable inicia en -1, se inicializa
		//con el primer numero
		for(int num : numeros) {
			if(res == -1) res = num;
			else res -= num;
		}
		System.out.println("Res: " + res);
	}

	public static void multiplicar() {
		double res = -1.0;
		//creacion de un array dinamico para luego multiplicar los numeros ingresados por el usuario
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//le pido al usuario ingresar numeros hasta que el ingrese -1
		System.out.println("Ingrese los numeros que quiere multiplicar (o -1 para terminar)");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) break;
			numeros.add(n);
		}
		//en este caso cada numero se multiplica en una variable resultado, como la variable inicia en -1, se inicializa
		//con el primer numero
		for(int num : numeros) {
			if(res == -1) res = num;
			else res *= num;
		}
		System.out.println("Res: " + res);
	}

	public static void dividir() {
		double res = -1.0;
		//creacion de un array dinamico para luego dividir los numeros ingresados por el usuario
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		//le pido al usuario ingresar numeros hasta que el ingrese -1
		System.out.println("Ingrese los numeros que quiere dividir (o -1 para terminar)");
		while(true) {
			int n = scanner.nextInt();
			if(n == -1) break;
			numeros.add(n);
		}
		//en este caso cada numero se divide en una variable resultado, como la variable inicia en -1, se inicializa
		//con el primer numero
		for(int num : numeros) {
			if(res == -1) res = num;
			else res /= num;
		}
		System.out.println("Res: " + res);
	}


	public static void main(String[] args) {
		while(true) {
			//interfaz comoda para el usuario que le deja elegir que operacion realizar
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bienvenido. Ingrese un numero correspondiente a la opcion que quiera");
			System.out.println("1)Sumar");
			System.out.println("2)Restar");
			System.out.println("3)Multiplicar");
			System.out.println("4)Dividir");
			System.out.println("5)Salir");
			int choice = scanner.nextInt();
			//este switch sirve para hacer el codigo mas comodo
			switch(choice) {
				case 1:
					sumar();
					break;
				case 2:
					restar();
					break;
				case 3:
					multiplicar();
					break;
				case 4:
					dividir();
					break;
				case 5:
					System.exit(0);
				default:
					System.out.println("Esa opcion no es valida");
					break;
			}
		}
      }
    }

