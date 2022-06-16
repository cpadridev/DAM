package ejercicio6;

public class Ejercicio6 {
	public static void main(String[] args) {
		Object[] v  = {
				new CamionCisterna(20000),
				new CamionCisterna(30000),
				new CamionCisterna(21000),
				new Piscina(8,3,1),
				new CamionCisterna(12000),
				new Piscina(10,5,2)
		};

		int total = 0;

		for (int i = 0; i < v.length; i++) {
			total += ((Rellenable) v[i]).rellenar();
		}

		System.out.println(total);
	}
}
