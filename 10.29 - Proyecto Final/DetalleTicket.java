import java.text.DecimalFormat;

public class DetalleTicket {

	private int cantidad;
	private String tituloFuncionBoleto;
	private double precioUnitario;
	private double descuento;

	public DetalleTicket(int cantidad, String tituloFuncionBoleto, double precioUnitario, double descuento) {
		setCantidad(cantidad);
		setTituloFuncionBoleto(tituloFuncionBoleto);
		setPrecioUnitario(precioUnitario);
		setDescuento(descuento);
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setTituloFuncionBoleto(String tituloFuncionBoleto) {
		this.tituloFuncionBoleto = tituloFuncionBoleto;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	// metodos gets
	public int getCantidad() {
		return cantidad;
	}

	public String getTituloFuncionBoleto() {
		return tituloFuncionBoleto;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public double getDescuento() {
		return descuento;
	}

	public double calcularImporte() {

		return cantidad * precioUnitario - calcularDescuento();
	}

	public double calcularDescuento() {

		return cantidad * precioUnitario * (descuento / 100);
	}

	public String toString() {
		String formato = "%-10s%-20s%-15s%-15s%-15s%-15s";
		DecimalFormat w = new DecimalFormat("0.00");

		return String.format(formato, cantidad, tituloFuncionBoleto, "$" + precioUnitario, descuento,
				"$" + w.format(calcularDescuento()), "$" + w.format(calcularImporte()));

	}

}