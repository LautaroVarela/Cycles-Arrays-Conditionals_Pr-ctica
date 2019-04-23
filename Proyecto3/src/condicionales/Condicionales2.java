package condicionales;
import java.util.Scanner;
public class Condicionales2 {
	private static Scanner numero;

	public static void main(String[] args) {

	
	{
	numero = new Scanner (System.in);	
	int x=0;
	System.out.println("Ingrese un numero menor a 4: ");
	x = numero.nextInt();

	
	if (x<4) {
		System.out.println("El número: " + x + ", es menor a 4.");
	}
	if (x>4) {
		System.out.println("El número: " + x + ", es mayor a 4.");
	}
	}
	}
}

