package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class _01Colecciones {
	public static void main(String[] args) {
		ArrayList<String> letras  = new ArrayList<>();
		letras.add("a");
		letras.add("b");
		letras.add("c");
		letras.add("d");
		letras.add("d");
		letras.add("e");
		
		ArrayList<String> vocales = 
				new ArrayList<>(Arrays.asList(new String[] {"a","e","i","o","u"}));
		
		LinkedList<String> consonantes = new LinkedList<>(Arrays.asList("b","c","d","f"));
		
		System.out.println("letras: " + letras);
		System.out.println("vocales: " + vocales);
		System.out.println("consonantes: " + consonantes);
		
		//Contains all
		System.out.println("Letras contiene todas las vocales: " + letras.containsAll(vocales) );
		
		//Letras mas vocales
		ArrayList<String> letrasYVocales = new ArrayList<>();
		letrasYVocales.addAll(letras);
		letrasYVocales.addAll(vocales);
		System.out.println("Letras y vocales: " + letrasYVocales);

		//Letras mas vocales sin duplicados
		TreeSet<String> letrasYVocales2 = new TreeSet<>();
		letrasYVocales2.addAll(letras);
		letrasYVocales2.addAll(vocales);
		System.out.println("Letras y vocales: " + letrasYVocales2);
		
		//Letras mas vocales
		ArrayList<String> letrasYVocales3 = new ArrayList<>(letras);
		letrasYVocales3.addAll(vocales);
		System.out.println("Letras y vocales: " + letrasYVocales3);
		
		//Crear una coleccion a partir de un array
		//Array --> asList --> constructor de la coleccion
		String [] nombres = {"pepe","luis","ana"};
		List<String> l = Arrays.asList(nombres);
		TreeSet<String> conjuntoNombres = new TreeSet<>(l);
		
		TreeSet<String> conjuntoNombres2 = 
				new TreeSet<>(Arrays.asList(new String[] {"pepe","luis","ana"}));

		//Delete all
		letrasYVocales.removeAll(consonantes);
		System.out.println("letrasYVocales al eliminar las consonantes: " + letrasYVocales);
		
		//Retain all
		letrasYVocales2.retainAll(consonantes);
		System.out.println("Dejar las consonantes en letrasYVocales: " + letrasYVocales2);
		
		
		//Convertir de colección a Array
		//De colección a array de Object
		Object[] v1 = vocales.toArray();
		
		//La siguiente instrucción compila, pero da error de ejecución,
		//porque String[] no es un subtipo de Object[]
		//String[] v2 = (String[]) vocales.toArray();
		
		
		//Si lo que necesito es almacenar la coleccion vocales en un array de String:
		String[] muestra = new String[0];
		String[] v2 = vocales.toArray(muestra);
		
		String[] v3 = vocales.toArray(new String[0]);
		String[] v4 = vocales.toArray(new String[] {});
		
		
		
		
		
	}
}
