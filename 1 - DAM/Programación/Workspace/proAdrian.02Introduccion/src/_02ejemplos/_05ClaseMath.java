package _02ejemplos;

public class _05ClaseMath {
	public static void main(String[] args) {
		// Constantes.
		System.out.println(Math.PI);
		System.out.println(Math.E);

		// Funciones de redondeo.
		System.out.println("Ceil " + Math.ceil(150.343));
		System.out.println("Floor " + Math.floor(150.343));
		System.out.println("Round " + Math.round(150.49));
		System.out.println("Round " + Math.round(150.51));

		// Raíz.
		System.out.println("Raiz: " + Math.sqrt(4.7));
		System.out.println("Raiz: " + Math.sqrt(-10));

		// Potencia.
		System.out.println("Pow: " + Math.pow(10, 3));
		System.out.println("Pow: " + Math.pow(10.5, 3));
		System.out.println("Pow: " + Math.pow(4, 0.5));
		System.out.println("Pow: " + Math.pow(-10, 0.5));

		// Random (Número aleatorio en [0, 1[).
		System.out.println(Math.random());
		System.out.println(Math.random());
	}
}
