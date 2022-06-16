package _03ejercicios._05gestionhospital;

public class TestPaciente {
	public static void main(String[] args) {
		Paciente p1 = new Paciente("Juan", 20);
		Paciente p2 = new Paciente("Miguel", 30);
		
		System.out.println(p1);
		System.out.println(p2 + "\n");
		
		int comparar = p1.compareTo(p2);
		
		if (comparar == 0) {
			System.out.println("Son iguales");
		} else {
			if (comparar == -1) {
				System.out.println(p1);
			} else {
				System.out.println(p2);
			}
		}
		
		try {
			p1.mejorar();
			System.out.println("\n" + p1);
		} catch (IllegalArgumentException e) {
			System.out.println("\nEl paciente ya esta curado\n" + p1);

		}
	}
}
