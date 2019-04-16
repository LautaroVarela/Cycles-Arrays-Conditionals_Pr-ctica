package arreglos;

public class arreglos1 {
	public static void main (String[] args)

	{
		
	int [] arreglo_enteros = new int[5]; //[0,0,0,0,0]
	arreglo_enteros[0] = 1;
	arreglo_enteros[1] = 2;
	arreglo_enteros[2] = 3;
	arreglo_enteros[3] = 4;
	arreglo_enteros[4] = 5;	

}
}

/*manera 1 en funcion
		int []arreglo_enteros_funcion = guardar_valores(arreglo_enteros); //al final vale [1,2,3,4,5]  
		
	
	
	
//manera2
		int[] arreglo_entero_2 = { 1, 2, 3, 4, 5};
		//en funcion				
		int[] arreglo_entero_2_funcion = guardar_valor_2(); //[ 1, 2, 3, 4, 5]
		

	
	
	
//manera 3
		for (int i = 0; i < 5 ; i++) 
		{	
			//System.out.println("i vale: " + i);
			//System.out.println("el valor de la posicion " + i + "es " + arreglo_entero_2[ i ]);
			arreglo_entero_2[i] = i + 1;
			
		}*/