package TA7;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej04Supermercado23Juntos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido a -supermercado generico- ");
            HashMap<String, Double> carrito = new HashMap<>();
            ArrayList<Double> precioIVA = new ArrayList<>();
            HashMap<String, Double> productosPrecios = new HashMap<>();
            productosPrecios.put("Leche", 0.99);
            productosPrecios.put("Pan", 0.79);
            productosPrecios.put("Cerveza", 1.49);
            productosPrecios.put("Patatas", 1.29);
            productosPrecios.put("Galletas", 0.89);
            productosPrecios.put("Aceite", 2.49);
            productosPrecios.put("Huevos", 1.69);
            productosPrecios.put("Arroz", 1.19);
            productosPrecios.put("Papel higiénico", 0.99);
            productosPrecios.put("Zumo", 1.29);

            HashMap<String, Integer> productosStock = new HashMap<>();
            productosStock.put("Leche", 50);
            productosStock.put("Pan", 100);
            productosStock.put("Cerveza", 200);
            productosStock.put("Patatas", 150);
            productosStock.put("Galletas", 80);
            productosStock.put("Aceite", 60);
            productosStock.put("Huevos", 120);
            productosStock.put("Arroz", 90);
            productosStock.put("Papel higiénico", 70);
            productosStock.put("Zumo", 100);

            boolean volver = false;
            while (!volver) {
                mostrarMenuPrincipal();
                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        añadirElementoInventario(productosPrecios, productosStock);
                        break;
                    case "2":
                        realizarCompra(carrito, precioIVA);
                        break;
                    case "3":
                        mostrarInventario(productosPrecios, productosStock);
                        break;
                    case "4":
                        añadirElementoCarritoDesdeStock(productosPrecios, productosStock, carrito);
                        break;
                    case "5":
                        salir = true;
                        volver = true;
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
        }

        System.out.println("¡Gracias por utilizar nuestro supermercado!");
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\nMenú Principal:");
        System.out.println("1. Añadir elemento al inventario");
        System.out.println("2. Realizar compra");
        System.out.println("3. Mostrar inventario");
        System.out.println("4. Añadir elemento al carrito");
        System.out.println("5. Salir");
        System.out.print("Por favor, seleccione una opción: ");
    }

    public static void añadirElementoInventario(HashMap<String, Double> productosPrecios,
            HashMap<String, Integer> productosStock) {
        preguntaAñadirInventario(productosPrecios, productosStock);
    }

    public static void mostrarInventario(HashMap<String, Double> productosPrecios,
            HashMap<String, Integer> productosStock) {
        mostrarHashMapPreciosPanel(productosPrecios, productosStock);
    }

    public static void realizarCompra(HashMap<String, Double> carrito, ArrayList<Double> precioIVA) {
        preguntaAñadirCarrito(carrito, precioIVA);
        imprimirHashMap(carrito, precioIVA);
        tiquetCompra(precioIVA);
    }

    public static String obtenerProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce producto.");
        String producto = sc.nextLine();
        return producto;
    }

    public static double obtenerPrecio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio.");
        double precio = Double.parseDouble(sc.nextLine());
        return precio;
    }

    public static double obtenerPrecioConIva(double precio) {
        Scanner sc = new Scanner(System.in);
        double iva;
        System.out.println("Es un producto de primera necesidad?(si/no)");
        String respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            iva = 1.04;
        } else {
            iva = 1.21;
        }
        return precio * iva;
    }

    public static void imprimirHashMap(HashMap<String, Double> HashMap, ArrayList<Double> precioIVA) {
        int contador = 0;
        DecimalFormat formato = new DecimalFormat("#.##");
        for (String producto : HashMap.keySet()) {
            double precioBruto = HashMap.get(producto);
            double precioConIVA = precioIVA.get(contador);
            String ivaFormateado = formato.format(precioConIVA);
            System.out.println(producto + " -> " + precioBruto + "€, precio más IVA: " + ivaFormateado + "€");
            contador++;
        }
    }

    public static double totalCompra(ArrayList<Double> precioIVA) {
        double suma = 0;
        for (double precio : precioIVA) {
            suma += precio;
        }
        return suma;
    }

    public static void pagar(double totalapagar) {
        DecimalFormat formato = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in);
        System.out.println("Con cuanto desea pagar?");
        double dinero = Double.parseDouble(sc.nextLine());
        System.out.println("Ha pagado con: " + dinero + "€");
        double vuelta = dinero - totalapagar;
        String vueltaFormateado = formato.format(vuelta);
        System.out.println("Su cambio es de: " + vueltaFormateado + "€");
    }

    public static void preguntaAñadirCarrito(HashMap<String, Double> HashMap, ArrayList<Double> precioIVA) {
        String respuestaCarrito = "";
        do {
            System.out.println("Desea añadir elementos al carro?(y/n)");
            Scanner sc = new Scanner(System.in);
            respuestaCarrito = sc.nextLine();
            if (respuestaCarrito.equalsIgnoreCase("y")) {
                String producto = obtenerProducto();
                double precioBruto = obtenerPrecio();
                double precioConIVA = obtenerPrecioConIva(precioBruto);
                HashMap.put(producto, precioBruto);
                precioIVA.add(precioConIVA);
            }
        } while (respuestaCarrito.equalsIgnoreCase("y"));
    }

    public static void tiquetCompra(ArrayList<Double> precioIVA) {
        double totalPagar = totalCompra(precioIVA);
        DecimalFormat formato = new DecimalFormat("#.##");
        String totalPagarForm = formato.format(totalPagar);
        System.out.println("El total a pagar es: " + totalPagarForm + "€");
        pagar(totalPagar);
    }

    public static void mostrarHashMapPreciosPanel(HashMap<String, Double> precio, HashMap<String, Integer> unidades) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : precio.keySet()) {
            double precioDeKey = precio.get(key);
            int unidadesDeKey = unidades.get(key);
            stringBuilder.append(key).append(": ").append(precioDeKey).append("€").append(" -> ").append(unidadesDeKey)
                    .append("\n");
        }
        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }

    public static void añadirArticuloInventario(HashMap<String, Double> hashmapPrecio,
            HashMap<String, Integer> hashmapUnidades, String respuesta) {
        Scanner sc = new Scanner(System.in);
        if (respuesta.equalsIgnoreCase("y")) {
            System.out.println("Por favor introduzca articulo.");
            String articulo = sc.nextLine();
            System.out.println("Ahora el precio");
            double precio = Double.parseDouble(sc.nextLine());
            System.out.println("Cuantos desea añadir?");
            int cantidad = Integer.parseInt(sc.nextLine());
            hashmapPrecio.put(articulo, precio);
            hashmapUnidades.put(articulo, cantidad);
        }
    }

    public static void añadirElementoCarritoDesdeStock(HashMap<String, Double> productosPrecios,
            HashMap<String, Integer> productosStock, HashMap<String, Double> carrito) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inventario:");
        mostrarInventario(productosPrecios, productosStock);
        System.out.print("Ingrese el nombre del producto: ");
        String producto = sc.nextLine();
        if (productosStock.containsKey(producto) && productosStock.get(producto) > 0) {
            int cantidadDisponible = productosStock.get(producto);
            System.out.print(
                    "Ingrese la cantidad que desea agregar al carrito (disponible: " + cantidadDisponible + "): ");
            int cantidad = sc.nextInt();
            if (cantidad <= cantidadDisponible) {
                double precio = productosPrecios.get(producto);
                double total = precio * cantidad;
                if (carrito.containsKey(producto)) {
                    total += carrito.get(producto);
                }
                carrito.put(producto, total);
                productosStock.put(producto, cantidadDisponible - cantidad);
                System.out.println("Producto agregado al carrito.");
            } else {
                System.out.println("No hay suficiente cantidad disponible en el inventario.");
            }
        } else {
            System.out.println("El producto no está disponible en el inventario.");
        }
    }

    public static void preguntaAñadirInventario(HashMap<String, Double> hashmapPrecio,
            HashMap<String, Integer> hashmapUnidades) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Desea añadir un articulo? (y/n)");
            respuesta = sc.nextLine();
            añadirArticuloInventario(hashmapPrecio, hashmapUnidades, respuesta);
        } while (respuesta.equalsIgnoreCase("y"));
    }
}