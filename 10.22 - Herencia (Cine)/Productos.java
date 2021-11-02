import java.text.*;

public class Productos {
	private int idProducto;
	private String nomProducto;
	private String descripcion;
	private String unidad;
	private double precio;

	public Productos (int idProducto, String nomProducto, String unidad, String descripcion, double precio) {
		setIdProducto(idProducto);
		setNomProducto(nomProducto);
		setDescripcion(descripcion);
		setUnidad(unidad);
		setPrecio(precio);
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}
	public void mostrarProductos() {
		DecimalFormat w = new DecimalFormat("#,###,###.00");
		String formato = "| %6s | %-20s | %-65s | %-16s | %13s |%n";
		System.out.printf(formato, idProducto, nomProducto, descripcion, unidad, "$" + w.format(precio));
	}
	public String toString() {
		return "contenido";
	}
}
