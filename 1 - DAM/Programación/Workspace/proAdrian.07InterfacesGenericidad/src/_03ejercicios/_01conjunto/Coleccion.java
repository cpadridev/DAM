package _03ejercicios._01conjunto;

public interface Coleccion <T> {
	void agregar(T t);
	void eliminar(T t);
	boolean estaVacia();
	int talla();
	boolean contiene(T t);
}
