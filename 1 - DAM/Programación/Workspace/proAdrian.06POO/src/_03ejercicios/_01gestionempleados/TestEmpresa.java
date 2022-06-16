package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa matisse = new Empresa("MatisseDAM");
		System.out.println("Numero empleados: " + matisse.getNumeroEmpleados());

		// Contratamos a un empleado
		Empleado e1 = new Empleado("pepe", "11111111A", 2021, 1500);
		matisse.contratar(e1);
		System.out.println("Numero empleados: " + matisse.getNumeroEmpleados());

		// Contratamos a otro empleado (creado al vuelo)
		matisse.contratar(new Empleado("luis", "22222222B", 2022, 1530));
		System.out.println("Numero empleados: " + matisse.getNumeroEmpleados());

		// Si vuelvo a contratar a e1, se producirá excepcion
		try {
			matisse.contratar(e1);
		} catch (IllegalArgumentException e) {
			System.out.println("contratacion fallida");
		}
		// Si vuelvo a contratar a luis, se producirá excepcion
		try {
			matisse.contratar(new Empleado("luis", "22222222B", 2022, 1530));
		} catch (IllegalArgumentException e) {
			System.out.println("contratacion fallida");
		}
		// Si vuelvo a contratar a 22222222B, se producirá excepcion
		try {
			matisse.contratar(new Empleado("Carlos", "22222222B", 2021, 1630));
		} catch (IllegalArgumentException e) {
			System.out.println("contratacion fallida");
		}

		System.out.println(matisse.toString());

		//Subir un 10% a quienes cumplen un trienio.
		matisse.subirTrienio(10);
	}

}
