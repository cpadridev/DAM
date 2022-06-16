package application.model;

public class Expendedora {
	final static double CREDITOMAXIMO = 10;
	private double credito;
	private double cambioDisponible;
	private double importeVentas;
	private String[] nombreProductos;
	private double[] precioProductos;
	private int[] stockProductos;

	/**
	 * Crea una maquina expendedora.
	 * 
	 * @param cambioDisponible
	 * @param nombreProductos
	 * @param precioProductos
	 * @param stockProductos
	 */
	public Expendedora(double cambioDisponible, String[] nombreProductos, double[] precioProductos,
			int[] stockProductos) {
		if (nombreProductos.length != precioProductos.length || precioProductos.length != stockProductos.length) {
			throw new IllegalArgumentException("Los 3 arrays deben tener el mismo tamano");
		}

		this.credito = 0;
		this.importeVentas = 0;
		this.cambioDisponible = cambioDisponible;
		this.nombreProductos = nombreProductos;
		this.precioProductos = precioProductos;
		this.stockProductos = stockProductos;
	}

	public double getCredito() {
		return credito;
	}

	public double getCambioDisponible() {
		return cambioDisponible;
	}

	public double getImporteVentas() {
		return importeVentas;
	}

	public String getNombre(int i) {
		return nombreProductos[i];
	}

	public double getPrecio(int i) {
		return precioProductos[i];
	}

	public int getStock(int i) {
		return stockProductos[i];
	}

	public int getNumeroProductos() {
		return nombreProductos.length;
	}

	@Override
	public String toString() {
		String texto = String.format(
				"Credito		 : %.2f euros" + "\nCambio		 : %.2f euros" + "\nImporte de ventas: %.2f euros"
						+ "\nProductos: %d",
				this.credito, this.cambioDisponible, this.importeVentas, this.getNumeroProductos());

		for (int i = 0; i < this.nombreProductos.length; i++) {
			texto += String.format("\n		%s	-	%.2f euros	-	%d uds", this.nombreProductos[i],
					this.precioProductos[i], this.stockProductos[i]);
		}

		return texto;
	}

	/**
	 * Anade credito a la expendedora.
	 *
	 * @param importe dinero a anadir
	 */
	public void anadirDinero(double importe) {
		if (String.valueOf(importe).length() <= 4 && this.credito + importe <= CREDITOMAXIMO && importe >= 0) {
			this.credito += importe;
		}
	}

	public double devolverCredito() {
		double devolucion = this.credito;
		this.credito = 0;
		return devolucion;
	}

	/**
	 * Compra un producto.
	 * 
	 * @param i numero del producto
	 * @return Devuelve el cambio.
	 * @throws CreditoInsuficienteException No hay suficiente credito
	 * @throws CambioInsuficienteException  No hay suficiente cambio
	 * @throws StockInsuficienteException   No hay suficiente stock
	 */
	public double comprar(int i)
			throws CreditoInsuficienteException, CambioInsuficienteException, StockInsuficienteException {
		double cambio = this.credito - this.precioProductos[i];

		if (this.credito >= this.precioProductos[i]) {
			if (this.stockProductos[i] == 0) {
				throw new StockInsuficienteException("Stock insuficiente");
			}
			if (this.cambioDisponible < cambio) {
				throw new CambioInsuficienteException("Cambio insuficiente");
			}

			// Actualizar el credito.
			this.credito = 0;
			// Actualizar el cambio disponible.
			this.cambioDisponible -= cambio;
			// Actualizar stock.
			this.stockProductos[i]--;
			// Actualizar importe de ventas.
			this.importeVentas += this.precioProductos[i];
		} else {
			throw new CreditoInsuficienteException("Credito insuficiente");
		}

		return cambio;
	}
}
