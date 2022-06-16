package _02ejemplos._04AtributoEstatico;

public class TestClase {
	public static void main(String[] args) {
		Clase c1 = new Clase();
		c1.x = 1;
		c1.y = 2;
		
		Clase c2 = new Clase();
		c2.x = 3;
		c2.y = 4;
		
		
		//c1 y c2 tienen sus propios atributos x e y
		System.out.println("c1.x: " + c1.x);
		System.out.println("c1.y: " + c1.y);
		System.out.println("c2.x: " + c2.x);
		System.out.println("c2.y: " + c2.y);
		
		//Sin embargo, comparten el atributo z (static)
		c1.z = 10;
		c2.z = 20;
		System.out.println("c1.z: " + c1.z);
		System.out.println("c2.z: " + c2.z);
		c1.z = 100;
		System.out.println("c1.z: " + c1.z);
		System.out.println("c2.z: " + c2.z);
		//z es un atributo de clase: La forma adecuada de referirse a el es esta:
		Clase.z = 200;
		System.out.println("Clase.z: " + Clase.z);
		
		
		
		
	}
}
