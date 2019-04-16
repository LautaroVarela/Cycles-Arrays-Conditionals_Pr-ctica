package condicionales;
import java.util.Scanner;

public class Condicionales6 {

	private static Scanner dni;
public static void main (String[] args) {
    
	
	dni = new Scanner(System.in);
	System.out.println("Ingrese su DNI: ");
	int x = 0; 
	int y = 30612453;
	int z = 23763290;
	int r = 21448503;
	int s = 34582048;
	int t = 15364857;
	x = dni.nextInt();
	
	if (x == y || x == z || x == r || x == s || x == t)
       {System.out.println("Este DNI ya existe.");} 

    else 
       {System.out.println("Su DNI se ha cargado.");}	
}
}


/*if (x != y || x != z || x != r || x != s || x != t)
{System.out.println("Su DNI se ha cargado.");} 

else 
{System.out.println("Este DNI ya existe.");}*/
