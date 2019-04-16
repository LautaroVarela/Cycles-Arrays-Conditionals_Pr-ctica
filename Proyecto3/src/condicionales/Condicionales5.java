package condicionales;
import java.util.Scanner;

public class Condicionales5 {
	private static Scanner numero;
public static void main (String[] args) {
	
	numero = new Scanner(System.in);
	System.out.println("Ingrese un número: ");
	int x = 0;
	x = numero.nextInt();
	
	
	if (x<10)
		System.out.println("Usted ingresó un número de una sola cifra.");
	else
		System.out.println("Usted ingresó un número de dos cifras.");
	
	
	
	
}
}