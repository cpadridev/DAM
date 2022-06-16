package _03ejercicios._08amarres;

public class Test {
	public static void main(String[] args) {
		Cliente c = new Cliente("12345678A", "AAAAAAA");
		
		Yate b = new Yate("1234", 10, 2000, 100, 1);
		Deportivo d = new Deportivo("12345", 6, 2000, 100);
		Velero v = new Velero("123456", 8, 2000, 2);
		
		Amarre a = new Amarre(0, c, b, 4);
		Amarre a2 = new Amarre(0, c, d, 1);
		Amarre a3 = new Amarre(0, c, v, 7);
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(d);
		System.out.println(v);
		
		System.out.println("Amarre yate: " + a.calcularPrecioAlquiler() + "€");
		System.out.println("Amarre deportivo: " + a2.calcularPrecioAlquiler() + "€");
		System.out.println("Amarre velero: " + a3.calcularPrecioAlquiler() + "€");
	}
}
