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

class Colegio {
	private List<Alumno> alumno;

	public Colegio(List<Alumno> alumno) {
		this.alumno = alumno;
	}

	public void setAlumno(List<Alumno> alumno) {
		this.alumno = alumno;
	}
	public List<Alumno> getAlumno() {
		return alumno;
	}
}

class Main {
	public static void main(String[] args) {
		List<Alumno> list = new ArrayList<Alumno>();
		String[] asignaturas = {"Literatura", "Matematicas", "Ciencias"};
		Alumno alumno = new Alumno("Elle", "Lawliet", 24, asignaturas);
		list.add(alumno);
		alumno = new Alumno("Pepito", "Perez", 21, asignaturas);
		list.add(alumno);
		alumno = new Alumno("Javi", "Madrid", 20, asignaturas);
		list.add(alumno);

		Colegio colegio = new Colegio(list);

		for(Alumno datos : colegio.getAlumno()) {
			System.out.println("NOMBRE: " + datos.getNombre());
			System.out.println("APELLIDO: " + datos.getApellido());
			System.out.println("EDAD: " + datos.getEdad());
			System.out.println("ASIGNATURAS: ");
			for (int i = 0; i < datos.getAsignaturas().length; i++) {
				System.out.println("* " + datos.getAsignaturas()[i]);
			}
			System.out.println();
		}
	}
}
