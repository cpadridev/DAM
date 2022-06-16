package _03ejercicios;

public class _24ReplicarCaracteres {
	public static void main(String[] args) {
		System.out.println(replicar('a', 2));

		// Otra prueba.
		String texto = "Listado de pacientes";

		System.out.println(replicar('*', texto.length()));
		System.out.println(texto);
		System.out.println(replicar('*', texto.length()));

		// Otra prueba.
		mostrarRotulo("Hola a todos");
	}

	public static String replicar(char letra, int veces) {
		String texto = "";
		int cont = 0;

		while (cont < veces) {
			texto = texto + letra;
			cont = cont + 1;
		}

		return texto;
	}

	public static void mostrarRotulo(String texto) {
		System.out.println(replicar('=', texto.length()));
		System.out.println(texto);
		System.out.println(replicar('=', texto.length()));
	}
}
