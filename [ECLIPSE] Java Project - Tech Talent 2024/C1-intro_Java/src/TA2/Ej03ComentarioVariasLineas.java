package TA2;

public class Ej03ComentarioVariasLineas {

	public static void main(String[] args) {
		/* Queremos definir el inicio y final para contar los numeros en el bucle for
		por eso, vamos a crear unas variables de inicio y fin para poder usarlas en
		el bucle y asi definirlo.*/
		int inicioCuenta = 4;	//las hemos creado aqui: inicioCuenta y finalCuenta
		int finCuenta = 8;		//son, respectivamente, el primer numero a partir
								//del cual contamos y el ultimo numero que obtenemos
		
		System.out.println("Hola" //eliminamos el comentario para poder ver los system.out y los juntamos en uno
				+ "\nAdios"
				+ "\nCucu"
				+ "\n\n¡Vamos a contar desde " +inicioCuenta+ " hasta " +finCuenta+ "!");
				//hemos creado un mensaje en consola para plasmar el rango que hemos
				//escogido a trabajar en el bucle for
		
		for (int contador = inicioCuenta; contador <= finCuenta; contador++) { 
		//eliminamos el comentario ya que no aportaba nada
			
			System.out.print(contador+" ");	//delimitamos el for con {llaves}
		}
		/* Hemos cambiado el nombre de la variablo i a contador ya que esa es su funcion
		en el bucle. Establecemos el valor de contador = inicioCuenta para empezar a contar
		desde el numero que queremos. En la condicion del for <= finCuenta para contar hasta
		el numero que queremos*/
		
		System.out.println("\nFIN DE PROGRAMA");
	}

}
