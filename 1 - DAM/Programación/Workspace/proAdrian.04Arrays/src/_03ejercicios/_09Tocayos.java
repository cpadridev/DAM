package _03ejercicios;

public class _09Tocayos {
	public static void main(String[] args) {
		String[] grupo1 = { "miguel", "jose", "ana", "luis" };
		String[] grupo2 = { "pablo", "vicente", "jose", "roberto", "luis", "alfonso" };
		int cont = 0;

		// Recorremos el primer grupo.
		for (int i = 0; i < grupo1.length; i++) {
			String nombre = grupo1[i];

			// Comprobamos si nombre está en el segundo grupo.
			boolean enc = false;

			for (int j = 0; j < grupo2.length && !enc; j++) {
// 				if(grupo2[j].equals(grupo1[i])) {
				if (grupo2[j].equals(nombre)) {
					enc = true;
				}
			}

			if (enc) {
				System.out.println(nombre + " tiene un tocayo en el segundo grupo");

				cont++;
			}
		}

		System.out.println("Total personas con tocayo: " + cont);
	}
}
