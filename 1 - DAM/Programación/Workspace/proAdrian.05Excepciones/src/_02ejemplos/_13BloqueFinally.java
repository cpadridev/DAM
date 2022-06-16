package _02ejemplos;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _13BloqueFinally {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		PrintStream f = null;
		try { 
			//Crear fichero
			f = new PrintStream("resultados.txt");
			
			//Escribir en el fichero
			for(int i = 1; i <= 5; i++) {
				System.out.println("Dividendo: ");
				int dividendo = tec.nextInt();
				System.out.println("Divisor: " );
				int divisor = tec.nextInt();
				
				int cociente = dividendo / divisor;
				f.println(cociente);
			}
		} catch (InputMismatchException e) {
			System.out.println("Tienes que introducir un entero");
		} catch(FileNotFoundException e) {
			System.out.println("No se ha podido crear el fichero");
		} finally {
			System.out.println("Cerramos el fichero");
			f.close();
		}
	}
}
