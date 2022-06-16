package _03ejercicios._04monedasbilletes;

public class TestDinero {
	public static void main(String[] args) {
		Moneda m = new Moneda(2, 2003, 400, 10);
		Billete b = new Billete(50, 2002, 800, 1500);
		
		System.out.println(m + "\n" + b);
		
		System.out.println(m.compareTo(b));
	}
}
