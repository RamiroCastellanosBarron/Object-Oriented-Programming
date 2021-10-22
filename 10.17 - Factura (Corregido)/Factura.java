import java.text.*;

public class Factura {
	private Detalle[] detalle;
	private Fecha fecha;
	private double subtotal;
	private double descuento;
	private double impuesto;
	private double total;
	private Cliente cliente;

	public Factura (Detalle[] detalle, Fecha fecha, double subtotal, double descuento, double impuesto, double total, Cliente cliente) {
		setDetalle(detalle);
		setFecha(fecha);
		setSubtotal(subtotal);
		setDescuento(descuento);
		setImpuesto(impuesto);
		setTotal(total);
		setCliente(cliente);
	}
	public void setDetalle(Detalle[] detalle) {
		this.detalle = detalle;
	}
	public Detalle[] getDetalle() {
		return detalle;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotal() {
		return total;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void mostrarDetallesFactura(int contadorDetalles, double cant, int id, String unidad, String descripcion, double precio, double imp) {
		DecimalFormat w = new DecimalFormat("#,###,###.00");
		String formatoDetalle = "| %11s | %-8s | %-8s | %-67s | %12s | %11s |%n";
		System.out.printf(formatoDetalle, w.format(cant), id, unidad, descripcion, "$" + w.format(precio), "$" + w.format(imp));
	}
	public void mostrarDatosFactura() {
		DecimalFormat w = new DecimalFormat("#,###,###.00");
		String formatoSubtotalDetalle = "%105s | %-12s | %11s |%n";
		System.out.printf(formatoSubtotalDetalle, " ", "DESCUENTO:", w.format(descuento) + "%");
		System.out.printf(formatoSubtotalDetalle, " ", "SUBTOTAL:", "$" + w.format(subtotal));
		System.out.printf(formatoSubtotalDetalle, " ", "IVA 16%:", "$" + w.format(impuesto));
		System.out.printf(formatoSubtotalDetalle, " ", "TOTAL:", "$" + w.format(total));
	}
}