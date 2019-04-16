package condicionales;
import java.util.Scanner;
public class Condicionales1 {

		private static Scanner scan;

		public static void main(String[] args) {
			
			scan = new Scanner (System.in);
			int x = 0;
			int y = 0;
			System.out.println("Ingrese su Edad: ");
			System.out.println("Ingrese su Distancia: ");
			x = scan.nextInt();
			y = scan.nextInt();
			
			if (x>16 && x<70 || y<500) 
			{
				System.out.println("Debe votar.");
			}
			
			else
				if  (x<16 || y>500)
			{
				System.out.println("No puede votar");
			}
			
				
				
				
		}
}
//if ((temperatura < 0 || temperatura > 30) && haceSol) {System.out.println("Mejor me quedo en casa")
