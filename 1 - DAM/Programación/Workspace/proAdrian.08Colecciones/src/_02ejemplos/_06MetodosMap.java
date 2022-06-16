package _02ejemplos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _06MetodosMap {
	public static void main(String[] args) {
		Map<String, String> traducciones = new LinkedHashMap<>();
		
		//put: 
		//Si no existe una pareja con la misma clave, inserta la pareja
		//y devuelve null
		traducciones.put("coche", "car");
		traducciones.put("bici", "bicycle");
		traducciones.put("fuego", "fire");
		System.out.println(traducciones.put("casa", "home"));
		System.out.println(traducciones);
		
		//Si ya existe una pareja con la misma clave, sobreescribe el valor
		//y devuelve el antiguo valor
		System.out.println(traducciones.put("casa", "house"));
		System.out.println(traducciones);
		
		//Get: Devuelve el valor con el que aparece determinada clave
		// o  null si no hay ninguna pareja con esa clave
		
		System.out.println("Traduccion de coche: " + traducciones.get("coche"));
		System.out.println("Traduccion de moto: " + traducciones.get("moto"));
		
		//Remove: Elimina la pareja cuya clave coincida con la indicada. Si la clave
		// existe, devuelve el valor con el que aparece. Si la clave no existe, devuelve
		//null
		System.out.println("Eliminar moto: " + traducciones.remove("moto"));
		System.out.println("Eliminar coche: " + traducciones.remove("coche"));
		
		//containsKey y containsValue: nos dicen si una clave o si un valor
		//están en el map
		System.out.println("Tenemos traduccion de casa?: " + traducciones.containsKey("casa"));
		System.out.println("Alguna se traduce como house?: " + traducciones.containsValue("house"));
		
		//size(): devuelve el numero de parejas
		System.out.println(traducciones.size());
		
		//Claves y valores
		System.out.println("Claves: " + traducciones.keySet());
		System.out.println("Valores: " + traducciones.values());
		
		//Recorrido de un map
		Set<String> setCastellano = traducciones.keySet();
		
		for(String palabraCastellano: setCastellano) { //Recorremos el set de claves
			//Obtenemos el valor asociado
			String palabraIngles = traducciones.get(palabraCastellano);
			System.out.println("La traduccion de " + palabraCastellano + " es " + palabraIngles);
		}
		
		//De otra forma: al vuelo
		for(String pCastellano: traducciones.keySet()) {
			System.out.println("La traduccion de " + pCastellano + " es " + traducciones.get(pCastellano));
		}
		
		//De otra forma: con entrySet
		for(Entry<String,String> pareja: traducciones.entrySet()) {
			System.out.println("La traduccion de " + pareja.getKey() + " es " + pareja.getValue());
		}
	}
}





