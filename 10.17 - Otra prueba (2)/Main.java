import java.util.*;

class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private String[] asignaturas;

	public Alumno(String nombre, String apellido, int edad, String[] asignaturas) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		setAsignaturas(asignaturas);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getApellido() {
		return apellido;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setAsignaturas(String[] asignaturas) {
		this.asignaturas = asignaturas;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
}

class Main {
	public static void main(String[] args) {
		Alumno a;
		a = new Alumno("Ramiro", "Castellanos", 21, pedirAsignatura());
		System.out.println(a.getNombre() + " " + a.getApellido() + " " + a.getEdad() + " " + a.getAsignaturas()[1]);
	}
	public static String[] pedirAsignatura() {
		Scanner sc = new Scanner(System.in);
		String[] asignaturas = new String[3];
		for(int i = 0; i < asignaturas.length; i++) {
			System.out.print("Ingresa la asignatura: ");
			asignaturas[i] = sc.nextLine();
		}
		return asignaturas;
	}
}
