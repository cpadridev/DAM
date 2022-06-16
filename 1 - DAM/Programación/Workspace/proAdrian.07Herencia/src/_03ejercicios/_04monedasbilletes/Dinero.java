package _03ejercicios._04monedasbilletes;

public abstract class Dinero {
	protected double valor;
	protected int anyo;
	
	public Dinero(double valor, int anyo) {
		this.valor = valor;
		this.anyo = anyo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dinero other = (Dinero) obj;
		return anyo == other.anyo && Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	public int compareTo(Dinero d) {
		if (this.valor == d.valor) {
			if (this.anyo == d.anyo) {
				return 0;
			} else {
				if (this.anyo > d.anyo) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			if (this.valor > d.valor) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	
	@Override
	public String toString() {
		return "valor=" + valor + "€, anyo=" + anyo;
	}
}
