package Clases;

import Clases.Subclases.Direccion;
import Clases.Subclases.Fecha;
import Clases.Subclases.Nombre;

public class Persona implements Metodo {
	private Nombre nombre;
	private Direccion direccion;
	private Fecha fecha;

	public Persona (Nombre nombre, Direccion direccion, Fecha fecha) {
		setNombre(nombre);
		setDireccion(direccion);
		setFecha(fecha);
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
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	public Fecha getFecha() {
		return fecha;
	}
	public void mostrarPersona() {
		nombre.mostrarNombreCompleto();
		direccion.mostrarDireccion();
		fecha.mostrarFechaNacimiento();
	}
	public void longitudNombre() {
		String nombreCompleto = nombre.getPrimerNombre() + " " + nombre.getApellidoPaterno() + " " + nombre.getApellidoMaterno();
		System.out.println("Cantidad de caracteres en: " + nombreCompleto + ".");
		System.out.println(nombreCompleto.length());
	}
	public void iniciales() {
		String primerNombre = nombre.getPrimerNombre();
		String apellidoPaterno = nombre.getApellidoPaterno();
		String apellidoMaterno = nombre.getApellidoMaterno();
		char c1 = primerNombre.charAt(0);
		char c2 = apellidoPaterno.charAt(0);
		char c3 = apellidoMaterno.charAt(0);
		char[] caracteres = {c1, c2, c3};
		String iniciales = String.valueOf(caracteres);
		System.out.println("Iniciales de " + primerNombre + " " + apellidoPaterno + " " + apellidoMaterno + ".");
		System.out.println(iniciales.toUpperCase());
	}
}
