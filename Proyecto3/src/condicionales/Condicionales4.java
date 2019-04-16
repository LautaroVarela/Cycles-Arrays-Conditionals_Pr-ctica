package condicionales;
import java.util.Scanner;
public class Condicionales4 {
	private static Scanner notas;

	public static void main (String[] args)
	
	{
	notas = new Scanner(System.in);
	System.out.println("Ingrese las dos notas del alumno:");
	int x = 0;
	int y = 0;
	x = notas.nextInt();
	y = notas.nextInt();
	float promedio = x + y / 2;
	
	if (promedio>7)
		System.out.println("¡Aprobado!");
	else 
		System.out.println("Desaprobado.");

}
}




/*Escritura en pantalla

public Class ImprimirCosas
{

public static void main (String[] args)
{
float cuenta = 1.5 ;
System.out.println(“El resultado es “ + cuenta + 1.3, “ aproximadamente.”);
}

}*/