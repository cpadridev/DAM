package _02ejemplos._02animales;

public class Test {
	public static void main(String[] args) {
		Perro p1 = new Perro();
		p1.saludar();
		p1.pasear();
		
		Gato g1 = new Gato();
		g1.saludar();
		g1.pasear();
		
		Lobo l1 = new Lobo();
		l1.saludar();
		//l1.pasear(); Lobo no tiene metodo pasear 
		
		Tigre t1 = new Tigre();
		t1.saludar();
		//t1.pasear(); //Tigre no tiene metodo pasear
		
		System.out.println("Array de animales --------");
		//Animal felinos[] = {g1,t1};
		Felino felinos[] = {g1,t1};
		//Recorrer el array saludando
		for(int i = 0; i < felinos.length; i++) {
			felinos[i].saludar();
		}
		//Recorrer el array trepando
		for(int i = 0; i < felinos.length; i++) {
			felinos[i].trepar();
		}
		
		System.out.println("Array de mascotas");
		//Animal misAnimales[] = {p1,g1};
		Mascota misAnimales[] = {p1,g1};
		for(int i = 0; i < misAnimales.length; i++) {
			//misAnimales[i].saludar();
			misAnimales[i].pasear();
		}
	}
}




