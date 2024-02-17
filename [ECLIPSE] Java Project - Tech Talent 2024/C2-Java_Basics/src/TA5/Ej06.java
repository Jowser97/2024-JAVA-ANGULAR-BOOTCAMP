package TA5;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
	
	/*Lee un numero por teclado que pida el precio de un producto y calcule el precio
	final con IVA. El IVA sera una constante del 21%*/
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Compruebe el precio con IVA aplicado.\nInserte el precio");
		
	String precioIn = sc.nextLine ();
	sc.close();
		
	//Convertimos string en double
	double precio = Double.parseDouble(precioIn);
	
	final double IVA = 0.21;
	double precioConIva = (precio+(precio*IVA));
	System.out.println(precioConIva);
	
	/*Para evitar que me imprima un importe con muchos decimales, mediante chatGPT
	he buscado una herramienta para redondear a 2 decimales al alza*/
	
	BigDecimal importeFinal = new BigDecimal(precioConIva);
	importeFinal = importeFinal.setScale(2, BigDecimal.ROUND_HALF_UP);
	
	
	System.out.println("\nEl precio final a pagar es: " + importeFinal + "€.");
	
	/*En este ejercicio he creado un programa para calcular el precio al aplicar 
	el iva, he usado con la ayuda de chatGPT una herramienta para evitar que el 
	el precio final tuviera mas de dos decimales*/
	
	}

}
