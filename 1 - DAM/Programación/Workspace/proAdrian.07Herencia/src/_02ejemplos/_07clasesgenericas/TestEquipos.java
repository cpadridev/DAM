package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class TestEquipos {
	public static void main(String[] args) {
		EquipoFutbol ef = new EquipoFutbol("1º Dam");
		ef.fichar(new Futbolista(1, "Adrian"));
		System.out.println(ef.getCapitan().getGoles());
		
		EquipoProgramame ep = new EquipoProgramame("Sin java no hay paraiso");
		ep.fichar(new Programador("12345678A", "Adrian", "Java"));
		System.out.println(ep.getCapitan().getLenguaje());
		
		// El problema del equipo de objetos es que admite cualquier objeto
		EquipoObjetos eo = new EquipoObjetos("2º Dam");
		eo.fichar(new Futbolista(1, "Adrian"));
		eo.fichar(new Programador("12345678A", "Adrian", "Java"));
		System.out.println(((Futbolista) eo.getCapitan()).getGoles());
		
		// Lista de Strings
		int luis = 20;
		ArrayList nombres = new ArrayList();
		nombres.add("javi");
		nombres.add("roberto");
//		nombres.add(luis);
		// Mostrar los nombres en mayusculas
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(((String) nombres.get(i)).toUpperCase());
		}
		
		// Con la sintaxis de genericidad (notacion de diamante)
		// el mismo error se detectaria al compilar
		ArrayList<String> nombres2 = new ArrayList();
		nombres2.add("javi");
		nombres2.add("roberto");
//		nombres2.add(luis);
		
		// Equipo
		Equipo<Futbolista> eFutbol = new Equipo<>("1º DAM");
		eFutbol.fichar(new Futbolista(1, "Adrian"));
		
		Equipo<Programador> eProgramame = new Equipo<>("1º DAM");
		eProgramame.fichar(new Programador("12345678A", "Adrian", "Java"));
	}
}