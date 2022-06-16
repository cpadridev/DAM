package ejercicio3;

public interface Operador<T> {
	//Dados dos elementos de tipo T devuelve otro elemento del mismo tipo
	//resultado de alguna operacion entre los dos primeros
	T operar (T o1, T o2);
}
