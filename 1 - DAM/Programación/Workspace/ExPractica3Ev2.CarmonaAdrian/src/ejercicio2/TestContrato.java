package ejercicio2;

public class TestContrato {
	public static void main(String[] args) {
		Contrato c1 = new ContratoMovil("A", 1, 0.1, 2, 50, 7);
		Contrato c2 = new ContratoFijo("B", 2, 0.08, 10);
		Contrato c3 = new ContratoFijoMasFibra("C", 3, 0.05, 0, 1000);

		System.out.println(c1);
		System.out.println(c1.calcularPrecio(75));
		System.out.println(c2);
		System.out.println(c2.calcularPrecio(15));
		System.out.println(c3);
		System.out.println(c3.calcularPrecio(10));
	}
}
