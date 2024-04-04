package Arrays1D;

import java.util.Iterator;

public class cheatsheet {

	public static void main(String[] args) {

		//Declarar array
		int i = 4; //i = cantidad de valores
		int[] n = new int[i];
		
		//Introducir valores al array
		n[0] = 1;
		n[1] = 2;
		n[2] = 3;
		n[3] = 4;
		
		//Tambien se puede declarar directamente
		int[] m = {1,2,3,4};
		
		//Recorrer array
		for (int j = 0; j < m.length; j++) {
			System.out.println(m[j]);
		} 
		
		//Array de strings
		String[] colores = {"rojo", "amarillo", "azul", "verde", "blanco"};
		
		//Recorrer array de strings
		for (int k = 0; k < colores.length; k++) {
			System.out.println(colores[k]);
		}
		
		
		
	}

}
