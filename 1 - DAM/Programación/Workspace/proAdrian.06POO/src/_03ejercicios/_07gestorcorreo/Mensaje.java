package _03ejercicios._07gestorcorreo;

public class Mensaje {
	private static int siguienteCodigo = 1;
	private int codigo;
	private String emisor;
	private String destinatario;
	private String asunto;
	private String texto;
	
	public Mensaje(String emisor, String destinatario, String asunto, String texto) {
		this.emisor = emisor;
		this.destinatario = destinatario;
		this.asunto = asunto;
		this.texto = texto;
		
//		this.codigo = siguienteCodigo;
//		siguienteCodigo ++;
		this.codigo = siguienteCodigo++;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getEmisor() {
		return emisor;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getAsunto() {
		return asunto;
	}

	public String getTexto() {
		return texto;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Mensaje)) return false;
		return this.codigo == ((Mensaje)o).codigo;
	}
	
	public static boolean validarEMail (String email) {
		int posArroba = email.indexOf('@');
		int posPunto= email.lastIndexOf('.');
		
		return  posPunto != -1 && posArroba > 0 && posPunto < email.length()-1 && posArroba < posPunto - 1;
	}
	
	public String toString () {
		return  "Codigo: " + codigo + 
				"\nDe: " + emisor + 
				"\nPara: " + destinatario + 
				"\nAsunto: " + asunto + 
				"\n" + texto;
				
	}
	
}
