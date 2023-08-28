import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String w1, w2, w3, w4, w5;
		int l1, l2, l3, l4, l5;
		
		System.out.println("Ingrese la primera palabra");
		w1 = scanner.next();
		System.out.println("Ingrese la segunda palabra");
		w2 = scanner.next();
		System.out.println("Ingrese la tercera palabra");
		w3 = scanner.next();
		System.out.println("Ingrese la cuarta palabra");
		w4 = scanner.next();
		System.out.println("Ingrese la quinta palabra");
		w5 = scanner.next();
		
		l1 = w1.length();
		l2 = w2.length();
		l3 = w3.length();
		l4 = w4.length();
		l5 = w5.length();
		
		String [] words = {w1,w2,w3,w4,w5};
		int [] lengths = {l1,l2,l3,l4,l5};
		int max = 0;
		int idx = 0;
		for(int i = 0; i < 5; i++) {
			if(max < lengths[i]) {
				max = lengths[i];
				idx = i;
			}
		}
		System.out.println("La palbra con mas caracteres es: " + words[idx] + ", siendo de " + lengths[idx] + " caracteres");
	}

}
