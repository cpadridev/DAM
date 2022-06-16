package ejercicio3;

public class Test {
	public static void main(String[] args) {
		GrupoUsuarios g = new GrupoUsuarios("editores");
		
		//Anyadir un usuario correctamente
		System.out.println(g.anadirUsuario("pepe","iesmatisse","aaa0123456789", false));
		System.out.println(g.toString());
		
		//Anyadir un usuario administrador correctamente
		System.out.println(g.anadirUsuario("admin","iesmatisse","bbb0123456789", true));
		System.out.println(g.toString());
		
		//Anyadir un usuario repetido
		System.out.println(g.anadirUsuario("pepe","iesmatisse","ccc0123456789", false));
		System.out.println(g.toString());
		
		
		//Anyadir un otro administrador
		System.out.println(g.anadirUsuario("admin2","iesmatisse","ddd0123456789", true));
		System.out.println(g.toString());
		
		//Anyadir un usuario sin alias
		System.out.println(g.anadirUsuario("","iesmatisse","eee0123456789", false));
		System.out.println(g.toString());
		
		//¿Hay usuarios con fortaleza de contraseña baja?
		System.out.println(g.hayBajas());
		
		
		
	}
}
