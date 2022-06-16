package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

	final static int N = 3; // M�ximo numero de contrasenyas que se conservan

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner tec = new Scanner(System.in);

		// Primera contrasenya: "aaa"
		ArrayList<String> c = new ArrayList<>(N);
		c.add("aaa");

		// Bucle infinito
		while (true) {
			System.out.print("Indica contrasena actual y dos veces la nueva: ");
			String antigua = tec.next();
			String nueva1 = tec.next();
			String nueva2 = tec.next();

			// Completar
			if (c.size() == 1) {
				if (antigua.equals(c.get(0))) {
					if (nueva1.equals(nueva2)) {
						c.add(nueva1);
						System.out.println("Contrasena cambiada correctamente");
					} else {
						System.out.println("Las dos versiones tienen que coincidir");
					}
				} else {
					System.out.println("La contrasena actual es incorrecta");
				}
			} else {
				if (antigua.equals(c.get(c.size() - 1))) {
					if (nueva1.equals(nueva2)) {
						int comprobar = 0;

						for (int i = 0; i < c.size(); i++) {
							if (nueva1.equals(c.get(i))) {
								comprobar++;
							}
						}

						if (comprobar == 0 && c.size() == 3) {
							if (c.size() == N) {
								c.remove(0);
								c.add(nueva1);
								System.out.println("Contrasena cambiada correctamente");
							}
						} else {
							if (comprobar == 0) {
								c.add(nueva1);
								System.out.println("Contrasena cambiada correctamente");
							} else {
								System.out.println("La contrasena se ha usado recientemente");
							}
						}
					} else {
						System.out.println("Las dos versiones tienen que coincidir");
					}
				} else {
					System.out.println("La contrasena actual es incorrecta");
				}
			}

			Iterator<String> it = c.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	}
}
