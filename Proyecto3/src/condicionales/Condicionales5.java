package condicionales;
import java.util.Scanner;

public class Condicionales5 {
	private static Scanner numero;
public static void main (String[] args) {
	
	numero = new Scanner(System.in);
	System.out.println("Ingrese un n�mero: ");
	int x = 0;
	x = numero.nextInt();
	
	
	if (x<10)
		System.out.println("Usted ingres� un n�mero de una sola cifra.");
	else
		System.out.println("Usted ingres� un n�mero de dos cifras.");
	
	
	
	
}
}