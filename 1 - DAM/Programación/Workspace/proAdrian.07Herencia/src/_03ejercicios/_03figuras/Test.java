package _03ejercicios._03figuras;

public class Test {
	public static void main(String[] args) {
		//Figura f= new Figura(0,0,"rojo");
		Circulo c = new Circulo (0,0,"rojo",10);
		Rectangulo r = new Rectangulo(20,30,"azul",10,30);
		System.out.println(c);
		System.out.println(r);
	}
}
