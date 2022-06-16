package ejercicio4;

public class Desempleado extends Trabajador implements Formable {
	@Override
	public void formar(int horas) {
		System.out.printf("Desempleado recibe formacion de %d horas%n", horas);
	}
}
