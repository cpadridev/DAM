package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _06ContarPalabras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce el nombre de un fichero:  ");
		String nombreFichero = tec.nextLine();
		
		Map<String,Integer> m = new LinkedHashMap<>();
		
		Scanner f = null;
		try {
			f = new Scanner(new File(nombreFichero));
			while(f.hasNextLine()) {
				String frase = f.nextLine();
				
				// Descomponemos la frase en palabras
				String[] palabras = frase.split(" ");
				System.out.println(Arrays.toString(palabras));

				for (int i = 0; i < palabras.length; i++) {
					Integer veces = m.get(palabras[i]); // Consulto con que valor esta la palabra en el map
					if (veces == null) {
						// Es la primera vez que aparece la palabra
						m.put(palabras[i], 1);
					} else {
						// La palabra ha aparecido 'veces' veces anteriormente
						m.put(palabras[i], veces + 1);
					}
					System.out.println(m);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		} finally {
			if(f != null) f.close();
		}
		
		//Mostrar qué palabras aparecen más de una vez y el numero
		//de veces
		for(String pal: m.keySet()) {
			int veces = m.get(pal);
			if(veces > 1) {
				System.out.println(pal + ": " + veces + " veces");
			}
		}
		
	}
}
