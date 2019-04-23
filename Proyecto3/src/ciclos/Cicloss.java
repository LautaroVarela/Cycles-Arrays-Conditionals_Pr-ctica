package ciclos;
import java.util.Scanner;
public class Cicloss 
{
	
private static Scanner scan;

public static void main(String[] args) 
	
	{
		int i = 0;
		while (i<10)
		{
			System.out.println(i+1);
			i++;
		}
		
		for (int j = 0 ; j<10 ; j++)
		{	
			//System.out.println(j+1);
		}
		
		
		// Utilizando ciclos For, hacer un programa que le pida 
		//al usuario que ingrese 5 números y luego los muestre en pantalla.

		
		scan = new Scanner (System.in);
		String numeros_enCadena = "";
		
		for (int k = 0  ;k <5  ; k++   )
		{
			//intrucciones
			System.out.println("ingrese un numero: ");
			numeros_enCadena = scan.nextLine() + " " + numeros_enCadena ;
	
			
		}
		
		System.out.println("los valores ingresados fueron: " + numeros_enCadena);
		
		
		
		
		
		
		
	}
	
	
}


