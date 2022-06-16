package _02ejemplos;

public class Entero {
	private int valor;
	public Entero(int valor) {
		this.valor = valor;
	}
	public boolean equals(Object o) {
		return this == o || (o instanceof Entero && this.valor == ((Entero)o).valor);
	}
	public int hashCode() {
		//Ultima cifra del valor
		return 0;
		//return this.valor % 10;
	}
}
