package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Euromillones {
	private static final int NUMEROS = 5;
	private static final int ESTRELLAS = 2;
	private static final int MAXNUMEROS = 50;
	private static final int MAXESTRELLAS = 12;
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList <Integer> numeros = new ArrayList<>();
	private static ArrayList <Integer> estrellas = new ArrayList<>();
	
	
	public static void main(String[] args) {
		int numApuestas = -1;
		
		do {
			try {
				System.out.println("Introduce el numero de apuestas a realizar");
				numApuestas = sc.nextInt();
				
				Boleto b = new Boleto(numApuestas, NUMEROS, ESTRELLAS, MAXNUMEROS, MAXESTRELLAS);
				System.out.println(b);
				
				leerCombGanadora("ganadora", numeros, estrellas);
			} catch (InputMismatchException e){
				System.out.println("Debe introducir un entero");
				sc.nextLine();
			}
		} while (numApuestas == 0);
	}
	
	public static void leerCombGanadora(String nombreFichero, List<Integer> numeros, List<Integer> estrellas) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(nombreFichero);
		int cont = 0;
		
		while (sc.hasNext()) {
			if (cont < 5) {
				numeros.add(sc.nextInt());
				cont++;
			} else {
				estrellas.add(sc.nextInt());
			}
		}
		
		Collections.sort(numeros);  
		Collections.sort(estrellas);
	}
}
