package ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio5 {
	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();

		try (Scanner f1 = new Scanner(new File("nombres.txt"));
			 PrintWriter f2 = new PrintWriter(new File("nombresOrdenados.txt"))) {
			while (f1.hasNext()) {
				if (f1.hasNextInt()) {
					f1.hasNextInt();
					f1.hasNextLine();
				}
				if (f1.hasNextLine()) {
					String nombre = f1.nextLine().toUpperCase();
					s.add(nombre);
				}

			}

			for (String n : s) {
				f2.println(n);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		}
	}
}
