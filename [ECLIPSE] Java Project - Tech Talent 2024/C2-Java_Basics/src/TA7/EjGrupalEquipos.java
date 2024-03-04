package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class EjGrupalEquipos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> edadesAlumnos = new HashMap<>();
        System.out.println("Introduce la cantidad de alumnos totales.");
        int alumnosTotales = Integer.parseInt(sc.nextLine());
        int i = 0;
        do {
            System.out.println("Alumno " + (i + 1) + ":");
            formulario(edadesAlumnos);
            i++;
        } while (i < alumnosTotales);
        System.out.println("La edad de los alumnos de clase es:");
        impHashMapKeyValue(edadesAlumnos);
        
        System.out.println("--FIN DE PROGRAMA--");
    }

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
}

//estudiantesTechTalent.put("Laia", 23);
//estudiantesTechTalent.put("Aurora", 22);
//estudiantesTechTalent.put("Alexandre", 21);
//estudiantesTechTalent.put("Jose", 20);
//estudiantesTechTalent.put("Santos", 24);
//estudiantesTechTalent.put("Manel", 21);
//estudiantesTechTalent.put("Alejandro", 20);
//estudiantesTechTalent.put("Isabel", 22);
//estudiantesTechTalent.put("Toni", 21);
//estudiantesTechTalent.put("Diego", 22);
//estudiantesTechTalent.put("Sebas", 22);
//estudiantesTechTalent.put("Abdel", 21);
//estudiantesTechTalent.put("Joel", 20);
//estudiantesTechTalent.put("Jessica", 22);
//estudiantesTechTalent.put("Ana Maria", 29);
