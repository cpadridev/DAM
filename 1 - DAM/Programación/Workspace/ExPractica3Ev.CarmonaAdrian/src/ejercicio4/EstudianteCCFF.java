package ejercicio4;

public class EstudianteCCFF extends Estudiante implements Formable {
	@Override
	public void formar(int horas) {
		System.out.printf("Estudiante de CCFF recibe formacion de %d horas%n", horas);
	}
}
