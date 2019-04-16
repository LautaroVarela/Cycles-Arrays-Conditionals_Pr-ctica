package ciclos;

import java.util.Scanner;
public class Ciclos4 {
private static Scanner entrada;

public static void main(String[] args) {
		
		
		int n = 0;
		entrada = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		n = entrada.nextInt();
		
		for(int i = 0 ; i<+5 ; i++ )
			
		{
			System.out.println(+n);
			n +=1;
		}
		
		
	}
	
	
	
}

//for(int c=0;c<=10;c++) { c=c+1; System.out.println(+c); }
