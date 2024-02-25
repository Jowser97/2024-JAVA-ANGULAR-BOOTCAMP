package TA6;

import java.util.Scanner;

public class Ej07 {

    public static void main(String[] args) {

        /*7) Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a 
        otra moneda, estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, 
        la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor,
        mostrara un mensaje indicando el cambio (void).*/

        System.out.println("Bienvenido al conversos de moneda.\nTenemos disponible:\nYen"
                + "\nDolar\nLibra");

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de Euros a convertir.");
        double cantidadEuros = sc.nextDouble();

        System.out.println("A que moneda desea hacer la conversion?");
        String monedaCambio = sc.next().toUpperCase();

        conversorMoneda(cantidadEuros, monedaCambio);

        sc.close();

    }

     public static void conversorMoneda(double cantidadEuros, String monedaDestino) {

        double tasaCambio = 0;
        String monedaCambio = "";

        switch (monedaDestino) {
            case "YEN":
                tasaCambio = 129.852;
                monedaCambio = "yenes";
                break;
            case "DOLAR":
                tasaCambio = 1.28611;
                monedaCambio = "dolares";
                break;
            case "LIBRA":
                tasaCambio = 0.86;
                monedaCambio = "libras";
                break;
            default:
                System.out.println("No ha introducido una moneda disponible."
                        + " Vuelva a ejecutar el programa.");
                return;
        }
        double cantidadConvertida = cantidadEuros * tasaCambio;
        System.out.println(cantidadEuros + " euros es igual a " + cantidadConvertida + " " + monedaCambio);

     }

}
