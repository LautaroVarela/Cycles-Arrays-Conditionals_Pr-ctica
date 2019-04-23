package arreglos;

public class arreglos {
	public static void main (String[] args) {
	
	for (int i = 0; i < 5 ; i++) 
	{	
		int[] arreglo_entero_2;
		//System.out.println("i vale: " + i);
		//System.out.println("el valor de la posicion " + i + "es " + arreglo_entero_2[ i ]);
		arreglo_entero_2[i] = i + 1;
		
	}
	
	
	int[] arreglo = {1,2,3,4,5};
	arreglo = void negarValores(arreglo); // {-1,2,-3,-4,5};
	//imprimir_arreglo(arreglo);
	
	
	int [] b = {1,22,34,56,234,1000,3,2,4,5,666,434,3232};
	b = multiplicar_por_pos2(b);
	imprimir_arreglo(b);
	
}
}

