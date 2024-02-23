package UD7;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.*	Para coger todos

public class UD7ArrayListApp {

	public static void main(String[] args) {
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");
		lista.add("Elemento 4");
		lista.add("Elemento 5");
		
		//Esto me imprime uno a uno cada elemento
		for (Object o: lista) {
			System.out.println(o);
		
		}
		//Esto me imprime los elementos entre corchetes, separados con coma.
		System.out.println(lista.toString());
		
		ArrayList<Integer> listaNumeros=new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(4);
		
		System.out.println("_______\nAñadir add():");
		System.out.println(listaNumeros.toString());
		System.out.println(listaNumeros.size());
		
		System.out.println("_______\nEliminar remove():");
		listaNumeros.remove(2);
		System.out.println(listaNumeros.toString());
		
		System.out.println("_______\nTamaño size():");
		System.out.println(listaNumeros.size());
		
		System.out.println("_______\nObtener valor get(indice (del arraylist)):");
		System.out.println(listaNumeros.get(0));
		
		System.out.println("_______\nIterador/Repeticiones en bucle iterator():");
		Iterator<Integer> it = listaNumeros.iterator();
		int num;
		while (it.hasNext()){
			num= it.next();
			System.out.println(num);
		}
		
		System.out.println("_______\nValor en un indice completo indexOf():");
		System.out.println(listaNumeros.indexOf(1));

		System.out.println("_______\nElimina todos los elementos clear():");
		listaNumeros.clear();
		System.out.println(listaNumeros.toString());
		
	}

}
