package condicionales;
import java.util.Scanner;
public class Condicionales3 {
	private static Scanner numero;

	public static void main(String[] args) {

	
	{ 
		int x = 0;
		int y=  0;
	numero = new Scanner (System.in);	
	
	System.out.println("Ingrese dos numeros ");
	x = numero.nextInt();
	y = numero.nextInt();

	
	if (x>y) 
	
	{System.out.println("El número " + x + " es mayor a " + y );}
		
	else 
		
	{System.out.println("El número " + x + " es menor a " + y );}
	
	
	}
	}
}
