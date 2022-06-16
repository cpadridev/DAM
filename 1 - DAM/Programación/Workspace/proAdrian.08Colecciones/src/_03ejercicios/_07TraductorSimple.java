package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _07TraductorSimple {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Map<String, String> m = new HashMap<>();
		//Abrir y leer el fichero palabras.txt
		Scanner  f = null;
		try {
			f = new Scanner(new File("palabras.txt"));
			while (f.hasNextLine()) {
				String palabra = f.next().trim();
				String traduccion = f.nextLine().trim();
				//System.out.println(palabra + " - " + traduccion);
				
				//Añadir las palabras al map
				m.put(palabra, traduccion);
			}	
				
			//Pedir una frase, descomponerla e n palabras y traducirla
			System.out.println("Frase: ");
			String frase = tec.nextLine();
			
			StringTokenizer st = new StringTokenizer(frase, "[ .:;,]+");
			String fraseTraducida = "";
			while(st.hasMoreTokens()) {
				String p = st.nextToken();
				String t = m.get(p);
				if(t != null) fraseTraducida += t + " ";
				else fraseTraducida += p + " ";
			}
			System.out.println(fraseTraducida);

//			fraseTraducida = "";
//			for (String p: palabras) {
//				String t = m.get(p);
//				if(t != null) fraseTraducida += t + " ";
//				else fraseTraducida += p + " ";
//			}
//			System.out.println(fraseTraducida);
			
			
				
			
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero");
		} finally {
			if (f != null) f.close();
		}
	}
}
