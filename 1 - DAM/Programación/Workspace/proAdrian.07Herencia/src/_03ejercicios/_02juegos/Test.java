package _03ejercicios._02juegos;

public class Test {
	public static void main(String[] args) {
		JuegoEnVenta j1 = new JuegoEnVenta("A", "A", 2022, 10, 10);
		Juego j12 = new Juego("A", "A", 2001);
		Juego j13 = new Juego("Aaa", "Aaa", 2000);
		JuegoEnAlquiler j2 = new JuegoEnAlquiler("A", "A", 2022, 10, 10, 7);
		
		// Juego en venta.
		System.out.println(j1);
		j1.vender();
		// Juego vendido.
		System.out.println(j1);
		
		// Juego en alquiler.
		System.out.println(j2);
		j2.alquilar();
		// Juego alquilado.
		System.out.println(j2);
		j2.devolver();
		// Juego vendido.
		System.out.println(j2);
	}
}
