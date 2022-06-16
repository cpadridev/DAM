package ejercicio2;

public class TestSeguro {
	public static void main(String[] args) {
		Seguro s1 = new Seguro("AA3414", 2014, "2533-BCC", false, true);
		SeguroRobo s2 = new SeguroRobo("AA3414", 2014, "2533-BCC", false, true, 6);
		SeguroTodoRiesgo s3 = new SeguroTodoRiesgo("AA3414", 2014, "2533-BCC", 6, 100);

		System.out.println(s1 + "\n");
		System.out.println(s2 + "\n");
		System.out.println(s3);
	}
}
