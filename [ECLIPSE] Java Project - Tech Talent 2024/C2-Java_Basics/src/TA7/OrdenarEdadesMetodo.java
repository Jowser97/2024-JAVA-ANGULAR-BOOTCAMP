package TA7;

import java.util.*;


public class OrdenarEdadesMetodo {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashMap<Integer, String> idNombre = new HashMap<>();
//        
//        idNombre.put(1, "Jose");
//        idNombre.put(2, "Isabel");
//        idNombre.put(3, "Joel");
//        idNombre.put(4, "Sebas");
//        idNombre.put(5, "Abdellah");
//        idNombre.put(6, "Antonio");
//        idNombre.put(7, "Diego");
//        idNombre.put(8,"Manel");
//        idNombre.put(9, "Jessica");
//        idNombre.put(10, "Santos");
//        idNombre.put(11, "Alex");
//        idNombre.put(12, "Ana María");
//        idNombre.put(13, "Aurora");
//        idNombre.put(14, "Laia");
//        idNombre.put(15, "Alejandro");
    
        
        HashMap<String, Integer> nombreEdad = new HashMap<>();
        //Para añadir manualmente los nombres y edades
//      int i = 0;
//      do {
//          System.out.println("Alumno " + (i + 1) + ":");
//          formulario(edadesAlumnos);
//          i++;
//      } while (i < alumnosTotales);
                
        nombreEdad.put("Jose", 26);
        nombreEdad.put("Isabel", 18);
        nombreEdad.put("Joel", 19);
        nombreEdad.put("Sebas", 29);
        nombreEdad.put("Abdellah", 21);
        nombreEdad.put("Antonio", 23);
        nombreEdad.put("Diego", 23);
        nombreEdad.put("Manel", 26);
        nombreEdad.put("Jessica", 26);
        nombreEdad.put("Santos", 24);
        nombreEdad.put("Alex", 28);
        nombreEdad.put("Ana María", 29);
        nombreEdad.put("Aurora", 29);
        nombreEdad.put("Laia", 23);
        nombreEdad.put("Alejandro", 19);
        
        imprimirGruposOrdenadosPorEdad(nombreEdad);
        
//        ArrayList<String> nombresOrdenadosPorEdad = new ArrayList<>(nombreEdad.keySet());
//        nombresOrdenadosPorEdad.sort(Comparator.comparingInt(nombreEdad::get));
//
//        // Imprimir los grupos
//        for (int i = 0; i < nombresOrdenadosPorEdad.size(); i += 3) {
//            System.out.println("Grupo " + (i / 3 + 1) + ":");
//            for (int j = i; j < Math.min(i + 3, nombresOrdenadosPorEdad.size()); j++) {
//                String nombre = nombresOrdenadosPorEdad.get(j);
//                int edad = nombreEdad.get(nombre);
//                System.out.println(nombre + " - Edad: " + edad);
//            }
//            System.out.println();
//        }
 }       
	   public static void imprimirGruposOrdenadosPorEdad(HashMap<String, Integer> nombreEdad) {
	        // Crear una lista ordenada de nombres por edad
	        ArrayList<String> nombresOrdenadosPorEdad = new ArrayList<>(nombreEdad.keySet());
	        nombresOrdenadosPorEdad.sort(Comparator.comparingInt(nombreEdad::get));

	        // Imprimir los grupos
	        for (int i = 0; i < nombresOrdenadosPorEdad.size(); i += 3) {
	            System.out.println("Grupo " + (i / 3 + 1) + ":");
	            for (int j = i; j < Math.min(i + 3, nombresOrdenadosPorEdad.size()); j++) {
	                String nombre = nombresOrdenadosPorEdad.get(j);
	                int edad = nombreEdad.get(nombre);
	                System.out.println(nombre + " - Edad: " + edad);
	            }
	            System.out.println();
	        }
	    }
        
//        List<List<Map.Entry<String, Integer>>> grupos = generarGruposEdad(nombreEdad);
//        
//        // Imprimir los grupos
//        for (int i = 0; i < grupos.size(); i++) {
//            System.out.println("Grupo " + (i + 1) + ":");
//            List<Map.Entry<String, Integer>> grupo = grupos.get(i);
//            for (Map.Entry<String, Integer> alumno : grupo) {
//                System.out.println(alumno.getKey() + " - " + alumno.getValue());
//            }
//            System.out.println();

    public static void formulario(HashMap<String, Integer> listadoHashmap) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre del alumno:");
        String nombre = sc.nextLine();
        System.out.println("Introduce la edad:");
        int edad = Integer.parseInt(sc.nextLine());
        listadoHashmap.put(nombre, edad);
    }

    public static void impHashMapKeyValue(HashMap<String, Integer> listadoHashmap) {
        for (String key : listadoHashmap.keySet()) {
            int valueDeKey = listadoHashmap.get(key);
            System.out.println(key + " / " + valueDeKey);
        }
    }

//    public static List<List<Map.Entry<String, Integer>>> generarGruposEdad(HashMap<String, Integer> alumnos) {
//        List<Map.Entry<String, Integer>> listaAlumnos = new ArrayList<>(alumnos.entrySet());
//        
//        Collections.sort(listaAlumnos, Comparator.comparing(Map.Entry::getValue));
//        
//        List<List<Map.Entry<String, Integer>>> grupos = new ArrayList<>();
//        for (int i = 0; i < listaAlumnos.size(); i += 3) {
//            List<Map.Entry<String, Integer>> grupo = new ArrayList<>();
//            for (int j = i; j < Math.min(i + 3, listaAlumnos.size()); j++) {
//                grupo.add(listaAlumnos.get(j));
//            }
//            grupos.add(grupo);
//        }
//        
//        return grupos;
//    }
    
}
