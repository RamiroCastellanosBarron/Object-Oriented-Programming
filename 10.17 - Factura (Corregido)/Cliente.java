import java.util.*;

public class Cliente {
	private Nombre nombre;
	private Fecha fecha;
	private Direccion direccion;
	
	public Cliente (Nombre nombre, Fecha fecha, Direccion direccion) {
		setNombre(nombre);
		setFecha(fecha);
		setDireccion(direccion);
	}
	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}
	public Nombre getNombre() {
		return nombre;
	}
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Fecha getfecha() {
		return fecha;
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
		return nombre.getAPaterno().substring(0, 1).toUpperCase() + nombre.getAPaterno().substring(1, 2).toUpperCase() + nombre.getAMaterno().substring(0, 1).toUpperCase() + nombre.getPrimerNombre().substring(0, 1).toUpperCase() + fecha.getAnio().substring(2, 4) + fecha.getMes().substring(0, 2) + fecha.getDia().substring(0, 2) + String.valueOf(c1).toUpperCase() + String.valueOf(c2).toUpperCase() + String.valueOf(randomNumber);
	}
}
