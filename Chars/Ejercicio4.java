import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String palabra, b, c;
		int cont = 0;
		System.out.println("Ingrese la palabra");
		palabra = scanner.next();
		System.out.println("Ingrese la letra que quiere reemplazar");
		b = scanner.next();
		System.out.println("Ingrese la letra que quiere que reemplaze la letra anterior");
		c = scanner.next();
		System.out.println("Palabra original: " + palabra);
		//este for recorre toda la palabra que ingreso el usuario para luego comparar cada caracter con el caracter
		//que desea reemplazar el usuario. Si hay un caracter que es igual, este se reemplaza por el nuevo caracter que ingreso el
		//usuario
		for(int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == b.charAt(0)) {
				palabra = palabra.replace(palabra.charAt(i), c.charAt(0));
				cont++;
			}
			
		}
		//si no se encuentra ningun caracter que sea igual al que se ingreso, le avisara al usuario.
		if(cont == 0) {
			System.out.println("La letra que elegiste no esta en la palabra");
			System.exit(0);
		}
		System.out.println("Palabra modificada: " + palabra);
	}
}
