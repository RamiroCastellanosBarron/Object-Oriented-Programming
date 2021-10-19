import java.text.DecimalFormat;
import java.util.*;

public class Detalle {
	private Productos productos;
	private double cantidad;
	private double importe;
	public Detalle (Productos productos, double cantidad, double importe) {
		setProductos(productos);
		setCantidad(cantidad);
		setImporte(importe);
	}
	public void setProductos(Productos productos) {
		this.productos = productos;
	}
	public Productos getProductos() {
		return productos;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getImporte() {
		return productos.getPrecio()*cantidad;
	}
	public void mostrarDetalle() {
		DecimalFormat w = new DecimalFormat("#,###,###.00");
		String formatoDetalle = "| %11s | %-8s | %-8s | %-67s | %12s | %11s |%n";
		System.out.printf(formatoDetalle, w.format(getCantidad()), productos.getIdProducto(), productos.getUnidad(), productos.getDescripcion(), "$" + w.format(productos.getPrecio()), "$" + w.format(getImporte()));
	}
}