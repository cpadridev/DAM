package ejercicio5;

import java.util.List;

public class Listas {
	public static <T> void modificarElementosLista(List<T> lista, Modificador<T> t) {
		for (int i = 0; i < lista.size(); i++) {
			T elemento = lista.get(i); // Obtenemos el elemento i de la lista.
			elemento = t.modificar(elemento); // Lo modificamos.
			lista.set(i, elemento); // Lo volvemos a guardar en la lista, en la misma posicion.
		}
	}
}
