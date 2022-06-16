package ejercicio3;

public class TestDeportista {
	public static void main(String[] args) {
		DeportistaExterno de = new DeportistaExterno("50598003G", "Adrian", "Futbol", 10.5);
		DeportistaInterno di = new DeportistaInterno("50598003G", "Adrian", "Futbol", "SOLO_ALOJAMIENTO");
		DeportistaBecado db = new DeportistaBecado("50598003G", "Adrian", "Futbol", "ALOJAMIENTO+DESAYUNO", 10);
		Gimnasta g = new Gimnasta("50598003G", "Adrian", "PENSION_COMPLETA");

		System.out.println(de);
		System.out.println("---------");
		System.out.println(di);
		System.out.println("---------");
		System.out.println(db);
		System.out.println("---------");
		System.out.println(g);
		System.out.println("---------");
		g.mostrarRecibo();
	}
}
