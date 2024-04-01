package TA9Herencia_Ej04_Raices;

public class raicesMainApp {

	public static void main(String[] args) {
		
		//Ejemplo 2 raices
		raices raiz1 = new raices(1, -4, 3);
	
		System.out.println(raiz1.toString());
		raiz1.calcular();
		
		//Ejemplo 1 raiz
		raices raiz2 = new raices(1, -2, 1);
		
		System.out.println(raiz2.toString());
		raiz2.calcular();
		
		//Ejemplo sin soluciones
		raices raiz3 = new raices(1, 1, 1);
		
		System.out.println(raiz3.toString());
		raiz3.calcular();

	}

}
