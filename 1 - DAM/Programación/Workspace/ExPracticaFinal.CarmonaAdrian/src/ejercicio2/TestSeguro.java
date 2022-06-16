package ejercicio2;

public class TestSeguro {
	public static void main(String[] args) {
		Conductor c = new Conductor("Adrian", 18, 1);
		Seguro s1 = new Seguro(2014, "2533-BCC", false, true, c);
		SeguroRobo s2 = new SeguroRobo();
		SeguroTodoRiesgo s3 = new SeguroTodoRiesgo();

		System.out.println(s1 + "\n");
		System.out.println(s2 + "\n");
		System.out.println(s3);
	}
}
