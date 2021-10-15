import java.util.*;
import java.text.*;

class Direccion {
	private String calle;
	private String noExterior;
	private String colonia;
	private String municipio;
	private String estado;
	private String codigoP;

	public Direccion (String calle, String noExterior, String colonia, String municipio, String estado, String codigoP) {
		setCalle(calle);
		setNoExterior(noExterior);
		setColonia(colonia);
		setMunicipio(municipio);
		setEstado(estado);
		setCodigoP(codigoP);
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCalle() {
		return calle;
	}
	public void setNoExterior(String noExterior) {
		this.noExterior = noExterior;
	}
	public String getNoExterior() {
		return noExterior;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}
	public String getColonia() {
		return colonia;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEstado() {
		return estado;
	}
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	public String getCodigoP() {
		return codigoP;
	}
}

class Nombre {
	private String primerNombre;
	private String aPaterno;
	private String aMaterno;

	public Nombre (String primerNombre, String aPaterno, String aMaterno) {
		setPrimerNombre(primerNombre);
		setAPaterno(aPaterno);
		setAMaterno(aMaterno);
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getAPaterno() {
		return aPaterno;
	}
	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getAMaterno() {
		return aMaterno;
	}

	public String iniciales() {
		String c1,c2,c3,c4;
		c1 = primerNombre.substring(0, 1).toUpperCase();
		c2 = aPaterno.substring(0, 1).toUpperCase();
		c3 = aMaterno.substring(0, 1).toUpperCase();
		c4 = c1 + c2 + c3;
		return c4;
	}

	public String toString(){
		return primerNombre + " " + aPaterno + " " + aMaterno;
	}
}

class FechaEmision {
	private String dia;
	private String mes;
	private String anio;

	public FechaEmision (String dia, String mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getMes() {
		return mes;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;
	}
	public String toString(){
		return dia + "-" + mes + "-" + anio;
	}
}
class FechaNacimiento {
	private String dia;
	private String mes;
	private String anio;

	public FechaNacimiento (String dia, String mes, String anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getDia() {
		return dia;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getMes() {
		return mes;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getAnio() {
		return anio;
	}
	public String toString(){
		return dia + "-" + mes + "-" + anio;
	}
}

class Cliente {
	private Nombre nombre;
	private FechaNacimiento fechaNacimiento;
	private Direccion direccion;

	public Cliente (Nombre nombre, FechaNacimiento fechaNacimiento, Direccion direccion) {
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
		setDireccion(direccion);
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setFechaNacimiento(FechaNacimiento fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public FechaNacimiento getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public String rfc() {
		Random rand = new Random();
		char c1 = (char)(rand.nextInt(26) + 'a');
		char c2 = (char)(rand.nextInt(26) + 'a');
		int randomNumber = (int)(Math.random()*5);
		return nombre.getAPaterno().substring(0, 1).toUpperCase() + nombre.getAPaterno().substring(1, 2).toUpperCase() + nombre.getAMaterno().substring(0, 1).toUpperCase() + nombre.getPrimerNombre().substring(0, 1).toUpperCase() + fechaNacimiento.getAnio().substring(2, 4) + fechaNacimiento.getMes().substring(0, 2) + fechaNacimiento.getDia().substring(0, 2) + String.valueOf(c1).toUpperCase() + String.valueOf(c2).toUpperCase() + String.valueOf(randomNumber);
	}

	public String toString(){
		return "\n" + "Nombre completo: " + nombre +"\n" + "Fecha de nacimiento: " + fechaNacimiento + "\n";
	}
}

class Producto {
	private int clave;
	private String unidad;
	private String descripcion;
	private double precio;

	public Producto (int clave, String unidad, String descripcion, double precio) {
		setClave(clave);
		setUnidad(unidad);
		setDescripcion(descripcion);
		setPrecio(precio);
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public int getClave() {
		return clave;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString(){
		return clave + unidad + descripcion + precio;
	}
}

class Detalle {
	private Producto producto;
	private double cantidad;
	private double importe;
	public Detalle (Producto producto, double cantidad, double importe) {
		setProducto(producto);
		setCantidad(cantidad);
		setImporte(importe);
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Producto getProducto() {
		return producto;
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
		return importe;
	}
}

class Factura {
	private FechaEmision fechaEmision;
	private String numFactura;

	public Factura (FechaEmision fechaEmision, String numFactura) {
		setFechaEmision(fechaEmision);
		setNumFactura(numFactura);
	}
	public void setFechaEmision(FechaEmision fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public FechaEmision getFechaEmision() {
		return fechaEmision;
	}
	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}
	public String getNumFactura() {
		return numFactura;
	}
}
class Main {
	public static void main(String[] args) {

		//factura
		FechaEmision fe = new FechaEmision("15", "MAYO", "2021");
		Factura f = new Factura(fe, "A 3798");
		String formatoNum = "%34s | %10s |%n";
		System.out.printf("                                   +------------+%n");
		System.out.printf(formatoNum, " ", "Folio");
		System.out.printf(formatoNum, " ", f.getNumFactura());
		System.out.printf("                                   +------------+%n");
		System.out.print("\n"+"\n"+"\n");

		//Datos cliente
		Nombre n = new Nombre("Ramiro", "Castellanos", "Barron");
		FechaNacimiento fen = new FechaNacimiento("02", "05", "2000");
		Direccion di = new Direccion("No especificada", "No.210 PTE", "COL. CENTRO", "MONTERREY", "NUEVO LEON", "C.P. 64000");
		Cliente c = new Cliente(n, fen, di);

		System.out.println("  " + "RFC: " + c.rfc());
		System.out.println("  " + "Nombre: " + c.getNombre().toString());
		System.out.println("  " + f.getFechaEmision().getDia() + " " + f.getFechaEmision().getMes() + " " + c.getDireccion().getNoExterior() + ", " + c.getDireccion().getColonia() + ", " + c.getDireccion().getMunicipio() + ", " + c.getDireccion().getEstado() + " " + c.getDireccion().getCodigoP() +"\n" +"\n");

		DecimalFormat w = new DecimalFormat("0.00");
		Producto p[] = new Producto[3];
		p[0] = new Producto(1163, "PIEZAS", "VIDA PIEL MULTIVITAMINICO PRO-KERATINA 60 CAPLETAS", 353.45f);
		p[1] = new Producto(283, "PIEZAS", "DUCRAY SABAL SHAMPOO 200ML", 250.00f);
		p[2] = new Producto(1663, "PIEZAS", "REVIVITAL KERATOCLEANSER 100G", 387.93f);
		Detalle d[] = new Detalle[3];
		d[0] = new Detalle(p[0], 1, p[0].getPrecio());
		d[1] = new Detalle(p[1], 1, p[1].getPrecio());
		d[2] = new Detalle(p[2], 1, p[2].getPrecio());
		String formato = "| %11s | %-8s | %-8s | %-56s | %12s | %11s |%n";
		System.out.format("+-------------+----------+----------+----------------------------------------------------------+--------------+-------------+%n");
		System.out.format("|  Cantidad   |  Clave   |  Unidad  |   Descripcion                                            |    Precio    |   Importe   |%n");
		System.out.format("+-------------+----------+----------+----------------------------------------------------------+--------------+-------------+%n");
		for(int i = 0; i < d.length; i++) {
			System.out.printf(formato, w.format(d[i].getCantidad()), p[i].getClave(), p[i].getUnidad(), p[i].getDescripcion(), "$" + w.format(p[i].getPrecio()), "$" + w.format(d[i].getImporte()));
		}
		System.out.format("+-------------+----------+----------+----------------------------------------------------------+--------------+-------------+%n%n");
		
		double arrayDatos[] = new double[4];
		String tablaizquierda[] = {"Descuento: ", "Subtotal: ", "IVA 16%: ", "Total: "};
		arrayDatos[0] = 0.00f;
		arrayDatos[1] = (d[0].getImporte() + d[1].getImporte() + d[2].getImporte()) - arrayDatos[0];
		arrayDatos[2] = arrayDatos[1] * 0.16f;
		arrayDatos[3] = arrayDatos[2] + arrayDatos[1];
		String formatoF = "%-94s | %-12s | %11s |%n";
		System.out.format("                                                                                               +--------------+-------------+%n");
		for(int i = 0; i < arrayDatos.length; i++) {
			System.out.printf(formatoF, " ", tablaizquierda[i], "$" + w.format(arrayDatos[i]));
		}
		System.out.format("                                                                                               +--------------+-------------+%n");
	}
}