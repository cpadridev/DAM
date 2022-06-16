package ejercicio3;

import java.util.ArrayList;

public class GrupoUsuarios {
	private String nombre;
	private ArrayList<Usuario> miembros;

	public GrupoUsuarios(String nombre) {
		this.nombre = nombre;
		this.miembros = new ArrayList<>();
	}

	// Completar a partir de aqui --------------
	public boolean anadirUsuario(String alias, String dominio, String pwd, boolean admin) {
		boolean anyadido = true;

		try {
			Usuario u = new Usuario(alias, dominio, pwd, admin);
			if (miembros.contains(u)) {
				anyadido = false;
			} else {
				if (admin) {
					for (Usuario x : miembros) {
						if (x.isAdmin()) {
							return false;
						}
					}
				}
				miembros.add(u);
			}
		} catch (IllegalArgumentException e) {
			anyadido = false;
		}

		return anyadido;
	}

	public boolean hayBajas() {
		for (Usuario u : miembros) {
			if (Usuario.calcularFortaleza(u.getPwd()) == Usuario.BAJA) {
				return true;
			}
		}

		return false;
	}

	public String toString() {
		String result = "Nombre del grupo: " + nombre + "\nNumero de usuarios: " + miembros.size()
				+ "\nDetalle de los usuarios: ";

		for (Usuario u : miembros) {
			result += "\n - " + u.toString();
		}

		return result;
	}
}
