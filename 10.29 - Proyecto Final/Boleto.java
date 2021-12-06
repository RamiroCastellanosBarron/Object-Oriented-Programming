public class Boleto {
	private int numBoleto;
	private Funcion funcion;
	private String asiento;
	private double precio;
	private String tipo;

	public Boleto(int numBoleto, Funcion funcion, String asiento, double precio, String tipo) {
		setNumBoleto(numBoleto);
		setFuncion(funcion);
		setAsiento(asiento);
		setPrecio(precio);
		setTipo(tipo);
	}

	public void setNumBoleto(int numBoleto) {
		this.numBoleto = numBoleto;
	}

	public int getNumBoleto() {
		return numBoleto;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public String toString(){
		return "\nBoleto No. " + numBoleto + "\nTipo: " + tipo + "\nFuncion: " + funcion.getTitulo() + "\nSala: " + funcion.getNoSala() + "\nAsiento: " + asiento + "\nFecha: " + funcion.getFecha() + "\nHora: " + funcion.getHora();
	}
}