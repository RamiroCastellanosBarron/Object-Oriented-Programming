import Clases.Persona;
import Clases.Subclases.Direccion;
import Clases.Subclases.Fecha;
import Clases.Subclases.Nombre;

public class Main {
	public static void main(String[] args) {
		Nombre n = new Nombre("Ramiro", "Castellanos", "Barron");
		Direccion d = new Direccion("La Gloria", "220", "66247", "Hacienda del Rosario", "San Pedro");
		Fecha f = new Fecha("02", "05", "2000");
		Persona p = new Persona(n, d, f);
		System.out.println();
		p.mostrarPersona();
		System.out.println();
		p.longitudNombre();
		System.out.println();
		p.iniciales();
		System.out.println();
	}
}