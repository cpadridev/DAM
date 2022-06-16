package _02ejemplos;

import java.util.ArrayList;

public class _03ClasesEnvoltorio {
	public static void main(String[] args) {
		// No se pueden crear ArrayList de tipos primitivos.
		// ArrayList <int> prueba;

		// Por cada tipo primitivo existe una clase, llamadas clases ENVOLTORIO.
		// (Wrapper)
		// byte - Byte
		// short - Short
		// int - Integer
		// long - Long
		// float - Float
		// double - Double
		// char - Character
		// boolean - Boolean

		ArrayList<Integer> listaNumeros = new ArrayList<>();

		listaNumeros.add(new Integer(10));
		listaNumeros.add(new Integer(20));
		listaNumeros.add(30);

		System.out.println(listaNumeros);

		ArrayList<Character> listaVocales = new ArrayList<>();

		listaVocales.add(new Character('a'));
		listaVocales.add(new Character('e'));
		listaVocales.add(new Character('i'));
		listaVocales.add('o');
		listaVocales.add('u');

		System.out.println(listaVocales);
	}
}
