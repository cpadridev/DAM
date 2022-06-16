package _02ejemplos;

public class _02SumarHasta5Modular {
	public static void main(String[] args) {
		int suma = sumarHasta5();
		System.out.println(suma);
	}

	public static int sumarHasta5() {
		return 5 + sumarHasta4();
	}

	public static int sumarHasta4() {
		return 4 + sumarHasta3();
	}

	public static int sumarHasta3() {
		return 3 + sumarHasta2();
	}

	public static int sumarHasta2() {
		return 2 + sumarHasta1();
	}

	public static int sumarHasta1() {
		return 1;
	}
}
