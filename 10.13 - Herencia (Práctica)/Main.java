import java.util.*;
import java.text.*;

class Persona {
	protected String nombre;
	protected int edad;

	public Persona (String nombre, int edad) {
		setNombre(nombre);
		setEdad(edad);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
}

class Alumno extends Persona {
	private double calificacion;

	public Alumno (String nombre, int edad, double calificacion) {
		super(nombre, edad);
		setCalificacion(calificacion);
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public String toString(){
		return nombre + edad + calificacion;
	}
}

class Main {
	public static void main(String[] args){
		DecimalFormat w = new DecimalFormat("00.0");
		Alumno a = new Alumno("Ramiro", 21, 99.4f);
		System.out.println(a.getNombre() + " " + a.getEdad() + w.format(a.getCalificacion()));
	}
}