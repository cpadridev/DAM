package _03ejercicios._01aulas;

public class AulaMusica extends Aula{
	private boolean piano;
	
	public AulaMusica(int codigo, double longitud, double anchura, boolean piano) {
		super(codigo, longitud, anchura);
		this.piano = piano;
	}

	public boolean isPiano() {
		return piano;
	}

	public void setPiano(boolean piano) {
		this.piano = piano;
	}
	
	@Override
	public double capacidad() {
		//REESCRITURA PARCIAL
		if(piano) {
			return super.capacidad() - 2;
		} else {
			return super.capacidad();
		}
	}
	public double capacidadIncorrecto() {
		
		if(piano) {
			return superficie() / 1.4 - 2;
		} else {
			return superficie() / 1.4;
		}
	}
	public String toString() {
		return super.toString() + (piano ? " con piano" : " sin piano");
		
//		if(piano) {
//			return super.toString() + " con piano";
//		} else {
//			return super.toString() + " sin piano";
//		}
	}
}




