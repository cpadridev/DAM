package _02ejemplos;

public class _14FinallyEjecutaSiempre {
	public static void main(String[] args) {
		int a = dividir(10,2);
		System.out.println("Resultado " + a);
	}
	public static int  dividir (int a, int b) {
		try {
			int cociente = a / b;
			return cociente;
		} finally {
			System.out.println("Hola soy la clausula finally");
		}
	}

}
