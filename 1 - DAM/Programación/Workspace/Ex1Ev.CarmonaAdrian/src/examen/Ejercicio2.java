package examen;

public class Ejercicio2 {
	public static String contrasenyaDefecto(String nombre, String fecha) {
		int posicion = 0;

		for (int i = 0; i < nombre.length(); i++) {
			if (nombre.charAt(i) == ' ') {
				posicion = i;
			}
		}

		String apellido = nombre.substring(posicion, nombre.length() - 1);
		String letras;

		if (apellido.length() > 2) {
			letras = apellido.substring(0, 4);
		} else {
			letras = apellido;
		}

		String dia = fecha.substring(0, fecha.indexOf('/'));
		String mes = fecha.substring(fecha.indexOf('/') + 1, fecha.lastIndexOf('/'));
		String anyo = fecha.substring(fecha.lastIndexOf('/') + 1);

		if (dia.length() == 1) {
			dia = 0 + dia;
		}
		if (mes.length() == 1) {
			mes = 0 + mes;
		}

		return letras.toLowerCase() + dia + mes + anyo;
	}

	public static void main(String[] args) {
		System.out.println(contrasenyaDefecto("LUIS ABEL PEREZ", "1/2/2000"));
		System.out.println(contrasenyaDefecto("FRANCISCO JOSE RUBIO GOZALBO", "2/10/2001"));
		System.out.println(contrasenyaDefecto("LIAO WU", "1/12/2002"));
	}
}
