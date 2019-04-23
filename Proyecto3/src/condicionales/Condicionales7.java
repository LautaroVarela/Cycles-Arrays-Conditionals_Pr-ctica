package condicionales;
import java.util.Scanner;

public class Condicionales7 {
private static Scanner consumo;
          public static void main (String[] args)

{
consumo = new Scanner(System.in);
System.out.println("Ingrese el consumo de KW: ");

         int x = 0;
         x = consumo.nextInt();
         
         int pesos_en_primeros200 = 20;
         
         float impuestos = (float) 7.8;
         
         float kw_excedentes = (float) 0.5;
         
         float resultado_agregado = pesos_en_primeros200+impuestos+kw_excedentes;
         
         
         if (x>=200)
        	 System.out.println("Su consumo equivale a: " + resultado_agregado);
         
         else 
        	 System.out.println(pesos_en_primeros200 + impuestos);
}
}
