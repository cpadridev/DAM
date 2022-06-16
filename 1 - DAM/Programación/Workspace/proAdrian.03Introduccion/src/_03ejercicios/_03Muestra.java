package _03ejercicios;

public class _03Muestra {
	public static void main(String[] args) {
		System.out.println("Mostrará: a = 3, b = 4 y c = 12");
		
		int a = 2, b = 3, c;
		
		c = ++a * ++b;
		
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
	}
}
