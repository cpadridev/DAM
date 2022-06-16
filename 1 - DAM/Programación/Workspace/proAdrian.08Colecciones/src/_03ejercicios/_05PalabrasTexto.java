package _03ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _05PalabrasTexto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre del fichero: ");
		String path = sc.nextLine();

		LinkedHashSet<String> l = new LinkedHashSet<String>();

		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			archivo = new File(path);
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			String linea = br.readLine().replaceAll("\\p{Punct}", "");
			String[] aux = linea.split("\\s+");

			for (int i = 0; i < aux.length; i++) {
				l.add(aux[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(l);
	}
}
