package _01pruebas;

public class Circulos {
	public static double longitud(double radio) {
		double l = 2 * Math.PI * radio;
		return l;
	}

	public static double area(double radio) {
		return Math.PI * radio * radio;
	}

	public static double volumen(double radio) {
		double v = (4.0 / 3) * Math.PI * Math.pow(radio, 3);
		return v;
	}
}
