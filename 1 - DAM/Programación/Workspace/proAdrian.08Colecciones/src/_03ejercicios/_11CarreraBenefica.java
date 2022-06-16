package _03ejercicios;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class _11CarreraBenefica {

	public static void main(String[] args) {
		List<String> vueltas = Arrays.asList(new String[]
				{"Arturo", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Encarna",
				"Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Antonio", "Pablo", "Maria", "Fran", "Pablo",
				"Daniel", "Miguel", "Maria", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria",
				"Antonio", "Pablo" });
		
		Map<String,String> patrocinios = new HashMap<>();
		patrocinios.put("Arturo", "Javi");
		patrocinios.put("Encarna", "Javi");
		patrocinios.put("Maria", "Esther");
		patrocinios.put("Fran", "Esther");
		patrocinios.put("Carlos", "Monica");
		patrocinios.put("Daniel", "Monica");
		
		mostrarPagos(vueltas,patrocinios);

	}
	
	
	private static void mostrarPagos(List<String> vueltas, Map<String, String> patrocinios) {
		int noPatrocinado = 0;
		Map<String, Integer> debe = new TreeMap<> ();
		for(String alumno: vueltas) {
			//Averiguar quién le patrocina
			String profe = patrocinios.get(alumno);
			
			if(profe == null) {
				noPatrocinado ++;
			} else {
				//Añadimos 1 a los euros que debe el profesor
				Integer euros = debe.get(profe);
				if(euros == null) debe.put(profe,1);
				else debe.put(profe, euros + 1);
			}
		}
		
		//Mostramos la informacion
		for(String profe: debe.keySet()) {
			System.out.println(profe + " debe " + debe.get(profe) + " euros");
		}
		System.out.println("No patrocinados: " + noPatrocinado);
	}

}
