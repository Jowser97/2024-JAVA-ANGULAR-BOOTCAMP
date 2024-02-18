package TA5;

import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        
    	
    	String contraseña = "bienvenido";
        Scanner sc = new Scanner(System.in);
        int intentos = 3;

        System.out.println("Bienvenido. \nPara poder acceder requiere de una contraseña"
        		+ " que ya conoce. Recuerde introducirla en minuscula.");
        
        while (intentos > 0) {
            System.out.print("Introduzca contraseña para acceder: ");
            String intento = sc.nextLine();
            
            //Aqui abro condicional if
            if (intento.equals(contraseña)) {
                System.out.println("Acceso concedido.");
                break;//Si acierta se acaba aqui.
            } else {//Si no,
                intentos--;//Se resta un intento
                if (intentos > 0) {	//Y vuelve a la linea 17 del codigo.
                					//siempre que los intentos sea superior a 0
                    System.out.println("Contraseña incorrecta. Le quedan " 
                    		+ intentos + " intentos.");
                } else { 	//Cuando intentos > 0 se aplica el siguiente sys.out.
                			//Y se cierra el bucle
                    System.out.println("Ha agotado todos sus intentos. "
                    		+ "No puede acceder.");
                }
            } 
        }sc.close();
       
    }
}
