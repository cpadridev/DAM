package ejercicio3;

public class Usuario implements Comparable<Usuario> {
	public static final int BAJA = 1;
	public static final int MEDIA = 2;
	public static final int ALTA = 3;

	private String alias;
	private String dominio;
	private String pwd;
	private boolean admin;

	public Usuario(String alias, String dominio, String pwd, boolean admin) {
		if (alias == null || dominio == null || alias.length() == 0 || dominio.length() == 0) {
			throw new IllegalArgumentException();
		} else {
			this.alias = alias;
			this.dominio = dominio;
			this.pwd = pwd;
			this.admin = admin;
		}
	}

	public String getAlias() {
		return alias;
	}

	public String getDominio() {
		return dominio;
	}

	public String getPwd() {
		return pwd;
	}

	public boolean isAdmin() {
		return admin;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Usuario))
			return false;
		return this.alias.equals(((Usuario) o).alias) && this.dominio.equals(((Usuario) o).dominio);
	}

	// -------Completar a partir de aqui -----------
	public int compareTo(Usuario u) {
		if (this.dominio.equals(u.dominio))
			return this.alias.compareTo(u.alias);
		else
			return this.dominio.compareTo(dominio);
	}

	public static int calcularFortaleza(String pwd) {
		int longitud = pwd.length();
		pwd = pwd.toLowerCase();

		if (longitud < 6) {
			return BAJA;
		} else if (longitud > 10) {
			String vocales = "aeiou";
			boolean tieneVoc = false;
			boolean tieneNoVoc = false;

			for (int i = 0; i < pwd.length() && !(tieneVoc && tieneNoVoc); i++) {
				if (vocales.indexOf(pwd.charAt(i)) != -1)
					tieneVoc = true;
				else
					tieneNoVoc = true;
			}
			if (tieneVoc && tieneNoVoc) {
				return ALTA;
			} else {
				return MEDIA;
			}
		} else {
			return MEDIA;
		}
	}

	public static int calcularFortaleza2(String pwd) {
		int longitud = pwd.length();
		pwd = pwd.toLowerCase();

		if (longitud < 6) {
			return BAJA;
		} else if (longitud > 10) {
			String vocales = "aeiou";
			int contVocales = 0;
			int contNoVocales = 0;

			for (int i = 0; i < pwd.length(); i++) {
				if (vocales.indexOf(pwd.charAt(i)) != -1)
					contVocales++;
				else
					contNoVocales++;

				if (contVocales > 0 && contNoVocales > 0)
					return ALTA;
			}
			return MEDIA;
		} else {
			return MEDIA;
		}
	}

	public String toString() {
		int fort = calcularFortaleza(this.pwd);
		String sFort;

		if (fort == BAJA)
			sFort = "baja";
		else if (fort == MEDIA)
			sFort = "media";
		else
			sFort = "alta";

		String sAdmin = "";
		if (admin)
			sAdmin = " (ADM)";

		return alias + "@" + dominio + sAdmin + " - Fortaleza " + sFort;
	}
}
