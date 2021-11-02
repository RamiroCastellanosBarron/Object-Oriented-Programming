import java.util.*;

public class Cliente {
	protected Nombre nombre;
	protected Direccion direccion;
	protected FechaNacimiento nacimiento;
	protected String telefono;
	protected FechaPrimeraCompra primeraCompra;
	protected FechaUltimaCompra ultimaCompra;
	protected Historial[] historial;

	public Cliente (Nombre nombre, Direccion direccion, FechaNacimiento nacimiento, String telefono, FechaPrimeraCompra primeraCompra, FechaUltimaCompra ultimaCompra, Historial[] historial) {
		setNombre(nombre);
		setDireccion(direccion);
		setNacimiento(nacimiento);
		setTelefono(telefono);
		setPrimeraCompra(primeraCompra);
		setUltimaCompra(ultimaCompra);
		setHistorial(historial);
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setNacimiento(FechaNacimiento nacimiento) {
		this.nacimiento = nacimiento;
	}
	public FechaNacimiento getNacimiento() {
		return nacimiento;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setPrimeraCompra(FechaPrimeraCompra primeraCompra) {
		this.primeraCompra = primeraCompra;
	}
	public FechaPrimeraCompra getPrimeraCompra() {
		return primeraCompra;
	}
	public void setUltimaCompra(FechaUltimaCompra ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}
	public FechaUltimaCompra getUltimaCompra() {
		return ultimaCompra;
	}
	public void setHistorial(Historial[] historial) {
		this.historial = historial;
	}
	public Historial[] getHistorial() {
		return historial;
	}
	public String rfc() {
		Random rand = new Random();
		char c1 = (char)(rand.nextInt(26) + 'a');
		char c2 = (char)(rand.nextInt(26) + 'a');
		int randomNumber = (int)(Math.random()*5);
		return nombre.getApellidoPaterno().substring(0, 1).toUpperCase() + nombre.getApellidoPaterno().substring(1, 2).toUpperCase() + nombre.getApellidoMaterno().substring(0, 1).toUpperCase() + nombre.getPrimerNombre().substring(0, 1).toUpperCase() + nacimiento.getAnio().substring(2, 4) + nacimiento.getMes().substring(0, 2) + nacimiento.getDia().substring(0, 2) + String.valueOf(c1).toUpperCase() + String.valueOf(c2).toUpperCase() + String.valueOf(randomNumber);
	}

	public int cantAnios() {
		int anioInicial = Integer.parseInt(primeraCompra.getAnio());
		int anioFinal = Integer.parseInt(ultimaCompra.getAnio());
		int anios = anioFinal - anioInicial;
		return anios;
	}
}